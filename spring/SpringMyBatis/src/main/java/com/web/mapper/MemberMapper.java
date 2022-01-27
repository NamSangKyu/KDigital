package com.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	public List<MemberDTO> selectAllMember();

	public int insertMember(MemberDTO memberDTO);

	public int deleteMember(String id);
}
