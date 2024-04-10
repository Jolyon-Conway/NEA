package objects;
import objects.point;
import processing.core.PApplet;
public class cuboid {
    public point[] points;

    public cuboid(point[] points) {
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
        //first point to 2nd 4th and 5th points
        applet.line(twoDpoints[0][0], twoDpoints[0][1], twoDpoints[1][0], twoDpoints[1][1]);
        applet.line(twoDpoints[0][0], twoDpoints[0][1], twoDpoints[3][0], twoDpoints[3][1]);
        applet.line(twoDpoints[0][0], twoDpoints[0][1], twoDpoints[4][0], twoDpoints[4][1]);
        //3rd point to 2nd 4th and 7th twoDpoints
        applet.line(twoDpoints[2][0], twoDpoints[2][1], twoDpoints[1][0], twoDpoints[1][1]);
        applet.line(twoDpoints[2][0], twoDpoints[2][1], twoDpoints[3][0], twoDpoints[3][1]);
        applet.line(twoDpoints[2][0], twoDpoints[2][1], twoDpoints[6][0], twoDpoints[6][1]);
        //6th point to 2nd 5th and 7th twoDpoints
        applet.line(twoDpoints[5][0], twoDpoints[5][1], twoDpoints[1][0], twoDpoints[1][1]);
        applet.line(twoDpoints[5][0], twoDpoints[5][1], twoDpoints[4][0], twoDpoints[4][1]);
        applet.line(twoDpoints[5][0], twoDpoints[5][1], twoDpoints[6][0], twoDpoints[6][1]);
        //8th point to 4th 5th and 7th twoDpoints
        applet.line(twoDpoints[7][0], twoDpoints[7][1], twoDpoints[3][0], twoDpoints[3][1]);
        applet.line(twoDpoints[7][0], twoDpoints[7][1], twoDpoints[4][0], twoDpoints[4][1]);
        applet.line(twoDpoints[7][0], twoDpoints[7][1], twoDpoints[6][0], twoDpoints[6][1]);
    }
}
