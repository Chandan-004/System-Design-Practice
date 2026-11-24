package strategy;

import models.*;

public interface WinnigStrategy {
    boolean checkWinner(Board board, Player player);    
}