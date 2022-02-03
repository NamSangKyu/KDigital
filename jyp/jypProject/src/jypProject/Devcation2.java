package jypProject;

class BankAccount{
	int balance = 0;     // ¿¹±Ý ÀÜ¾×
	String accNumber;     // °èÁÂ¹øÈ£
    String ssNumber;     // ÁÖ¹Î¹øÈ£  
    
	
    BankAccount(String acc, String ss, int bal) {
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }
    BankAccount(String acc) {
        accNumber = acc;
        ssNumber = "";
        balance = 0;
    }
	
	public int deposit(int amount) {
        balance += amount;
        return balance;
	}    

	public int withdraw(int amount) {
	    balance -= amount;
	    return balance;
	}

	public int checkMyBalance() {
		 System.out.println("°èÁÂ¹øÈ£: " + accNumber);
	     System.out.println("ÁÖ¹Î¹øÈ£: " + ssNumber);
	     System.out.println("ÀÜ    ¾×: " + balance + '\n');
	    return balance;
	}
}

public class Devcation2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    BankAccount dev = new BankAccount("1234");
        BankAccount cation = new BankAccount("4321","870215",1000);

        dev.deposit(5000);
        cation.deposit(3000);

        dev.withdraw(2000);
        cation.withdraw(2000);

        dev.checkMyBalance(); // 3000
        cation.checkMyBalance();   // 1000
		
	}

	

}
