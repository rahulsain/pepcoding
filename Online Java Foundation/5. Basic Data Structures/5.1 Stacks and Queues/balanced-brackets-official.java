import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    String q = sc.nextLine();
    boolean balanced = true;

    Stack<Character> st = new Stack<>();

    for (int i = 0; i < q.length(); i++) {
      char ch = q.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[') {
        st.push(ch);
      } else if (ch == ')' || ch == '}' || ch == ']') {
        if (st.size() == 0) {
          balanced = false;
          break;
        } else if (ch == ')' && st.peek() == '(') {
          st.pop();
        } else if (ch == '}' && st.peek() == '{') {
          st.pop();
        } else if (ch == ']' && st.peek() == '[') {
          st.pop();
        } else {
          balanced = false;
          break;
        }
      }
    }

    if (st.size() != 0) {
      balanced = false;
    }

    System.out.println(balanced);

  }

}