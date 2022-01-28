package com.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.dto.MemberDTO;
import com.web.dto.StudentDTO;
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

	public MemberDTO selectMember(String id) {
		return mapper.selectMember(id);
	}

	public int updateMember(MemberDTO memberDTO) {
		return mapper.updateMember(memberDTO);
	}

	public List<MemberDTO> selectListMember(String search) {
		return mapper.selectListMember(search);
	}

	public List<StudentDTO> selectStudent() {
		return mapper.selectStudent();
	}
}








