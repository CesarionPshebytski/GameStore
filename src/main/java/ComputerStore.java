import java.util.LinkedList;
import java.util.List;

class ComputerStore {
    private final List<ComputerGame> computerGames;

    ComputerStore() {
        computerGames = new LinkedList<>();
    }

    void addGame(ComputerGame computerGame) {
        computerGames.add(computerGame);
    }

    List<ComputerGame> search(GameSpecs searchSpecs) {
        List<ComputerGame> games = new LinkedList<>();
        for (ComputerGame computerGame : computerGames) {
            if (computerGame.getGameSpecs().matches(searchSpecs)) {
                games.add(computerGame);
            }
        }
        return games;
    }
}
