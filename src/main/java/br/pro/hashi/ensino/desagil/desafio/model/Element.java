package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Element {
    protected int row;
    protected int col;

    protected Element(int row, int col) {
        this.row = row;
        this.col = col;
    }

    protected Random getRandomNumber(){
      return new Random();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    protected void move(int rowShift, int colShift){
        row += rowShift;
        col += colShift;
    }
}
