package JavaSEConcurrency.dao;

import JavaSEConcurrency.beans.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {

    public int saveUser(User user){
        int rows = 0;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO user values(?,?,?)");
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getEmail());
            rows = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

}
