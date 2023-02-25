public class MyCircle {
    /* Attributes/Data fields/Properties */
    private double x;
    private double y;
    private double radius;
    MyCircle () {
        x = 0;
        y = 0;
        radius = 1;
    }
    MyCircle (double radius) {
        x = 0;
        y = 0;
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            this.radius = 1;
        }
    }
    MyCircle (double x, double y) {
        this.x = x;
        this.y = y;
        radius = 1;
    }
    MyCircle ( double x, double y, double radius) {
        this.x = x;
        this.y = y;

        if (radius > 0) {
            this.radius = radius;
        }
        else {
            this.radius = 1;
        }
    }

    /* Method(s) */
    // Getters and Setters
    public double getX(/* add expected arguments here if needed */) {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY(/* add expected arguments here if needed */) {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getRadius(/* add expected arguments here if needed */) {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
    }



    // Other helpful methods
    public boolean contains(double x, double y) {
        double line = Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
        if (line > radius){
            return false;
        }
        else {
            return true;
        }
    }
}