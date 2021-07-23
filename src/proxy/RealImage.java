package proxy;

public class RealImage extends Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk();
    }

    public RealImage() {
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + fileName);
    }

}
