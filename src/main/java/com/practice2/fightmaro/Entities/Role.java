package com.practice2.fightmaro.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Role {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String RoleName;
}
