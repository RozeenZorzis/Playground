import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int fd = n1/100;
      int ld =n1%10;
      int sum = fd+ld;
      System.out.println(sum);
	}
}