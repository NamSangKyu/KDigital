package com.board.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.dto.BoardDTO;

@Mapper	
public interface BoardMapper {

	List<BoardDTO> selectBoardList(int page);

	int selectAllCount();

	int insertBoard(BoardDTO boardDTO);

	BoardDTO selectBoard(int bno);

	void addCount(int bno);

	void updateBoard(HashMap<String, Object> map);

	void deleteBoard(int bno);

	int insertBoardLike(HashMap<String, Object> map);

	void deleteBoardLike(HashMap<String, Object> map);

	int selectBoardLike(int bno);

	int insertBoardHate(HashMap<String, Object> map);

	void deleteBoardHate(HashMap<String, Object> map);

	int selectBoardHate(int bno);

}
