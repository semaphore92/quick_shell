package com.example.quick_shell.member.service;

import com.example.quick_shell.member.domain.Member;
import com.example.quick_shell.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public Member getMemberInfo(String memId) {

        Member memberInfo = memberRepository.findByMemId(memId);

        return memberInfo;
    }
}
