public class Pattern9{
    public static void main(String args[]){
       int i , j ;
       int s = 0;

        for( i = 2 ; i < 5 ; i++){
            System.out.print(i + " ");
            for( j = 2 ; j < i ; j++) {
                s  = (int) Math.pow(i ,j);
                if(i > 2) {
                    System.out.print(s + " ");
                }

            }
            System.out.println();

        }

    }
}