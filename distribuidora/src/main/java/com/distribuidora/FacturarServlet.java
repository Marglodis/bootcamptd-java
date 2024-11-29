package com.distribuidora;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class FacturarServlet
 */
@WebServlet("/FacturarServlet")
public class FacturarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacturarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Obtener los valores de la sesión
        HttpSession session = request.getSession();
        String nombre = (String) session.getAttribute("nombre");
        String direccion = (String) session.getAttribute("direccion");
        int cantidad1 = (Integer) session.getAttribute("cantidad1");
        int cantidad2 = (Integer) session.getAttribute("cantidad2");
        int cantidad3 = (Integer) session.getAttribute("cantidad3");
        double totalProducto1 = (Double) session.getAttribute("totalProducto1");
        double totalProducto2 = (Double) session.getAttribute("totalProducto2");
        double totalProducto3 = (Double) session.getAttribute("totalProducto3");
        double total = (Double) session.getAttribute("total");
        double descuento = (Double) session.getAttribute("descuento");
        double totalConDescuento = (Double) session.getAttribute("totalConDescuento");

        // Enviar atributos a la página JSP
        request.setAttribute("nombre", nombre);
        request.setAttribute("direccion", direccion);
        request.setAttribute("cantidad1", cantidad1);
        request.setAttribute("cantidad2", cantidad2);
        request.setAttribute("cantidad3", cantidad3);
        request.setAttribute("totalProducto1", totalProducto1);
        request.setAttribute("totalProducto2", totalProducto2);
        request.setAttribute("totalProducto3", totalProducto3);
        request.setAttribute("total", total);
        request.setAttribute("descuento", descuento);
        request.setAttribute("totalConDescuento", totalConDescuento);

        // Redirigir a la página de factura
        RequestDispatcher dispatcher = request.getRequestDispatcher("Factura.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
