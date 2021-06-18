package nLayeredHW.business.abstracts;

import nLayeredHW.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
