package com.example.trabalhote;

public class Customer {
    private Integer id;
    private String creationTimestamp;
    private String birthDateInMillis;
    private boolean blacklist;
    private String name;
    private String phoneNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public String getBirthDateInMillis() {
        return birthDateInMillis;
    }

    public void setBirthDateInMillis(String birthDateInMillis) {
        this.birthDateInMillis = birthDateInMillis;
    }

    public boolean isBlacklist() {
        return blacklist;
    }

    public void setBlacklist(boolean blacklist) {
        this.blacklist = blacklist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
