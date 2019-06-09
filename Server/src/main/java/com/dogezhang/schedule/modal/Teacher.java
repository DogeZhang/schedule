package com.dogezhang.schedule.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String code;
    private String[] freeTime = {"1111111","1111111","1111111","1111111","1111111","1111110"};
    private Integer curTime;
    private Integer TotalTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String[] getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(String[] freeTime) {
        this.freeTime = freeTime;
    }

    public Integer getCurTime() {
        return curTime;
    }

    public void setCurTime(Integer curTime) {
        this.curTime = curTime;
    }

    public Integer getTotalTime() {
        return TotalTime;
    }

    public void setTotalTime(Integer totalTime) {
        TotalTime = totalTime;
    }
}
