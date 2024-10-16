public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    // Getter and setter for x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter and setter for y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Get both x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
