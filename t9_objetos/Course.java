package t9_objetos;

public class Course {

	
		private String courseName=" ";
		private String[] students=new String[25];
		private  int numberOfStudent;
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String[] getStudents() {
			return students;
		}
		public void setStudents(String[] students) {
			this.students = students;
		}
		public int getNumberOfStudent() {
			return numberOfStudent;
		}
		public void setNumberOfStudent(int numberOfStudent) {
			this.numberOfStudent = numberOfStudent;
		}

	public Course () {
		
	}
	
	public Course (String course, int id) {
		this.courseName=course;
		this.numberOfStudent=id;
		id++;
	}
	
	//add and drop students
	
	

}
