package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Permission;

@Repository
public interface IPermissionRepository extends JpaRepository<Permission, Integer> {

    List<Permission> findByRolePermissions_Role_Users_Id(Integer userId);

}
