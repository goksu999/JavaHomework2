package homework2;

public class InstructorManager {
	
	public void giveLecture(Instructor instructor) {
		System.out.println("Eðitmenin verdiði dersler : " + instructor.getInstructorCourses());
	}
	
	public void giveHomework(Instructor instructor) {
		System.out.println("Eðitmenin verdiði ödevler : " + instructor.getGiveHomework());
	}
}
