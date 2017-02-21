import java.util.*;
public class Armstrong { 
		  public static void main(String[] args)  {  
		    int c=0,a,temp;  
		    Scanner o=new Scanner(System.in);
		    System.out.println("Enter 3 digit Number");
		    int n=o.nextInt();
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    {
		    System.out.println(+temp+" is an armstrong number");   
		    }
		    else
		    {
		        System.out.println(+temp+ "is Not an armstrong number");   
		   }  
		}  
}

