public class ArrayUtils {
    
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid array or indices");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        
        String[] stringArray = {"apple", "banana", "cherry"};
        System.out.println("Before swap: " + java.util.Arrays.toString(stringArray));
        swap(stringArray, 0, 2);
        System.out.println("After swap: " + java.util.Arrays.toString(stringArray));

        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Before swap: " + java.util.Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("After swap: " + java.util.Arrays.toString(intArray));
    }
}
