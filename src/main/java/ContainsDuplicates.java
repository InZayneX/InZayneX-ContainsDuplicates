import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        // import HashSet and Set
        //make a Set/new HashSet
        Set <Integer> sums = new HashSet<Integer>();
        // use a for loop to see if the new hashset has any duplicate runnning through int i : nums(int[])
        // if there is duplicate of int i while for looping in the sums hashset, it will return true
        //if sums.add(i) which adds nums array to new hashset and if there are no duplicate, return false
        for (int i : nums) {
            if (sums.contains(i)) 
            return true;
            sums.add(i);
        }

        return false;
    }
}
