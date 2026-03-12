// package com.example.demo.model;

// import jakarta.persistence.EmbeddedId;
// import jakarta.persistence.Entity;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @NoArgsConstructor
// @Entity(name = "role_permissions")
// public class RolePermissionCompose {
    
//     @EmbeddedId
//     private RolePermissionPK id;

//     @ManyToOne
//     @JoinColumn(name = "role_id")
//     private Role role;

//     @ManyToOne
//     @JoinColumn(name = "permission_id")
//     private Permission permission;
// }
