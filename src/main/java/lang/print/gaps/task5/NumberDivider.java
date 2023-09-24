package lang.print.gaps.task5;
public class NumberDivider {
    void divide(int toBeDivided) {
          int result = toBeDivided / 5;
            System.out.println("Result: " + result);
        
    }

    public static void main(String[] args) {
        NumberDivider divider = new NumberDivider();
        int numberToBeDivided = 20; 
        divider.divide(numberToBeDivided);
    }
}


