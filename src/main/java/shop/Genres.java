package shop;

public enum Genres {
    ACTION("Action"), MOBA("MOBA"), SIMULATION("Simulation");

    private String name;

    Genres(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
