
package com.arquest.controller;

import com.arquest.service.QuestService;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class QuestCompletionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        int userId = Integer.parseInt(req.getParameter("userId"));
        int questId = Integer.parseInt(req.getParameter("questId"));

        QuestService service = new QuestService();
        service.completeQuest(userId, questId);

        resp.sendRedirect("success.jsp");
    }
}
