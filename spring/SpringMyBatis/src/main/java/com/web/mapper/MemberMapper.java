package com.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.dto.MemberDTO;
import com.web.dto.StudentDTO;

@Mapper
public interface MemberMapper {
	public List<MemberDTO> selectAllMember();

	public int insertMember(MemberDTO memberDTO);

	public int deleteMember(String id);

	public MemberDTO selectMember(String id);

	public int updateMember(MemberDTO memberDTO);

	public List<MemberDTO> selectListMember(String seach);

	public List<StudentDTO> selectStudent();
}
