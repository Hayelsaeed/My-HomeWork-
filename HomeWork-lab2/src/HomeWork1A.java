public class HomeWork1A {
    //the answer of qustion (1) on lab(2)
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 9, 6};
        int arr2[] = new int[arr1.length];
        System.out.print("arr2={");
        for (int i=0;i< arr2.length;i++){
            arr2[i] = arr1[arr1.length-1-i];
            System.out.print( arr2[i] + ", ");
        }
        System.out.print("}");
    }

}