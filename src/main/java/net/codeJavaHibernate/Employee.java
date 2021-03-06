package net.codeJavaHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	   @Id
	   @Column(name = "id")
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Integer id;
	   private String firstName; 
	   private String lastName;   
	   private int salary;  

	   public Employee() {}
	   
	   public Employee(String fname, String lname, int salary) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.salary = salary;
	   }
	   
	   public Integer getId() {
	      return id;
	   }
	   
	   public void setId( Integer id ) {
	      this.id = id;
	   }
	   
	   public String getFirstName() {
	      return firstName;
	   }
	   
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   
	   public int getSalary() {
	      return salary;
	   }
	   
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }
	}