package batalhaNaval;

import java.util.*;


public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    
    public void setLocationCells(ArrayList<String> loc)
    {
        locationCells = loc;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    
    
    public String checkYourself(String userInput)
    {
        String result = "errado";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "eliminar";
            }
            else
            {
                result = "correto";
            }
        }
        return result;
    }
    
}
