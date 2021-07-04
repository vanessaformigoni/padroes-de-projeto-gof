package Proxy;

public class ProxyImage extends Image{
    private String fileName;
    private RealImage image;

    public ProxyImage(String fileName) {
        this.fileName=fileName;
    }

    public void displayImage() {
        if (image == null) {
            image = new RealImage(fileName);
        }
        image.displayImage();
    }
}
