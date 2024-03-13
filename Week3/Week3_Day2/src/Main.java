import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1. Guess the Number: In this game, the computer generates a random number,
        //         and the player has to guess it. The computer provides hints like "too high"
        //         or "too low" until the player guesses the correct number.

        // Գուշակիր համարը. Այս խաղում համակարգիչը պատահական թիվ է ստեղծում, և խաղացողը պետք է կռահի այն:
        // Համակարգիչը տալիս է «շատ բարձր» կամ «շատ ցածր» հուշումներ, մինչև խաղացողը կռահի ճիշտ թիվը:

/*
        Random rand = new Random();
        int random = rand.nextInt(10);
        System.out.println(random);

        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        while(userNum > random){
            System.out.println("Too low.");
            userNum = scanner.nextInt();

            while(userNum < random){
                System.out.println("Too high.");
                userNum = scanner.nextInt();
            }
            if(userNum == random){
                System.out.println("Yes.");
            }
        }
*/

        // Task 2. Դահիճ. Hangman-ը բառ գուշակելու խաղ է: Համակարգիչը պատահական բառ է ընտրում, և խաղացողը պետք է
        //         հերթով կռահի բառի տառերը: Յուրաքանչյուր սխալ գուշակությամբ գծվում է «դահիճի» կերպարի մի մասը։
        //         Խաղացողը պետք է կռահի բառը, նախքան գործչի ավարտը:

        //  Hangman is a word-guessing game. The computer selects a random word, and the player has to guess
        //  the letters in the word one by one. With each incorrect guess, a part of a "hangman" figure is drawn.
        //  The player must guess the word before the figure is complete.

/*
        String[] arrayWords = {"java", "notebook", "chair", "classroom", "table"};
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        String wordToGuess = arrayWords[rand.nextInt(0, arrayWords.length)];
        System.out.println("\nWord is a` " + wordToGuess);

        int count = 0;
        int maxcount = 6;

        StringBuilder guessedWord = new StringBuilder();

        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord.append("_");
        }

        System.out.println("\nWelcome to Hangman!");

        while (count < maxcount) {

            System.out.println("\nWord to guess: " + guessedWord);
            System.out.println("Incorrect guess left: " + (maxcount - count));
            System.out.println("Enter a letter: ");
            char guess = scanner.next().charAt(0);


            boolean isCorrectGuess = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) {
                    guessedWord.setCharAt(i, guess);
                    isCorrectGuess = true;
                }
            }

            if (!isCorrectGuess) {
                count++;
                System.out.println("Incorrect guess! Try again.");
            }

            if (guessedWord.toString().equals(wordToGuess)) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                break;
            }
        }
*/

/*
        String[] arrayWord = {"java", "notebook", "table", "chair", "pen"};
        Scanner scanner = new Scanner(System.in);
        Random randIndex = new Random();

        int index = randIndex.nextInt(0, arrayWord.length);
        String wordToGuess = arrayWord[index];
        System.out.println("Word is` " + wordToGuess);

        for (int i = 0; i < wordToGuess.length(); i++) {
            System.out.print("_");
        }

        int step = 0;
        int maxStep = 5;
        StringBuilder guess = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guess.append("_");
        }

        System.out.println("\nWelcome to Hangman.");
        while (step < maxStep) {
            System.out.println("\nWord to guess` " + guess);
            System.out.println("Steps = " + (maxStep - step));
            System.out.print("Enter a letter = ");
            char guessLetter = scanner.next().charAt(0);


            boolean isCorrectGuess = false;
            for (int i = 0; i < arrayWord.length; i++) {
                if (wordToGuess.charAt(i) == guessLetter) {
                    guess.setCharAt(i, guessLetter);
                    isCorrectGuess = true;
                }
            }

            if (!isCorrectGuess) {
                step++;
                System.out.println("Incorrect guess! Try again.");
            }

            if (guess.toString().equals(wordToGuess)) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                break;
            }
        }

 */

        // Task 3. Rock, Paper, Scissors: Create a game where the player and computer both choose rock, paper, or scissors.
        //         The winner is determined based on the rules: rock beats scissors, scissors beats paper, and paper beats rock.

        // Քար, թուղթ, մկրատ. Ստեղծեք խաղ, որտեղ խաղացողը և համակարգիչը երկուսն էլ ընտրում են քար, թուղթ կամ մկրատ:
        // Հաղթողը որոշվում է կանոնների հիման վրա՝ քարը հաղթում է մկրատին, մկրատը՝ թղթին, թուղթը՝ քարին։
/*
        String[] arrayWords = {"Rock", "Paper", "Scissors"};

        Random compRandom = new Random();
        int cIndex = compRandom.nextInt(0, arrayWords.length);
        String compWord = arrayWords[cIndex];
        System.out.println("\nComputer word is` " + compWord);

        Random playerRandom = new Random();
        int pIndex = playerRandom.nextInt(0, arrayWords.length);
        String playerWord = arrayWords[pIndex];
        System.out.println("Player word is` " + playerWord);

        if(compWord.equals("Rock") && playerWord.equals("Rock")) {
            System.out.println("No one.");
        } else if(compWord.equals("Rock") && playerWord.equals("Paper")) {
            System.out.println("Player is win.");
        } else if(compWord.equals("Rock") && playerWord.equals("Scissors")) {
            System.out.println("Computer is win.");
        }
        else if(compWord.equals("Paper") && playerWord.equals("Paper")) {
            System.out.println("No one.");
        } else if(compWord.equals("Paper") && playerWord.equals("Rock")) {
            System.out.println("Computer is win.");
        } else if(compWord.equals("Paper") && playerWord.equals("Scissors")) {
            System.out.println("Player is win.");
        }
        else if(compWord.equals("Scissors") && playerWord.equals("Scissors") ) {
            System.out.println("No one.");
        } else if(compWord.equals("Scissors") && playerWord.equals("Rock") ){
            System.out.println("Player is win.");
        } else if(compWord.equals("Scissors")  && playerWord.equals("Paper") ) {
            System.out.println("Computer is win.");
        }
*/


        // Task 4. Text Adventure Game: Design a text-based adventure game with a storyline, choices, and outcomes.
        //         Players navigate the story by making choices, and the game responds based on their decisions.

        // Տեքստային արկածային խաղ. Նախագծեք տեքստի վրա հիմնված արկածային խաղ՝ պատմվածքով, ընտրություններով և արդյունքներով:
        // Խաղացողները նավարկում են պատմությունը՝ ընտրություն կատարելով, և խաղը պատասխանում է նրանց որոշումների հիման վրա:




        // Task 5. Number Wizard: Similar to "Guess the Number," but with a twist. The computer thinks of a number,and the player
        //         tries to guess it. After each guess, the computer tells the player if the correct number is higher or lower.

        // Համարների հրաշագործ. Նման է «Guess the Number»-ին, բայց շրջադարձով: Համակարգիչը մտածում է թվի մասին, և խաղացողը փորձում
        // է գուշակել այն: Յուրաքանչյուր գուշակությունից հետո համակարգիչը խաղացողին ասում է՝ ճիշտ թիվը ավելի մեծ է, թե ցածր:

        // ????????????????????????????????????????????

        /*
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();

        Random rand = new Random();
        int random = rand.nextInt(10);
        System.out.println(random);

        while(random > userNum){
            System.out.println("Too low.");
            random = random - 1;

            while(random < userNum){
                System.out.println("Too high.");
                random = random + 1;
            }
            if(random == userNum){
                System.out.println("Yes.");
            }
        }
*/

        // Task 6. Minesweeper: Implement a text-based version of the Minesweeper game. The player is
        //         presented with a grid of hidden mines and numbers indicating the number of adjacent mines.
        //         The goal is to flag all the mines without triggering any of them.

        // Ականակիր. Իրականացնել Minesweeper խաղի տեքստային տարբերակը: Խաղացողին ներկայացվում է թաքնված ականների
        // ցանց և թվեր, որոնք ցույց են տալիս հարակից ականների քանակը: Նպատակն է դրոշակել բոլոր ականները՝ առանց
        // դրանցից որևէ մեկի գործարկման:

    }
}