package day27_Review;



public class School {
    String name;
    String location;
    String educationSystem;
    int age;

    public School(String name){
        this.name=name;

    }

    public School(String name, int age){
        this.name=name;
        this.age=age;
    }

    public School(String name,String location, int age){
        this.name=name;
        this.location=location;
        this.age=age;
    }

    public School(String name,String location, String educationSystem, int age){
        this.name=name;
        this.location=location;
        this.educationSystem=educationSystem;
        this.age=age;
    }

    public static void main(String[] args) {

    }
}

 class Student extends School{
    static String schoolName="Kuleli";
    String name;
    int epauletNumber;

    public Student(String name, int epauletNumber){
        super(name);
        this.name=name;
        this.epauletNumber=epauletNumber;
    }

     @Override
     public String toString() {
         return "Student["+
                 "name=" + name +
                 ", location=" + location +
                 ", educationSystem=" + educationSystem +
                 ", age=" + age +
                 ", name=" + name +
                 ", epauletNumber=" + epauletNumber +
                 ']';
     }

     public static void main(String[] args) {
         Student aras=new Student("Aras",1612);
         Student tulpar=new Student("Tulpar",1613);
         Student efe=new Student("Efe",1614);
         Student ege=new Student("Ege",1615);

         System.out.println(aras);
         System.out.println(tulpar);
         System.out.println(efe);
         System.out.println(ege);

     }
}
