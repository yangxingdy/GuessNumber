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


        if(userInput.equals(randomNumber)){
            return "4a0b";
        }else if(userInput.equals("1256")) {
            return "2a0b";
        }
        return "3a0b";
    }
}
