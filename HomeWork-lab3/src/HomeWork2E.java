import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork2E {
    //the answer of question (4) on lab(3)
    public static void main(String[] args) {
        int[] Array1={1,2,3,4,5};
        int[] Array2={1,2,3,4,5};
        boolean l= Arrays.equals(Array1,Array2);
        if (l == true) {
            System.out.print("The Array1 and Array2 are Equivalence");
        }else {
            System.out.print("The Array1 and Array2 are not Equivalence");
        }
    }
}
