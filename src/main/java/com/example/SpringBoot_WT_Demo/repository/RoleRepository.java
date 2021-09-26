package com.example.SpringBoot_WT_Demo.repository;


import com.example.SpringBoot_WT_Demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}