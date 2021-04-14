package com.example.trabalhote;

public class Customer {
    private Integer birthDateInMillis;
    private boolean blacklist;
    private String name;
    private String phoneNumber;

    public Integer getBirthDateInMillis() {
        return birthDateInMillis;
    }

    public void setBirthDateInMillis(Integer birthDateInMillis) {
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
