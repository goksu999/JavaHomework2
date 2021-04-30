package homework2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, null, null, null, null, null, null, null);
		System.out.println("Öğrenci ve Eğitmen Kayıt Sistemi");
		System.out.println(""+"---------------------------------------------");
		student1.setUserName("Göksu");
		student1.setLastName(" Yılmaz");
		student1.setAdress(" İstanbul");
		student1.setNationalIdentity("99999999999");	
		student1.setEnrollmentDate("01.01.2020");
		student1.setTakeHomework(null);
		student1.setStudentCourses("Java & React Course");
		student1.setTakeHomework("User-Instructor-Student Classları => inheritance-class-method uygula!");
		
		Instructor instructor1 = new Instructor(1, null, null, null, null, null, null);
		instructor1.setUserName("Engin");
		instructor1.setLastName(" Demiroğ");
		instructor1.setAdress(" İstanbul");
		instructor1.setNationalIdentity("11111111111");
		instructor1.setInstructorCourses("C#-ANGULAR COURSE && JAVA REACT-COURSE");
		instructor1.setGiveHomework("User-Instructor-Student Classları => inheritance-class-method uygula!");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(instructor1);
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
