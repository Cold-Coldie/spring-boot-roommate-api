package com.coldie.roommateapi.entity;

import jakarta.persistence.*;

@Entity
public class Roommate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String course;
    private int level;

    public Roommate(Long id, String firstName, String lastName, String course, int level) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.level = level;
    }


    public Roommate() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
