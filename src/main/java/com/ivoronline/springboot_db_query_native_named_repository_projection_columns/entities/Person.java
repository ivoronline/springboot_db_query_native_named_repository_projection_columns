package com.ivoronline.springboot_db_query_native_named_repository_projection_columns.entities;

import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
  name    = "PersonMapping",
  columns = {
    @ColumnResult(name = "name"),   //"John"
    @ColumnResult(name = "greet")   //"John is 20"
  }
)
@NamedNativeQuery(
  name             = "Person.selectPerson",
  query            = "SELECT id, name, age, name || ' is ' || age AS greet FROM Person WHERE name = :name",
  resultSetMapping = "PersonMapping"
)
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

}
