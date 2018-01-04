package models;

import java.util.ArrayList;

public class Game {
    private String currentMessage;
    private ArrayList<String> scenarios;
    private String loseMessage;
    private String userInput;


        public Game(String userInput) {
            scenarios = new ArrayList<>();
            this.currentMessage = "You are in St. Louis, Missouri. Do you get on a wagon to Oregon? (Type: yes or no)";
            loseMessage = "You are dead.   :(";

            scenarios.add("You come across a town before the mountains. What do you do? (Type: 'stop for supplies' or 'continue')");
            scenarios.add("You've made it to the mountains and it is deep winter. What do you do? (Type: 'wait for winter to pass' or 'brave the weather')");
            scenarios.add("Your wagon wheel breaks. What do you do? (Type: 'wait for help' or 'search for help')");
            scenarios.add("Welcome to Oregon!!!   :)");

        }

        public String getLoseMessage() {
            return loseMessage;
        }


        public String getCurrentMessage(){
            return currentMessage;
        }

        public int getScenarioSize() {
            return scenarios.size();
        }

        public String scenarioOneMessage(){
            currentMessage = scenarios.get(0);
            return currentMessage;
        }

        public String scenarioTwoMessage(){
            currentMessage = scenarios.get(1);
            return currentMessage;
        }

        public String scenarioThreeMessage(){
            currentMessage = scenarios.get(2);
            return currentMessage;
        }
        public String scenarioFourMessage(){
            currentMessage = scenarios.get(3);
            return currentMessage;
        }

//        public String getResponse(){
//            return ;
//
//        }

    }



