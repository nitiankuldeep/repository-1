import java.util.*;
class Guesser{
	int guesserNumber;
	int passToUmpire() {
		Scanner sc = new Scanner(System.in);
		guesserNumber= sc.nextInt();
		 while(guesserNumber>10) {
			 System.out.println("Please Enter Number Between 1 and 10 only ");
			 guesserNumber= sc.nextInt();
		 }
			 
		return guesserNumber;
	}
}
class Player{
	int playerNumber;
	int passToUmpire() {
		Scanner sc = new Scanner(System.in);
		 playerNumber= sc.nextInt();
		while(playerNumber>10) {
			System.out.println("Enter Number Between 1 And 10 only ");
			playerNumber= sc.nextInt();
		}
		return playerNumber;
	}
}
class Umpire{
	int GuesserNumber;
	int numberOfPlayer;
	 void playersCount() {
		 int players;
		 System.out.println("Enter Number Of Players");
		 Scanner sc = new Scanner(System.in);
		numberOfPlayer=sc.nextInt();
		  }
	 int []numberCollectionFromPlayer() {
		 int [] playerNumber=new int [numberOfPlayer];
         for(int i=0;i<numberOfPlayer;i++) {
			Player p= new Player();
			System.out.println("Enter Players "+(i+1) +" Number Between 1 And 10");
			playerNumber[i]=p.passToUmpire();
		} 
         return playerNumber;
	}
	 
	void numberCollectionFromGuesser() {
		Guesser g=new Guesser();
		System.out.println("Enter Guesser Number Between 1 And 10");
		GuesserNumber=g.passToUmpire();
	}
	void decision(){
	int playerNumber[]	=numberCollectionFromPlayer();
		int number=0;
		for(int i=0;i<numberOfPlayer;i++) {
			if(playerNumber[i]==GuesserNumber) {
				number++;
				System.out.println("player "+(i+1)+" won the match");
			}
		}
		if(number==0)
        System.out.println("No One Won Try Again");		
	}
}

public class GueesGame {

	public static void main(String[] args) {
	Umpire u=new Umpire();
	u.playersCount();
	u.numberCollectionFromGuesser();
	u.decision();
	

	}

}
