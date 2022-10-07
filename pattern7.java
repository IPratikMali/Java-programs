// write a program to print parallelogram tilted towards right.

public class pattern7 {

    public static void main(String[] args){

        for(int j = 1 ; j<=5 ; j++)
        {
             for(int k = 1 ; k <= j ; k++)
            {
                System.out.print("");
                for (int i = 1; i <= 5; i++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }
}