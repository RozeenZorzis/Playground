import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int num =1;
         for(int count=1; count<=2*n; count++)
         {
           if(num%2 != 0)
                System.out.println(num);
             else
                System.out.print("");
                num = num+1;
         }
           
	}
  
}