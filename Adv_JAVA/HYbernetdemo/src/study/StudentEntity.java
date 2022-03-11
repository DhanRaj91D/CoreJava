package study;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="IET_Student")
public class StudentEntity {
	@Id
	@Column(name = "roll_number")
	private int rollNumber;
	
	@Column(name="student_name")
	private String studentName;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public StudentEntity(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}

	public StudentEntity() {
		
	}

	@Override
	public String toString() {
		return "StudentEntity [rollNumber=" + rollNumber + ", studentName=" + studentName + "]";
	}
	
	

}
