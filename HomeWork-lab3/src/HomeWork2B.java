public class HomeWork2B {

    //the answer of question (3) on lab(3)
    public void mergeArray(int[] arr1,int[] arr2,int n1,int n2,int[] arr3){
        int i=0,j=0,k=0;
//        while (i<n1 && j<n2){
//            if (arr1[i]<arr2[j])
//                arr3[k++]=arr1[i++];
//            else arr3[k++]=arr2[j++];
//        }
        while (i<n1)
            arr3[k++]=arr1[i++];
        while (j<n2)
            arr3[k++]=arr2[j++];

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        HomeWork2B s=new HomeWork2B();
        s.mergeArray(arr1,arr2,arr1.length,arr2.length,arr3);

        System.out.print("Array1={");
        for (int d = 0; d < arr1.length; d++) {
            System.out.print(arr1[d]+",");
        }
        System.out.println("}");

        System.out.print("Array2={");
        for (int f = 0; f < arr1.length; f++) {
            System.out.print(arr2[f]+",");
        }
        System.out.println("}");



        System.out.print("Array3={");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+",");
        }
        System.out.print("}");


    }
}
