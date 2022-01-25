package service;

import java.util.ArrayList;

import dao.BoardDAO;
import dto.BoardDTO;

public class BoardService {
	private static BoardService instance = new BoardService();

	private BoardService() {
	}

	public static BoardService getInstance() {
		if(instance == null)
			instance = new BoardService();
		return instance;
	}

	public ArrayList<BoardDTO> selectPageBoard(int pageNo) {
		return BoardDAO.getInstance().selectPageBoard(pageNo);
	}

	public void insertBoard(BoardDTO boardDTO) {
		BoardDAO.getInstance().insertBoard(boardDTO);
	}

	public BoardDTO selectBoard(int bno) {
		return BoardDAO.getInstance().selectBoard(bno);
	}

	public void deleteBoard(int bno) {
		BoardDAO.getInstance().deleteBoard(bno);
	}

	public void updateBoard(BoardDTO boardDTO) {
		BoardDAO.getInstance().updateBoard(boardDTO);
	}

	
}
