public enum Platforms {
    WIN, MACOS, LINUX;

    @Override
    public String toString() {
        switch (this) {
            case WIN:
                return "Windows";
            case MACOS:
                return "macOS";
            case LINUX:
                return "linux";
            default:
                return "no such platform";
        }
    }
}
