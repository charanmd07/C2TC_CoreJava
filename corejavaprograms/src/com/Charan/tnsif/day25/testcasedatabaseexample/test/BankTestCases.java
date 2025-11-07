//Program to demonstrate Test Cases - Bank Test Case to validate AccNo
package com.Charan.tnsif.day25.testcasedatabaseexample.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.Charan.tnsif.day25.testcasedatabaseexample.dao.DBUtil;
import com.Charan.tnsif.day25.testcasedatabaseexample.service.SavingAccountService;



class BankTestCases {
	SavingAccountService service;

	@ParameterizedTest
	@ValueSource(ints = { 1001, 1006 })
	void validateAccountTest(int accNo) {
		service = new SavingAccountService();
		boolean status = service.validateAccount(accNo);
		// assertEquals(true, status);
		assertTrue(status);
	}

	@Test
	void testNotNullConnection() {
		assertNotNull(DBUtil.getConnection());
	}

	
}
