public class Vector3D {
    public static void main(String[] args) {
        Vector3D vector = new Vector3D(1.23456, 7.89012, 3.45678);
    }
    double x;
    double y;
    double z;
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
