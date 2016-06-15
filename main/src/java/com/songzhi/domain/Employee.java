package com.songzhi.domain;

import javax.persistence.Entity;
import javax.persistence.Id; 

@Entity
public class Employee {
  @Id
  private String id;

  private String name;

  private String city;

  Employee() {
  }

  public Employee(final String id, final String name,final String city) {
      this.id = id;
      this.name = name;
      this.city = city;
  }

  public String getId() {
      return id;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getCity() {
      return city;
  }

  public void setCity(String city) {
      this.city = city;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
  }

  
}
