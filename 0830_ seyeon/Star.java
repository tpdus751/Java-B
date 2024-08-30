package friday_work;

import java.util.Scanner;

public class Star {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      int n = input.nextInt();
      
      System.out.println("----------------------Star01-----------------------");
      star_01(n);
      System.out.println("----------------------Star02-----------------------");
      star_02(n);
      System.out.println("----------------------Star03-----------------------");
      star_03(n);
      System.out.println("----------------------Star04-----------------------");
      star_04(n);
      System.out.println("----------------------Star05-----------------------");
      star_05(n);
      System.out.println("----------------------Star06-----------------------");
      star_06(n);
      
   }
   
   static void star_01(int n) {
      for (int i = 1; i <= n; i++) {
         for (int j = 1; j <= n; j++) {
            if (j > i) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }
         System.out.println();
      }
   }
   
   static void star_02(int n) {
      for (int i = 1; i <= n; i++) {
         for (int j = n; j >= 1; j--) {
            if (j < i) {
               System.out.print(" ");
            } else {
               System.out.print("*");
            }
         }
         System.out.println();
      }
   }
   
   static void star_03(int n) {
      for (int i = 1; i <= n; i++) {
    	  for (int j = n; j >= 1; j--) {
    		  if (j > i) {	
    			  System.out.print(" ");
    		  } else {
    			  System.out.print("*");
    		  }
    	  }
    	  System.out.println();
      }
   }
   
   static void star_04(int n) {
	   for (int i = 0; i < n; i++) {
	    	  for (int j = 0; j < n; j++) {
	    		  if (i <= j) {
	    			  System.out.print("*");
	    		  } else {
	    			  System.out.print(" ");
	    		  }
	    	  }
	    	  System.out.println();
	      }
   }
   
   static void star_05(int n) {
	   
	   int all = (2 * n) - 1;
	   int mid = (all / 2) + 1;
	   
	   for (int i = 0; i < n; i++) {
	    	  for (int j = 1; j <= all; j++) {
	    		  if (j >= mid - i && j <= mid + i) {
	    			  System.out.print("*");
	    		  } else {
	    			  System.out.print(" ");
	    		  }
	    	  }
	    	  System.out.println();
	      }
   }
   
   static void star_06(int n) {
	   int start = 0;
	   int end = (2 * n) - 1;
	   int mid = (end / 2) + 1;
	   
	   for (int i = 0; i < n; i++) {
	    	  for (int j = 1; j <= end; j++) {
	    		  if (j <= i || j > end - i) {
	    			  System.out.print(" ");
	    		  } else {
	    			  System.out.print("*");
	    		  }
	    	  }
	    	  System.out.println();
	      }
   }


}
