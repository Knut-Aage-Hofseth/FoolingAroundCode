package Enum;

public enum Geometry {
    SQUARE{
        @Override
        public double circumference(double ... a) {
            return a[0]*4;
        }

        @Override
        public double area(double ... a) {
            return a[0]*a[0];
        }
    }, RECTANGLE{
        @Override
        public double circumference(double ... a) {
            return a[0]*2+a[1]*2;
        }

        @Override
        public double area(double ... a) {
            return a[0]*a[1];
        }
    }, CIRCLE{
        @Override
        public double circumference(double ... a) {
            return 2*Math.PI*a[0];
        }

        @Override
        public double area(double ... a) {
            return Math.PI*a[0]*a[0];
        }
    }, TRIANGEL{
        @Override
        public double area(double... a) {
            return (a[0]*a[1])/2;
        }

        @Override
        public double circumference(double... a) {
            return a[0]+a[1]+a[2];
        }
    };


    public abstract double area (double ... a);
    public abstract double circumference(double ... a);

}
