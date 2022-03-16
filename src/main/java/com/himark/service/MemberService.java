package com.himark.service;

import com.himark.domain.MemberVO;

public interface MemberService {
	
		//회원정보 보기
		public MemberVO getMember(String userName);
		
		//회원정보 수정
		public void updateMember(MemberVO vo);
		
		//회원정보 삭제
		public void deleteMember(MemberVO vo);
	
}
