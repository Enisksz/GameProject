package concrete;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class CustomerManager implements CustomerService {

	private CustomerCheckService _customerCheckService;

	public CustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (_customerCheckService.CheckIfPerson(customer)) {
			System.out.println("M��teri eklendi : " + customer.getFirstName() +" "+ customer.getLastName());
		} else {
			System.out.println("B�yle biri yok :" + customer.getNationality());
		}
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : "+customer.getFirstName()+customer.getLastName());

	}

	@Override
	public void edit(Customer customer) {
		System.out.println("M��teri d�zenlendi : "+customer.getFirstName()+customer.getLastName());
	}

}
