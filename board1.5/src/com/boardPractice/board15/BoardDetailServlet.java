package com.boardPractice.board15;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boardPractice.board15.model.BoardDAO;
import com.boardPractice.board15.model.BoardEntity;

@WebServlet("/detail")
public class BoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strI_board = request.getParameter("i_board");
		int i_board = Integer.parseInt(strI_board);
		
		BoardEntity param = new BoardEntity();
		param.setI_board(i_board);
		
		BoardEntity data = BoardDAO.selBoard(param);
		
		request.setAttribute("data", data);
		
		String jsp = "/WEB-INF/jsp/detail.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}
}

