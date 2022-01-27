package com.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.dto.MemberDTO;
import com.web.mapper.MemberMapper;
@Service
public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<MemberDTO> selectAllMember(){
		return mapper.selectAllMember();
	}

	public int insertMember(MemberDTO memberDTO) {
		int count = 0;
		try {
			count =mapper.insertMember(memberDTO); 
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return count;
	}

	public int deleteMember(String id) {
		return mapper.deleteMember(id);
	}
}








