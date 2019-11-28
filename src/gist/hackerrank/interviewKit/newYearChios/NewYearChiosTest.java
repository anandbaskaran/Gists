package gist.hackerrank.interviewKit.newYearChios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewYearChiosTest {

    NewYearChios nyc = new NewYearChios();
    @Test
    void minimumBribes() {
//        int[] q = {2, 1, 5, 3, 4};
        int[] q = {2 ,5 ,1 ,3 ,4};
        nyc.minimumBribes(q);
    }
}