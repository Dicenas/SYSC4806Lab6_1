package com.lab6.BuddyAddressBook;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * This class represents a BuddyInfo object that stores a buddy's name, address, and phone number.
 *
 * @author Daniel Godfrey 101156147
 */
@Entity
public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    public BuddyInfo() {
        this("Henry", "123 Sesame Street", "248-434-5508");
    }
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public String getBuddyInfo() {
        return "Name: " + name + ", Address: " + address + ", Phone: " + phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        System.out.println("Hello " + buddy.getName());
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
