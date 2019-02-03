import java.io.*;
import java.util.Scanner;

class Employee {
    private String ID, FullName, DOB, Department, Position, Date;
    private double Seniority, Monthly, Minimum;
    public Employee(String ID, String fullName, String DOB, String department, String position, String date, double seniority, double monthly, double minimum) {
        this.ID = ID;
        FullName = fullName;
        this.DOB = DOB;
        Department = department;
        Position = position;
        Date = date;
        Seniority = seniority;
        Monthly = monthly;
        Minimum = minimum;
    }
    public String getID() {
        return ID;
    }
    public String getFullName() {
        return FullName;
    }
    public String getDOB() {
        return DOB;
    }
    public String getDepartment() {
        return Department;
    }
    public String getPosition() {
        return Position;
    }
    public String getDate() {
        return Date;
    }
    public double getSeniority() {
        return Seniority;
    }
    public double getMonthly() {
        return Monthly;
    }
    public double getMinimum() {
        return Minimum;
    }
}

public class Employees {
    public static void main(String[] args) throws FileNotFoundException {
        int n;
        String ID, FullName, DOB, Department, Position, Date;
        double Seniority, Monthly, Minimum, Basic, Extra, Salary;
        Employee []this_array = new Employee[100];
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        n = userInput.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the details for employee " + (i+1));
            userInput.nextLine();
            System.out.print("ID: ");
            ID = userInput.nextLine();
            System.out.print("Full Name: ");
            FullName = userInput.nextLine();
            System.out.print("DOB: ");
            DOB = userInput.nextLine();
            System.out.print("Department: ");
            Department = userInput.nextLine();
            System.out.print("Working Position: ");
            Position = userInput.nextLine();
            System.out.print("Working Date: ");
            Date = userInput.nextLine();
            System.out.print("Seniority Coefficient: ");
            Seniority = userInput.nextDouble();
            System.out.print("Monthly Performance Evaluation Coefficient: ");
            Monthly = userInput.nextDouble();
            System.out.print("Minimum salary: ");
            Minimum = userInput.nextDouble();
            this_array[i] = new Employee(ID, FullName, DOB, Department, Position, Date, Seniority, Monthly, Minimum);
        }
        userInput.close();
        PrintStream out = new PrintStream(new File("employees.txt"));
        PrintStream stdout = System.out;
        System.setOut(out);
        for (int i = 0; i < n; i++) {
            System.out.println(this_array[i].getID());
            System.out.println(this_array[i].getFullName());
            System.out.println(this_array[i].getDOB());
            System.out.println(this_array[i].getDepartment());
            System.out.println(this_array[i].getPosition());
            System.out.println(this_array[i].getDate());
            System.out.println(this_array[i].getSeniority());
            System.out.println(this_array[i].getMonthly());
        }
        out.flush(); out.close();
        System.setOut(stdout);
        Scanner fileInput = new Scanner(new FileInputStream("D:\\Labwork4\\src\\employees.txt"));
//        FileReader file = new FileReader("D:\\Labwork4\\src\\employees.txt");
        for (int i = 0; i < n; i++) {
            ID = fileInput.nextLine();
            FullName = fileInput.nextLine();
            DOB = fileInput.nextLine();
            Department = fileInput.nextLine();
            Position = fileInput.nextLine();
            Date = fileInput.nextLine();
            Seniority = Double.parseDouble(fileInput.nextLine());
            Monthly = Double.parseDouble(fileInput.nextLine());
//            fileInput.nextLine();
            Basic = Seniority*this_array[i].getMinimum();
            Extra = Monthly*Basic;
            Salary = Basic + Extra;
            System.out.println("================================================================");
            System.out.println("Order: " + (i+1));
            System.out.println("Employee ID: " + ID);
            System.out.println("Employee Full Name: " + FullName);
            System.out.println("Employee DOB: " + DOB );
            System.out.println("Employee Department: " + Department);
            System.out.println("Employee Working Position: " + Position );
            System.out.println("Number of Months Working: " + Date);
            System.out.println("Basic Salary: " + Basic);
            System.out.println("Extra Salary: " + Extra);
            System.out.println("Salary: " + Salary);
            System.out.println("================================================================");
        }
        fileInput.close();
        stdout.flush(); stdout.close();
    }

}





