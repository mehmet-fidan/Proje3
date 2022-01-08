package GameGuess;

public class Main {

    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        int random = guessGame.randomGenerator();
        guessGame.letsGuess(random);
    }


    /*
     Main methodunda
     İlk olarak randomGenerator method'undan random sayıyı alın
     Sonra LetsGuess method unu çağırın.
     randomGenerator,  LetsGuess method'unun parametresidir
     */


}
