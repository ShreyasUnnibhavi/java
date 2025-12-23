public class sorting{
    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void bubbleSort(int array[]){              //Ascending order
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void selectionSort(int array[]){
        for(int i = 0; i < array.length-1; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void insertionSort(int array[]){
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < i; j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void countingSort(int array[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        int count[] = new int[max+1];

        for(int i = 0; i < array.length; i++){
            count[array[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                array[j] = i;
                count[i]--;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int array[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        countingSort(array);
        print(array);
    }
}