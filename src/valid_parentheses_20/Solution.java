package valid_parentheses_20;

import java.util.LinkedList;


public class Solution {
    public static boolean isValid(String s) {
        String opening = "([{";
        String closing = ")]}";
        char[] a = s.toCharArray();
        LinkedList<Character> list = new LinkedList<Character>();

        for (int i=0; i<a.length; i++) {
            if ( list.size() == 0 ) {
                if ( /*closing.indexOf(a[i]) >= 0*/
                        a[i] == ')' || a[i] == '}' || a[i] == ']' ) return false;
                list.push(a[i]);
                continue;
            }
            if ( /*opening.indexOf(a[i]) >= 0*/
                    a[i] == '(' || a[i] == '{' || a[i] == '[' ) {
                list.push(a[i]);
                continue;
            }
            char tmp = (char)list.peekFirst();
            if (    ( tmp == '(' && a[i] == ')' )
                    || ( tmp == '{' && a[i] == '}' )
                    || ( tmp == '[' && a[i] == ']' )
                ) {
                list.pop();
                continue;
            }
            return false;
        }
        if (list.size() == 0) return true;
        return false;
    }
}
