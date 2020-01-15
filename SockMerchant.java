import java.util.*;
import java.util.stream.*;

public class SockMerchant {

    public static void main(String[] args) {
        int[] ar = {44, 55, 11, 15, 4, 72, 26, 91, 80, 14, 43, 78, 70, 75, 36, 83, 78, 91, 17, 17, 54,
                65, 60, 21, 58, 98, 87, 45, 75, 97, 81, 18, 51, 43, 84, 54, 66, 10, 44, 45, 23, 38, 22,
                44, 65, 9, 78, 42, 100, 94, 58, 5, 11, 69, 26, 20, 19, 64, 64, 93, 60, 96, 10, 10, 39,
                94, 15, 4, 3, 10, 1, 77, 48, 74, 20, 12, 83, 97, 5, 82, 43, 15, 86, 5, 35, 63, 24, 53,
                27, 87, 45, 38, 34, 7, 48, 24, 100, 14, 80, 54};

        //print pair count
        System.out.println(sockMerchant(ar));
        System.out.println(sockMerchant2(ar));
    }

    //Method without HashMap
    static int sockMerchant(int[] ar) {
        //counts the number of paired socks
        int count = 0;
        int i = 0;

        //sorted array needed to find pairs of same colored socks
        Arrays.sort(ar);

        //iterate through number of socks in ar
        while(i < ar.length-1) {
            //if the current sock matches the color of the next sock, add one to the paired sock count
            if(ar[i] == ar[i+1]) {
                count++;
                //move on to the next sock after this current matched pair
                i += 2;
            }
            //if there pair does not match, move onto the next sock
            else {
                i += 1;
            }
        }
        //output the number of sock pairs
        return count;
    }

    //Method with HashMap
    static int sockMerchant2(int[] ar) {
        //creates an empty HashMap
        HashMap<Integer, Integer> pairs = new HashMap<>();

        //iterates through the socks in ar
        for(int i = 0; i < ar.length; i++) {
            int num = ar[i];
            //if the current sock color already exists in the HashMap, increase count of that current sock color
            if(pairs.containsKey(num)){
                pairs.put(num, pairs.get(num)+1);
            }
            //otherwise create that key and have the current sock color value be 1
            else {
                pairs.put(num, 1);
            }
        }

        //initialize the pair count to zero
        int count = 0;

        //go through HashMap
        for(Integer key : pairs.keySet()) {
            //for every value in HashMap, divide by two for a pair and round down
            // (eliminating the sock colors that are not paired), setting count to this result
            count += Math.floor(pairs.get(key)/2);
        }

        //output the number of sock pairs
        return count;
    }
}