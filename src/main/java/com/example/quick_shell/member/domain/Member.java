package com.example.quick_shell.member.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "member")
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @Column(unique = true, nullable = false)
    private String memId;

    private String memName;


    @JsonManagedReference
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MemberOrgRel> memberOrgRels = new ArrayList<>();


    @Builder
    public Member(String memId, String memName, List<MemberOrgRel> memberOrgRels) {
        this.memId = memId;
        this.memName = memName;
        this.memberOrgRels = memberOrgRels;
    }

}
