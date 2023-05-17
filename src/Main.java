
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Write here square sides: ");
        double a = scanner.nextDouble();
        Square square= new Square(a);
        System.out.println("Square P = "+square.getPerimetr());


        Scanner scanner1= new Scanner(System.in);
        System.out.println("Write Oval sides a,b");
        double a1= scanner1.nextDouble();
        double b1= scanner1.nextDouble();
        Oval oval= new Oval(a1,b1);
        System.out.println("Oval P= "+oval.getPerimetr());


        Scanner scanner2= new Scanner(System.in);
        System.out.println("Write tringle sides q,w,e");
        double q=scanner2.nextDouble();
        double w= scanner2.nextDouble();
        double e=scanner2.nextDouble();
        Tringle tringle= new Tringle(q,w,e);
        System.out.println("Tringle P = "+tringle.getPerimetr());

        Scanner scanner3= new Scanner(System.in);
        System.out.println("Write circle radius: ");
        double r=scanner3.nextDouble() ;
        Circle circle= new Circle(r);
        System.out.println("Circle P= "+circle.getPerimetr());


        Scanner scanner4= new Scanner(System.in);
        System.out.println("Write Trapazium sides ");
        double a2= scanner4.nextDouble();
        double a3= scanner4.nextDouble();
        double a4= scanner4.nextDouble();
        double a5= scanner4.nextDouble();
        Trapazium trapazium= new Trapazium(a2,a3,a4,a5);
        System.out.println("Trapazium sides = "+trapazium.getPerimetr());




    }
}
