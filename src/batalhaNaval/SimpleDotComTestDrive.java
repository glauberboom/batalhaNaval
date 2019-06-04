package batalhaNaval;

import java.util.Scanner;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		DotCom dot = new DotCom();
		int [] locations = {2,3,4};
		dot.setLocationCells(locations);
//		String userGuess = "2";
//		String result = dot.checkYourself(userGuess);
		
		
		Scanner ler = new Scanner(System.in);
		int numOfGuesses = 0;
		
		System.out.printf("insira um número");
		numOfGuesses=ler.nextInt();
		
		while (!(dot.equals(null) )) {
			numOfGuesses=ler.nextInt();
//			String result = dot.checkYourself(userGuess);
		}

	}
}
