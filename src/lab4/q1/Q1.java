package lab4.q1;

class Account {
	long accNum;
	Double balance;
	String accHolder;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

}

class Person extends Account {

	String name;
	float age;

	public Person(String name, float age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public Person(long accNum, double balance, String accHolder) {
		// TODO Auto-generated constructor stub
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	final float minBal = 1000;
	boolean oLimit;

	void withdraw(double minBal) {
		System.out.println("Availabe Balance : " + balance);
		minBal -= balance;
		System.out.println(oLimit = true);
		if (balance < 1000) {
			minBal += balance;
			System.out.println(oLimit = false);

		}
		System.out.println("Rs. : " + balance + "/-Debited");
		System.out.println("Balance : " + minBal);
	}

	double balance;

	void deposit(double deposit) {

		double deposit1 = 2000;

		balance = balance + deposit1;
		System.out.println(balance);
	}

}

class Q4 {
	public static void main(String arg[]) {
		Person c1 = new Person(1, 2000, "Smith");
		System.out.println(c1.accNum);
		System.out.println(c1.balance);
		System.out.println(c1.accHolder);

		Person c2 = new Person(2, 3000, "Kathy");
		System.out.println(c2.accNum);
		System.out.println(c2.balance);
		System.out.println(c2.accHolder);

		c1.withdraw(2000);
		c2.deposit(2000);

	}
}
