
	public class PresentAcount extends Account {
		private int tradeLicenseNumber;
		private static final double MIN_BALANCE = 500.0;
		
		public PresentAcount() {
			
		}
		
		public PresentAcount(String memberName, double accountBalance) {
			super(memberName, accountBalance);
		}
		
		public void getBalance() {
			System.out.println(getAccountBalance());
		}

		public void withDraw(double amount) {
			if((getAccountBalance() - amount) >= MIN_BALANCE ) {
				setAccountBalance(getAccountBalance() - amount);
			} else {
				System.out.println("Insufficient funds");
			}
		}
	}


