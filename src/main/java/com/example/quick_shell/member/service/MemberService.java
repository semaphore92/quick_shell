package com.example.quick_shell.member.service;

import com.example.quick_shell.member.domain.Member;

import java.util.Optional;

public interface MemberService {

    public Member getMemberInfo(String memId);

}
