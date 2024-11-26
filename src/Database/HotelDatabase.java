package Database;
import java.sql.*;

public class HotelDatabase {

    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/hotel_management";
    private static final String USER = "root"; // Change to your MySQL username
    private static final String PASSWORD = "1a1b1A&&"; // Change to your MySQL password

    // Create connection to the database
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Create a new guest
    public static void createGuest(long guestId, String guestName, String guestMobile, String guestRoomno) {
        String sql = "INSERT INTO guests (guest_id, guest_name, guest_mobile, guest_roomno) VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, guestId);
            ps.setString(2, guestName);
            ps.setString(3, guestMobile);
            ps.setString(4, guestRoomno);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Guest added successfully!");
            } else {
                System.out.println("Failed to add guest.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read guest details
    public static void readGuest(long guestId) {
        String sql = "SELECT * FROM guests WHERE guest_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, guestId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Guest ID: " + rs.getLong("guest_id"));
                System.out.println("Name: " + rs.getString("guest_name"));
                System.out.println("Mobile: " + rs.getString("guest_mobile"));
                System.out.println("Room No: " + rs.getString("guest_roomno"));
            } else {
                System.out.println("Guest not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update guest details
    public static void updateGuest(long guestId, String newName, String newMobile, String newRoomno) {
        String sql = "UPDATE guests SET guest_name = ?, guest_mobile = ?, guest_roomno = ? WHERE guest_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setString(2, newMobile);
            ps.setString(3, newRoomno);
            ps.setLong(4, guestId);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Guest updated successfully!");
            } else {
                System.out.println("Failed to update guest.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a guest
    public static void deleteGuest(long guestId) {
        String sql = "DELETE FROM guests WHERE guest_id = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1, guestId);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Guest deleted successfully!");
            } else {
                System.out.println("Failed to delete guest.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

