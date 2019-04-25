package com.cg.bankapp.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.bankapp.model.CustomerDetails;
import com.cg.bankapp.model.TransactionDetails;

class BankCollectionsDaoTest {
static	long acc;

	@BeforeAll
	public static void init() {
		customerDetails.setFirstname("shiva");
		customerDetails.setLastname("kumar");
		customerDetails.setAadharCardNo("123412391235");
		customerDetails.setAddress("noida");
		customerDetails.setBalance(1000);
		customerDetails.setEmail("shiva@gmil.com");
		customerDetails.setMobileNo("7512345678");
		customerDetails.setPanNo("12345678");
		customerDetails.setPassword("pwd");
		acc=dao.registration(customerDetails);
	}
	
	static CustomerDetails customerDetails=new CustomerDetails();

	static BankCollectionsDao dao=new BankCollectionsDaoImpl();

	 Map<Long, CustomerDetails> customers1 =  new TreeMap<Long, CustomerDetails>();
	 	
	@Test
	
	public void testRegistration() {
		customerDetails.setFirstname("shiva");
		customerDetails.setLastname("kumar");
		customerDetails.setAadharCardNo("123412391235");
		customerDetails.setAddress("noida");
		customerDetails.setBalance(1000);
		customerDetails.setEmail("shiva@gmil.com");
		customerDetails.setMobileNo("7512345678");
		customerDetails.setPanNo("12345678");
		customerDetails.setPassword("pwd");
//		customerDetails=null;
		assertEquals(123456791,dao.registration(customerDetails));
	}

	@Test
	public void testLogin() {
		customerDetails=dao.login(123456790, "pwd");
	assertEquals(acc, customerDetails.getAccountNo());
	}
	
	@Test
	void testValidation() {
		assertEquals(true, dao.validation("12356788"));
	}
	
	@Test
	void testWithdraw() {
		customerDetails.setAccountNo(123456790);
		customerDetails.setBalance(1000);
		assertEquals(950, dao.withdraw(123456790,50));
	}

	@Test
	void testDeposit() {
		assertEquals(1000, dao.deposit(123456790, 50));
	}

		@Test
	void testFundTransfer() {
		TransactionDetails details=new TransactionDetails();
		details.setFromAccountNo(123456789);
		details.setToAccountNo(123456787);
		details.setAmount_transfered(-1000);
		assertEquals(-1,dao.fundTransfer(details));
	}

}
