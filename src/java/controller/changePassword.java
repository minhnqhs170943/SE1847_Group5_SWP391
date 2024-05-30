import dal.DBContext;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/changePassword")
public class changePassword extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentPassword = request.getParameter("currentPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username"); 

        if (username == null || username.isEmpty()) {
            response.sendRedirect("Login.jsp"); 
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            request.setAttribute("errorMessage", "New password and confirm password do not match!");
            request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
            return;
        }

        try (Connection connection = new DBContext().getConnection()) {
            // Check current password
            String checkPasswordSql = "SELECT password FROM account WHERE username = ?";
            try (PreparedStatement checkPasswordStmt = connection.prepareStatement(checkPasswordSql)) {
                checkPasswordStmt.setString(1, username);
                try (ResultSet rs = checkPasswordStmt.executeQuery()) {
                    if (rs.next()) {
                        String storedPassword = rs.getString("password");
                        if (!storedPassword.equals(currentPassword)) {
                            request.setAttribute("errorMessage", "Current password is incorrect!");
                            request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
                            return;
                        }
                    } else {
                        request.setAttribute("errorMessage", "User not found!");
                        request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
                        return;
                    }
                }
            }

            // Update password
            String updatePasswordSql = "UPDATE account SET password = ? WHERE username = ?";
            try (PreparedStatement updatePasswordStmt = connection.prepareStatement(updatePasswordSql)) {
                updatePasswordStmt.setString(1, newPassword);
                updatePasswordStmt.setString(2, username);

                int rowsAffected = updatePasswordStmt.executeUpdate();
                if (rowsAffected > 0) {
                    request.setAttribute("successMessage", "Password changed successfully!");
                    request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
                } else {
                    request.setAttribute("errorMessage", "Failed to change password!");
                    request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            request.setAttribute("errorMessage", "An error occurred. Please try again later.");
            request.getRequestDispatcher("ChangePassword.jsp").forward(request, response);
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
        return "Change Password Servlet";
    }
}
