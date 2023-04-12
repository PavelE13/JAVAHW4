package JAVAHW4;

import java.util.*;

public class zad2 {

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2){
        LinkedList<Integer> llst= new LinkedList<Integer>();
        Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();
        String str1 = new String();
        String str2 = new String();
        int sz = d1.size();

        //System.out.println(d1);

        for (int i = 0; i < sz; i++) {
            str1 += d1.pollLast();
            //System.out.println(str1);
        }

        //System.out.println(d1);

        for (int i = 0; i < sz; i++) {
            str2 += d2.pollLast();
            //System.out.println(str2);
        }

        int summ = Integer.parseInt(str1) + Integer.parseInt(str2);
        //System.out.println(summ);

        while (summ>0){
            llst.add(summ%10);
            summ /= 10;
        }

        return llst;
    }
    public static void main(String[] args) {
        /*Даны 2 Deque представляющие два неотрицательных целых числа.  Цифры хранятся в обратном порядке,
        и каждый из узлов содержит одну цифру. Сложите 2 числа и верните сумму в виде связанного списка.
        Output
        [6,6,0,1]*/

        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        System.out.println(sum(d1, d2));
    }
}