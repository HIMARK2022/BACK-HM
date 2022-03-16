package com.himark.service;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

import com.himark.domain.MemberVO;
import com.himark.mapper.MemberMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	private MemberMapper mapper;
	
	@Override
	public MemberVO getMember(String userName) {
		return mapper.getMember(userName);
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

}
