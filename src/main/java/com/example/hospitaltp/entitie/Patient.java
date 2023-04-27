package com.example.hospitaltp.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.Date;
@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;
    boolean malade;
    int score;
}
