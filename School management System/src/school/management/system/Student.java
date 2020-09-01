package school.management.system;
/*
 * Created by Anamay
 * This class is responsible for keeping
 * track of students fees,grade & fee 
 * paid.
 */
public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	/**
	 * To create new student by initializing
	 * Fees for every student is $30,000
	 * Fees paid initially is 0.
	 * @param id id for the student: unique.
	 * @param name name of the student.
	 * @param grade grade of the student.
	 */
	
	public Student(int id, String name, int grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	//Not going to change student's name
	/**
	 * For updating grade
	 * @param grade new grade of the student.
	 */
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	/**
	 * Keep adding the fees to feesPaid.
	 * Add the fees to the fees paid.
	 * The school is going to receive the funds
	 *
	 * @param fees the fees that the student pays.
	 */
	
	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
}
	
	/**
	 * 
	 * @return id of student.
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @return name of student.
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return Fees paid by the student.
	 */
	public int getFeesPaid() {
		return feesPaid;
	}
	
	/**
	 * 
	 * @return total fees of the student.
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	/**
	 * 
	 * @return grade of the student
	 */
	public int getGrade() {
		return grade;
	}
	
	/**
	 * 
	 * @param fees the remaining fees.
	 */
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
}
