package state;

import game.Game;
import models.*;
public interface GameState {
    void handlemMove(Game game, Player player, int row, int col);
}
