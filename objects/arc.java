package objects;
import objects.point;
import processing.core.PApplet;
public class arc {
    public point[] points;

    public arc(point[] points) {
        this.points = points;
    }

    public float[][] vectoriseAll(point[] points) {
        float[][] twoDpoints = new float[points.length][2];
        for (int i = 0; i < points.length; i++) {
            twoDpoints[i][0] = points[i].vectoriseX(points[i].x, points[i].z);
            twoDpoints[i][1] = points[i].vectoriseY(points[i].y, points[i].z);
        }
        return twoDpoints;
    }

    public void pointToPoint(float[][] twoDpoints, PApplet applet) {
        for (int i = 0; i < twoDpoints.length -1; i++) {
            applet.line(twoDpoints[i][0], twoDpoints[i][1], twoDpoints[i+1][0], twoDpoints[i+1][1]);
        }
    }

    // rotates all the vertices about the origin
    public void rotateAllX(float theta) {
        for (int i = 0; i < points.length; i++) {
            points[i].rotateX(theta);
        }
    }

    public void rotateAllY(float theta) {
        for (int i = 0; i < points.length; i++) {
            points[i].rotateY(theta);
        }
    }

    public void rotateAllZ(float theta) {
        for (int i = 0; i < points.length; i++) {
            points[i].rotateZ(theta);
        }
    }
}
