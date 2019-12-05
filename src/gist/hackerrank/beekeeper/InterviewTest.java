package gist.hackerrank.beekeeper;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class InterviewTest {

    Interview interview = new Interview();

    @Test
    void filter() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(interview.filter(integerList, x->x%2==0));

    }

    @Test
    void filterStream(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        integerList.add(5);
        integerList.add(5);
        integerList.add(5);

        Iterator it = interview.filterStream(integerList.iterator(), x->x%2==0);

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}