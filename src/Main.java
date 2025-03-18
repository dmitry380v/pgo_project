///Task1
//import java.util.ArrayList;
//
//public class Main {
//    public static int[] filterEvenIndexOddValue(int[] array) {
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < array.length; i += 2) {
//            if (array[i] % 2 != 0) {
//                result.add(array[i]);
//            }
//        }
//        int[] filteredArray = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            filteredArray[i] = result.get(i);
//        }
//        return filteredArray;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5, 6};
//        int[] arr2 = {2, 3, 4, 5, 6, 7};
//        int[] arr3 = {7, 8, 9, 10, 11};
//
//        int[] result1 = filterEvenIndexOddValue(arr1);
//        int[] result2 = filterEvenIndexOddValue(arr2);
//        int[] result3 = filterEvenIndexOddValue(arr3);
//
//        System.out.println("arr1: ");
//        for (int i = 0; i < result1.length; i++) {
//            System.out.print(result1[i] + " ");
//        }
//            System.out.println();
//
//            System.out.print("arr2: ");
//            for (int i = 0; i < result2.length; i++) {
//                System.out.print(result2[i] + " ");
//            }
//            System.out.println();
//
//            System.out.print("arr3: ");
//            for (int i = 0; i < result3.length; i++) {
//                System.out.print(result3[i] + " ");
//            }
//            System.out.println();
//        }
//    }

///Task2
public class Main {
    public static int findDominant(int[] array) {
        int n = array.length;
        int threshhold = n / 2;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count < threshhold) {
                return i;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2, 2};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 5, 5, 5, 1};

        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }
}