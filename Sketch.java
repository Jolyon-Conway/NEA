import processing.core.*;

public class Sketch extends PApplet {

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(255);
    }

    public void draw() {
        fill(0);
        ellipse(mouseX, mouseY, 20, 20);
    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}