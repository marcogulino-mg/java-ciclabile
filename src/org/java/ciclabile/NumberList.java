package org.java.ciclabile;

public class NumberList {
    // Context: Attributes
    private int[] numList;
    private int arrIndex;

    // Context: Methods
    // Context: Constructors
    public NumberList(int[] numList) {
        this.numList = numList;
    }

    // Context: Concrete Methods
    public int getElementoSuccessivo() {
        int element = this.numList[arrIndex];
        arrIndex++;
        return element;
    }
}
