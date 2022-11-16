package basic_programs;
import java.util.*;
import java.lang.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check :");
        int numb = sc.nextInt();
        int original = numb;
        int count = 0;
        int temp;
        int numb2 = 0;
        while(original > 0){
            temp = original /10;
            count++;
            original = original/10;
        }
        original = numb;
        while(original > 0){
           int temp2 = original % 10;
            numb2 = numb2 + ((int) Math.pow(temp2 , count));
            original = original/10;
        }
        if(numb == numb2){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not Armstrong");
        }
    }
}
