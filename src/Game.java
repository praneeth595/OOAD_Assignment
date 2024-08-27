//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
//Game class
public  class Game {

    public static void main(String[] args) {
      //this game needs two players
      Player p1=new Player('X');
      Player p2=new Player('O');
      //creating object for board
      GameBoard gb=new GameBoard();
      boolean flag=true;
      boolean gameOver=false;
      //printing board
        gb.printBoard();

        //game algorithm
      while(!gameOver) {
          //altering players using flag variable
          if(flag){
              //calls play method in player class
              p1.play(gb);

              gb.printBoard();
              // checking for game result
              gameOver=checkGameResult(gb,p1);
              if(gameOver) {
                  System.out.println("Game Over Player "+p1.myChar+" Have Won!!!");
              }
              flag=false;
          }
          else{
              //calls play method in player class
              p2.play(gb);
              gb.printBoard();
              //checking for game result
              gameOver=checkGameResult(gb,p2);

              if(gameOver) {
                  System.out.println("Game Over Player "+p2.myChar+" Have Won!!!");
              }
              flag=true;
          }
          if(checkForDraw(gb)){
              break;
          }


      }




    }

    static boolean checkGameResult(GameBoard gb,Player p){
        for (int row = 0; row < gb.arr.length; row++) {
            if (gb.arr[row][0] == p.myChar && gb.arr[row][1] == p.myChar && gb.arr[row][2] == p.myChar) {
                return true;
            }
        }

        // check for col
        for (int col = 0; col < gb.arr[0].length; col++) {
            if (gb.arr[0][col] == p.myChar && gb.arr[1][col] == p.myChar && gb.arr[2][col] == p.myChar) {
                return true;
            }
        }

        // diagonal
        if (gb.arr[0][0] == p.myChar && gb.arr[1][1] == p.myChar && gb.arr[2][2] == p.myChar) {
            return true;
        }

        if (gb.arr[0][2] == p.myChar && gb.arr[1][1] == p.myChar && gb.arr[2][0] == p.myChar) {
            return true;
        }

        return false;
    }
    static boolean checkForDraw(GameBoard gb){
        int c=0;
        for (int row = 0; row < gb.arr.length; row++) {
            for (int col = 0; col < gb.arr[0].length; col++) {
                if (gb.arr[row][col] !=' ') {
                    c++;
                }
            }
        }
        if(c==((gb.arr[0].length)*(gb.arr.length))){
            System.out.println("GAME DRAW !!!");
            return true;
        }
        return false;
    }


}



