package InterviewPrep2025;

public class RotateTheNumberLessThanN {
    public static void main(String[] args) {
        //Rotate The number where k is less than n
        int arr[]=new int[]{4,3,2,1,5,6,7,8};
        int k=3; //expected arr= {6,7,8,4,3,2,1,5};
        System.out.print("Before:");
        reverseTheNumber.printArray(arr);
        reverseTheNumber.Reverse(arr,0,arr.length-1);
        System.out.print("\n Phase1:");
        reverseTheNumber.printArray(arr);
        //now looks like arr={8,7,6,5,1,2,3,4}
        reverseTheNumber.Reverse(arr,0,k-1);
        System.out.print("\n Phase2:");
        reverseTheNumber.printArray(arr);
        //now looks like arr={6,7,8,5,1,2,3,4}
        reverseTheNumber.Reverse(arr,k,arr.length-1);
        System.out.print("\nPhase3 final:");
        System.out.print("\nAfter:");
        reverseTheNumber.printArray(arr);
    }
}
