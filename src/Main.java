public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<=10; i++){
            for(int k = 1; k>=(1 - i);k--){
                System.out.print(" ");
            }
            for(int m = 19 ; m>= (2*i) + 1 ; m--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
