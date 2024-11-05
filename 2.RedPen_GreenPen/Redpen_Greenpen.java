import java.io.*;
import java.util.*;

public class Redpen_Greenpen
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=0; i<n-1; i++)
		{
			if(((arr[i] % 2 == 1) && (arr[i + 1] % 2 == 0)) || ((arr[i] % 2 == 0) && (arr[i + 1] % 2 == 1)))
			{
				count += 1;
			}
		}
		System.out.println(count);
	}
}