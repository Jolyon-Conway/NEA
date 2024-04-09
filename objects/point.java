package objects;
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
}
