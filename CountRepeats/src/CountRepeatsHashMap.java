import java.util.*;

class CountRepeatsHashMap {
    public static void main(String[] args) {
    /*
      Given an array, count the number of repeats
      per value in the array

      This solution is O(2n), which is O(n)
    */
        int[] arr = {1,3,6,3,0,2,7,6,3,1,3,-1,0};
        allRepeats(arr);
    }

    static void allRepeats(int[] arr) {
        HashMap<Integer, Integer> repeats = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if(repeats.containsKey(key)) {
                repeats.put(key, repeats.get(key) + 1);
            } else {
                repeats.put(key, 1);
            }
        }
        for(int num : repeats.keySet()) {
            System.out.println("The number " + num + " repeats " + repeats.get(num) + " times.");
        }
    }
}