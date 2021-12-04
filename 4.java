import java.util.Scanner;

abstract class Shape {
    double x, y;

    abstract void compute_area();
}

class Triangle extends Shape {
    void set_data(double x ,double y)
    {
        this.x = x;
        this.y = y;
    }

    void compute_area() {
        double area;
        area = 0.5 * x * y;
        System.out.println("The area of Triangle with base "+ x +" and " + "height "+ y+ " is : " + area);
        
    }
}

class Rectangle extends Shape {
    void set_data(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void compute_area(){
        double area;
        area = x*y;
        System.out.println("The area of Triangle with length "+ x +" and " + "breadth "+ y+ " is : " + area);
    }
}

public class pra4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of triangle :     ");
        float b = input.nextFloat();
        //Validation when dimension is zero
        while(b == 0)
        {
            System.out.println("WARNING : Base of traingle can't be zero !!");
            System.out.print("Enter the base of triangle :     ");
            b = input.nextFloat();
        }
        System.out.print("Enter the height of triangle :   ");
        float h = input.nextFloat();
        //Validation when dimension is zero
        while(h == 0)
        {
            System.out.println("WARNING : Height of triangle can't be zero !!");
            System.out.print("Enter the base of triangle :     ");
            h = input.nextFloat();
        }

        Triangle T = new Triangle();  // Creating object for Triangle
        T.set_data(b,h);
        T.compute_area();


        System.out.print("Enter the length of rectangle :  ");
        float len = input.nextFloat();
        //Validation when dimension is zero
        while(len == 0)
        {
            System.out.println("WARNING : Length of rectangle can't be zero !!");
            System.out.print("Enter the length of rectangle :  ");
            len = input.nextFloat();
        }
        System.out.print("Enter the breadth of rectangle : ");
        float bred = input.nextFloat();
        //Validation when dimension is zero
        while(bred == 0)
        {
            System.out.println("WARNING : Breadth of reactangle can't be zero !!");
            System.out.print("Enter the breadth of reactangle :  ");
            bred = input.nextFloat();
        }

        Rectangle R = new Rectangle();  // Creating object for Rectangle
        R.set_data(len,bred);
        R.compute_area();

        input.close();
    }
}
