import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by JJBOOM on 2016/4/3.
 * This is the implementation of the Insertion Sort
 */
public class Insertion {

    public static void sort(Comparable[] a)
    {
        int N = a.length;

        for (int i = 1; i < N; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }

    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0; }

    private static void exch(Comparable[] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t; }

    private static void show(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
            edu.princeton.cs.algs4.StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1]))  return false;
        return true;
    }

    public static void main(String[] args)
    {
        In in = new In(args[0]);
        String[] a = in.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }

}
