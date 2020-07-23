package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emo_tab")
public class Employee {

  @Id
  @Column(name="emp_id_col")
  private Integer id;
  
  @Column(name = "emp_name_col")
  private Integer empName;
  
  @Column(name="emp_city_col")
  private Integer empCity;
}
