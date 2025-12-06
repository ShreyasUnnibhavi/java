public class pattern7 {
    public static void main(String args[]){
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print((i+j)%2 + " ");
            }
            System.out.println();
        }
    }
}

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
