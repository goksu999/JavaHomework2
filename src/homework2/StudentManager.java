package homework2;

public class StudentManager {

	public void addCourse(Student student) {
		System.out.println("Seçtiðiniz kurslar : " + student.getStudentCourses()); 
	}
	
	public void addDate(Student student) {
		System.out.println( "Kayýt tarihiniz : " + student.getEnrollmentDate()); 
	}
	
	public void doHomework(Student student) {
		System.out.println( "Yapýlan ödevler : " + student.getTakeHomework()); 
		System.out.println(" ");
	}
	
	
}
