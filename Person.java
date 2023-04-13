// Create an interface called "Person" with a method called "speak". Create two classes called "Student" and "Teacher" that implement the Person interface and implement the "speak" method. Create objects of both the Student and Teacher classes and call their respective "speak" methods.





package Interface;

public interface Person 
{
	void speak();
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.speak();
		Teacher t = new Teacher();
		t.speak();
	}

}
class Student implements Person
{
	@Override
	public void speak() 
	{
		System.out.println("I am a student.");
		
	}
	
}
class Teacher implements Person{

	@Override
	public void speak() 
	{
		
		System.out.println("I am a Teacher.");
	}
	
}