public class MultiDimensionArray {
    public static void main(String[] args) {
        int arr1[][]={{12,22},{23,4}};

        for(int i=0;i< arr1.length;i++){
            for(int j=0;j< arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        int arr[][]=new int[2][2];

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j]= (int) (Math.random() *100);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
