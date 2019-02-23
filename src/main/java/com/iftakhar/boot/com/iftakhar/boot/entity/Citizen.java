package com.iftakhar.boot.com.iftakhar.boot.entity;

import javax.persistence.*;

@Entity
@Table(name = "citizen_details")
public class Citizen {
    @Id
    @GeneratedValue
    @Column(name = "citizen_id")
    private Integer id;

    @Column(name="citizen_name")
    private String Name;

    @Column(name = "citizen_age")
    private Integer Age;

    @OneToOne
    private Aadhaar aadhaar;

    public Citizen() {
    }

    public Citizen(String name, Integer age, Aadhaar aadhaar) {
        Name = name;
        Age = age;
        this.aadhaar = aadhaar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Aadhaar getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }
}
