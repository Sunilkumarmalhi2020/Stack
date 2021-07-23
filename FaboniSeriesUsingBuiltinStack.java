package Assingments.Assingments2;

import java.util.Stack;

public class FaboniSeriesUsingBuiltinStack {

	Stack<Integer> stack=new Stack<>();
	int a,b=0,c=1;

	public void add(){
		stack.push(c);
		a=b;
		b=c;
		c=a+b;
	}
	// end of add method

	public void display(){
		for(int i:stack){
			System.out.print(i+" ");
		}
	}
	//end of display method

	public static void main(String arg[]){
		FaboniSeriesUsingBuiltinStack object=new FaboniSeriesUsingBuiltinStack();

		for(int i=1;i<=13;i++)
		object.add();

		object.display();
	}
}
