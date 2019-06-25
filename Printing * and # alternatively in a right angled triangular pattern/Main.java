import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
  		int r,c,n=1;
        for(r=1;r<=num;r++){
           for(c=1;c<=r;c++){
              if(n%2==0){
                 System.out.print("#");}
             else
                 System.out.print("*");
             n++;
           } System.out.println(); 
           }
           
                  
    }
}