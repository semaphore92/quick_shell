package com.example.quick_shell.member.model.response;


import com.example.quick_shell.member.domain.MemberOrgRel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberOrgRelResponse {

    private String jobName;

    private OrgResponse org;

    public MemberOrgRelResponse(String jobName, OrgResponse org) {
        this.jobName = jobName;
        this.org = org;
    }

    public static MemberOrgRelResponse from(MemberOrgRel memberOrgRel) {
        OrgResponse orgResponse = OrgResponse.from(memberOrgRel.getOrg());
        return new MemberOrgRelResponse(memberOrgRel.getJobName(), orgResponse);
    }
}
