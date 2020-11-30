
public class Cube {

    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume() {
        int volumen = this.edgeLength * this.edgeLength * this.edgeLength;
        return volumen;
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
