package com.lab6.BuddyAddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class AddressBookController {

    private final AddressBookRepository addressBookRepository;

    @Autowired
    public AddressBookController(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    @GetMapping("/AddressBookController")
    public String greeting(@RequestParam("bookId") int id, Model model) {
        Optional<AddressBook> bookOpt = addressBookRepository.findById(id);

        if (bookOpt.isPresent()) {
            AddressBook book = bookOpt.get();
            model.addAttribute("addressBook", book);
            return "AddressBookController";
        } else {
            model.addAttribute("errorMessage", "Address Book not found");
            return "error";
        }
    }
}
