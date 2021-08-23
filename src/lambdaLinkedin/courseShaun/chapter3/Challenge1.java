package lambdaLinkedin.courseShaun.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {
    static class Person {
        public final String name;
        public final Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Car {
        public final String make;
        public final String color;
        public final Float price;

        public Car(String make, String color, Float price) {
            this.make = make;
            this.color = color;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car[" +
                    "make='" + make +
                    ", color='" + color +
                    ", price=" + price +
                    ']';
        }
    }

    static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Person[] peopleArr = {
                new Person("Brandon", 23),
                new Person("Hank", 43),
                new Person("Jenna", 33),
                new Person("Veronica", 56),
                new Person("Jack", 27),
        };
        List<Person> people = new ArrayList<>(Arrays.asList(peopleArr));
        // Find all the names of people
        List<String> peopleNames=people
                .stream()
                .map((person)->person.name)
                .collect(Collectors.toList());
        System.out.println(peopleNames);

        Car[] carsArr = {
                new Car("Chevy", "red", 45000f),
                new Car("Ford", "blue", 23000f),
                new Car("Toyota", "grey", 14000f),
                new Car("Lamborghini", "blue", 150000f),
                new Car("Renault", "blue", 150000f),
        };
        List<Car> cars = new ArrayList<>(Arrays.asList(carsArr));

        // Print all blue cars
        List<Car>bueCars= cars.stream()
                        .filter((car)->car.color=="blue")
                        .collect(Collectors.toList());
        System.out.println(bueCars);

        Employee[] employeesArr = {
                new Employee("John", 34, "developer", 80000f),
                new Employee("Hannah", 24, "developer", 95000f),
                new Employee("Bart", 50, "sales executive", 100000f),
                new Employee("Sophie", 49, "construction worker", 40000f),
                new Employee("Darren", 38, "writer", 50000f),
                new Employee("Nancy", 29, "developer", 75000f),
        };
        List<Employee> employees = new ArrayList<>(Arrays.asList(employeesArr));

        // Find the all employees salaries sum
         Float sumOfAll= employees
                            .stream()
                            .map((employee) ->(employee.salary))
                            .reduce(0f,(acc,x)->acc+x);
        System.out.println(sumOfAll);


        Float sumOfDevelopers= employees
                            .stream()
                            .filter((employee) ->employee.jobTitle=="developer")
                            .map((developer)->developer.salary)
                            .reduce(0f, Float::sum);

        Long numberOfDevelopers=employees
                            .stream()
                            .filter((employee)->employee.jobTitle=="developer")
                            .collect(Collectors.counting());
    }
}


