import java.util.Scanner;

class Employee {
    String Emp_name, Email_ID, address, mobile_no;
    float basic_salary;


    void display() {
        float DA, HRA, PF, club_Fund;
        DA = (basic_salary * 97) / 100;  
        HRA = (basic_salary * 10) / 100; 
        PF = (basic_salary * 12) / 100; 
        club_Fund = (basic_salary * 10) / 100;

        float gross_salary = basic_salary + DA + HRA - PF - club_Fund;
        float net_salary = gross_salary - 0.1f * gross_salary;
        System.out.println("Employee name              : " + Emp_name);
        System.out.println("Address                    : " + address);
        System.out.println("Mail_id of Employee        : " + Email_ID);
        System.out.println("Mobile number of employee  : " + mobile_no);

        System.out.println("The value of DA            : " + DA);
        System.out.println("The value of HRA           : " + HRA);
        System.out.println("The value of PF            : " + PF);
        System.out.println("The value of Club Fund     : " + club_Fund);

        System.out.println("Gross Salary of employee   : " + gross_salary);
        System.out.println("Net Salary of employee     : " + net_salary);
        System.out.println("\n");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, String mail_id, String mobile_no, float basic_salary) {
        System.out.println("<----------------------Pay slip of Programmer Employee------------------------->");
        Emp_name = name;
        this.address = address;
        Email_ID = mail_id;
        this.mobile_no = mobile_no;
        this.basic_salary = basic_salary;
    }
}

class TeamLead extends Employee {
    TeamLead(String name, String address, String mail_id, String mobile_no, float basic_salary) {
        System.out.println("<-----------------------Pay slip of TeamLead Employee-------------------------->");
        Emp_name = name;
        this.address = address;
        Email_ID = mail_id;
        this.mobile_no = mobile_no;
        this.basic_salary = basic_salary;
    }
}

class Assistant_Project_Manager extends Employee {
    Assistant_Project_Manager(String name, String address, String mail_id, String mobile_no, float basic_salary) {
        System.out.println("<----------------Pay slip of Assistant Project Manager Employee---------------->");
        Emp_name = name;
        this.address = address;
        Email_ID = mail_id;
        this.mobile_no = mobile_no;
        this.basic_salary = basic_salary;
    }
}

class Project_Manager extends Employee {
    Project_Manager(String name, String address, String mail_id, String mobile_no, float basic_salary) {
        System.out.println("<-------------------Pay slip of Project_Manager Employee----------------------->");
        Emp_name = name;
        this.address = address;
        Email_ID = mail_id;
        this.mobile_no = mobile_no;
        this.basic_salary = basic_salary;
    }
}

public class pra3 {
    public static void main(String[] args) {

        String Emp_name, Email_ID, address, mobile_no;
        float basic_salary;
        Scanner sc = new Scanner(System.in);

        System.out.println("<----------------------Data Entry of Programmer Employee------------------------>");
        System.out.println("Enter the employee Name :  ");
        Emp_name = sc.nextLine();
        System.out.println("Enter the email ID      :  ");
        Email_ID = sc.nextLine();
        System.out.println("Enter the address       :  ");
        address = sc.nextLine();
        System.out.println("Enter the mobile no.    :  ");
        mobile_no = sc.nextLine();
        // MOBILE NO. VALIDATION
        while(!mobile_no.matches("[0-9]+") || (mobile_no.length() != 10))
        {
            System.out.println("Inproper mobile no. !! Enter Again");
            System.out.println("Enter the mobile no.    :  ");
            mobile_no = sc.nextLine();
        }
        System.out.println("Enter the basic pay     :  ");
        basic_salary = Float.parseFloat(sc.nextLine());
        Programmer E1 = new Programmer(Emp_name,Email_ID,address,mobile_no,basic_salary);
        E1.display();
        


        
        System.out.println("<----------------------Data Entry of TeamLead Employee--------------------------->");
        System.out.println("Enter the employee Name :  ");
        Emp_name = sc.nextLine();
        System.out.println("Enter the email ID      :  ");
        Email_ID = sc.nextLine();
        System.out.println("Enter the address       :  ");
        address = sc.nextLine();
        System.out.println("Enter the mobile no.    :  ");
        mobile_no = sc.nextLine();
        // MOBILE NO. VALIDATION
        while(!mobile_no.matches("[0-9]+") || (mobile_no.length() != 10))
        {
            System.out.println("Inproper mobile no. !! Enter Again");
            System.out.println("Enter the mobile no.    :  ");
            mobile_no = sc.nextLine();
        }
        System.out.println("Enter the basic pay     :  ");
        basic_salary =  Float.parseFloat(sc.nextLine());
        TeamLead E2 = new TeamLead(Emp_name,Email_ID,address,mobile_no,basic_salary);
        E2.display();
        


      
        System.out.println("<--------------Data Entry of Assistant Project Manager Employee------------------->");
        System.out.println("Enter the employee Name :  ");
        Emp_name = sc.nextLine();
        System.out.println("Enter the email ID      :  ");
        Email_ID = sc.nextLine();
        System.out.println("Enter the address       :  ");
        address = sc.nextLine();
        System.out.println("Enter the mobile no.    :  ");
        mobile_no = sc.nextLine();
        // MOBILE NO. VALIDATION
        while(!mobile_no.matches("[0-9]+") || (mobile_no.length() != 10))
        {
            System.out.println("Inproper mobile no. !! Enter Again");
            System.out.println("Enter the mobile no.    :  ");
            mobile_no = sc.nextLine();
        }
        System.out.println("Enter the basic pay     :  ");
        basic_salary =  Float.parseFloat(sc.nextLine());
        Assistant_Project_Manager E3 = new Assistant_Project_Manager(Emp_name,Email_ID,address,mobile_no,basic_salary);
        E3.display();
        


  
        System.out.println("<--------------Data Entry of Project Manager Employee------------------->");
        System.out.println("Enter the employee Name :  ");
        Emp_name = sc.nextLine();
        System.out.println("Enter the email ID      :  ");
        Email_ID = sc.nextLine();
        System.out.println("Enter the address       :  ");
        address = sc.nextLine();
        System.out.println("Enter the mobile no.    :  ");
        mobile_no = sc.nextLine();
        // MOBILE NO. VALIDATION
        while(!mobile_no.matches("[0-9]+") || (mobile_no.length() != 10))
        {
            System.out.println("Inproper mobile no. !! Enter Again");
            System.out.println("Enter the mobile no.    :  ");
            mobile_no = sc.nextLine();
        }
        System.out.println("Enter the basic pay     :  ");
        basic_salary =  Float.parseFloat(sc.nextLine());
        Project_Manager E4 = new Project_Manager(Emp_name,Email_ID,address,mobile_no,basic_salary);
        E4.display();
        
    }
}
