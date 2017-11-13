class GameSpecs {
    private String name;
    private String description;
    private int restriction;
    private double price;
    private Object genre;
    private Object platform;

    GameSpecs(String name, double price, int restriction, Genres genre,
              Platforms platform, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.restriction = restriction;
        this.genre = genre;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRestriction() {
        return restriction;
    }

    public Object getGenre() {
        return genre;
    }

    public Object getPlatform() {
        return platform;
    }

    public String getDescription() {
        return description;
    }

    boolean matches(GameSpecs searchSpecs) {
        if (name != null && !(name.contains(searchSpecs.getName()))) {
            return false;
        }
        if (!(price <= searchSpecs.getPrice())) {
            return false;
        }
        if (!(restriction <= searchSpecs.getRestriction())) {
            return false;
        }
        if (genre.equals(Genres.ANY) && !genre.equals(searchSpecs.getGenre())) {
            return false;
        }
        if (!platform.equals(searchSpecs.getPlatform())) {
            return false;
        }
        return description.contains(searchSpecs.getDescription());
    }
}
