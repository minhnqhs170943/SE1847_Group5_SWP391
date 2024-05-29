package controller;

import dal.DBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet(name="register", urlPatterns={"/register"})

public class register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");

    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String email = request.getParameter("email");
    String address = request.getParameter("address");
    String dob = request.getParameter("dob");
    String password = request.getParameter("password");
    String confirmPassword = request.getParameter("confirm_password");

    try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Registration Result</title>");
        out.println("</head>");
        out.println("<body>");

        if (password.equals(confirmPassword)) {
            DBContext dbContext = new DBContext();
            try (Connection conn = dbContext.getConnection()) {
                
                String checkEmailQuery = "SELECT id FROM account WHERE username = ?";
                    try (PreparedStatement checkEmailStmt = conn.prepareStatement(checkEmailQuery)) {
                        checkEmailStmt.setString(1, email);
                        try (ResultSet rs = checkEmailStmt.executeQuery()) {
                            if (rs.next()) {
                                out.println("<h2>Registration Failed</h2>");
                                out.println("<p>Email already exists.</p>");
                                return;
                            }
                        }
                    }

                    String checkPhoneQuery = "SELECT id FROM customer WHERE phone = ?";
                try (PreparedStatement checkPhoneStmt = conn.prepareStatement(checkPhoneQuery)) {
                    checkPhoneStmt.setInt(1, Integer.parseInt(phone));
                    try (ResultSet rs = checkPhoneStmt.executeQuery()) {
                        if (rs.next()) {
                            out.println("<h2>Registration Failed</h2>");
                            out.println("<p>Phone number already exists.</p>");
                            return;
                        }
                    }
                }

                int roleID = 1; 

                String accountQuery = "INSERT INTO account (username, password, roleID) VALUES (?, ?, ?)";
                int accountID; 
                try (PreparedStatement accountStmt = conn.prepareStatement(accountQuery, Statement.RETURN_GENERATED_KEYS)) {
                    accountStmt.setString(1, email);
                    accountStmt.setString(2, password);
                    accountStmt.setInt(3, roleID);
                    accountStmt.executeUpdate();

                    try (ResultSet generatedKeys = accountStmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            accountID = generatedKeys.getInt(1);
                        } else {
                            throw new SQLException("Failed to retrieve generated account ID.");
                        }
                    }
                }

                String customerQuery = "INSERT INTO customer (firstName, lastName, DOB, addressID, gmail, accountID, phone) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement customerStmt = conn.prepareStatement(customerQuery)) {
                    String[] nameParts = name.split(" ");
                    String firstName = nameParts[0];
                    String lastName = nameParts.length > 1 ? nameParts[nameParts.length - 1] : "";

                    int addressID = 1;

                    customerStmt.setString(1, firstName);
                    customerStmt.setString(2, lastName);
                    customerStmt.setDate(3, java.sql.Date.valueOf(dob));
                    customerStmt.setInt(4, addressID);
                    customerStmt.setString(5, email);
                    customerStmt.setInt(6, accountID);
                    customerStmt.setInt(7, Integer.parseInt(phone));
                    customerStmt.executeUpdate();
                }

                out.println("<h2>Registration Successful</h2>");

                response.sendRedirect("Login.jsp");
                return; 
            } catch (SQLException e) {
                e.printStackTrace();
                out.println("<h2>Registration Failed</h2>");
                out.println("<p>Error: " + e.getMessage() + "</p>");
            }
        } else {
            out.println("<h2>Registration Failed</h2>");
            out.println("<p>Passwords do not match.</p>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Register servlet";
    }
}
