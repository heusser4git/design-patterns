package Vinyl;

public class Ep extends Vinyl {
    public Ep(Config config) {
        super(config);
    }

    @Override
    public String toString() {
        return "Ep{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
