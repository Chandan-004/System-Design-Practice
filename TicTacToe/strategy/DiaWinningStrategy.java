package strategy;

import models.*;

public class DiaWinningStrategy implements WinnigStrategy {
    @Override 
    public boolean checkWinner(Board board, Player player){
        boolean mainDiaWin=true;
        for(int i=0; i<board.getSize(); i++){
            if(board.getCell(i, i).getSymbol() != player.getSymbol()){
                mainDiaWin=false;
                break;
            }
            if(mainDiaWin) return true;
        }

        boolean antiDiaWin=false;
        for(int i=0; i<board.getSize(); i++){
            if(board.getCell(i, board.getSize()-1-i).getSymbol() != player.getSymbol()){
                antiDiaWin=false;
                break;
            }
            if(antiDiaWin) return true;
        }

        return false;
    }
}
