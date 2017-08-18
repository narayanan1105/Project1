package sample;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test10 a=new Test10();
a.star();


	}

	public static void star()
	{
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
		{
		if(i==0||j==0||i==3||j==3)
			System.out.print("*");
		else
			System.out.print(" ");
		
		}
			
			
			System.out.println("");
	}
		
}
}
