import java.util.Scanner;
public class woodle {
    public static void main(String[] args) {
        String word = "apple";
        Scanner input = new Scanner(System.in);
        int attemps = 0;
        while (true) {
            System.out.println("Enter a five letter word");
            String guess = input.nextLine();
            int correctLocation = 0;
            int correctLetter = 0;
            boolean usedAnswer = false;
            boolean usedGuess = false;
            for (int i = 0; i < 5; i++){
                if (guess.substring(i, i+1).equals(word.substring(i, I + 1))){
                    correctLocation ++;
                    usedAnswer = true;
                    usedGuess = true;
                }
            }
            for (int i = 0; i < 5; i++){
                if(usedGuess = false) {
                    for (int j = 0; j < 5; j++){
                        
                    }
                }
            }
    
        }
    }
}
