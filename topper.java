import java.util.Scanner;
class topper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number of students in the class: ");
		int s = sc.nextInt();
		System.out.print("Enter The Number of Subjects: ");
		int m = sc.nextInt();
		int[][] input = new int[s][m];
		int[] sum = new int[s];
		int max =0;
		int num = 0;
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print("Enter the marks of student "+(i+1)+" for Subject "+(j+1)+": ");
				int marks = sc.nextInt();
				if(marks<0 || marks > 100)
				{
					System.err.println("Enter the valid marks between 0 to 100");
					j--;
					continue;
				}
				input[i][j] = marks;
			}
		}
		for(int l =0;l<s;l++)
		{
			for(int k =0;k<m;k++)
			{
				sum[l] = (sum[l] + input[l][k]);
			}
		}
		
		for(int y =0;y<s;y++)
		{
			if(sum[y] > max)
			{
				num = y+1;
				max = sum[y];
			}
		}
		System.out.println("The First Topper of the class is Student "+num+" with "+max+" marks ");
		System.out.print("The Second Topper of the class is Student "+num+" with "+max+" marks ");


		sc.close();
	}

}
