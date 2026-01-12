public class sorting{
    public static void print(int array[]){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void bubbleSort(int array[]){              //Ascending order
        boolean swap = false;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                return;
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
            int min = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > min){
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = min;

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
        int array[] = {1,2,3,4,5};
        bubbleSort(array);
        // selectionSort(array);
        // insertionSort(array);
        // countingSort(array);
        print(array);
    }
}