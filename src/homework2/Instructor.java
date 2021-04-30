package homework2;

public class Instructor extends User{
	
	private  String instructorCourses;
	private String giveHomework;
	
	
	public Instructor(int id, String name, String lastName, String nationalIdentity, String adress,
			String instructorCourses, String giveHomework) {
		super(id, name, lastName, nationalIdentity, adress);
		this.instructorCourses = instructorCourses;
		this.giveHomework = giveHomework;
	}


	
	public String getInstructorCourses() {
		return instructorCourses;
	}


	public void setInstructorCourses(String instructorCourses) {
		this.instructorCourses = instructorCourses;
	}



	public String getGiveHomework() {
		return giveHomework;
	}



	public void setGiveHomework(String giveHomework) {
		this.giveHomework = giveHomework;
	}


}
