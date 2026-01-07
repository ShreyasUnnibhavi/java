public class IndexesOfKey {
    public static void indexesOfKey(int array[], int key, int i){
        if(i == array.length) return ;
        if(array[i] == key){
            System.out.println(i);
        }
        indexesOfKey(array, key, i+1);
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,3,6,4,3};
        indexesOfKey(array, 9, 0);
    }
}
