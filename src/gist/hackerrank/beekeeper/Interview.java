package gist.hackerrank.beekeeper;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Interview {
    <T> List<T> filter(List<T> input, Predicate<T> lamda){
       return input.stream().filter(lamda).collect(Collectors.toList());
    }

    <T> Iterator<T> filterStream(Iterator<T> input, Predicate<T> lamda){
        Iterator out = new Iterator() {
            Queue<T> internalQueue = new LinkedList<>();
            @Override
            public boolean hasNext() {
                //TODO: THis can be improved
                while (input.hasNext()){
                    T next = input.next();
                    if(lamda.test(next)){
                        internalQueue.add(next);
                        return true;
                    }
                }
                return false;
            }

            @Override
            public Object next() {
                while (!internalQueue.isEmpty() || input.hasNext()){

                    if(!internalQueue.isEmpty()){
                        T next = internalQueue.poll();
                        return next;
                    }else {
                        T next = input.next();
                        if(lamda.test(next)){
                            return next;
                        }
                    }

                }
                return null;
            }
        };

        return out;
    }
//    public static void main(String[] args){
//        System.out.println("Hello world");
//    }
}
