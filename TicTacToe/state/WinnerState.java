package state;

import exceptions.InvalidMoveExceptions;
import game.Game;
import models.Player;

public class WinnerState implements GameState {
    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        throw new InvalidMoveExceptions("Game is already over. " + game.getWinner().getName() + " has won.");
    }
}