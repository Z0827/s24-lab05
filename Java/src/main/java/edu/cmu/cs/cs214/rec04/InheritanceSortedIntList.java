package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    private int addCount;

    public InheritanceSortedIntList(){
        this.addCount = 0;
    }

    public boolean add(int value){
        boolean result = super.add(value);
        if(result) addCount++;
        return result;
    }
    public boolean addAll(IntegerList value){
        boolean result = super.addAll(value);
        if(result) addCount += value.size();
        return result;
    }
    // Write your implementation below with API documentation
    public int getTotalAdded(){
        return this.addCount;
    }
}