package com.javabrain.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
/*@DiscriminatorValue("RegularEmployee")*/
@Table(name="RegularEmployee200")
@AttributeOverrides({
@AttributeOverride(name="id",column=@Column(name="id")),
@AttributeOverride(name="firstName",column=@Column(name="firstName")),
@AttributeOverride(name="lastName",column=@Column(name="lastName")),
@AttributeOverride(name="salary",column=@Column(name="salary"))
})

@PrimaryKeyJoinColumn(name="id")
public class Regular_Employee extends Employee {
  
  @Column(name="salaryMonthly")    
  private float salaryMonthly;  
    
  @Column(name="bonus")     
  private int bonus;

  public float getSalaryMonthly() {
    return salaryMonthly;
  }

  public void setSalaryMonthly(float salaryMonthly) {
    this.salaryMonthly = salaryMonthly;
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }  
  
  
    

}
