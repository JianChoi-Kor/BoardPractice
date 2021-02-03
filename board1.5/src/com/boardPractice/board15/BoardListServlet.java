package com.boardPractice.board15;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.boardPractice.board15.model.BoardDAO;
import com.boardPractice.board15.model.BoardDTO;
import com.boardPractice.board15.model.BoardEntity;

@WebServlet("/list")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strPage = request.getParameter("page");
		int page = strPage == null ? 1 : Integer.parseInt(strPage);
		
		int rowCnt = 5;
		BoardDTO param = new BoardDTO();
		param.setRowCountPerPage(rowCnt);
		param.setStartIdx((page-1)*rowCnt);
		request.setAttribute("pageLength", BoardDAO.selPageLength(param));
		
		List<BoardEntity> list = BoardDAO.selBoardList(param);
		request.setAttribute("list", list);
		
		String jsp="/WEB-INF/jsp/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}
}


