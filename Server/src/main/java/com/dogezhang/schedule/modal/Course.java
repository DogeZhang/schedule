package com.dogezhang.schedule.modal;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private String id;
    private String name;
    private Integer type;
    @OneToOne
    private Teacher teacher;
    private String[] freeTime = {"1111111","1111111","1111111","1111111","1111111","1111110"};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String[] getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(String[] freeTime) {
        this.freeTime = freeTime;
    }
}
