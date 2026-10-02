import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("****************");
        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("****************");
        JuniorDeveloper[] jrs = new JuniorDeveloper[5];
        MidDeveloper[] mids = new MidDeveloper[5];
        SeniorDeveloper[] seniors = new SeniorDeveloper[5];

        HRManager hr1 = new HRManager(1, "Zeynep", 75000, jrs, mids, seniors);
        JuniorDeveloper jr1 = new JuniorDeveloper(1,"Yavuz",60000);
        JuniorDeveloper jr2 = new JuniorDeveloper(2,"Ayse",55000);
        MidDeveloper md1 = new MidDeveloper(4,"Kubilay",90000);
        hr1.addEmployee(0,jr1);
        hr1.addEmployee(1,jr2);
        hr1.addEmployee(0,md1);
        System.out.println(Arrays.toString(jrs));
    }
}