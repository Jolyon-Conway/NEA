import processing.core.*;
import objects.point;
import objects.arc;
import objects.cuboid;
import java.lang.Math.*;
public class Sketch extends PApplet {
    public point[] points;



    public void settings() {
        size(800, 800);
    }

    public void setup() {
        points = new point[8];
        points[0] = new point(-104.90f, -18.40f, 136.60f);
        points[1] = new point(68.30f, 81.70f, 136.60f);
        points[2] = new point(18.30f, 168.30f, -36.60f);
        points[3] = new point(-154.90f, 68.30f, -36.60f);
        points[4] = new point(-18.30f, -168.30f, 36.60f);
        points[5] = new point(154.90f, -68.30f, 36.60f);
        points[6] = new point(104.90f, 18.40f, -136.60f);
        points[7] = new point(-68.30f, -81.70f, -136.60f);
    }

    public void draw() {
        background(37,37,38);
        stroke(255);
        cuboid cuboid = new cuboid(points);
        float[][] twoDpoints = cuboid.vectoriseAll(points);
        cuboid.pointToPoint(twoDpoints, this);
    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}

