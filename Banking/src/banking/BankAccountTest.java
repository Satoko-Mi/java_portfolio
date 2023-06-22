package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	//declare objects for testing
	Customer customer;
	BankAccount mycheckingAccount;
	BankAccount mySavingAccount; 

	@BeforeEach
	void setUp() throws Exception {
		
		this.customer = new Customer("Brandon");
		this.mycheckingAccount = new BankAccount("checking", this.customer);
		this.mySavingAccount = new BankAccount("savings", this.customer);
		
	}

	@Test
	void testDeposit() {
		
		//make deposit
		this.mycheckingAccount.deposit(100);
		
		//test that current balance is 100
		assertEquals(100, this.mycheckingAccount.balance);

		//make deposit of negative amount
		this.mycheckingAccount.deposit(-100);
		
		//balance should be the same
		assertEquals(100, this.mycheckingAccount.balance);
		
		//make deposit of negative amount
		this.mycheckingAccount.deposit(0);
		assertEquals(100, this.mycheckingAccount.balance);
		
	}

	@Test
	void testWithdraw() {
		//deposit initial 100 into savings
		this.mySavingAccount.deposit(100);
		//assert deposit amount
		assertEquals(100, this.mySavingAccount.balance);
		
		//try to make withdrawal of 80
		try {
			this.mySavingAccount.withdraw(80);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//balance should be 20
		assertEquals(20, this.mySavingAccount.balance);
		
		//try to withdraw amount grater than available balance
		//expect an exception
		assertThrows(Exception.class,() ->{
			this.mySavingAccount.withdraw((21));
		});
		
		//balance should be the same
		assertEquals(20, this.mySavingAccount.balance);
		
		//try to make withdrawal
		//does not throw exception
		assertDoesNotThrow(() -> {
			this.mySavingAccount.withdraw(19);
		});
		
		//balance should be 1
		assertEquals(1, this.mySavingAccount.balance);
		
	}
	


	@Test
	void testFastWithdraw() {
		//initial deposit
		this.mycheckingAccount.deposit(100);
		
		//try to make fast withdrawal
		//default amount is 60
		try {
			this.mycheckingAccount.fastWithdraw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(40, this.mycheckingAccount.balance);
		
		//reset the fast cash amount to 20
		this.mycheckingAccount.setFastCashAmount(20);
		
		//assert that an exception is not thrown when I make fast cash withdrawal
		assertDoesNotThrow(() -> {
			this.mycheckingAccount.fastWithdraw();
		});
		
		//check balance
		assertEquals(20, this.mycheckingAccount.balance);
		
		//set fast cash amount to negative value, which should be ignored
		this.mycheckingAccount.setFastCashAmount(-50);
		
		//should still withdrawal 20
		
		try {
			this.mycheckingAccount.fastWithdraw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//balance should be 0 after fast withdrawal
		assertEquals(0,mycheckingAccount.balance);
		
		assertThrows(Exception.class, () -> {
		this.mycheckingAccount.fastWithdraw();
		});
		

	}

}
