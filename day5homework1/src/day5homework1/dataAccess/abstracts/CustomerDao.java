package day5homework1.dataAccess.abstracts;

import day5homework1.entities.concretes.Customer;

public interface CustomerDao {
	void signUp(Customer customer);
	void signIn(Customer customer);
	
}
