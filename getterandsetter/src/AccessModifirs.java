class Cylinder{
    private int radius;
    private  int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class AccessModifirs {
    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder(12, 9);
        myCylinder.setHeight(13);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // System.out.println(myCylinder.surfaceArea());

        System.out.println(myCylinder.volume());
    }
}
