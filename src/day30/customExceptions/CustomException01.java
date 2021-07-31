package day30.customExceptions;

public class CustomException01 {
    public static void main(String[] args) {
        // Handle checked exception
        try {
            checkGrade(200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Handle unchecked exception
        divide(12,1);


    }

    public static void checkGrade(int grade) throws Exception{
        if(grade<0 || grade>100){
            throw new IllegalGradeException("Grades must be between 0 and 100");
        }
        System.out.println("Your grade is "+grade);
    }

    public static void divide(int x, int y){
        if(y==1){
            throw new DivideByOneException("Divisor must be more than 1");
        }
        System.out.println();
    }
}

class IllegalGradeException extends IllegalArgumentException{
    public IllegalGradeException(String message){
        super(message);
    }
}

class DivideByOneException extends RuntimeException{
    public DivideByOneException(String message){
        super(message);
    }
}
