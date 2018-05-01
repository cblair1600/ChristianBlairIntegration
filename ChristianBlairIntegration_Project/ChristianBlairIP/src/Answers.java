// Christian Blair, this file is for a class for the Answers object in the main file 
public class Answers {
    private double answer;

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    private boolean truefalse;

    public boolean isTruefalse() {
        return truefalse;
    }

    public void setTruefalse(boolean truefalse) {
        this.truefalse = truefalse;
    }

    public void speak() {
        System.out.println("The answer is: " + answer);

    }

    public void speak2() {
        System.out.println("The answer is: " + truefalse);
    }
}