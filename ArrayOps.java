public class ArrayOps {
    public static void main(String[] args) {
        //int[] arr = {0, 1, 2, 4, 5};
        //System.out.println(findMissingInt(arr));
        //int[] arr1 = {3, 133, 133, 10, 11, 10};
        //System.out.println(secondMaxValue(arr1));
        //int[] arr1 = {3, 133, 133, 11, 10};
        //int[] arr2 = {3, 133, 133, 10, 11, 10};
        //System.out.println(containsSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1})); // true
        //System.out.println(containsSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3})); // true
        //System.out.println(containsSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3})); // true
        //System.out.println(containsSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5}));
        //System.out.println(isSorted(new int[] {-1, -2, -3, -3, 3, -4})); // true
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        int l = array.length;
        int sum = (l * (l + 1)) / 2;
        int arrsum = 0;
        for (int i = 0; i < l; i++){
            arrsum += array[i];
        }
        int missing = sum - arrsum;
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int l = array.length;
        int max  = 0;
        int max1 = 0;
        for (int i = 0; i < l; i++){
            if (array[i] > max1){
                if (array[i] > max){
                    max1 = max;
                    max = array[i];
                }
                else{
                    if (array[i] != max){
                        max1 = array[i];
                    }
                }       
            }
        }
        return max1;
    }

    public static boolean contains(int[] arr, int value, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false ;
    }

    public static int countUnique(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = contains(arr, arr[i], i) ? count : count + 1;
        }   
        return count;
    }

    public static int [] set (int[] arr){
        int [] res = new int [countUnique(arr)];
        int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!contains(arr, arr[i], i)){
                    res[index++] = arr[i];
                }
            }
        return res;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        int [] ar1 = set(array1);
        int [] ar2 = set(array2);
        if (ar1.length != ar2.length){
            return false;
        }
        int count = 0;
        for (int i = 0; i < ar1.length; i++) {
            for (int n = 0; n < ar2.length; n++) {
                if (ar1[i] != ar2[n]) {
                    count = 1;
                }
                else{
                    count = 0;
                    break;
                }
            }
        }
        if (count == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        int count = 0;
        int [] ar = set(array);
        if (array[0] < array[1] && array[1] < array[2]){
            count += 1;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]){
                    return false;
                }
            }
        }
        if (array[0] > array[1] && array[1] > array[2]){
            count += 1;
            for (int n = 0; n < array.length - 1; n++){
                if (array[n] < array[n + 1]){
                    return false;
                }
            }
        }
        if (count != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
