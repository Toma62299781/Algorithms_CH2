/**
 * Created by JJBOOM on 2016/4/16.
 * This test will test the performance of the "" + x and toString() method
 */
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

public class test {
    public static double time(String alg, double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg == "shorthand")   SHORTHAND(a);
        else                      TOSTRING(a);
        return timer.elapsedTime();
    }

    public static void TOSTRING(double[] a) {
        String[] c = new String[a.length];
        int i = 0;
        for (double element:a) {
            c[i] = Double.toString(element);
            i = i + 1;
        }
    }
    public static void SHORTHAND(double[] a) {
        String[] c = new String[a.length];
        int i = 0;
        for (double element: a) {
            c[i] = "" + element;
            i = i + 1;
        }
    }

    public static void main(String[] args) {
        double[] aa = new double[100000];
        for (int i = 0; i < aa.length; i++)
            aa[i] = StdRandom.uniform();
        double time_TO = time("to", aa);
        double time_SH = time("shorthand", aa);
        StdOut.print(time_TO / time_SH);
    }
}
