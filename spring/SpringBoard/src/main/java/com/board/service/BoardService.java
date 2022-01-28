package com.board.service;

import java.util.ArrayList;
import java.util.Collection;
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

	public void deleteBoard(int bno) {
		mapper.deleteBoard(bno);
	}

	public int insertBoardLike(HashMap<String, Object> map) {
		return mapper.insertBoardLike(map);
	}

	public void deleteBoardLike(HashMap<String, Object> map) {
		mapper.deleteBoardLike(map);
		
	}

	public int selectBoardLike(int bno) {
		return mapper.selectBoardLike(bno);
	}

	public int insertBoardHate(HashMap<String, Object> map) {
		return mapper.insertBoardHate(map);
	}

	public void deleteBoardHate(HashMap<String, Object> map) {
		mapper.deleteBoardHate(map);
	}

	public int selectBoardHate(int bno) {
		return mapper.selectBoardHate(bno);
	}

	public List<BoardDTO> selectSearchBoard(HashMap<String, String> map) {
		return mapper.selectSearchBoard(map);
	}
	
	
}





