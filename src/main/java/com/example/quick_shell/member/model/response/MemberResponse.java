package com.example.quick_shell.member.model.response;

import com.example.quick_shell.member.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class MemberResponse {

    private String memId;

    private String memName;

    private List<MemberOrgRelResponse> memberOrgRels;

    public MemberResponse(String memId, String memName, List<MemberOrgRelResponse> memberOrgRels) {
        this.memId = memId;
        this.memName = memName;
        this.memberOrgRels = memberOrgRels;
    }

    public static MemberResponse from(Member member) {
        List<MemberOrgRelResponse> orgRels = member.getMemberOrgRels()
                .stream()
                .map(MemberOrgRelResponse::from)
                .collect(Collectors.toList());
        return new MemberResponse(member.getMemId(), member.getMemName(), orgRels);
    }


}
