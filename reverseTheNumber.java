package InterviewPrep2025;

public class reverseTheNumber {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,3,4,5,6,7,8};
        System.out.println("Before :");
        printArray(arr);
        Reverse(arr,0,arr.length-1);
        System.out.println("\n After :");
        printArray(arr);
    }
    public static void  Reverse(int[] arr,int sp,int ep){
        int startPointer=sp;
        int endPOinter=ep;
        while(startPointer<endPOinter){
            int temp=arr[startPointer];
            arr[startPointer++]=arr[endPOinter];
            arr[endPOinter--]=temp;
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
