import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int n = 3;
    int i=1;
    for(i=1; i<=num; i++){
      System.out.print(i);
    if((i%n==0)&&(i!=num))
      System.out.print(",");}
  }
}