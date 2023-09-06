package hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParenthesisTest {
    public static void main(String[] args) {
        // The element is popped from the top of the stack and is removed from the same.
        // Ref https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
        String exp = "([{}])";
        isParenthesisBalanced(exp);
        if(isParenthesisBalanced(exp))
        {
            System.out.println("Balanced");
        }else {
            System.out.println("Not Balanced");
        }
    }

    public static boolean isParenthesisBalanced(String exp) {
        // Take one Stack
        Deque<Character> s = new ArrayDeque<>();
        for (int i = 0; i < exp.length() - 1; i++) {
            char item=exp.charAt(i);
            if (item == '(' || item == '{' || item == '[') {
                s.push(item);
                continue;
            }
            if (s.isEmpty())
                return false;
            char popitem;
            switch (item) {
                case ')':
                    popitem = s.pop();
                    if(popitem=='{' || popitem=='[')
                        return false;
                    break;
                case '}':
                    popitem = s.pop();
                    if(popitem=='[' || popitem=='(')

                        return false;
                    break;
                case ']':
                    popitem = s.pop();
                    if(popitem=='(' || popitem=='{')
                        return false;
                    break;
            }

        }
        return (s.isEmpty());
    }
}
