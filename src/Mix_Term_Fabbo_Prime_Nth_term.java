
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
public class Mix_Term_Fabbo_Prime_Nth_term {
    
public static void fibonacci(int n)
{
	int i, t1 = 0, t2 = 1, nextTerm;
	for (i = 1; i<=n; i++)
	{
		nextTerm = t1 + t2;
		t1 = t2;
		t2 = nextTerm;
	}
	
        System.out.println("It's Position :\n"+t1);
}
public static void prime(int n)
{
	int i, j, flag, count =0;
	for (i=2; i<=n; i++)
	{
		flag = 0;
		for (j=2; j<i; j++)
		{
			if(i%j == 0)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		if(++count == n)
		{
	
                    System.out.println("It's Position :\n"+i);
			break;
		}
	}
}
    public static void main(String[] args) {
      	int n;
        Scanner kb = new Scanner(System.in);
	       System.out.println("Enter value to check the position :\n");
        n = kb.nextInt();
	if(n%2 == 1)
		fibonacci(n/2 + 1);
	else
		prime(n/2);
         
    }
}
