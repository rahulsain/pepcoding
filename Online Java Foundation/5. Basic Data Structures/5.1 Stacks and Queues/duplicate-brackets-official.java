import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String q = sc.nextLine();
        boolean duplicate = true;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            if (ch != ')') {
                st.push(ch);
            } else {
                duplicate = true;
                while (st.peek() != '(') {
                    duplicate = false;
                    st.pop();
                }
                st.pop();
                if (duplicate)
                    break;
            }
        }

        System.out.println(duplicate);

    }

}