package company.lab3.Calculator;

public class LogicalOp {


    public int getHigherNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    public String nameComparison(String fastTrackIt) {
        String text = fastTrackIt;
        text = "fastTrackIt";

        if (fastTrackIt.equals(text)) {
            return ("Learning text comparison!");
        } else {
            return "Go try some more";

        }
    }

    public String nameAndText(String fastTrackIt, int a) {
        String text = fastTrackIt;
        text = "fastTrackIt";
        if
        (fastTrackIt.equals(text)) {
            System.out.println("text + a");
        } else if (a <= 3) ;
        else if (fastTrackIt.equals(text)) {
            return (fastTrackIt + a);
        } else {
            return fastTrackIt;
        }

    }
}

