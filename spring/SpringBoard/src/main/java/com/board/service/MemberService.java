package com.board.service;

import org.springframework.stereotype.Service;

import com.board.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
}
