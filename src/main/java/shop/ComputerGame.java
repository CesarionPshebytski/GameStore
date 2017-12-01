package shop;

public class ComputerGame {
    private static int idCounter = 1;

    private final int   id;
    private final GameSpecs gameSpecs;

    public ComputerGame(GameSpecs specs) {
        this.gameSpecs = specs;
        this.id = ComputerGame.idCounter++;
    }

    public int getId() {
        return id;
    }

    public GameSpecs getGameSpecs() { return gameSpecs; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputerGame that = (ComputerGame) o;

        if (id != that.id) return false;
        return gameSpecs.equals(that.gameSpecs);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + gameSpecs.hashCode();
        return result;
    }
}
