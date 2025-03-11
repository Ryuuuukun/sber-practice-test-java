import com.ryuukun.sort.Sorter;
import org.junit.Assert;
import org.junit.Test;


public class SorterTest {

    @Test
    public void quickSorterExample() {
        int[] integers = new int[100];
        long[] longs = new long[100];

        arrayRandomFill(integers, -1000, 1000);
        arrayRandomFill(longs, -100000, 100000);

        Sorter.quick(integers);
        Sorter.quick(longs);

        assertArraySort(integers);
        assertArraySort(longs);
    }

    @Test
    public void bubbleSorterExample() {
        int[] integers = new int[100];
        long[] longs = new long[100];

        arrayRandomFill(integers, -1000, 1000);
        arrayRandomFill(longs, -100000, 100000);

        Sorter.bubble(integers);
        Sorter.bubble(longs);

        assertArraySort(integers);
        assertArraySort(longs);
    }

    @Test
    public void quickStressTest() {
        int[] integers = new int[1000];
        long[] longs = new long[1000];

        arrayRandomFill(integers, Integer.MIN_VALUE, Integer.MAX_VALUE);
        arrayRandomFill(longs, Long.MIN_VALUE, Long.MAX_VALUE);

        Sorter.quick(integers);
        Sorter.quick(longs);

        assertArraySort(integers);
        assertArraySort(longs);
    }

    @Test
    public void bubbleStressTest() {
        int[] integers = new int[1000];
        long[] longs = new long[1000];

        arrayRandomFill(integers, Integer.MIN_VALUE, Integer.MAX_VALUE);
        arrayRandomFill(longs, Long.MIN_VALUE, Long.MAX_VALUE);

        Sorter.bubble(integers);
        Sorter.bubble(longs);

        assertArraySort(integers);
        assertArraySort(longs);
    }

    public void assertArraySort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            Assert.assertTrue(array[i - 1] <= array[i]);
        }
    }

    public void assertArraySort(long[] array) {
        for (int i = 1; i < array.length; ++i) {
            Assert.assertTrue(array[i - 1] <= array[i]);
        }
    }

    public void arrayRandomFill(int[] array, int min, int max) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
        }
    }

    public void arrayRandomFill(long[] array, long min, long max) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = (long) ((Math.random() * (max - min)) + min);
        }
    }
}
