package com.sample.controllers;


interface MyInterface{  
    /* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
    default void newMethod()
    {  
        System.out.println("Newly added default method");  
    }  
    /* Already existing public and abstract method
     * We must need to implement this method in 
     * implementation classes.
     */
    static void staticMethod()
    {
    	System.out.println("Static method in interface");
    }
    void existingMethod(int i);  
}  
public class DefaultMethodInterface implements MyInterface
{ 
	// implementing abstract method
    public void existingMethod(int i)
    {           
        System.out.println("Int is: "+i);  
    }  
    public static void main(String[] args) 
    {  
    	DefaultMethodInterface obj = new DefaultMethodInterface();
    	
    	//calling the default method of interface
        obj.newMethod();     
        //calling the abstract method of interface
        obj.existingMethod(20);
        //calling the static method of interface
        MyInterface.staticMethod();
  
    }  
}