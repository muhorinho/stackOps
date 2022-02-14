import java.util.Stack;

import static java.lang.Integer.parseInt;

public class GenericStackOps<T extends Comparable<T>> {


    public boolean search(GenericStack<T> s, T val) {
        boolean found = false;
        GenericStack<T> temp = new GenericStack<T>((Class<T>) val.getClass(), s.size());
        while (!s.isEmpty()) {
            T topElement = s.pop();
            temp.push(topElement);
            if (topElement.compareTo(val) == 0) {
                found = true;
                break;
            }
        }
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }

        return found;
    }
    static boolean bracketControl(String s) {
        Stack<Character> stack = new Stack<Character>();
        char par,control;
        int i = 0;
        while (i < s.length()) {
            par = s.charAt(i);
            if (par == '(' || par == '[' || par == '{') {
                stack.push(par);
                i++;
                continue;
            }
            if (!stack.isEmpty()) {
                if (par == ']') {
                    control = stack.pop();
                    if (control == '(' || control == '{')
                        return false;
                } else if (par == '}') {
                    control = stack.pop();
                    if (control == '(' || control == '[')
                        return false;
                } else if (par == ')') {
                    control = stack.pop();
                    if (control == '{' || control == '[')
                        return false;
                }
                i++;
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

     static String postfixCalculate(String s) {
        //GenericStack<Integer> stack = null;
        GenericStack<String> stack = new GenericStack<String>(String.class, s.length());
        if (s.length() == 0) {
            return String.valueOf(stack.pop());
        }
        int i = 0;
        while (i < s.length()) {
            if ("0123456789".contains(Character.toString(s.charAt(i)))) {
                stack.push(String.valueOf(parseInt(Character.toString(s.charAt(i)))));
            } else if ("+".contains(Character.toString(s.charAt(i)))) {
                if (stack.size() > 1) {
                    int int1 = parseInt(stack.pop());
                    int int2 = parseInt(stack.pop());
                    stack.push(String.valueOf(int1 + int2));
                }
            } else if ("-".contains(Character.toString(s.charAt(i)))) {
                if (stack.size() > 1) {
                    int int1 = parseInt(stack.pop());
                    int int2 = parseInt(stack.pop());
                    stack.push(String.valueOf(int2 - int1));
                }
            } else if ("*".contains(Character.toString(s.charAt(i)))) {
                if (stack.size() > 1) {
                    int int1 = parseInt(stack.pop());
                    int int2 = parseInt(stack.pop());
                    stack.push(String.valueOf(int2 * int1));
                }
            } else if ("/".contains(Character.toString(s.charAt(i)))) {
                if (stack.size() > 1) {
                    int int1 = parseInt(stack.pop());
                    int int2 = parseInt(stack.pop());
                    stack.push(String.valueOf(int2 / int1));
                }
            }
            i++;
        }
        return String.valueOf(stack.pop());
    }
}

