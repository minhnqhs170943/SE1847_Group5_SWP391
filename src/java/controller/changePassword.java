import dal.DBContext;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/changePassword")  
public class changePassword extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the new password from the request parameter
        String newPassword = request.getParameter("newPassword");
        
        // Get a connection to the database using DBContext
        try (Connection connection = new DBContext().getConnection()) {
            // Prepare SQL statement to update the password
            String sql = "UPDATE users SET password = ? WHERE username = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Set parameters for the SQL statement
                statement.setString(1, newPassword);
                statement.setString(2, getUsernameFromSession(request)); // Get the username from session or wherever it's stored
                
                // Execute the SQL statement
                int rowsAffected = statement.executeUpdate();
                
                if (rowsAffected > 0) {
                    // Password successfully updated, redirect to a success page
                    response.sendRedirect("passwordChanged.jsp");
                } else {
                    // Handle the case where no rows were affected (e.g., username not found)
                    response.sendRedirect("error.jsp");
                }
            }
        } catch (SQLException ex) {
            // Handle database connection or SQL errors
            ex.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
    
    // Dummy method to get username from session (replace with actual logic)
    private String getUsernameFromSession(HttpServletRequest request) {
        return "John Doe"; // Placeholder, replace with actual logic
    }
}
