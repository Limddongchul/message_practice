package kh.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.web.dao.MessageDAO;
import kh.web.dto.MessageDTO;


@WebServlet("*.do")
public class FrontConrtroller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean isRedirect = true;
		String dst = null;
		
		try {
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		if(command.equals("/input.do")) {
			String name = request.getParameter("name");
			String message = request.getParameter("message");
			
			MessageDAO dao = new MessageDAO();
			int result = dao.insertData(name, message);
			
			request.setAttribute("result", result);
			
			isRedirect = false;
			dst = "inputview.jsp";
			
		}else if(command.equals("/output.do")) {
			MessageDAO dao = new MessageDAO();
			List<MessageDTO> result = new ArrayList<>();
			result = dao.getAllData();
			
			request.setAttribute("result", result);
			
			isRedirect = false;
			dst = "output.jsp";
			
		}
		
		}catch(Exception e) {
			
		}
		
		if(isRedirect) {
			response.sendRedirect(dst);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(dst);
			rd.forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
