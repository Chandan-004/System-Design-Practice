package state;

import exceptions.InvalidMoveExceptions;
import game.Game;
import models.Player;

public class DrawState implements GameState {
    @Override
    public void handleMove(Game game, Player player, int row, int col) {
        throw new InvalidMoveExceptions("Game is already over. It was a draw.");
    }
}