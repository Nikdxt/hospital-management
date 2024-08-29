package com.example.hospital;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/app/*")
public class HospitalApplication extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getPathInfo();
        
        switch (action) {
            case "/login":
                req.getRequestDispatcher("/WEB-INF/views/doctorLogin.jsp").forward(req, resp);
                break;
            case "/register":
                req.getRequestDispatcher("/WEB-INF/views/doctorRegister.jsp").forward(req, resp);
                break;
            case "/patient-info":
                req.getRequestDispatcher("/WEB-INF/views/patientInfo.jsp").forward(req, resp);
                break;
            case "/prescription":
                req.getRequestDispatcher("/WEB-INF/views/patientPrescription.jsp").forward(req, resp);
                break;
            default:
                resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Handle form submissions for login, registration, etc.
    }
}
