import java.io.*;
import java.util.*;
public class SumofCubes
{
    public static void main(String args[])
    {
        //Creating the object for the Scanner class
	Scanner sc = new Scanner(System.in);
	
	//Initializing value from the user
        int m = sc.nextInt();
        int n = sc.nextInt();
	
	// Initialize the sum value as 0
        int sum = 0;

	//Check the largest number between two	
        if (m < n)
        {
            //Initialize the i th value as m and ending is equal to n
	    for(int i=m; i<=n; i++)
            {
                sum += (i*i*i); // Add the cube value to the sum
            }
	    //print the sum value
            System.out.println(sum);
        }
        else
        {
            System.out.println("Doesn't calculate the sum of cubes");
        }
       
    }
}