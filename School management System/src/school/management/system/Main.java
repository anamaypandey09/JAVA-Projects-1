package school.management.system;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Teacher anand = new Teacher(1,"anand",500); //(id,"name",salary)
		Teacher prakash = new Teacher(2,"prakash",700);
		Teacher swarna = new Teacher(3,"swarna",600);
	
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(anand);;
		teacherList.add(prakash);
		teacherList.add(swarna);
		
		Student surya = new Student(1,"surya",4);
		Student anamay = new Student(2,"anamay",7);
		Student venkat = new Student(1,"venkat",10);
	
		List<Student> studentList = new ArrayList<>();
		studentList.add(surya);
		studentList.add(anamay);
		studentList.add(venkat);
		
		School lilflower = new School(teacherList,studentList);
	
		surya.payFees(5000);
		anamay.payFees(6000);
		System.out.println("lilflower has earned $" +lilflower.getTotalMoneyEarned());

		System.out.println("Paying Salary : ");
		
		anand.receiveSalary(anand.getSalary());
		System.out.println("lilFlower has spent for salary to "+anand.getname()
							+" and now has $"+lilflower.getTotalMoneyEarned());
	
		swarna.receiveSalary(swarna.getSalary());
		System.out.println("lilFlower has spent for salary to "+swarna.getname()
		+" and now has $"+lilflower.getTotalMoneyEarned());

		
	
	}

}
