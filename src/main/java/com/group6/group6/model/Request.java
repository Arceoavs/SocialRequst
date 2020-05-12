package com.group6.group6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCreation;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Request {  // extends Topic?
    /*
    * Attributes
    */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Title required")
    @Size(min = 1, message = "Title required")
    private String title;

    private String description;

    private long[] location = new long[2]; //is this a good solution for the location?

    @GeneratedValue(strategy = GenerationType.AUTO)
    private DateTimeAtCreation createdAt; //Todo: test if this works

    // private User userID; //User Model required

    /*
    * Getter and Setter
    */
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setLocation(long longitude, long latitude){
        this.location[0] = longitude;
        this.location[1] = latitude;
    }

    public long[] getLocation(){
        return location;
    }

    public DateTimeAtCreation getCreatedAt(){
        return this.createdAt;
    }

    public void setCreatedAt(DateTimeAtCreation createdAt){
        this.createdAt = createdAt;
    }

    // private User getUserId()[
    //     return this.userId();
    // ]

    // private void setUserId(User id){
    //     this.userId = id;
    // }
}