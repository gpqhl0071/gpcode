package com.event;

public class EmployeeDTO {

  private Integer id;
  private String firstName;
  private String lastName;
  private String designation;

  public EmployeeDTO(String designation) {
    this.id = -1;
    this.firstName = "gao";
    this.lastName = "peng";
    this.designation = designation;
  }

  public EmployeeDTO() {
  }

  @Override
  public String toString() {
    return "EmployeeDTO{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", designation='" + designation + '\'' +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }
}
