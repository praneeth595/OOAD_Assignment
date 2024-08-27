class GameBoard{
    char arr[][]=new char[3][3];
    GameBoard(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=' ';
            }

        }
    }


    boolean addCharInAtPosition(int x, int y,char myChar){

        if(x>=arr.length || y>=arr[0].length || x<0 || y<0 || arr[x][y]!=' '){
            System.out.println("Invalid Move!!!");
            return false;
        }
        arr[x][y]=myChar;
        return true;

    }
    void printBoard(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
