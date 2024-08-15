package com.school.management.controller;

import com.school.management.dao.StudentDAO;
import com.school.management.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    private StudentDAO studentDAO = new StudentDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = studentDAO.getAllStudents();
        req.setAttribute("students", students);
        req.getRequestDispatcher("/views/student.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        int id = studentDAO.getAllStudents().size() + 1;
        Student student = new Student(id, name, age);
        studentDAO.addStudent(student);
        resp.sendRedirect("students");
    }
}
