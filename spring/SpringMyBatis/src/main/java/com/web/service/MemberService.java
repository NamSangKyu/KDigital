package com.web.service;

import java.util.List;

import com.web.dto.MemberDTO;
import com.web.mapper.MemberMapper;

public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<MemberDTO> selectAllMember(){
		return mapper.selectAllMember();
	}
}








