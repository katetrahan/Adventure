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
                    //newGame.addScenarioOne();
                } else if(userInput.equals("quit")) {
                    alive = false;
                } else if(userInput.equals("yes")) {
                    System.out.println(newGame.scenarioOneMessage());
                    //newGame.addScenarioTwo();
                } else if(userInput.equals("no")) {
                    System.out.println(newGame.getLoseMessage());
                    alive = false;
                } else if(userInput.equals("stop for supplies")) {
                    System.out.println(newGame.scenarioTwoMessage());
                    //newGame.addScenarioThree();
                } else if(userInput.equals("continue")){
                    System.out.println(newGame.getLoseMessage());
                    alive = false;
                } else if(userInput.equals("wait for winter to pass")) {
                    System.out.println(newGame.scenarioThreeMessage());
                    //newGame.addScenarioFour();
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
                    System.out.println("Input not recognized.");
                }

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
