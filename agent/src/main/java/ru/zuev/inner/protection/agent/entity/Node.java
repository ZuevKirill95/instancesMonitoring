package ru.zuev.inner.protection.agent.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "NODES")
public class Node {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, length = 120)
    private String host;

    @Column(nullable = false, length = 50)
    private String ip;

    @Column(nullable = false, length = 50)
    private String state;

    @Column(nullable = false, name = "load_cpu")
    private Long loadCpu;

    @Column(nullable = false,  name = "free_ram")
    private Long freeRam;

    @Column(nullable = false, name = "total_ram")
    private Long totalRam;

    @Column(nullable = false, name = "free_hdd")
    private Long freeHdd;

    @Column(nullable = false, name = "total_hdd")
    private Long totalHdd;

    @Column(nullable = false, name = "free_jvm")
    private Long freeJvm;

    @Column(nullable = false, name = "total_jvm")
    private Long totalJvm;

    @Column(nullable = false, name = "session_count")
    private Long sessionCount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getLoadCpu() {
        return loadCpu;
    }

    public void setLoadCpu(Long loadCpu) {
        this.loadCpu = loadCpu;
    }

    public Long getFreeRam() {
        return freeRam;
    }

    public void setFreeRam(Long freeRam) {
        this.freeRam = freeRam;
    }

    public Long getTotalRam() {
        return totalRam;
    }

    public void setTotalRam(Long totalRam) {
        this.totalRam = totalRam;
    }

    public Long getFreeHdd() {
        return freeHdd;
    }

    public void setFreeHdd(Long freeHdd) {
        this.freeHdd = freeHdd;
    }

    public Long getTotalHdd() {
        return totalHdd;
    }

    public void setTotalHdd(Long totalHdd) {
        this.totalHdd = totalHdd;
    }

    public Long getFreeJvm() {
        return freeJvm;
    }

    public void setFreeJvm(Long freeJvm) {
        this.freeJvm = freeJvm;
    }

    public Long getTotalJvm() {
        return totalJvm;
    }

    public void setTotalJvm(Long totalJvm) {
        this.totalJvm = totalJvm;
    }

    public Long getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(Long sessionCount) {
        this.sessionCount = sessionCount;
    }
}
