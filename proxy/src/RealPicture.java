public class RealPicture implements Picture {
    private String fileName;
    private volatile boolean loading = true;

    public RealPicture(String fileName) {
        this.fileName = fileName;
        loadFromServer(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromServer(String fileName) {
        System.out.println("Loading " + fileName);

        // Simulates download
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                loading = false;
                System.out.println("loading complete");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        while (loading) {
            System.out.println("loading in progress...");
        }
    }
}
