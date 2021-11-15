package com.example.opportunity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Opportuinty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
}
