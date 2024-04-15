package objects;
import java.lang.Math;
public class point {
    public float x, y, z;
    public float w, h;


    public point(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float vectoriseX (float x, float z) {
        this.w = x*(400/(600-z)) + 400;
        return this.w;
    }

    public float vectoriseY(float y, float z) {
        this.h = -y*(400/(600-z)) + 400;
        return this.h;
    }


    // rotates the point about the origin in a choses axis
    public void rotateX(float theta) {
        theta = theta * (float) (Math.PI / 180);
        float newY = (float) (this.y * Math.cos(theta) - this.z * Math.sin(theta));
        float newZ = (float) (this.y * Math.sin(theta) + this.z * Math.cos(theta));
        this.y = newY;
        this.z = newZ;
    }

    public void rotateY(float theta) {
        theta = theta * (float) (Math.PI / 180);
        float newX = (float) (this.x *Math.cos(theta) + this.z * Math.sin(theta));
        float newZ = (float) (-this.x * Math.sin(theta) + this.z * Math.cos(theta));
        this.x = newX;
        this.z = newZ;
    }

    public void rotateZ(float theta) {
        theta = theta * (float) (Math.PI / 180);
        float newX = (float) (this.x * Math.cos(theta) - this.y * Math.sin(theta));
        float newY = (float) (this.x * Math.sin(theta) + this.y * Math.cos(theta));
        this.x = newX;
        this.y = newY;
    }
}
