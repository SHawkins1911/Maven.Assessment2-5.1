package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    String[] result;

    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @param endingIndex      - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        return copyOfRange(arrayToBeSpliced, startingIndex, endingIndex);
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        ArrayList<String> results = new ArrayList<>();
        for (int i = startingIndex; i <= arrayToBeSpliced.length; i++) {
            results.add(arrayToBeSpliced[i]);


        }
        return results.toArray(new String[0]);
    }
}