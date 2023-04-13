package com.gyojincompany.board.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyojincompany.board.dao.BoardDao;
import com.gyojincompany.board.dto.BoardDto;

public class ListCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		BoardDao dao = new BoardDao();
		
		ArrayList<BoardDto> dtos = dao.list();		
		
		request.setAttribute("list", dtos);

	}

}
