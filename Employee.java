import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee{
    String name;
    int age;
    double salary;
    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String toString(){
        return name+":"+age+":"+salary;
    }
}

class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return Double.compare(e2.salary,e1.salary);
    }
}

class NameComparator implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return e1.name.compareTo(e2.name);
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Employee>employees=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the employee name, age and salary");
            String name=sc.nextLine();
            int age=sc.nextInt();
            double salary=sc.nextDouble();
            employees.add(new Employee(name, age, salary));
        }
        sc.close();
        System.out.println("Origional Emplyees");
        System.out.println(employees);
        Collections.sort(employees,new SalaryComparator());
        System.out.println("Employees Sorted by salary");
        System.out.println(employees);
        Collections.sort(employees,new NameComparator());
        System.out.println("Employees Sorted by name");
        System.out.println(employees);
    }
}