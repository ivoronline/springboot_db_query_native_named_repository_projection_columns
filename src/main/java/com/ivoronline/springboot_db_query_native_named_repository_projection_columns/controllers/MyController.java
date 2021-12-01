package com.ivoronline.springboot_db_query_native_named_repository_projection_columns.controllers;

import com.ivoronline.springboot_db_query_native_named_repository_projection_columns.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON
  //================================================================
  @RequestMapping("SelectPerson")
  Object[] selectPerson() {
    Object[] objectArray = (Object[]) personRepository.selectPerson("John");
    return   objectArray;
  }

}


