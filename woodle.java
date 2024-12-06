import java.util.Scanner;
public class woodle {
    public static void main(String[] args) {
        String word = "FROST";
        Scanner input = new Scanner(System.in);
        int attempts = 0;
        boolean isCorrect = false;
        
        while (!isCorrect) {
            System.out.println("Enter a five letter word:\n");
            String gguess = input.nextLine();
            String guess = gguess.toUpperCase();
            System.out.println();

            
            
            if (guess.length() != 5){
                System.out.println("That is not 5 letters, please enter a five letter word:");
            }
            
            int correctLocation = 0;
            int correctLetter = 0;
            
            for (int i = 0; i < 5; i++){
                if (guess.substring(i, i+1).equals(word.substring(i, i + 1))){
                    correctLocation ++;   
                }
            }
            
            for (int i = 0; i < 5; i++) {
                boolean alreadyMatched = false;
                
                if (!guess.substring(i, i + 1).equals(word.substring(i, i + 1)))
                    for (int j = 0; j < 5; j++){
                        if(guess.substring(i, i+1).equals(word.substring(j, j+1))){
                            for (int k = 0; k < i; k++){
                                if (guess.substring(k, k + 1).equals(word.substring(j, j +1))&& guess.substring(k, k+1).equals(guess.substring(i, i+1))){
                                    alreadyMatched = true;
                                    break;
                                }
                            }
                    if (!alreadyMatched){
                        correctLetter++;
                        break;
                    }
                }
            }
        }
         
            
            
        System.out.println(correctLocation + " in the correct location");
        System.out.println(correctLetter + " correct letter (wrong location)");
        attempts++;

        if  (correctLocation == 5){
            System.out.println();
            System.out.println("Congragulations! you guessed the word in " + attempts + " attempts");
            isCorrect=true;
        }
    }
    }
}
