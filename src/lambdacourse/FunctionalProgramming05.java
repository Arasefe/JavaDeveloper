package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05 {
    public static void main(String[] args) {
        Course cTurkishDay=new Course("Summer","Turkish Day",97,126);
        Course cTurkishNight=new Course("Winter","Turkish Night",98,154);
        Course cEnglishDay=new Course("Spring","English Day",95,132);
        Course cEnglishNight=new Course("Winter","English Night",93,113);

        List<Course> courseList = new ArrayList<>();
        courseList.add(cTurkishDay);
        courseList.add(cTurkishNight);
        courseList.add(cEnglishDay);
        courseList.add(cEnglishNight);

        System.out.println(checkAverageScoreGreaterThan(courseList,91));
        System.out.println(checkAnyCourseContainsTurkish(courseList));
        printTheHighestScoreCourse(courseList);
        System.out.println(sortAvgAscSkipFirstTwo(courseList));
        System.out.println(sortAvgAscGetThird(courseList));
    }

    // 1-Create a method to check if all average scores are greater than 91. If so, return true
    private static boolean checkAverageScoreGreaterThan(List<Course> courseList, int average) {
        return courseList.stream().allMatch(p->p.getAverageScore()>average);
    }

    // 2-Create a method to check if at least one of the course names contains "Turkish". If so, return true
    private static boolean checkAnyCourseContainsTurkish(List<Course> courseList) {
        return courseList.stream().anyMatch(p->p.getCourseName().contains("Turkish"));
    }

    // 3-Create a method to print the course whose average score is the highest
    private static void printTheHighestScoreCourse(List<Course> courseList) {
        Course course= courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        System.out.println(course);

    }

    // 4-Sort the list elements according to the average score in ascending order and skip the first 2 elements
    private static List<Course> sortAvgAscSkipFirstTwo(List<Course> courseList) {
        return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
    }

    // 5-Sort the list elements according to the average score in ascending order and print just 3rd one
    private static List<Course> sortAvgAscGetThird(List<Course> courseList) {
        return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).limit(1).collect(Collectors.toList());
    }

}
