package org.java.ciclabile;

public class NumberList {
    // Context: Attributes
    private int[] numList;
    private int currentIndex = 0;

    // Context: Methods
    // Context: Constructors
    public NumberList() {
        this.numList = new int[0];
    }

    public NumberList(int[] numList) {
        this.numList = numList;
    }

    // Context: Concrete Methods
    public int getElementoSuccessivo() {
        int element = this.numList[this.currentIndex];
        this.currentIndex++;
        return element;
    }

    public boolean hasAncoraElementi() {
        if (this.currentIndex == this.numList.length) {
            return false;
        } else {
            return true;
        }
    }

    public void addElemento(int additionalNum) {
        // Explanation: Create empty Array with numList lenght + 1
        int[] newArr = new int[this.numList.length + 1];

        // Explanation: Import numList values into newArr
        for (int i = 0; i < this.numList.length; i++) {
            newArr[i] = numList[i];
        }

        // Explanation: Import additionalNum into newArr last index
        newArr[newArr.length - 1] = additionalNum;

        this.numList = newArr;
    }
}
