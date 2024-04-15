import processing.core.*;
import objects.*;
public class Sketch extends PApplet {
    public point[] points;
    public point[] points2;
    public cuboid cuboid;
    public pyramid pyramid;


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
        cuboid = new cuboid(points);
        points2 = new point[4];
        points2[0] = new point(0f,0,0);
        points2[1] = new point(-0, 0, 100f);
        points2[2] = new point(100f, 120f, 100f);
        points2[3] = new point(0f, 0, -100f);
        pyramid = new pyramid(points2);
    }

    public void draw() {
        background(37,37,38);
        stroke(255);
        float[][] twoDpoints = cuboid.vectoriseAll(points);
        cuboid.pointToPoint(twoDpoints, this);
        cuboid.rotateAllY(1f);
        float[][] twoDpoints2 = pyramid.vectoriseAll(points2);
        pyramid.pointToPoint(twoDpoints2, this);
        pyramid.rotateAllX(1f);
    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}

