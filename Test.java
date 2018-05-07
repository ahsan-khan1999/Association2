public class Test{
	public static void main(String[] args){
	
	
	Name name = new Name("asd","ef","sd");
	Person p = new Person(name,18);
	Student student = new Student(name,18,3,"sp18");
	
	student.setGpa(4);
	System.out.println();
	p.display();
	}
}