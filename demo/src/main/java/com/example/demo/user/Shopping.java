package com.example.demo.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Shopping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int UserID;
    private int value;

    private String name;
    private String description;
    private Date date;

    public Shopping() {

    }

    public Shopping(int userID, int value, String name, String description, Date date) {
        UserID = userID;
        this.value = value;
        this.name = name;
        this.description = description;
        this.date = date;
    }
}
