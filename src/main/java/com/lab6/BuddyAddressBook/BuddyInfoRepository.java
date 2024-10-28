package com.lab6.BuddyAddressBook;

import com.lab6.BuddyAddressBook.BuddyInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Integer> {
    List<BuddyInfo> findByName(String name);

    BuddyInfo findById(long id);
}
