import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(countABCSub(s));
  }

  static int countABCSub(String s) {

    int a = 0, ab = 0, abc = 0;

    for (int j = 0; j < s.length(); j++) {
      char ch = s.charAt(j);

      if (ch == 'a') {
        a = 2 * a + 1;
      } else if (ch == 'b') {
        ab = 2 * ab + a;
      } else {
        abc = 2 * abc + ab;
      }
    }

    return abc;
  }
}