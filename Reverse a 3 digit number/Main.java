import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int fd = n1%10;
    int n2 = n1/10;
    int sd = n2%10;
    int td = n2/10;
    
    System.out.print(fd);
    System.out.print(sd);
    System.out.print(td);
      
  }
}