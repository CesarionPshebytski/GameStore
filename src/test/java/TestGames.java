public class TestGames {
    public static GameSpecs GameSpecs1() {
        return new GameSpecs("Battlefield 1",39.99,18, Genres.ACTION, Platforms.WIN,
                "Travel back in time to The Great War, WW1, and join massive multiplayer battles with up to 64 players. " +
                        "Then experience the unique stories of soldiers across the entire theater of war in an adventure-filled campaign!");
    }

    public static GameSpecs GameSpecs2() {
        return new GameSpecs("DOTA2", 0, 0, Genres.MOBA, Platforms.LINUX,
                "The most-played game on Steam.");
    }
    public static GameSpecs GameSpecs3() {
        return new GameSpecs("GRID 2", 29.99, 0, Genres.SIMULATION, Platforms.MACOS,
                "Be fast, be first and be famous as the race returns in GRID 2, the sequel to the BAFTA-award winning, multi-million selling Race Driver: GRID. " +
                        "Experience aggressive racing against advanced AI and become immersed in the race with GRID 2’s new TrueFeel™ Handling system " +
                        "which powers edge of control exhilaration behind the wheel of every iconic car.");
    }
}