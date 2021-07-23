package Assingments.Assingments2;

public class FabonacciUsingStack {

	int[] arraylist;
	int i=-1;
	int a,b=0,c=1;
	public void push(){
		i++;
		if(i==arraylist.length-1)
			System.out.println("list is full");
		arraylist[i]=c;
		a=b;
		b=c;
		c=a+b;
	}
	// end of push method....
	public void traversList(){
		for(int j:arraylist)
			System.out.print(j+" ");
		System.out.println();
	}
	// end of traversList method.....

	/*public void pop(){
		c=arraylist[i];
		arraylist[i]=0;
		i--;

	}*/
	// end of pop method...

}
