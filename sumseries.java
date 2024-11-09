import java.util.Scanner ;
public class sumseries
         {
public static void main(String[] args)
            { 
                           Scanner  input = new Scanner(System.in);
   for(int i=1;i<=3;i++)
{
   System.out.print("Case "+ i + ": Enter n"+i+" : ");
int n = input.nextInt();
int sum =n*(n+1)/2;
                        System.out.print("1+2+3+.....+" + n +" = " + sum);
System.out.println();
                      }
  input.close();
}
     
              }