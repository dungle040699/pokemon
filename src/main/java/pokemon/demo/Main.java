package pokemon.demo;


import pokemon.demo.caller.Controller;

public class Main {

    public static void main(String[] args) {

       var caller = new Controller();
       caller.playGame();
    }
}
