package homework2;

public class InstructorManager {
	
	public void giveLecture(Instructor instructor) {
		System.out.println("E�itmenin verdi�i dersler : " + instructor.getInstructorCourses());
	}
	
	public void giveHomework(Instructor instructor) {
		System.out.println("E�itmenin verdi�i �devler : " + instructor.getGiveHomework());
	}
}
