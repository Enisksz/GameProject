package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = true;
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationality()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
		}catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return result;

	}
	
	
}
