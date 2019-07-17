package company.lab5;


import company.lab5.Calculator.LogicalOp;

public class Main {
    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        int[] myArray = op.getArrayToHundred();
        for (int i =0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        int[] myEvenArray=op.getEvenArray();
        for(int i=0;i<myEvenArray.length; i++){
            System.out.println(myEvenArray[i]);
        }

        int[] myAverageArray={1,6,8,2,4,7};
        float media =op.getAverageArray(myAverageArray) ;
        System.out.println("Media numerelor din myAverageArray este;" + media);


        int[] myNumberInArray = op.checkIfNumberInArray();


    }
}