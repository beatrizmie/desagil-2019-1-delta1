package br.pro.hashi.ensino.desagil.desafio.model;

public class Target extends Element {
    private final Board board;

    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    public void move(){
        while (row > 0 && col > 0 && row < board.getNumCols() - 1 && col < board.getNumCols() - 1){
            if (getRandomNumber().nextInt(4) == 0){
                if (!board.isWall(row, col++)) {
                  move(0, 1);
                }
            } if (getRandomNumber().nextInt(4) == 1) {
                if (!board.isWall(row++,col)){
                  move(1,0);
                }
            } if (getRandomNumber().nextInt(4) == 2) {
                if (!board.isWall(row,col--)){
                  move(0,-1);
                }
            } if (getRandomNumber().nextInt(4) == 3) {
                if (!board.isWall(row--, col)) {
                  move(-1, 0);
                }
            }
        }

    }
}
