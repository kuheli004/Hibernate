package com.javabrain.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@NamedQueries(
		{
			@NamedQuery(
					name="findEmployeeByName",
					query="from Employee  e where e.firstName=:name")
		}
		
		
		)




@Entity
@Table(name= "emp500")  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Employee {  
@Id
private int id;  
private String firstName,lastName;  
private int salary;
  
public int getId() {  
    return id;  
}  
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void setId(int id) {  
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
  
  
}  
