public class LongestTurbulantSubarray {
    public static int maxTurbulenceSize(int arr[]) {
        if(arr.length < 2)
            return arr.length;
        int currLen = (arr[0] == arr[1])? 1: 2;
        int prevSign = Integer.compare(arr[0], arr[1]);
        int maxLen = currLen;
        for(int i = 1; i < arr.length-1; i++) {
            int currSign = Integer.compare(arr[i], arr[i+1]);
            if(currSign != 0 && currSign != prevSign)
                currLen++;
            else if(currSign == 0)
                currLen = 1;
            else
                currLen = 2;

            maxLen = Math.max(currLen, maxLen);
            prevSign = currSign;
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        System.out.println(maxTurbulenceSize(arr));
    }
}
