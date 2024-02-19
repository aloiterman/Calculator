/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COSC600_PB1_aloiterman0;
import java.util.Scanner;


/**
 *
 * @author Aharon Loiterman
 */
public class Calculator 
     
    /**
     * Here is the engine method where all the magic happens!
     * It first opens up with the menu and then depending on what
     * the user selects, the "switch" chooses the appropriate 
     * method to run.
     * However, if the user selects "0" then the do/while 
     * loop causes the program to be shut down.
     */
{   public static void engine()
    {
        int request;
        System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query1 = new Scanner(System.in);
        request=query1.nextInt();
   do{
       
       switch(request)
        {
           case 1: 
          System.out.println("You have chosen addition.");
            addition();
            System.out.println();
            System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query2 = new Scanner(System.in);
        request=query2.nextInt();
           break;
           
           case 2: 
          System.out.println("You have chosen subtraction.");  
          subtraction();
          System.out.println();
           System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query3 = new Scanner(System.in);
        request=query3.nextInt();
           break;
           
           case 3:
               System.out.println("You have chosen multiplication.");
               multiplication();
               System.out.println();
               System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query4 = new Scanner(System.in);
        request=query4.nextInt();
           break;
           
           case 4:
               System.out.println("You have chosen division.");
               division();
               System.out.println();
               System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query5 = new Scanner(System.in);
        request=query5.nextInt();
          break;
          
           case 5:
               System.out.println("You have chosen modulo.");
               modulo();
               System.out.println();
               System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query6 = new Scanner(System.in);
        request=query6.nextInt();
          break;
          
           case 6:
           System.out.println("You have chosen square.");
           square();
           System.out.println();
           System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query7 = new Scanner(System.in);
        request=query7.nextInt();
           break;
           
           case 7:
               System.out.println("You have chosen square root.");
               sqrt();
               System.out.println();
               System.out.println("Calculator written by Aharon Loiterman:");
        menu();
        Scanner query8 = new Scanner(System.in);
        request=query8.nextInt();
               break;
           
          
           default:
               System.out.println("That selection is invalid. You may only select from 0-7.");
        } 
   }
    }while(request>0);
   System.out.println("The calculator is shutting down.");
   }
    /**
    *Here is the addition method. 
    */
    public static void addition()
    {
         Scanner add=new Scanner (System.in);
         double num1,num2,sum;
        System.out.println("Enter First number you want to add:");
        num1=add.nextDouble();
        System.out.println("Enter Second number you want to add:");
        num2=add.nextDouble();
        sum= num1 + num2;
        System.out.print("Here is the sum:");
        System.out.println(sum);
        
    }
    /**
    *Here is the subtraction method. 
    */
    public static void subtraction()
    {
      Scanner subtract=new Scanner (System.in);
         double num3,num4,difference;
        System.out.println("Enter First number you want to subtract:");
        num3=subtract.nextDouble();
        System.out.println("Enter Second number you want to subtract:");
        num4=subtract.nextDouble();
        difference= num3 - num4;
        System.out.print("Here is the difference:");
        System.out.println(difference);   
    }
    /**
    *Here is the multiplication method. 
    */
    public static void multiplication()
    {
        Scanner multiply=new Scanner (System.in);
         double num5,num6,product;
         System.out.println("Enter First number you want to multiply:");
        num5=multiply.nextDouble();
        System.out.println("Enter Second number you want to multiply:");
        num6=multiply.nextDouble();
         product=num5*num6;
        System.out.print("Here is the product:");
        System.out.println(product);
    }
    /**
    *Here is the division method. 
    */
    public static void division()
    {
        Scanner divide=new Scanner (System.in);
         double num7,num8,quotient;
         System.out.println("Enter First number you want to divide:");
        num7=divide.nextDouble();
        System.out.println("Enter Second number you want to divide:");
        num8=divide.nextDouble();
        quotient=num7/num8;
        System.out.print("Here is the quotient:");
        System.out.println(quotient);
    }
    /**
    *Here is the method that does square roots(sqrt). 
    */
    public static double sqrt()
    {
        Scanner squareroot=new Scanner (System.in);
         double num9;
         System.out.println("Enter the number you want to square root:");
        num9=squareroot.nextDouble();
        System.out.println("Here is the answer:");
        System.out.println(Math.sqrt(num9));
        return 0;
         }
    /**
    *Here is the modulo method. 
    */
    public static void modulo()
    {
        Scanner remainder=new Scanner (System.in);
         double num10,num11,answer;
         System.out.println("Enter First number you want to divide:");
        num10=remainder.nextDouble();
        System.out.println("Enter Second number you want to divide:");
        num11=remainder.nextDouble();
         answer= num10%num11;
          System.out.print("Here is the answer:");
        System.out.println(answer);
    }
    /**
    *Here is the square method. 
    */
    public static void square()
    {
         Scanner power=new Scanner (System.in);
         double num12;
         System.out.println("Enter the number you want to square:");
        num12=power.nextDouble();
        System.out.print("Here is the answer:");
        System.out.println(Math.pow(num12,2));
      }
    /**
    *Here is the menu method.
    *This method contains the set of
    * choices that appear on the screen
    * for the user to pick.
    */
    public static void menu()
    {
      System.out.println("Please choose one of the following options:");
      System.out.println("1: Addition");
      System.out.println("2: Subtraction");
      System.out.println("3: Multiplication");
      System.out.println("4: Division");
      System.out.println("5: Modulo");
      System.out.println("6: Square");
      System.out.println("7: Square Root");
      System.out.println("0: Close Calculator");
       }
    }

