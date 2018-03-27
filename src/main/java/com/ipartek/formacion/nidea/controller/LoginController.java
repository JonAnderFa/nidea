package com.ipartek.formacion.nidea.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iparek.formacion.nidea.pojo.Alert;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatch;
	String usuario = "";
	String pass = "";
	boolean ok = false;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("views/login/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// Recoger parametros
			getParameters(request);
			autentificar();
			if (ok) {
				request.setAttribute("alert", new Alert("Ongi etorri", Alert.TIPO_PRIMARY));
				dispatch = request.getRequestDispatcher("views/backoffice/index.jsp");
				ok = false;
			} else {
				request.setAttribute("alert", new Alert("Prueba a poner admin admin", Alert.TIPO_WARNING));
				dispatch = request.getRequestDispatcher("index.jsp");
			}
			// enviar atributos a la vista

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("alert", new Alert());
			dispatch = request.getRequestDispatcher("index.jsp");
		} finally {
			dispatch.forward(request, response);
		}
	}

	private void autentificar() {
		if (usuario.equalsIgnoreCase("admin")) {
			if (pass.equalsIgnoreCase("admin")) {
				ok = true;
			}
		}

	}

	private void getParameters(HttpServletRequest request) {
		usuario = request.getParameter("usuario");
		pass = request.getParameter("pass");

	}

}
