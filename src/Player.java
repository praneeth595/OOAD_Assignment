import java.util.Scanner;

class Player{
    char myChar;
    int col;
    int row;
    Player(char myChar){
        this.myChar=myChar;
    }

    void play(GameBoard gb){
        System.out.println("Player "+myChar+" enter at position :");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        col=sc.nextInt();
        if(!gb.addCharInAtPosition(row,col,myChar)) {
            System.out.println("Play Again");
            play(gb);
        }


    }
}

