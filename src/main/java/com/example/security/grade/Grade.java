package com.example.security.grade;


import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    @Id
    @GeneratedValue
    private Long id;

    private double value;
}
