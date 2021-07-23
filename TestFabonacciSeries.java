package Assingments.Assingments2;

public class TestFabonacciSeries extends FabonacciUsingStack {

	public TestFabonacciSeries(int size){
		arraylist=new int[size];
	}

	public static void main(String[] args) {
		TestFabonacciSeries test=new TestFabonacciSeries(10);
		test.push();
		test.push();
		test.push();
		test.push();
		test.push();
		test.push();
		test.traversList();
		System.out.println("\n.....................");
		//test.pop();
		//test.pop();
		test.traversList();
		System.out.println("\n.....................");
		test.push();
		test.traversList();
		test.push();
		System.out.println("\n.....................");
		test.traversList();



	}

}
