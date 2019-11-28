package gist.hackerrank.interviewKit.newYearChios;

public class NewYearChios {

    // solution is at https://medium.com/@lonell.liburd/new-year-chaos-1672cb15ba42

    // Complete the minimumBribes function below.
    public static void minimumBribes(int[] q) {
        final int[] bribeCount = {0};

        int swap = 0;
        int bribes;
        int pos = 0;
        for(int i = q.length-1; i >= 0; i--) {
            int j = 0;

            bribes = q[pos] - (pos+1);
            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (q[i] - 2 > 0){
                j = q[i] - 2;
            }

            while(j <= i) {
                if (q[j] > q[i]){
                    swap++;
                }
                j++;
            }
            pos++;
        }
        System.out.println(swap);

    }



}
