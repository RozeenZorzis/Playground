import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int reverse=0;
      while(n != 0)
      {
         reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
        int first_two = reverse%100;
        int sd = first_two/10;
        System.out.println(sd);
	}
}