package com.ivoronline.springboot_db_query_native_named_repository_projection_columns.controllers;

import com.ivoronline.springboot_db_query_native_named_repository_projection_columns.entities.Person;
import com.ivoronline.springboot_db_query_native_named_repository_projection_columns.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON BY NAME AGE
  //================================================================
  @RequestMapping("SelectPersonByNameAge")
  Object[] selectPersonByNameAge() {
    Object[] objectArray = personRepository.selectPersonByNameAge("John");
    return   objectArray;
  }

}


