
package com.arquest.service;

import com.arquest.dao.ProgressDAO;
import com.arquest.dao.UserDAO;
import com.arquest.db.DBConnection;

import java.sql.Connection;

public class QuestService {

    private final ProgressDAO progressDAO = new ProgressDAO();
    private final UserDAO userDAO = new UserDAO();

    public void completeQuest(int userId, int questId) {
        if (userId <= 0 || questId <= 0)
            throw new IllegalArgumentException("Invalid input");

        Connection con = null;
        try {
            con = DBConnection.getConnection();
            con.setAutoCommit(false);

            if (progressDAO.alreadyCompleted(con, userId, questId)) {
                throw new IllegalStateException("Quest already completed");
            }

            progressDAO.insertProgress(con, userId, questId);
            userDAO.updateScore(con, userId, 10);

            con.commit();
        } catch (Exception e) {
            try {
                if (con != null) con.rollback();
            } catch (Exception ignored) {}
            throw new RuntimeException(e);
        }
    }
}
