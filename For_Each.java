package basic_programs;

public class For_Each {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int count = 0;
        for(int i : arr){
            count++;
        }
        System.out.println("length is : " +count);
    }
}
