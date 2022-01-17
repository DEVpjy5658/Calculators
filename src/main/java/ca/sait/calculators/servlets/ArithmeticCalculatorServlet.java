/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Jin-young Park
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fInput = request.getParameter("first");
        String sInput = request.getParameter("second");
 
        if (fInput != null && sInput != null) 
        {
            try {
                int first = Integer.parseInt(fInput);
                int second = Integer.parseInt(sInput);
                String calculation = request.getParameter("calculation");
                int result = 0;
                
                
                switch(calculation)
                {
                    case "plus" :
                        result = first + second;
                        break;
                     case "minus" :
                        result = first - second;
                        break;
                     case "times" :
                        result = first * second;
                        break;
                     case "remainders" :
                        result = first % second;
                        break;
                }

                request.setAttribute("result", result);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                

            } catch (Exception ex) {
                request.setAttribute("result", "invalid");
            }
        }
        else
        {
            request.setAttribute("result", "invalid");
        }

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

}
