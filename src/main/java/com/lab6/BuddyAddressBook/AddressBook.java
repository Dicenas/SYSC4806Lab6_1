package com.lab6.BuddyAddressBook;

import com.lab6.BuddyAddressBook.BuddyInfo;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an AddressBook which stores a list of BuddyInfo objects.
 *
 * @author Daniel Godfrey 101156147
 */
@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id = null;

    @OneToMany(cascade = CascadeType.ALL)
    private List<BuddyInfo> myBuddies;

    public AddressBook(){
        myBuddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo aBuddy) {
        if(aBuddy != null){
            myBuddies.add(aBuddy);
        }
    }

    public BuddyInfo getBuddy(int id){
        return this.myBuddies.get(id);
    }

    public BuddyInfo removeBuddy(int index) {

        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }

    public void printBuddies() {
        for (BuddyInfo buddy : myBuddies) {
            System.out.println(buddy.getBuddyInfo());
        }
    }

    public List<BuddyInfo> getBuddies() {
        return myBuddies;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static void main(String[] args) {
        /*
        BuddyInfo buddy1 = new BuddyInfo("Tom", "123 Navan", "613-555-5555");
        BuddyInfo buddy2 = new BuddyInfo("Cristy", "321 Bronson", "416-555-5555");

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        addressBook.printBuddies();

         */
    }
}
