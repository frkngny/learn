package nLayeredHW.core;

import java.rmi.RemoteException;

import nLayeredHW.business.abstracts.CustomerCheckService;
import nLayeredHW.entities.concretes.Customer;
import nLayeredHW.mernis.KPSPublicSoap;
import nLayeredHW.mernis.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// it doesn't work ????
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}
}
