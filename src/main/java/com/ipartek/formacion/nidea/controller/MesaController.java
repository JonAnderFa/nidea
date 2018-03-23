package com.ipartek.formacion.nidea.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iparek.formacion.nidea.pojo.Mesa;

/**
 * Servlet implementation class MesaController
 */
public class MesaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Crear mesa
		Mesa m = new Mesa();
		// recoger parametros *** SIEMPRE String ***
		String sPatas = request.getParameter("patas");
		String sDimension = request.getParameter("dimension");
		String sMaterial = request.getParameter("material");
		String sCustom = request.getParameter("custom");
		String sColor = request.getParameter("color");
		// Si parametro son NULL recoger y crear
		if (sPatas != null) {

			int patas = Integer.parseInt(sPatas);
			m.setNumeroPatas(patas);

			int dimension = Integer.parseInt(sDimension);
			m.setDimension(dimension);

			int material = Integer.parseInt(sMaterial);
			m.setMaterial(material);

			if (sCustom == null) {
				m.setCustom(false);
				sColor = "#ffffff";
			} else { // viene 'on'
				m.setCustom(true);
			}
			m.setColor(sColor);
		}

		// Enviar atributos a la JSP
		request.setAttribute("mesa", m);
		// request.setAttribute("materiales", Mesa.MATERIALES);

		// Ir a la JSP
		request.getRequestDispatcher("mesa.jsp").forward(request, response);
		;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
