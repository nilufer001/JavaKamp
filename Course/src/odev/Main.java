package odev;

public class Main {

	public static void main(String[] args) {
		
		
		Course curse1= new Course();
		curse1.id=1;
		curse1.CourseName="Java&Kotlin";
		curse1.StartDate="10/04/2021";
		curse1.FinishDate="10.04.2022";
		curse1.TeacherName="Engin Demirog";
		
		Course course2=new Course(2,"C# yazýlým geliþtirici","01/01.2020","01/01/2021","Engin Demirog");
		Course course3= new Course(3,"Web programlama ","05/05/2021","05/05/2022","Engin Demirog");
		
		CourseManager manager= new CourseManager();
		manager.addToCart(curse1);
		manager.addToCart(course2);
		manager.deletToCourse(course3);
		Course[]  Courses= {curse1,course2,course3};		
		
		System.out.println("------------------------------------------");
		
		for(Course course: Courses) {
			System.out.println(course.CourseName);
		}
		

	}

}
