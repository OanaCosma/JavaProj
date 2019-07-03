package company.lab5.Calculator;

public class LogicalOp {


    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) { // folosim for cand stim de cate ori vrem sa iteram.
            System.out.println(i);
        }

    }

    public void printToHundredWhile(int number) {
        while (number <= 100) ;
        System.out.println(number);
        number++;
    }


    public void printToHundredDoWhile(int number) {
        do { // se executa cel putin o data,spre deosebire de while-do.
            System.out.println(number);
            number++;
        } while (number <= 100);
    }


    public void printSumAndAverage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println(sum);
        System.out.println("Average is : " + (sum / 100f));
    }


    public void printStars() {

        int i, j;
        for (i = 0; i <= 6; i++) {
            for (j = 1; j <= 7 - i; j++) System.out.print("*");
            System.out.println("");
        }

    }


    public void printEvenNumbers() {

        int limit = 100;

        System.out.println("Printing Even numbers between 1 and " + limit);

        for (int i = 1; i <= limit; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void printOddNumbers() {
        System.out.println("The Odd Numbers are:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


    //Tema 13, ex 2
    public int[] getArrayToHundred() {
        int[] myArray = new int[100];

        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }


    public int[] getEvenArray() {
        int[] myArray = new int[51];
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                myArray[count] = i;
                count++;
            }
        }
        return myArray;
    }


    public float getAverageArray(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        return (sum / myArray.length);

    }


    public void checkIfNumberInArray(int[] myArray, int x) {
        boolean check = false;
        for (int i = 0; i < myArray.length; i++) {
            if (x == myArray[i]) {
                check = true;
            }
            System.out.println(check);
        }


        public int checkIfNumberInArrayIndex (int[] myArray, int x){
            int a = -1;
            for (int i = 0; i < myArray.length; i++)
                if (x == myArray[i]) {
                    a = i;
                    break;

                }

            return a;
        }


        public void showCharactersArray() {
            char[] myArray = {'-', '-', '-', '-', '-', '-', '-'};
            for (int i = 0; i < 6; i++) {
                System.out.println();

                for (int j = 0; j < myArray.length; j++) {
                    System.out.print(myArray[j] + " ");
                }
            }
        }


    }
}






