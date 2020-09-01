package school.management.system;

/**
 * 
 * @author AP Created by
 * This class is responsible for keeping 
 * of teacher's name, id, salary.
 *
 */

public class Teacher {
		private int id;
		private String name;
		private int salary;
		private int salaryEarned;
		
		/**
		 * Create Teacher object.
		 * @param id id for teacher.
		 * @param name name of the teacher.
		 * @param salary salary of the teacher.
		 */
		
		public Teacher(int id, String name, int salary) {
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.salaryEarned=0;
		}
		/*
		 * return id
		 */
		public int getId(){
			return id;
		}
		/**
		 * 
		 * @return name of the teacher
		 */
		public String getname() {
			return name;
		}
		/**
		 * 
		 * @return salary of the teacher
		 */
		public int getSalary() {
			return salary;
		}
		/**
		 * set the salary
		 * @param salary
		 */
		public void setSalary(int salary) {
			
		}
		
		/**
		 * Add to salary
		 * Takes from the total money earned by school
		 * @param salary
		 */
		public void receiveSalary(int salary) {
			salaryEarned+=salary;
			School.updateTotalMoneySpent(salary);
		}
		
}
