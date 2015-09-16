package br.edu.univas.si.lab6.bmi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.univas.si.lab6.bmi.service.BMIService;

/**
 * Servlet implementation class BMIController
 */
public class BMIController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Float weight = Float.valueOf(request.getParameter("weight"));
		Float height = Float.valueOf(request.getParameter("height"));
		
		Float bmiIndex = BMIService.getIndex(weight, height);
		
		response.getWriter().append(bmiIndex.toString());
	}

}
