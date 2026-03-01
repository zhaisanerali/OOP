package lab3;

import Lab2.Student;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBook {
	private Course course;
	private List<Student> students;
	private List<Integer> grades;
	
	public GradeBook(Course course, List<Student> students) {
		this.course = course;
		this.students = students;
		this.grades = new ArrayList<>();
	}
	
	
	
	public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }
	
	
	public void inputGrades() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, input grades for students:");
        for (Student s : students) {
            System.out.print("Student " + s.getName() + ": ");
            grades.add(input.nextInt());
        }
    }
	
	
	
	public void displayGradeReport() {
        if (grades.isEmpty()) return;

        double total = 0;
        int lowGrade = grades.get(0);
        int highGrade = grades.get(0);
        Student lowStudent = students.get(0);
        Student highStudent = students.get(0);

        for (int i = 0; i < grades.size(); i++) {
            int g = grades.get(i);
            total += g;

            if (g < lowGrade) {
                lowGrade = g;
                lowStudent = students.get(i);
            }
            if (g > highGrade) {
                highGrade = g;
                highStudent = students.get(i);
            }
        }

        System.out.printf("\nClass average is %.2f. ", total / grades.size());
        System.out.printf("Lowest grade is %d (%s, id: %s).\n", lowGrade, lowStudent.getName(), lowStudent.getId());
        System.out.printf("Highest grade is %d (%s, id: %s).\n", highGrade, highStudent.getName(), highStudent.getId());

        outputBarChart();
    }
	
	
	
	
	public double determineClassAverage() {
        int total = 0;
        for (int g : grades) total += g;
        return (double) total / grades.size();
    }
	
	
	
	
	
	private void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] frequency = new int[11]; // для диапазонов 0-9, 10-19... и 100

        for (int grade : grades) {
            frequency[grade / 10]++;
        }

        for (int count = 0; count < frequency.length; count++) {
            if (count == 10) {
                System.out.print("  100: ");
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
	
	
	
	@Override
    public String toString() {
        return "GradeBook for " + course.getName();
    }
	
	
	public static void main(String[] args) {

		

		    
		    Course oop = new Course("CS101", "Object-oriented Programming and Design", 5, "No");

		    
		    List<Student> students = new ArrayList<>();
		    students.add(new Student("A", "1")); 
		    students.add(new Student("B", "4")); 
		    students.add(new Student("C", "6"));
		    students.add(new Student("D", "5"));
		    students.add(new Student("E", "11"));
		    students.add(new Student("F", "45"));
		    students.add(new Student("G", "12"));
		    students.add(new Student("H", "9"));
		    students.add(new Student("I", "7"));
		    students.add(new Student("J", "10"));
		    

		    GradeBook gb = new GradeBook(oop, students);

		    gb.displayMessage();    
		    gb.inputGrades();        
		    gb.displayGradeReport();
		}
		
		
		
		
		
	
}
	

