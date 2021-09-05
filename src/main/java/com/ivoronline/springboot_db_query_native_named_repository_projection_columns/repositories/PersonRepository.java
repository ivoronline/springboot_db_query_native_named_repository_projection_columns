package com.ivoronline.springboot_db_query_native_named_repository_projection_columns.repositories;

import com.ivoronline.springboot_db_query_native_named_repository_projection_columns.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Object[] selectPersonByNameAge(String name);
}


