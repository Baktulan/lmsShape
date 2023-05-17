public class Oval extends Shape{
    private double a1;
    private double b1;

    public Oval(double a1, double b1) {
        this.a1 = a1;
        this.b1 = b1;
    }

    @Override
    public double getPerimetr() {
        return (((Math.PI*a1*b1)+Math.pow(a1-b1,2))/(a1+b1))*4;
    }
}
