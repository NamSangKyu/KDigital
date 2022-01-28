package com.board.service;

import java.util.HashMap;
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

	public int selectAllCount() {
		return mapper.selectAllCount();
	}

	public int insertBoard(BoardDTO boardDTO) {
		return mapper.insertBoard(boardDTO);
	}

	public BoardDTO selectBoard(int bno) {
		return mapper.selectBoard(bno);
	}

	public void addCount(int bno) {
		mapper.addCount(bno);
	}

	public void updateBoard(HashMap<String, Object> map) {
		mapper.updateBoard(map);
	}
	
	
}





