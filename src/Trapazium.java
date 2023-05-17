public class Trapazium extends Shape {
    private double a2;
    private double a3;
    private double a4;
    private double a5;

    public Trapazium(double a2, double a3, double a4, double a5) {
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    @Override
    public double getPerimetr() {
        return a2+a3+a4+a5;
    }
}


