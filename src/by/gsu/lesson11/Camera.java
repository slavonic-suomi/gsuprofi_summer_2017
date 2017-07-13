package by.gsu.lesson11;

public class Camera extends Product<Camera> {
    private int zoom;

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "Camera{" + super.toString() +
                ", zoom=" + zoom +
                '}';
    }
}
