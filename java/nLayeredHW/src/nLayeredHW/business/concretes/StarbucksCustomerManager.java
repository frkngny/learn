package nLayeredHW.business.concretes;

import nLayeredHW.business.abstracts.BaseCustomerManager;
import nLayeredHW.business.abstracts.CustomerCheckService;
import nLayeredHW.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Valid");
		}
	}
	
	
}
