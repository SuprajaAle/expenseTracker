package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.example.demo.validation.CheckUser;
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CheckUser
    private String name;
    @NotNull(message = "Dont leave this field empty")
    private String username;
    @NotNull(message = "Dont leave this field empty")
    private String password;
    @NotNull(message = "Dont leave this field empty")
    private String occupation;
    @NotNull(message = "Dont leave this field empty")
    private long income;

    public User(String name,String username, String password, String occupation,long income) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.occupation = occupation;
        this.income = income;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", occupation='" + occupation + '\'' +
                ", income=" + income +
                '}';
    }
}
