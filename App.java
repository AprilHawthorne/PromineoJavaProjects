
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Number 3a
		double itemAPrice = 15.15;
		double itemBPrice = 99.99;
		// Number 3b
		double amountOfMoneyInAmysWallet = 50.25;
		double amountOfMoneyInBobbysWallet = 110.00;
		//Number 3c
		int numberOfAmysFriends = 5;
		int numberOfBobbysFriends = 4;
		// Number 3d
		int amysAge = 30;
		int bobbysAge = 34;
		// Number 3e
		String amyFirstName = "Amy";
		String bobbyFirstName = "Bobby";
		// Number 3f
		String amyLastName = "Harrison";
		String bobbyLastName = "Harris";
		// Number 3g
		char amyMiddleInitial = 'G';
		char bobbyMiddleInitial = 'P';
		
		// Printed out lines for number 3
		System.out.println("The new book costs $" + itemAPrice);
		System.out.println("The new watch costs $" + itemBPrice);
		System.out.println("Amy has $" + amountOfMoneyInAmysWallet);
		System.out.println("Bobby has $" + amountOfMoneyInBobbysWallet);
		System.out.println("Amy has made " + numberOfAmysFriends + " friends each year");
		System.out.println("Bobby has made " + numberOfBobbysFriends + " friends each year");
		System.out.println("Amy is " + amysAge + " years old");
		System.out.println("Bobby is " + bobbysAge + " years old");
		System.out.println("Her first name is " + amyFirstName); 
		System.out.println("Amy's middle initial is " + amyMiddleInitial);
		System.out.println("Amy's last name is " + amyLastName);
		System.out.println("His first name is " + bobbyFirstName);
		System.out.println("Bobby's middle initial is " + bobbyMiddleInitial);
		System.out.println("Bobby's last name is " + bobbyLastName);
		
		// Number 4a
		double moneyLeftInAmysWallet = amountOfMoneyInAmysWallet - itemAPrice;
		double moneyLeftInBobbysWallet = amountOfMoneyInBobbysWallet - itemBPrice;
		// Number 4b
		int numberOfTotalAmyFriends = numberOfAmysFriends * amysAge;
		int numberOfTotalBobbyFriends = numberOfBobbysFriends * bobbysAge;
		// Number 4c
		String amysFullName =  amyFirstName + " " + amyMiddleInitial + " " + amyLastName;
		String bobbysFullName =  bobbyFirstName + " " + bobbyMiddleInitial + " " + bobbyLastName;
		
		// Printed out lines for number 4
		System.out.println("Amy bought the book and now has $" + moneyLeftInAmysWallet + " left");
		System.out.println("Bobby bought the watch and now has $" + moneyLeftInBobbysWallet + " left");
		System.out.println("Amy has made " + numberOfTotalAmyFriends + " friends in her lifetime");
		System.out.println("Bobby has made " + numberOfTotalBobbyFriends + " friends in his lifetime");
		System.out.println("Her full name is " + amysFullName);
		System.out.println("His full name is " + bobbysFullName);
		
	}

}
