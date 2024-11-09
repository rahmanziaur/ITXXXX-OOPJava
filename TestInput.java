import java.util.Scanner;

class TestInput{
 
 public static void main(String[] args)
 {
  System.out.print("Enter Highest Val:");
  Scanner myVal = new Scanner(System.in);
  int higVal = myVal.nextInt();
  
  int sum =0;

  for (int i=1; i<= higVal;i++)
   sum = sum + i;
  
  System.out.print("Series Sum:"+sum);
 }
}

 