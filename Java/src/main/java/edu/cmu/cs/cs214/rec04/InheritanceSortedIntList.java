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
    private int totalAdded;

    public InheritanceSortedIntList(){
        super();
        this.totalAdded = 0;
    }

    public boolean add(int value){
        boolean result = super.add(value);
        this.totalAdded++;
        return result;
    }
    public boolean addAll(IntegerList value){
        boolean result = super.addAll(value);
        //this.totalAdded += value.size();
        return result;
    }
    // Write your implementation below with API documentation
    public int getTotalAdded(){
        return this.totalAdded;
    }
}