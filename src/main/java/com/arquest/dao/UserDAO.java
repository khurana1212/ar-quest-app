
package com.arquest.dao;

import java.sql.*;

public class UserDAO {
    public void updateScore(Connection con, int userId, int score) throws SQLException {
        PreparedStatement ps = con.prepareStatement(
            "UPDATE users SET score = score + ? WHERE id=?");
        ps.setInt(1, score);
        ps.setInt(2, userId);
        ps.executeUpdate();
    }
}
