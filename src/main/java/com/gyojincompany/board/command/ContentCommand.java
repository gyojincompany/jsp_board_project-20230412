package com.gyojincompany.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyojincompany.board.dao.BoardDao;
import com.gyojincompany.board.dto.BoardDto;

public class ContentCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String bnum = request.getParameter("bnum");
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.content_view(bnum);
		request.setAttribute("contentDto", dto);
		
	}

}
