package company.lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class LogicalOp {



//tema lab 6

    //ex1
    public List<Integer> getListHundred() {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            myList.add(i);
        }

        return myList;
    }


    //ex2
    public void displayList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void displayListB(List<Integer> list) {
        for (int i : list) {
            System.out.println(i);
        }
    }


    //ex3
    public void addToList(List<Double> myList, double myNum) {
        myList.set(98, myNum);
        for (double i : myList) {
            System.out.println(i);
        }
    }

    public void printList(List<Integer> myList, int x) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == x) {
                for (int j = i; j < myList.size(); j++) {
                    System.out.println(myList.get(j));
                }
            }
        }

    }

    //ex4
    public void printBackwards(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }


    //ex7
    public void printList(List<Integer> myIntList) {
        for (int i = 0; i < myIntList.size(); i++) {
            System.out.println("Pe pozitia " + i + " valoarea este " + myIntList.get(i));
        }
    }

    //ex8
    public int checkMaxList(List<Integer> myList) {
        int max = 1;
        for (int i = 1; i < myList.size(); i++) {
            if (max < myList.get(i)) {
                max = myList.get(i);
            }
        }
        return max;
    }


}
















