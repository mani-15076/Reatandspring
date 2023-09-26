package com.example.demo.model;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
public class ContactsController {
    private ContactRepository contactRepository;

    public ContactsController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @GetMapping("/contacts")
    Collection<Contact>contacts(){
        Collection<Contact>y= (Collection<Contact>) contactRepository.findAll();
        return y;
    }

    @PostMapping("/contacts")
    Collection<Contact>createContact(@Validated @RequestBody Contact contact) throws URISyntaxException {

        Contact result=contactRepository.save(contact);

        return (Collection<Contact>) ResponseEntity.ok().body(result);



    }
}
