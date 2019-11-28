package gist.hackerrank.numbrs.shopingbudget;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopingBudgetTest {

    ShopingBudget shopingBudget = new ShopingBudget();

    @org.junit.jupiter.api.Test
    void shoping() {
        int n =50;
        List<Integer> bundleQuantities = new ArrayList<Integer>();
        List<Integer> bundleCosts = new ArrayList<Integer>();

        bundleQuantities.add(20);
        bundleQuantities.add(19);

        bundleCosts.add(24);
        bundleCosts.add(20);

        assertEquals(0,shopingBudget.shoping(n , bundleQuantities, bundleCosts), 50 );

    }
}