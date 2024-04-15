package objects;
import objects.point;
import processing.core.PApplet;
public class pyramid {
    public point[] points;


    public pyramid(point[] points) {
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
        //1st point to other 3 points
        applet.line(twoDpoints[0][0], twoDpoints[0][1], twoDpoints[1][0], twoDpoints[1][1]);
        applet.line(twoDpoints[0][0], twoDpoints[0][1], twoDpoints[2][0], twoDpoints[2][1]);
        applet.line(twoDpoints[0][0], twoDpoints[0][1], twoDpoints[3][0], twoDpoints[3][1]);
        //2nd point to the 3rd and 4th point
        applet.line(twoDpoints[1][0], twoDpoints[1][1], twoDpoints[2][0], twoDpoints[2][1]);
        applet.line(twoDpoints[1][0], twoDpoints[1][1], twoDpoints[3][0], twoDpoints[3][1]);
        //3rd point to the 4th point
        applet.line(twoDpoints[2][0], twoDpoints[2][1], twoDpoints[3][0], twoDpoints[3][1]);
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