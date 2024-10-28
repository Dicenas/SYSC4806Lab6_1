package com.lab6.BuddyAddressBook;


public class BuddyInfoDTO {
    private Integer addressBookId;
    private Integer buddyId;
    private BuddyInfo buddy;

    public BuddyInfoDTO(Integer addressBookId) {
        this.addressBookId = addressBookId;
        this.buddy = null;
        this.buddyId = null;
    }

    public BuddyInfoDTO(Integer addressBookId, BuddyInfo buddy) {
        this(addressBookId);
        this.buddy = buddy;
        this.buddyId = buddy.getId();
    }

}
