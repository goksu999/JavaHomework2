package homework2;

public class StudentManager {

	public void addCourse(Student student) {
		System.out.println("Se�ti�iniz kurslar : " + student.getStudentCourses()); 
	}
	
	public void addDate(Student student) {
		System.out.println( "Kay�t tarihiniz : " + student.getEnrollmentDate()); 
	}
	
	public void doHomework(Student student) {
		System.out.println( "Yap�lan �devler : " + student.getTakeHomework()); 
		System.out.println(" ");
	}
	
	
}
