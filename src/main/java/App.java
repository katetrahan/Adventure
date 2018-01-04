import models.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
         boolean alive = true;


        System.out.println("Welcome to Oregon Trail Adventure! Type 'start' to play or 'quit' to end program.");

        while(alive){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            try {

                String userInput = bufferedReader.readLine();
                Game newGame = new Game(userInput);

                if (userInput.equals("start")) {
                    System.out.println(newGame.getCurrentMessage());
                } else if(userInput.equals("quit")) {
                    alive = false;
                } else if(userInput.equals("yes")) {
                    System.out.println(newGame.scenarioOneMessage());
                } else if(userInput.equals("no")) {
                    System.out.println(newGame.getLoseMessage());
                    alive = false;
                } else if(userInput.equals("stop for supplies")) {
                    System.out.println(newGame.scenarioTwoMessage());
                } else if(userInput.equals("continue")){
                    System.out.println(newGame.getLoseMessage());
                    alive = false;
                } else if(userInput.equals("wait for winter to pass")) {
                    System.out.println(newGame.scenarioThreeMessage());
                } else if (userInput.equals("brave the weather")) {
                    System.out.println(newGame.getLoseMessage());
                    alive = false;
                } else if (userInput.equals("wait for help")) {
                    System.out.println(newGame.scenarioFourMessage());
                    alive = false;
                } else if (userInput.equals("search for help")) {
                    System.out.println(newGame.getLoseMessage());
                    alive = false;
                } else {
                    System.out.println("Are you sure you don't want to play? (type 'start')");
                }



            }

            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
