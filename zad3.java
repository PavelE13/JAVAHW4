package JAVAHW4;

import java.util.*;

public class zad3 {
    
    public static boolean valid(Deque<Character> deq) {
        Boolean res = true;

        Stack<Character> stack = new Stack<>();
        for(char c : deq) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(c == ')' || c == ']' || c == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char toUp = stack.pop();
            }
        }
        return stack.isEmpty();
        }
        public static void main(String[] args) {
            /*Дана строка содержащая только символы. Определите:
        //является ли входная строка логически правильной
        //Входная строка логически правильная, если:
        1) Открытые скобки должны быть закрытыми скобками того же типа
        2) Открытые скобки должны быть закрыты правильно. Каждая скобка имеет соответствующую откр. скобку
        того же типа. Строка '(', ')', '{', '}', '[', ']'
        Output
        ()[] = true
        () = true
        {[()]} = true
        ()() = true
        )()( = false
         */
        Deque<Character> dlst = new ArrayDeque<>(Arrays.asList('(',')','{','}'));
        System.out.print(dlst);
        System.out.printf(" = " + valid(dlst));

        Deque<Character> dlst1 = new ArrayDeque<>(Arrays.asList(')','(',')','('));
        System.out.print("\n" + dlst1);
        System.out.printf(" = " + valid(dlst1));

        Deque<Character> dlst2 = new ArrayDeque<>(Arrays.asList('{','[','(',')', ']','}'));
        System.out.print("\n" + dlst2);
        System.out.printf(" = " + valid(dlst2));
        }
}