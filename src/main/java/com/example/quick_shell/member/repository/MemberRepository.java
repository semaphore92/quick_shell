package com.example.quick_shell.member.repository;

import com.example.quick_shell.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member findByMemId(String memId);
}
