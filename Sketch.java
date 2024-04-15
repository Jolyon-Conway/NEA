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
        points[0] = new point(100f, 100f, 100f);
        points[1] = new point(-100f, 100f, 100f);
        points[2] = new point(-100f, -100f, 100f);
        points[3] = new point(100f, -100f, 100f);
        points[4] = new point(100f, 100f, -100f);
        points[5] = new point(-100f, 100f, -100f);
        points[6] = new point(-100f, -100f, -100f);
        points[7] = new point(100f, -100f, -100f);
    }

    public void draw() {
        background(37,37,38);
        stroke(255);
        cuboid cuboid = new cuboid(points);
        float[][] twoDpoints = cuboid.vectoriseAll(points);
        cuboid.pointToPoint(twoDpoints, this);
        cuboid.rotateAllX(1f);
        cuboid.rotateAllY(1f);
        cuboid.rotateAllZ(1f);
    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}

