package com.board.service;

import org.springframework.stereotype.Service;

import com.board.mapper.BoardMapper;

@Service
public class BoardService {
	private BoardMapper mapper;

	public BoardService(BoardMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
