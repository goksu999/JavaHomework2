package homework2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("��renci ve E�itmen Kay�t Sistemi");
		System.out.println("--------------------------------------------------------------------------------------");
		
		
		Student student1 = new Student(1,"G�ksu"," Y�lmaz","99999999999"," �stanbul","Java & React Course","01.01.2020",
				"User-Instructor-Student Classlar� => inheritance-class-method uygula!");
		Instructor instructor1 = new Instructor(1,"Engin","Demiro�","11111111111"," �stanbul","C#-ANGULAR COURSE && JAVA REACT-COURSE",
				"User-Instructor-Student Classlar� => inheritance-class-method uygula!");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
		
		User[] users = {student1,instructor1};
		userManager.addMultiple(users);
		userManager.delete(student1);
	
		System.out.println("**************************************************************************************");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCourse(student1);
		studentManager.addDate(student1);
		studentManager.doHomework(student1);
		
		System.out.println("**************************************************************************************");
		
	

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.giveLecture(instructor1);
		instructorManager.giveHomework(instructor1);
		
		

	}

}


