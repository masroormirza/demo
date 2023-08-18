package com.digit.spring.SpringDemo;

public class Hello {
private String name;



	public Hello() {
	super();
	// TODO Auto-generated constructor stub
}




	public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



	public Hello(String name) {
	super();
	this.name = name;
}



	public void sayHello()
	{
		System.out.println("hello............");
	}

	@Override
public String toString() {
	return "Hello [name=" + name + "]";
}


	
}
