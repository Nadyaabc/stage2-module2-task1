
package com.example.servlet;

import com.example.User;
import com.example.Warehouse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet("/users")
public class GetUsersServlet extends HttpServlet {
    //write your code here!
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Warehouse wh = Warehouse.getInstance();
        Set<User> usersSet = wh.getUsers();
        request.setAttribute("users",usersSet);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/users.jsp");
        requestDispatcher.forward(request, response);
    }

}
