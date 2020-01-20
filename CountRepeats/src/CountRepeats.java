import java.util.*;

class Main {
    public static void main(String[] args) {
    /*
      Given an array, count the number of repeats
      per value in the array
      - ISSUE: There can be no negative values in the array

      This solution is O(n^3)
    */
        int[] arr = {1,3,6,3,2,7,6,3,1,3};
        //countRepeats(3, arr);
        allRepeats(arr);
    }

    static void allRepeats(int[] arr) {
        // if alreadyShown != true, countRepeats
        ArrayList<Integer> isRepeated = new ArrayList<Integer>(Arrays.asList(-1)); // initializing a value that

        for (int i = 0; i < arr.length; i++) {
            // int numberOfRepeats = 0;
            for (int j = 0; j < isRepeated.size(); j++) {
                if (!isRepeated.contains(arr[i])) {
                    System.out.println(countRepeats(arr[i], arr));
                    isRepeated.add(arr[i]);
                }
            }
        }
    }

    static String countRepeats(int num, int[] arr) {
        int numberOfRepeats = 0;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                numberOfRepeats++;
            }
        }
        return "The number " + num + " repeats " + numberOfRepeats + " times.";
        // return numberOfRepeats;
    }
}