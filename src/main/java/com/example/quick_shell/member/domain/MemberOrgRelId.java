package com.example.quick_shell.member.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MemberOrgRelId implements Serializable {

    private String memId;
    private String orgCode;

    // 기본 생성자
    public MemberOrgRelId(){

    }

    public MemberOrgRelId(String memId, String orgCode) {
        this.memId = memId;
        this.orgCode = orgCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberOrgRelId that = (MemberOrgRelId) o;
        return memId.equals(that.memId) && orgCode.equals(that.orgCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memId,orgCode);
    }
}
