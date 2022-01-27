package com.board.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.board.dto.MemberDTO;
import com.board.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}

	public MemberDTO login(String id, String passwd) {
		HashMap<String , String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("passwd", passwd);
		
		return mapper.login(map);
	}
	
}




