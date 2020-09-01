package school.management.system;
import java.util.List;

/**
 * Many teachers,many students.
 * using arraylist.
 * @author AP
 *
 */

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * new school object is created
	 * @param teachers list of teachers
	 * @param students list of students
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	
	public List<Teacher> getTeachers() {
		return teachers;
	}
/**
 * Add a teacher to school.
 * @param teacher the teacher to be added
 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
/**
 * 
 * @return the list of students in school
 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Add a student to the school
	 * @param student the student to be added
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	/**
	 * 
	 * @return the total money earned
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	/**
	 * 
	 * @return the total money spent
	 */
	public int  getTotalMoneySpent() {
		return totalMoneySpent;
	}
	/**
	 * Salary given by school to teacher
	 * @param totalMoneySpent
	 */

	public static void updateTotalMoneySpent(int MoneySpent) {
		
		totalMoneyEarned-=MoneySpent;
	}
	
	
	
	
}
