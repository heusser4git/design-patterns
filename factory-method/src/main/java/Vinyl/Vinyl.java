package Vinyl;

public class Vinyl {
    String color;
    String name;
    String artist;

    public Vinyl(Config config) {
        this.color = config.color;
        this.name = config.name;
        this.artist = config.artist;
    }

    @Override
    public String toString() {
        return "Vinyl{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
