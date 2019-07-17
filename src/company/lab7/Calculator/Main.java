package company.lab7.Calculator;

public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        System.out.println("You entered the number: " + read.getInt());
        System.out.println("You entered the number: " + read.getFloat());
        System.out.println("You entered the number: " + read.getDouble());
        System.out.println("You entered the number: " + read.getByte());
        System.out.println(read.intList());


    }
}