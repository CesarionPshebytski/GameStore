public enum Platforms {
    WIN("Windows"), MACOS("Macos"), LINUX("Linux");

    private String name;

    Platforms(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
