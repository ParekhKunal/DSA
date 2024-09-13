/*
Pattern One - Practicing For Loops
* * * *
* * * *
* * * *
* * * *

PatternTwo
*
* * 
* * * 
* * * *

PatternThree
1
1 2
1 2 3
1 2 3 4

PatternFour
1
2 2
3 3 3
4 4 4 4

PatternFive
* * * *
* * *
* * 
*

PatternFive
1 2 3 4 5
1 2 3 4
1 2 3  
1 2
1

PatternSeven
      *
    * * *
  * * * * * 
* * * * * * *

PatternEight
* * * * * * *
  * * * * * 
    * * *
      *

PatternNine
      *
    * * *
  * * * * * 
* * * * * * *
* * * * * * *
  * * * * * 
    * * *
      *

PatternTen
*
* * 
* * * 
* * * *
* * *
* * 
*

PatternEleven
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/


public class Pattern {

    public static void patternOne(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternThree(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patternFour(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void patternFive(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternSix(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void patternSeven(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i+1; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternEight(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2 * n - ( 2 * i + 1); j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternNine(int n){

         for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i+1; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2 * n - ( 2 * i + 1); j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternTen(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1 ; i < n; i++){
            for(int j = 0 ; j < n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternEleven(int n){

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print((i+j+1)%2+" ");
            }
            System.out.println();
        }

    }
    

    public static void main(String args[]){

        System.out.println("Pattern One");
        patternOne(5);

        System.out.println();
        System.out.println("Pattern Two");
        patternTwo(5);

        System.out.println();
        System.out.println("Pattern Three");
        patternThree(5);

        System.out.println();
        System.out.println("Pattern Four");
        patternFour(5);

        System.out.println();
        System.out.println("Pattern Five");
        patternFive(5);

        System.out.println();
        System.out.println("Pattern Six");
        patternSix(5);

        System.out.println();
        System.out.println("Pattern Seven");
        patternSeven(5);

        System.out.println();
        System.out.println("Pattern Eight");
        patternEight(5);

        System.out.println();
        System.out.println("Pattern Nine");
        patternNine(5);

        System.out.println();
        System.out.println("Pattern Ten");
        patternTen(6);

         System.out.println();
        System.out.println("Pattern Eleven");
        patternEleven(5);

    }
}
