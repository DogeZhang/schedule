package com.dogezhang.schedule.modal;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String code;
    @OneToMany
    private List<Course> courses;
    private String[] freeTime = {"1111111","1111111","1111111","1111111","1111111","1111110"};

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

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public String[] getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(String[] freeTime) {
        this.freeTime = freeTime;
    }
}
