package com.himark.domain;

import lombok.Data;

@Data
public class MemberVO {
	private String userId;
	private String userPwd;
	private String userName;
	private String pos;
	private String duty;
	private String dept;
	private String authorityCode;
	private String birth;
	private String sex;
	private String phoneNo;
	private String email;
	private String currentState;
}
