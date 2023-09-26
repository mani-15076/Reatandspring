package com.example.demo.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ContactRepository extends CrudRepository<Contact,Long> {
}
