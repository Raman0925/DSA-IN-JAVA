import java.util.*;
class maxElement {
    public static int maxElement(List<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(maxElement(arr));


       }
       
}