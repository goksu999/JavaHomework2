package homework2;

public class Student extends User{
	
	private String studentCourses;
	private String enrollmentDate;
	private String takeHomework;
	
	
	public Student(int id, String name, String lastName, String nationalIdentity, String adress, String studentCourses,
			String enrollmentDate,String takeHomework) {
		super(id, name, lastName, nationalIdentity, adress);
		this.studentCourses = studentCourses;
		this.enrollmentDate = enrollmentDate;
		this.takeHomework = takeHomework;
	}

	
	
	public String getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(String studentCourses) {
		this.studentCourses = studentCourses;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}



	public String getTakeHomework() {
		return takeHomework;
	}



	public void setTakeHomework(String takeHomework) {
		this.takeHomework = takeHomework;
	}
	
		
}
