package com.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.dto.BoardDTO;
import com.board.mapper.BoardMapper;

@Service
public class BoardService {
	private BoardMapper mapper;

	public BoardService(BoardMapper mapper) {
		this.mapper = mapper;
	}

	public List<BoardDTO> selectBoardList(int page) {
		return mapper.selectBoardList(page);
	}
	
	
}





