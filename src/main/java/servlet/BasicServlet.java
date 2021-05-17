package servlet;

import product.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BasicServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html><body>");
        for (int i = 0; i < 10; i++) {
            resp.getWriter().println("<p>");
            resp.getWriter().println(new Product(i, "product" + i, "ssss" + i));
            resp.getWriter().println("</p>");
        }
        resp.getWriter().println("</html></body>");
    }
}
