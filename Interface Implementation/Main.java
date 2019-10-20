public class Main {

	 
	public static void main(String[] args) throws Exception {

	Student1 s1=new Student1();
	if(s1 instanceof Dancer) {
				System.out.println(s1  +"  Dancing");
				
				
				  Dancer Dancer_student  = (Dancer)s1;
				  Dancer_student.dance();
				  
			}

	}

}
