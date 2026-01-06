public class RecursionBasics {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fact = n * fnm1;
        return fact;
    }

    public static void decreasing(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        decreasing(n-1);
    }

    public static void increasing(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        increasing(n-1);
        System.out.print(n + " ");
    }

    public static int sumofN(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = sumofN(n-1);
        int sum = n + snm1;
        return sum;
    }

    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fibm1 = fibonacci(n-1);
        int fibm2 = fibonacci(n-2);
        int ans = fibm1 + fibm2;
        return ans;
    }

    public static boolean isSorted(int[] array, int i){
        if(i == array.length-1){return true;}
        if(array[i] > array[i+1]){
            return false;
        }
        return isSorted(array, i+1);
    }

    public static int firstOccurance(int array[], int target, int i){
        if(i == array.length){
            return -1;
        }
        if(array[i] == target){
            return i;
        }
        return firstOccurance(array, target, i+1);
    }

    public static int lastOccurance(int array[], int target, int i){
        // if(i < 0){
        //     return -1;
        // }
        // if(array[i] == target){
        //     return i;
        // }
        // return lastOccurance(array, target, i-1);
        if(i == array.length){
            return -1;
        }
        int isFound = lastOccurance(array, target, i+1);
        if(isFound == -1 && array[i] == target){
            return i;
        }
        return isFound;
    }

    public static int xToPowerN(int x, int n){
        // if(n == 0){
        //     return ans;
        // }
        // if((n & 1) == 1){       //if(n % 2 == 1),     can be written this way as well
        //     ans = ans * x;
        // }
        // x = x * x;
        // return xToPowerN(x, n>>2, ans);   //return xToPwerN(x, n/2, ans);      , can be written in this way as well
        if(n == 0){
            return 1;
        }
        int halfPower = xToPowerN(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int n = 10, x = 2;
        int array[] = {5,5,5,5,5,5,4}, target = 5;
        // increasing(n);
        // decreasing(n);
        // System.out.println(factorial(n));
        // System.out.print(sumofN(n));
        // System.out.println(fibonacci(n));
        // System.out.println(isSorted(array,i));
        // System.out.println(firstOccurance(array,target,0));
        // System.out.println(lastOccurance(array,target,array.length-1));
        System.out.println(xToPowerN(x,n));  //xToPowerN(x,n,1)     ,for the other method(commented out in the function def)
    }
}
