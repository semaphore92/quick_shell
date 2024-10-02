package com.example.quick_shell.member.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "member_org_rel")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberOrgRel {

    @EmbeddedId
    private MemberOrgRelId id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @MapsId("memId")
    @JoinColumn(name = "mem_id")
    private Member member;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("orgCode")
    @JoinColumn(name = "org_code")
    private Org org;

    private String jobName;

}
