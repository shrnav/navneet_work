package com.employee;

import java.util.*;

import java.util.stream.Collectors;

class Employee
{
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    private static void getEmployee(List<Employee> employeeList) {
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
    }

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        getEmployee(employeeList);
        //Get female employee only.
        employeeList.stream().filter(i->i.getGender().equals("Female")).forEach(System.out::println);

        //Count number of male and female employee in the list.
        Map<String,Long> map =  employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(map);

        //Print the name of all departments in org.
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //average age of male and female employees?
        Map<String,Double> averageAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println(averageAge);

        //Highest paid employee in the org.
        Optional<Employee> collect = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        Employee emp = collect.get();
        System.out.println(emp.getSalary());

        //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(i->i.getYearOfJoining()>2015).forEach(i-> System.out.println(i.getName()));

        //Count the number of employees in each department?
        Map<String, Long> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect1);

        //Get the details of youngest male employee in the product development department?
        Employee product_development = employeeList.stream().filter(dep -> dep.getDepartment().equals("Product Development")).collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge))).get();
        System.out.println(product_development);

        // most working experience in the organization.
        Employee employee = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get();
        System.out.println(employee.getName());

        //How many male and female employees are there in the sales and marketing team?
        employeeList.stream().filter(dept->dept.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).forEach((i,j)-> System.out.println(i+" "+j));

        //average salary of male and female employees?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).forEach((i,j)-> System.out.println(i+" "+j));

        //List down the names of all employees in each department?
        employeeList.stream().distinct().collect(Collectors.toMap(Employee::getName,Employee::getDepartment)).forEach((name,dept)-> System.out.println("Department: "+dept+" Name: "+name));

        //average salary and total salary of the whole organization?
        DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Total Salary of organization:: "+doubleSummaryStatistics.getSum());
        System.out.println("Avg Salary of Employee:: "+doubleSummaryStatistics.getAverage());

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> collect2 = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        Set<Map.Entry<Boolean, List<Employee>>> entries = collect2.entrySet();
        for (Map.Entry<Boolean, List<Employee>> entry : entries)
        {
            System.out.println("----------------------------");

            if (entry.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }

        //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee employee1 = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Name:: "+employee1.getName());
        System.out.println("Age:: "+employee1.getAge());
        System.out.println("Dept:: "+employee1.getDepartment());


    }
}
