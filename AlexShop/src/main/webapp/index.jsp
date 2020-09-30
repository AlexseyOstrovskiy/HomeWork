package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        Date today = new java.util.Date();
        out.println("<html> <body>"
                + "<h1 align=center>Hello HelloServlet2!</h1><br>" + today
                + "</body> </html>");
}
}
