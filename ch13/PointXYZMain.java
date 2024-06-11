package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointXYZ;

public class PointXYZMain {

    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(3, 4, 5);

        double distanceXY = point.getXYDistance();
        double distanceXZ = point.getXZDistance();
        double distanceYZ = point.getYZDistance();
        double distanceXYZ = point.getXYZDistance();

        String pointOutput = point.convertToString();
        System.out.println("PointXYZ " + pointOutput);

        System.out.println("XY distance = " + distanceXY);
        System.out.println("XZ distance = " + distanceXZ);
        System.out.println("YZ distance = " + distanceYZ);
        System.out.println("XYZ distance = " + distanceXYZ);
    }
}
