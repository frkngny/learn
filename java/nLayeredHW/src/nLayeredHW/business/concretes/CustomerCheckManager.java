package nLayeredHW.business.concretes;

import nLayeredHW.business.abstracts.CustomerCheckService;
import nLayeredHW.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
