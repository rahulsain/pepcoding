import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line, strs[];
        int n = Integer.parseInt(br.readLine());
        int v[] = new int[n];
        int w[] = new int[n];
        line = br.readLine(); // to read multiple integers line
        strs = line.trim().split(" ");
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(strs[i]);
        }
        line = br.readLine(); // to read multiple integers line
        strs = line.trim().split(" ");
        for (int i = 0; i < n; i++) {
            w[i] = Integer.parseInt(strs[i]);
        }
        int cap = Integer.parseInt(br.readLine());

        System.out.println(getMaxValue(w, v, cap));
    }

    private static double getMaxValue(int[] wt, int[] val, int capacity) {
        ItemValue[] iVal = new ItemValue[wt.length];

        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }

        // sorting items by value;
        Arrays.sort(iVal, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalValue = 0d;

        for (ItemValue i : iVal) {

            int curWt = (int) i.wt;
            int curVal = (int) i.val;

            if (capacity - curWt >= 0) {
                // this weight can be picked while
                capacity = capacity - curWt;
                totalValue += curVal;
            } else {
                // item cant be picked whole
                double fraction = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                capacity = (int) (capacity - (curWt * fraction));
                break;
            }
        }

        return totalValue;
    }

    static class ItemValue {
        Double cost;
        double wt, val, ind;

        // item value function
        public ItemValue(int wt, int val, int ind) {
            this.wt = wt;
            this.val = val;
            this.ind = ind;
            cost = new Double((double) val / (double) wt);
        }
    }
}