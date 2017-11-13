public enum Genres {
    ACTION, MOBA, SIMULATION, ANY;

    @Override
    public String toString() {
        switch (this) {
            case ACTION:
                return "Action";
            case MOBA:
                return "Moba";
            case SIMULATION:
                return "Simulation";
            case ANY:
                return "Any";
            default:
                return "No such Genres";
        }
    }
}
