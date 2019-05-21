package batalhaNaval;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
		
	}

	public String checkYourself(int numOfGuesses) {
		int guess = numOfGuesses;
		
		String result = "miss";
		
		for(int cell : locationCells) {
			
			if(guess == cell ) {
				
				result = "hit";
				numOfHits++;
				break;
				
			}
		}
		
		if(numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

	

}
