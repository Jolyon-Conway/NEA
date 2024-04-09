import processing.core.*;
import objects.shape.*;
public class Sketch extends PApplet {
objects.shape dot;
    public void settings() {
        size(400, 400);
    }

    public void setup() {
        dot = new objects.shape(200, 200, 200, 200, 200);
    }

    public void draw() {
        background(37,37,37);
        fill(255);
        ellipse(dot.h, dot.w, 10, 10);

    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}

