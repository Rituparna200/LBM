package com.verinon.lbm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verinon.lbm.entity.SmartBookSystem;

import java.util.List;

public interface SmartBookSystemRepository extends JpaRepository<SmartBookSystem, Integer>
{
    List<SmartBookSystem> findByMemberName(String memberName);
}
