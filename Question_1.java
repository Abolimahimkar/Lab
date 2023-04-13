 //Create an abstract class called "Shape" with an abstract method called "calculateArea". Create two subclasses called "Circle" and "Rectangle" that inherit from Shape and implement the "calculateArea" method. Create objects of both the Circle and Rectangle classes and call their respective "calculateArea" methods




package Abstract;

abstract class Shape
{
	abstract void calculateArea();
}
class Circle extends Shape
{
	float Pi=3.14f,r=5;

	void calculateArea() 
	{
		float a = Pi*(r*r); 
		System.out.println("The area of Circle is: "+a);
	}
}
class Rectangle extends Shape
{
	int l=5 ,w=8;
	void calculateArea() 
	{
		int b = l*w;
		System.out.println("The area of Rectangle is: "+b);
	}
}

public class Question_1 
{
public static void main(String[] args) 
{
	Circle c = new Circle();
	c.calculateArea();
	Rectangle r = new Rectangle();
	r.calculateArea();
}
}