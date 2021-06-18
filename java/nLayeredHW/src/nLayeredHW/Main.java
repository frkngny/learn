package nLayeredHW;

import java.util.Date;

import nLayeredHW.business.abstracts.*;
import nLayeredHW.business.concretes.*;
import nLayeredHW.core.MernisServiceAdapter;
import nLayeredHW.entities.concretes.Customer;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "Furkan", "Güney", new Date(19, 03, 1998), "50296411806"));
		

	}

}
