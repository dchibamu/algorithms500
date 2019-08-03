package org.chibamu.algos;

import javax.management.RuntimeMBeanException;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void merge(Integer[] X, Integer[] Y)
    {
        //move elements of X to the beginning of the array
        int k = 0;
        for (int i = 0; i < X.length; i++)
        {
            if (X[i] != null)
            {
                X[k++] = X[i];
            }
        }
        int m = k - 1;
        int n = Y.length - 1;
        k = X.length - 1;
        while (m >= 0 && n >= 0)
        {
            if (X[m] > Y[n])
            {
                X[k--] = X[m--];
            }
            else {
                X[k--] = Y[n--];
            }
        }

        while (n >= 0)
        {
            X[k--] = Y[n--];
        }
    }

    /**
     *Assumptions: X and Y both contain positive integers. The size of Y is at least 1,and X contains enough empty spaces to accommodate Y
     * values
     * @param X
     * @param Y
     */
    public void mergeTwoSortedArrays(int[] X, int[] Y)
    {
        int k = -1;
        while(X[++k] != -1 && k < X.length);

        if(k == X.length)
        {
            throw new RuntimeException("X must contain at least size of both X and Y");
        }
        int q = k - 1;
        int p = Y.length - 1;
        k = X.length - 1;
        while(q >= 0 && p >= 0)
        {
            if(Y[p] > X[q])
            {
                X[k--] = Y[p--];
            }
            else
            {
                X[k--] = X[q--];
            }
        }

        while(p >= 0)
        {
            X[k--] = Y[p--];
        }
    }

    /**
     * Sort array of ones, zeros and twos
     * @param X
     */
    public void threeWayPartitionSorting(int[] X)
    {
        int start = 0, end = X.length - 1, pointer = 0, pivot = 1;
        while(pointer <= end)
        {
            if(X[pointer] < pivot)
            {
                swap(X, start, pointer);
                ++start;
                ++pointer;
            }
            else if(X[pointer] > pivot)
            {
                swap(X, pointer, end);
                --end;
            }
            else
            {
                ++pointer;
            }
        }
    }

    private void swap(int[] X, int i, int j)
    {
        int temp = X[i];
        X[i] = X[j];
        X[j] = temp;
    }
}
