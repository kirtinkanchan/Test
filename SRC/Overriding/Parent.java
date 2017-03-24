package Overriding;

import java.io.IOException;

public class Parent {

	public static void main(String args[]){
		System.out.println("Argumente main");
	}

	public static void main(){
		System.out.println("Parent : Blank main");
	}
	
	public void show(){
		System.out.println("Parent final show .. ");
	}
	
	private void show(int i){
		System.out.println("Parent final show .. "+i);
	}
}
