package com.example.quick_shell.member.model.response;

import com.example.quick_shell.member.domain.Org;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrgResponse {

    private String orgCode;

    private String orgName;

    public OrgResponse(String orgCode, String orgName) {
        this.orgCode = orgCode;
        this.orgName = orgName;
    }

    public static OrgResponse from(Org org) {
        return new OrgResponse(org.getOrgCode(), org.getOrgName());
    }
}