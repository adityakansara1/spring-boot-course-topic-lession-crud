package com.api.coursetopiclession.model;

import org.springframework.context.annotation.Lazy;

import javax.persistence.*;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int ref_id;
    @ManyToOne
    private Course course;

    public int getRef_id() {
        return ref_id;
    }

    public void setRef_id(int ref_id) {
        this.ref_id = ref_id;
    }


    public Topic() {
    }

    public Topic(int id, String name, String description,int ref_id, Course course) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ref_id = ref_id;
        this.course = course;
    }

    public Topic(int id,String name, String description, Course course) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
