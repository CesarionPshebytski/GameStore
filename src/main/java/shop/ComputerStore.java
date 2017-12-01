package shop;

import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private final List<ComputerGame> computerGames = new ArrayList<>();

    public ComputerStore() {

    }

    public boolean addGame(ComputerGame computerGame) {
        if(!computerGames.contains(computerGame)) {
            computerGames.add(computerGame);
            return true;
        }
        return false;
    }

    public List<ComputerGame> search(GameSpecs searchSpecs) {
        List<ComputerGame> games = new ArrayList<>();
        for (ComputerGame computerGame : computerGames) {
            if (computerGame.getGameSpecs().matches(searchSpecs)) {
                games.add(computerGame);
            }
        }
        return games;
    }
}
