import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int n1 = n;
       while (n >= 10)  
            n /= 10; 
         int fd = n;
         int ld = n1%10;
         int sum = (fd + ld);
         System.out.println(sum);
	}
}