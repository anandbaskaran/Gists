package gist.hackerrank.numbrs.shopingbudget;

import java.util.ArrayList;
import java.util.List;


public class ShopingBudget {


    public void main(String[] args) {
	// write your code here
        int n =50;
        List<Integer> bundleQuantities = new ArrayList<Integer>();
        List<Integer> bundleCosts = new ArrayList<Integer>();

        bundleQuantities.add(20);
        bundleQuantities.add(19);

        bundleCosts.add(24);
        bundleCosts.add(20);


        System.out.println("Maximum notebook = " + shoping(n , bundleQuantities, bundleCosts));

    }

    public int shoping(int n, List<Integer> bundleQuantities, List<Integer> bundleCosts) {
        final int[] max = {0};
        dpRecursive(n, bundleQuantities, bundleCosts, max, 0, 0 );
        return max[0];
    }

    private void dpRecursive(int n, List<Integer> bundleQuantities, List<Integer> bundleCosts, int[] max, int position, int count) {
        if(n==0 || position == bundleCosts.size()){
            if(count > max[0]){
                max[0] = count;
            }
            return;
        }
        for(int i=0;i<=n/bundleCosts.get(position);i++){
            dpRecursive(n-i*bundleCosts.get(position), bundleQuantities, bundleCosts, max, position+1, count+ i*bundleQuantities.get(position));
        }
    }
}
