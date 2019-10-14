package Enum;

public class Calculation {

    public static double area (String shape, double ... a)
    {
        Geometry form = Geometry.valueOf(shape.toUpperCase());
        return form.area(a);
    }


}
