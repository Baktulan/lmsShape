public class Tringle extends Shape{
    private double q;
    private double w;
    private double e;

    public Tringle(double q, double w, double e) {
        this.q = q;
        this.w = w;
        this.e = e;
    }

    @Override
    public double getPerimetr() {
        return (q+w+e);
    }
}

