public class HomeWork2C {
    //the answer of question (2) on lab(3)
    public void CloningArray(int[] arr1,int[] arr2,int n1,int n2){
       int i=0,j=0;
        while (i < n1){
            arr2[j++]=arr1[i++];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        HomeWork2C a = new HomeWork2C();
        a.CloningArray(arr1, arr2, arr1.length, arr2.length);
        System.out.print("Array1={");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+",");
        }
        System.out.println("}");
        System.out.println("We Copied Array1 into new Array:");
        System.out.print("Array2={");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+",");
        }
        System.out.print("}");
    }
}
