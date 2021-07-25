
	class Bank{
		int balance = 0;
		
		public int deposit(int amount) {
			balance += amount;
			return balance;
			}
		
		public int withdraw(int amount) {
			balance -= amount;
			return balance;
			}
		
		public int checkMybank() {
			System.out.println("잔액 :" + balance);
			return balance;
		}
}
	
	class DupRef{
		public static void main(String[] args) {
			Bank  ref1= new Bank();
			Bank ref2= ref1;   // ref1이 참조하는 대상을 ref2도 참조
			
			ref1.deposit(3000);
			ref2.deposit(2000);
			ref1.withdraw(500);
			ref2.withdraw(400);
			ref1.checkMybank();
			ref2.checkMybank();
			
			
		}
	}
