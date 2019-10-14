package Enum;

public class Calculation {

    public static double area (String shape, double ... a)
    {
        Geometry form;
        try{
            form = Geometry.valueOf(shape.toUpperCase());
            return Math.abs(form.area(a));
        } catch (IllegalArgumentException e){
            System.out.println("Wrong type or number of arguments");
            return 0;
        }
    }

    public static double circumference (String shape, double ... a)
    {
        Geometry form;
        try{
            form = Geometry.valueOf(shape.toUpperCase());
            return Math.abs(form.circumference(a));
        } catch (IllegalArgumentException e){
            System.out.println("Wrong type or number of arguments");
            return 0;
        }
    }


}
