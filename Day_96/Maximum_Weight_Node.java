package Day_96;

public class Maximum_Weight_Node {

}

class Solution {
    public int maxWeightCell(int N, int Edge[]) {
        int arr[] = new int[N];
        int maxi = 0;
        int index = 0;
        for (int i = 0; i < N; i++) {
            if (Edge[i] != -1) {
                arr[Edge[i]] = arr[Edge[i]] + i;
                if (arr[Edge[i]] > maxi) {
                    maxi = arr[Edge[i]];
                    index = Edge[i];
                }
            }
        }
        return index;
    }
}