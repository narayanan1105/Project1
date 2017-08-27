package sample1;

public class Arrayabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[]={'A','B','C','D','E','F','G','H','I'};
		for(int i=0,k=8;i<=4;i++,k--)
		{
		for(int j=0;j<=8;j++)
			{
				if(i==j||k==j)
				{
				System.out.print(a[j]);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}



