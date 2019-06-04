package batalhaNaval;

import java.util.ArrayList;

public class DotComBust {

		private GameHelper helper = new GameHelper();
		private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
		int numOfGuesses = 0;
		
		private void setUpGame() {
			DotCom one = new DotCom();
			DotCom two = new DotCom();
			DotCom three = new DotCom();
			one.setName("Pets.com");
			two.setName("eToys.com");
			three.setName("Go2.com");	
			dotComList.add(one);
			dotComList.add(two);
			dotComList.add(three);
			System.out.println("Seu objetivo é eliminar três dot coms.");
			System.out.println("Pets.com, eToys.com, Go2.com");
			System.out.println("Tente eliminar todas com o menos número de palpites");
			for(DotCom dotComToSet : dotComList) {
				ArrayList<String> newLocation = helper.placeDotCom(3);
				dotComToSet.setLocationCells(newLocation);
			}
		}
		
		private void startPlaying() {
			while(!dotComList.isEmpty()) {
				String userGuess = helper.getUserInput("Insira um palpite");
				checkUserGuess(userGuess);
			}
			finishGame();
		}
		
		private void checkUserGuess(String userGuess) {
			numOfGuesses++;
			String result = "errado";
			for(DotCom dotComToTest : dotComList) {
				result = dotComToTest.checkYourself(userGuess);
				if(result.equals("correto")) {
					break;
				}
				if(result.equals("eliminar")) {
					dotComList.remove(dotComToTest);
					break;
				}
			}
			System.out.println(result);
		}
		
		private void finishGame() {
			System.out.println("Todas as Dot Coms foram eliminadas! Agora seu conjunto está vazio.");
			if(numOfGuesses <=18) {
				System.out.println("Você só usou " + numOfGuesses + "palpites.");
				System.out.println("Você saiu antes de eliminar suas opções.");
				
			}else {
				System.out.println("Demorou demais." + numOfGuesses + "palpites");
				System.out.println("Não haverá pesca com essas opções");
			}
		}
		
		public static void main(String[] args) {
			DotComBust game = new DotComBust();
			game.setUpGame();
			game.startPlaying();
		}
		
}