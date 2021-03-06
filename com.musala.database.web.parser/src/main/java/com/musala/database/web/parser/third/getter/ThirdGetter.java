package com.musala.database.web.parser.third.getter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.musala.database.web.parser.model.impl.MySqlWebDbEngine;

/**
 * Servlet implementation class ThirdGetter
 */
@WebServlet("/ThirdGetter")
public class ThirdGetter extends HttpServlet {

	private static final long serialVersionUID = -6827863660743607788L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdGetter() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MySqlWebDbEngine engine = MySqlWebDbEngine.getInstance(response, request);
		engine.startQuering();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
