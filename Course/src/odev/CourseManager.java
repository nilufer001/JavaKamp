package odev;

public class CourseManager {
	 public void addToCart(Course course) {
		 System.out.println(course.CourseName+" Sepete Eklendi.");
	 }
	 
	 public void deletToCourse(Course course) {
		 System.out.println(course.CourseName+" Sepetten Çýkarýldý.");
		 
	 }
	 
	 public void updateToCourse(Course course) {
		 System.out.println(course.CourseName+" Sepet Güncellendi.");
		 
	 } 
	 
}


