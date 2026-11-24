package models;

import enums.Symbol;
import exceptions.InvalidMoveExceptions;

public class Board {
    private final int size;
    private final Cell[][] board;
    private int movesCount;
    
    public Board(int size){
        this.size=size;
        this.board=new Cell[size][size];
        this.movesCount=0;
        initializerBoard();
    }

    public void initializerBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                board[i][j]=new Cell();
            }
        }
    }

    public boolean placeSymbol(int row, int col, Symbol symbol) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            throw new InvalidMoveExceptions("Invalid position: out of bounds.");
        }
        if (board[row][col].getSymbol() != Symbol.EMPTY) {
            throw new InvalidMoveExceptions("Invalid position: cell is already occupied.");
        }
        board[row][col].setSymbol(symbol);
        movesCount++;
        return true;
    }

  public Cell getCell(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return null;
        }
        return board[row][col];
    }

    public boolean isFull() {
        return movesCount == size * size;
    }

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < size; i++) {
            System.out.print("| ");
            for (int j = 0; j < size; j++) {
                Symbol symbol = board[i][j].getSymbol();
                System.out.print(symbol.getChar() + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public int getSize() {
        return size;
    }

}
