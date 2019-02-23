package com.iftakhar.boot.com.iftakhar.boot.entity;

import javax.persistence.*;

@Entity(name = "aadhaar_detail")
public class Aadhaar {
    @Id
    @GeneratedValue
    @Column(name = "aadhaar_id")
    private Integer id;

    @Column(name = "aadhhar_number")
    private String aadhaarNumber;

    @OneToOne(mappedBy = "aadhaar", fetch = FetchType.LAZY)
    private Citizen citizen;

    public Aadhaar() {
    }

    public Aadhaar(Integer id, String aadhaarNumber, Citizen citizen) {
        this.id = id;
        this.aadhaarNumber = aadhaarNumber;
        this.citizen = citizen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public Citizen getCitizen() {
        return this.citizen;
    }

    public void setCitizen(Citizen citizen) {
        this.citizen = citizen;
    }
}
