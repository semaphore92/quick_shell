package com.example.quick_shell.member.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "org")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Org {

    @Id
    @Column(unique = true, nullable = false)
    private String orgCode;

    private String orgName;

}
