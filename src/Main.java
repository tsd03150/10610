import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String tmp = kb.next();
        char[] ch = tmp.toCharArray();
        Integer[] arr = new Integer[ch.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ch[i] - 48;
            sum += arr[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        if (sum % 3 != 0 || arr[arr.length-1] != 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < arr.length; i++) {
                ch[i] = (char)(arr[i]+48);
            }
            System.out.println(String.valueOf(ch));
        }

    }
}
