package second;

public class ProxyPicture implements Picture {
    private String fileName;
    private RealPicture realPicture;

    public ProxyPicture(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realPicture == null) {
            realPicture = new RealPicture(fileName);
        }
        realPicture.display();
    }
}
