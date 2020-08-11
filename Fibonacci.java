
/*
 * 
 * @author (Lateefat Salami) 
 * @version (a version number or a date)
 */
//a PROGRAM TO PRINT OUT A FIBONACCI SEQUENCE//

public class Fibonacci {
 public static void main(String[] args){
  int NumCount = 25, 
  FirstNum = 0,
  SecondNum = 1;
  
   System.out.print("The first " + NumCount + " fibonacci sequence are: ");
   for (int i = 1; i <= NumCount; ++i){
   System.out.print(FirstNum + " , ");
   
   int sum = FirstNum + SecondNum; 
   FirstNum = SecondNum;
   SecondNum = sum; }
   
    }
    
   }