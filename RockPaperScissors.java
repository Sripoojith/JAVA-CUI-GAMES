import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    
		boolean win = false;
		char[] player = {'r','p','s'};
		
		
		Random ran = new Random();
		
		System.out.println("welocm rock paper sissors game");
		System.out.println("Enter r for rock \n s for sissors \n p for paper");
		while(!win){
		    char player1 = sc.next().charAt(0);
		    char player2 = player[ran.nextInt(player.length)];
		    System.out.println(player2);
		    
		    win = win(player1,player2);
		}
	
	}
	public static boolean win(char player1,char player2){
	    if(player1 == player2){
	        System.out.println("Draw");
		    return false;
		}
        if(player1 == 'r' && player2 == 's' || player1 == 'p' && player2 == 'r'|| player1 == 's' && player2 == 'p' ){
		     System.out.println("player1 is win");
		     return true;
		}
		if(player2 == 'r' && player1 == 's' || player2 == 'p' && player1 == 'r'|| player2 == 's' && player1 == 'p'){
		     System.out.println("player2 is win");
		     return true;
		}
		return false;
	}
}
