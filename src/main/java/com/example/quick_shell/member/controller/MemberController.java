package com.example.quick_shell.member.controller;

import com.example.quick_shell.member.domain.Member;
import com.example.quick_shell.member.model.request.MemberRequest;
import com.example.quick_shell.member.model.response.MemberResponse;
import com.example.quick_shell.member.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member")
@Api(value = "사용자 정보 API 목록")
public class MemberController {

    @Autowired
    private final MemberService memberService;

    @ApiOperation(value = "사용자 정보 조회", notes = "사용자 정보를 조회한다.")
    @PostMapping("/info")
    public MemberResponse getMemberInfo(HttpServletRequest request,
                                        @RequestBody MemberRequest memberRequest){

        String memId = memberRequest.getMemId();
        Member member = memberService.getMemberInfo(memId);

        return MemberResponse.from(member);

    }

}
