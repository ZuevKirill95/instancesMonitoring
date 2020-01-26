package ru.zuev.inner.protection.agent.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SERVICES")
public class Service {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 120)
    private String name;

    @Column(nullable = false, unique = true)
    private long nodeId;

    @Column(nullable = false, length = 50)
    private String state;

    @Column(nullable = false, length = 50)
    private String adminState;
}
