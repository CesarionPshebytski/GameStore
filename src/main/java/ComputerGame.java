class ComputerGame {
    private static int idCounter = 1;

    private final int   id;
    private final GameSpecs gameSpecs;

    ComputerGame(GameSpecs specs) {
        this.gameSpecs = specs;
        this.id = idCounter;
        idCounter++;
    }

    int getId() {
        return id;
    }

    GameSpecs getGameSpecs() { return gameSpecs; }
}
