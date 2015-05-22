package com.patterns2.abstractfactory;

public class RunAbstractFactoryTest {
	public static void main(String args[]){
		TestClient test = new TestClient();
		System.out.println("Run example for Japan");
		String countryCode = "JP";
		test.run(countryCode);

		System.out.println("Run example for US");
		countryCode = "US";
		test.run(countryCode);

		System.out.println("Run example for DE");
		countryCode = "DE";
		test.run(countryCode);
	}
}
