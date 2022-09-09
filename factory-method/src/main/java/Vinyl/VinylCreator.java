package Vinyl;

public final class VinylCreator {
    public static Vinyl create(Config config) {
        switch (config.type) {
            case "EP":
                return new Ep(config);
            case "LP":
                return new Lp(config);
            default:
                throw new Error("No Vinyl Type given");

        }
    }
}
