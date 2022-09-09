package Vinyl;

public class App {
    public static void main(String[] args) {
        Vinyl vinyl = VinylCreator.create(new Config("gruen", "U2", "Bono", "LP"));
        System.out.println(vinyl);

        Ep ep = (Ep)VinylCreator.create(new Config("rot", "band", "saenger", "EP"));
        System.out.println(ep);

    }
}
