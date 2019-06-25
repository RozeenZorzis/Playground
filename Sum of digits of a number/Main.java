import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   int m, sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0)
        {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        System.out.println(+sum);
	}
}