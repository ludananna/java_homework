package algorithm;

public class SelectionSort {
    public static void sort(int[] n) {
        int indexOfSmallest;
        for (int i = 0; i < n.length; i++) {
            indexOfSmallest = indexOfSmallTest(i, n);
            interchange(i, indexOfSmallest, n);

        }

    }

    private static int indexOfSmallTest(int unsorted, int[] n)
    {
            int smallest = n[unsorted];
            int indexOfNextSmallest = unsorted;
            for (int i = unsorted + 1; i < n.length; i++)
                if (n[i] < smallest)
                {
                    smallest = n[i];
                    indexOfNextSmallest = i;
                }
            return indexOfNextSmallest;


        }

        private static void interchange(int i, int j, int[] n)
        {
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;

    }
}