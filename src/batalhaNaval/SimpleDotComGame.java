package batalhaNaval;

import java.util.Scanner;

public class SimpleDotComGame {

	public static void main(String[] args) {
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom dot = new SimpleDotCom();
		int randomNum = (int) (Math.random()*5);
		int [] locations = {randomNum,randomNum+1,randomNum+2};
		dot.setLocationCells(locations);

		boolean isAlive = true;
		
		Scanner ler = new Scanner(System.in);
		
				
		while (isAlive==true) {
			System.out.printf("insira um número");
			String guess = helper.getUserInput("Insira um número");
			String result = dot.checkYourself(guess);
			numOfGuesses++;
			if(result.equals("kill")) {
				isAlive=false;
			}else {
				isAlive=true;
				System.out.println("Você usou " + numOfGuesses + "palpites");
			}
		}
		
	}
}