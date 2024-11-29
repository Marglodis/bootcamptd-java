package com.distribuidora;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class EnviarInfoServlet
 */
@WebServlet("/EnviarInfoServlet")
public class EnviarInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EnviarInfoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Obtener los datos del formulario
        String nombre = request.getParameter("nombre");
        String direccion = request.getParameter("direccion");
        int cantidad1 = Integer.parseInt(request.getParameter("cantidad1"));
        int cantidad2 = Integer.parseInt(request.getParameter("cantidad2"));
        int cantidad3 = Integer.parseInt(request.getParameter("cantidad3"));

        // Realizar los cálculos de los productos
        double precio1 = 100.0;
        double precio2 = 200.0;
        double precio3 = 300.0;

        double totalProducto1 = precio1 * cantidad1;
        double totalProducto2 = precio2 * cantidad2;
        double totalProducto3 = precio3 * cantidad3;

        double total = totalProducto1 + totalProducto2 + totalProducto3;
        double descuento = total * 0.10;
        double totalConDescuento = total - descuento;

        // Guardar los valores en la sesión
        HttpSession session = request.getSession();
        session.setAttribute("nombre", nombre);
        session.setAttribute("direccion", direccion);
        session.setAttribute("cantidad1", cantidad1);
        session.setAttribute("cantidad2", cantidad2);
        session.setAttribute("cantidad3", cantidad3);
        session.setAttribute("totalProducto1", totalProducto1);
        session.setAttribute("totalProducto2", totalProducto2);
        session.setAttribute("totalProducto3", totalProducto3);
        session.setAttribute("total", total);
        session.setAttribute("descuento", descuento);
        session.setAttribute("totalConDescuento", totalConDescuento);

        // Redirigir al servlet que genera la factura
        response.sendRedirect("FacturarServlet");
    }

}
