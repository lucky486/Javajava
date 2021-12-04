import java.util.Scanner;

class Publications
{
    String Title;
    double Price;
    int Copies_A; //Copies Available
    int Copies_S; //Copies Sold
    
    // Publications Class Constructor for setting default values
    public Publications()
    {
        Title = "";
        Price = 0.0;
        Copies_A = 0;
        Copies_S = 0;
    }

    // Declaring a method which will get overridden by the inherited class
    public void saleCopy()
    {
        System.out.println("\nSeparate Sale Copy for Book and Magazine!!!");
    }

    // Declaring method to return no. of copies sold.
    public int get_Copies()
    {
        return Copies_S;
    }

    // Common method for taking input
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Title:\t");
        Title = sc.nextLine();
        System.out.println("\nEnter Price:\t");
        Price = sc.nextDouble();
        System.out.println("\nEnter Number of copies Available:\t");
        Copies_A = sc.nextInt();   
    }

    // Method to display data
    public void display()
    {
        System.out.println("\nTitle:\t"+Title);
        System.out.println("\nPrice:\t"+Price);
        System.out.println("\nNumber of Copies Available:\t"+Copies_A);
    }
}

class Book extends Publications
{
    String author;

    //Book Class Constructor for setting default values
    public Book()
    {
        super();
        author="";
    }

    // Overriding the parent class method
    @Override
    public void saleCopy()
    {
        double total_sale = 0;
        total_sale = Price* Copies_S;
        System.out.println("\nTotal Sale Copy for Book!!!");
        display_book();
        System.out.println("\nTotal Sales for "+ author + " is " + total_sale);
    }

    // Method for ordering the no of copies.
    public void orderCopies()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many Copies of book you want to order ?");
        n = sc.nextInt();
        
        // VALIDATION : When no. of Copies available is smaller than the no. of copies for buying 
        while(n > Copies_A)
        {
            System.out.println("Sorry we don't have that much copies !! Try Again !!");
            System.out.println("\nHow many Copies of book you want to order ?");
            n = sc.nextInt();
        }
        
        Copies_S = Copies_S + n;
        Copies_A = Copies_A - n;
    }
    
    // Method for taking input
    public void input_book()
    {
        input(); // calling input from Publications class (Parent Class)
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Book Author:");
        author = sc.nextLine();
    }
    
    public void display_book()
    {
        display(); // calling display from Publications class (Parent Class)
        System.out.println("\nBook Author:\t" + author);
    }
}

class Magazine extends Publications
{
    int issue;
    
    // Magazine Class Constructor for setting default values
    public Magazine()
    {
        super();
        issue = 0;
    }
    
    // Overriding the parent class method
    @Override
    public void saleCopy()
    {
        double total_sale = 0;
        total_sale = Price*Copies_S;
        System.out.println("\nTotal Sale Copy for Magazine!!!");
        display();
        System.out.println("\nTotal Sales for "+ issue + " is " + total_sale);
    }
    
    // Method for taking input
    public void input_mag()
    {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Magazine Issue:\t");
        issue = sc.nextInt();
    }
    
    // Method to order magazine quantity
    public void orderQty()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQuantity of magazine you want to order?");
        n = sc.nextInt();
        
        // VALIDATION : When no. of Copies available is smaller than the no. of copies for buying
        while(n > Copies_A)
        {
            System.out.println("Sorry we don't have that much copies !! Try Again !!");
            System.out.println("\nHow many Copies of Magazine you want to order ?");
            n = sc.nextInt();
        }
        Copies_S = Copies_S + n;
        Copies_A = Copies_A - n;
    }
    
    public int receiveissue()
    {
        return issue;
    }
    
    // Method for displaying details for magazine
    public void display_mag()
    {
        display(); // calling display from Publications class (Parent Class)
        System.out.println("\nMagazine Issue:\t"+issue);
    }
}
public class pra2 {
    public static void main(String[] args) {

        Book b1 = new Book();
        
        // Dynamic method dispatch is the mechanism by which a call to an overridden method is resolved at run time, 
        // rather than compile time.
        // Java uses this fact to resolve calls to overridden methods at run time.
        
        
        Publications p1 = new Book(); // reference = super class &  object = subclass (Dynamic Method Dispatch)

        System.out.println("\n----------------------Book Data Entry-------------------------");
        b1.input_book();
        System.out.println("\n------------------Book Data Entry SuccessFul------------------");
        b1.display_book();
        System.out.println("\n--------------------------------------------------------------");
        b1.orderCopies();
        
        p1 = b1;  // Assigning all contents
        
        System.out.println("\n------------------Modified Details of the Book----------------");
        p1.saleCopy();
        System.out.println("\nTotal Copies Sold : "+p1.get_Copies());


        Magazine m1 = new Magazine();
        Publications t1 = new Magazine();


        System.out.println("\n--------------------Magazine Data Entry-----------------------");
        m1.input_mag();
        System.out.println("\n------------------Magazine Data Entry SuccessFul--------------");
        m1.display_mag();
        System.out.println("\n--------------------------------------------------------------");
        m1.orderQty();
        System.out.println("\n--------------------------------------------------------------");
        t1 = m1;  // Assigning all contents
        System.out.println("\n--------------Modified Details of the Magazine----------------");
        t1.saleCopy();
        System.out.println("\nAbove information is for issue : "+ m1.receiveissue());
        System.out.println("\n--------------------------------------------------------------");
    }
}
