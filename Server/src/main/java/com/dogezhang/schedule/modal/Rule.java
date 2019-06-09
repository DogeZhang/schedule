package com.dogezhang.schedule.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rule")
public class Rule {
    @Id
    @GeneratedValue
    private Integer id;
    private String[] freeTime = {"1111111","1111111","1111111","1111111","1111111","1111110"};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String[] getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(String[] freeTime) {
        this.freeTime = freeTime;
    }
}
