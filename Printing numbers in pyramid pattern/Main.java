import java.util.Scanner;
class Main{
	public static void main (String[] args){
    
	   Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();	 
    int number = 1;
 for(int i = 1; i <= n; i++) {
   for(int s=0;s<n-i;s++){
      System.out.print(" ");}
 for(int j = 1; j <= i; j++) {
   
                System.out.print(number + " ");
    ++number;
            }

            System.out.println();
    }    
}}