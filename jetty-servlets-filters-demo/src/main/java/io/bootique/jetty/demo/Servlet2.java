package io.bootique.jetty.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {

    static final Logger LOGGER = LoggerFactory.getLogger(Servlet2.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LOGGER.info("GET servlet2");

        resp.setContentType("text/plain");
        PrintWriter pw = resp.getWriter();
        pw.printf("Servlet 2! p1: %s; p2: %s\n", this.getInitParameter("p1"), this.getInitParameter("p2"));
        pw.close();
    }
}
