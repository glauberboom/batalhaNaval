package batalhaNaval;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
		
	}

	public String checkYourself(String guess2) {
		int guess = Integer.parseInt(guess2);
		
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
