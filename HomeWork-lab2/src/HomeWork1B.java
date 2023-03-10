public class HomeWork1B {
    //the answer of qustion (2) on lab(2)
    public static void main(String[] args) {
        int[] arr1={3,5,4,6,7,8};
        int[] arr2=new int[arr1.length];
        System.out.print("Arr1={");
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        for (int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.print("}\n" );
        System.out.print("Arr2={");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + ", ");
        }
        System.out.print("}" );

    }
}
