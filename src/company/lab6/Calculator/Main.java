package company.lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOp op=new LogicalOp();
        System.out.println(op.getListHundred());

        List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(27);
        list.add(15);
        list.add(20);
        op.displayList(list);


        List<Double> myList= new ArrayList<>();
        myList.add(2.7);
        myList.add(6.5);
        myList.add(9.2);
        myList.add(1.6);
        op.addToList(myList,9.5);

        List<Integer>myList=new ArrayList<>();
        myList.add(10);
        myList.add(12);
        myList.add(14);
        myList.add(16);
        myList.add(18);
        myList.add(20);
        op.printList(myList,20);

        op.printBackwards(myList);

        op.printList(myList);

        List<Integer> myListB=new ArrayList<>();
        myListB.add(47);
        myListB.add(50);
        myListB.add(80);
        myListB.add(97);
        myListB.add(78);
        System.out.println("Cel mai mare numar din lista este "+ op.checkMaxList(myListB));


            }
        }



