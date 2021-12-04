import java.util.Scanner;

class Complex {
    float real, img; // data member

    // default constructor
    public Complex() {
        System.out.println(":::::::::::: ARITHMETIC OPERATIONS OF TWO COMPLEX NUMBERS ::::::::::::");
        real = 0;
        img = 0;
    }

    // parameterized constructor
    public Complex(float real, float img) {
        this.real = real;
        this.img = img;
    }

    // Displaying the Complex numbers taken from user
    public void Display(Complex C, Complex C2) {
        // Printing first complex number
        System.out.println("First Complex Numbers = (" + C.real + ")+(" + C.img + ")i");
        // Printing second complex number
        System.out.println("Second Complex Numbers = (" + C2.real + ")+(" + C2.img + ")i");
    }

    // addition of two complex number
    public void AddComp(Complex C, Complex C2) {
        float real, img;
        
        real = (C.real + C2.real);
        img = (C.img + C2.img);
        
        System.out.println("Addition of Complex Numbers =(" + real + ")+(" + img + ")i");
        // printing addition of two complex number
    }

    // subtraction of two complex number
    public void SubComp(Complex C, Complex C2) {
        
        float real, img;
        
        real = (C.real - C2.real);
        img = (C.img - C2.img);

        System.out.println("Substraction of Complex Numbers =(" + real + ")+(" + img + ")i");

    }

    // multiplication of two complex number
    public void MultiComp(Complex C, Complex C2) {
        float real, img;

        real = (C.real * C2.real - C.img * C2.img);
        img = (C.real * C2.img + C.img * C2.real);
    
        System.out.println("Multiplication of Complex Numbers =(" + real + ")+(" + img + ")i");
    }

    // division of two complex number
    public void DivComp(Complex C, Complex C2) {
        float real, img;

        // Validation : When denominator is zero
        if(C2.real == 0 && C2.img == 0)
        {
            System.out.println("Warning : For Division denominator can't be zero");
            return;
        }

        real = (C.real * C2.real + C.img * C2.img) / (C2.real * C2.real + C2.img * C2.img);
        img = (C.img * C2.real - C.real * C2.img) / (C2.real * C2.real + C2.img * C2.img);
    
        System.out.println("Division of Complex Numbers =(" + real + ")+(" + img + ")i");
    }

}

public class pra1 {

    public static void main(String[] args) {
        float x, y;
        Complex C = new Complex();
        Scanner input = new Scanner(System.in);
        System.out.println("NOTE : Enter the Complex number in x+yi format  ");

        // Taking input for First Number
        System.out.print("Enter real part of First Number         : ");
        x = input.nextFloat();
        System.out.print("Enter imaginary part of First Number    : ");
        y = input.nextFloat();
        Complex Com1 = new Complex(x, y);

        // Taking input for Second Number
        System.out.print("Enter real part of Second Number        : ");
        x = input.nextFloat();
        System.out.print("Enter imginary part of Second Number    : ");
        y = input.nextFloat(); 
        Complex Com2 = new Complex(x, y);
        input.close();

        System.out.print("\n");
        
        C.Display(Com1, Com2); // calling display function
        
        System.out.print("\n");
        
        C.AddComp(Com1, Com2); // calling addition function
        
        C.SubComp(Com1, Com2); // calling subtraction function
        
        C.MultiComp(Com1, Com2); // calling multiplication function
        
        C.DivComp(Com1, Com2); // calling division function
        
    }
}
