package shop;

public class GameSpecs {
    private String name;
    private String description;
    private int restriction;
    private double price;
    private Object genre;
    private Object platform;

    public GameSpecs(String name, double price, int restriction, Genres genre,
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
        if (!genre.equals(searchSpecs.getGenre())) {
            return false;
        }
        if (!platform.equals(searchSpecs.getPlatform())) {
            return false;
        }
        return description.contains(searchSpecs.getDescription());
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameSpecs gameSpecs = (GameSpecs) o;

        if (restriction != gameSpecs.restriction) return false;
        if (Double.compare(gameSpecs.price, price) != 0) return false;
        if (!name.equals(gameSpecs.name)) return false;
        if (!description.equals(gameSpecs.description)) return false;
        if (!genre.equals(gameSpecs.genre)) return false;
        return platform.equals(gameSpecs.platform);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + restriction;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + genre.hashCode();
        result = 31 * result + platform.hashCode();
        return result;
    }
}
