package com.ipartek.formacion.nidea.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iparek.formacion.nidea.pojo.Alert;

/**
 * Servlet implementation class CalculadoraController
 */
public class CalculadoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatch;

	float num1 = 1;
	float num2 = 0;
	int operador = 0;
	float resultado = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Nos llaman atraves de un enlace, peticion GET
		request.getRequestDispatcher("views/calculadora/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// nos llaman atraves de un formulario, peticion post

		try {
			// Recoger parametros
			getParameters(request);
			calcular();
			// enviar atributos a la vista
			request.setAttribute("resultado", resultado);
			dispatch = request.getRequestDispatcher("views/calculadora/resultado.jsp");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			request.setAttribute("alert", new Alert("Introduce un Numero con forma correcta", Alert.TIPO_DANGER));
			dispatch = request.getRequestDispatcher("views/calculadora/index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("alert", new Alert());
			dispatch = request.getRequestDispatcher("views/calculadora/index.jsp");
		} finally {
			dispatch.forward(request, response);
		}

	}

	private void calcular() {
		switch (operador) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;

		case 3:
			resultado = num1 * num2;
			break;

		case 4:
			resultado = num1 / num2;
			break;
		default:
			break;
		}

	}

	private void getParameters(HttpServletRequest request) {

		String snum1 = request.getParameter("num1");
		String snum2 = request.getParameter("num2");
		String soperador = request.getParameter("operador");
		snum1 = snum1.replace(",", ".");
		snum2 = snum2.replace(",", ".");

		num1 = Float.parseFloat(snum1);
		num2 = Float.parseFloat(snum2);
		operador = Integer.parseInt(soperador);
		resultado = 0;

	}

}
