package com.saoke.mttq.model;

import jakarta.persistence.*;


import javax.xml.crypto.Data;



@Entity
@Table(name = "vietcombank")
public class SaokeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "date")
    private String date;
    @Column(name = "transaction_Code", length = 1000)
    private String transactionCode;
    @Column(name = "description", length = 1000)
    private String description;

    public SaokeModel() {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}