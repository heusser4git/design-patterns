package Vinyl;

public class Lp extends Vinyl {
    public Lp(Config config) {
        super(config);
    }

    @Override
    public String toString() {
        return "Lp{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
