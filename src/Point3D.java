public class Point3D extends Point2D {
    private float z = 0.0f;

    // Constructors
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
    }

    // Getter and setter for z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Set x, y, and z
    public void setXYZ(float x, float y, float z) {
        setXY(x, y); // Calls setXY from Point2D
        this.z = z;
    }

    // Get x, y, and z as an array
    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
