package mum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */

public class Calculator2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator2() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/calc/calculator.jsp");
        requestDispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String add1 = request.getParameter("add1").trim();
        String add2 = request.getParameter("add2").trim();
        String mult1 = request.getParameter("mul1").trim();
        String mult2 = request.getParameter("mul2").trim();
        String sum = "";
        String product = "";

        try {
            Integer a1 = Integer.parseInt(add1);
            Integer a2 = Integer.parseInt(add2);
            sum = "" + (a1+a2);
        } catch(NumberFormatException e) {
            //do nothing
        }

        try {
            Integer m1 = Integer.parseInt(mult1);
            Integer m2 = Integer.parseInt(mult2);
            product = "" + (m1 * m2);
        } catch(NumberFormatException e) {
            //do nothing
        }

        request.setAttribute("add1", add1);
        request.setAttribute("add2", add2);
        request.setAttribute("mul1", mult1);
        request.setAttribute("mul2", mult2);
        request.setAttribute("sum", sum);
        request.setAttribute("product", product);


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/calc/result.jsp");
        requestDispatcher.forward(request, response);

    }


}
