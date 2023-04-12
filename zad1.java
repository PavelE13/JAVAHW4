package JAVAHW4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class zad1 {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean checkOn(Deque<Integer> deq){
        Boolean res = true;

        for (int i = 0; i < deq.size()/2; i++) {
            int a = deq.pollFirst();
            //System.out.println(deq);
            int b = deq.pollLast();
            //System.out.println(deq);
            if (a != b) {
                res = false;
                break;
            }
            //System.out.println(res);
        }

        return res;
    }
    public static void main(String[] args) {
        /*Дан Deque состоящий из последовательности цифр. Необходимо проверить, что последовательность
        цифр палиндром.*/
        
        Deque<Integer> dlst = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(dlst);
        System.out.println(checkOn(dlst) ? "Palindrom": "Ne palindrom");
    }
}