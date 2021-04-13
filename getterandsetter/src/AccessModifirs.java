class Cylinder{
    private int radius;
    private  int height;

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
}

public class AccessModifirs {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(13);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
    }
}
