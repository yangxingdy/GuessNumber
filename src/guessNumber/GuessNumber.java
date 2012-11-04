package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int[] inputs = parseString(userInput);
        int[] randomNum = parseString(randomNumber);
        int PlaceCorrects =0;
        int PlaceIncorrects=0;

        for (int i=0; i<4; i++)
        {
            if(inputs[i] == randomNum[i])
            {
                PlaceCorrects++;
            }
            else if (containsInput(randomNum,inputs[i]))
            {
                PlaceIncorrects++;
            }
        }

        return PlaceCorrects+"a"+PlaceIncorrects+"b";
    }

    private boolean containsInput(int[] randomNum, int input) {
        boolean boFlag = false;
        for (int i:randomNum)
        {
            if(i == input)
                return true;
        }
        return boFlag;  //To change body of created methods use File | Settings | File Templates.
    }

    private int[] parseString(String userInput) {
        int[] ilist = new int[4];
        for (int i =0; i< 4; i++)
        {
            ilist[i] = Integer.parseInt(userInput.substring(i,i+1));
        }
        return ilist;  //To change body of created methods use File | Settings | File Templates.
    }
}
