package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{
    // Write your implementation below with API documentation
    SortedIntList sil;
    private int totalAdded;
    public DelegationSortedIntList(){
        this.sil = new SortedIntList();
        this.totalAdded = 0;
    }

    public boolean add(int value){
        boolean result = this.sil.add(value);
        if(result) this.totalAdded++;
        return result;
    }

    public boolean addAll(IntegerList value){
        boolean result = this.sil.addAll(value);
        if(result) this.totalAdded += value.size();
        return result;
    }

    public int getTotalAdded(){
        return this.totalAdded;
    }

    public int get(int value){
        return this.sil.get(value);
    }

    public boolean remove(int value){
        return this.sil.remove(value);
    }

    public boolean removeAll(IntegerList value){
        return this.sil.removeAll(value);
    }

    public int size(){
        return this.sil.size();
    }

}