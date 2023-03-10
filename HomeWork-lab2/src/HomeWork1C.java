public class HomeWork1C {
    //the answer of qustion (3) on lab(2)
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int size=a.length;
        int position =0;
        int i;
        int j;
        System.out.print("The Array={ ");
        for (int k = 0; k < a.length ; k++) {
            System.out.print(a[k]+",");
        }
        System.out.println("}");
        System.out.print("We will delete Index(0) in ech cycle");
        for (i = position; i < size; i++) {
            System.out.println("");
            System.out.print("Array= ");
            if (size!=0) {
                for (j = position + 1; j < size; j++) {
                    a[j - 1] = a[j];
                    System.out.print(a[j] + " ");

                }
                size--;
                if (size==0){
                    System.out.print("no more valuse");
                }

            }i--;
        }
    }

}

