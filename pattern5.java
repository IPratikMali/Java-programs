//write a program to print a 5 stars 5 times in a different row.

public class pattern5{

    public static void main(String[] args){

        for(int j = 1 ; j<=5 ; j++)
        {
            System.out.println();
            for (int i = 1; i <= 5; i++)
            {
                System.out.print("*  ");
            }
        }
    }
}

/* output :

 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *

 */