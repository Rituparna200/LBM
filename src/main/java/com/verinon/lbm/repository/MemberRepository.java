package com.verinon.lbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verinon.lbm.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer>
{
    //List<MemberPojo> findByMember_name(String name);
}
