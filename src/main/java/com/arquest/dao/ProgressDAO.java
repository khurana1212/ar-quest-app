
package com.arquest.dao;

import java.sql.*;

public class ProgressDAO {

    public boolean alreadyCompleted(Connection con, int userId, int questId) throws SQLException {
        PreparedStatement ps = con.prepareStatement(
            "SELECT 1 FROM progress WHERE user_id=? AND quest_id=?");
        ps.setInt(1, userId);
        ps.setInt(2, questId);
        return ps.executeQuery().next();
    }

    public void insertProgress(Connection con, int userId, int questId) throws SQLException {
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO progress(user_id, quest_id) VALUES (?, ?)");
        ps.setInt(1, userId);
        ps.setInt(2, questId);
        ps.executeUpdate();
    }
}
