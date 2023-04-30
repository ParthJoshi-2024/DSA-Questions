import java.util.Scanner;

public class LinearSearch{
    static boolean flag = false;
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,33,4,56,7,8,-1,7,5};
        int target = 7;
        System.out.println("Press 1 if you want to return the index");
        System.out.println("Press 2 if you want to return the element");
        int choice = in.nextInt();
        if(choice == 1){
            int returned = search(arr, target);
            check(returned,flag);
        }
        if(choice == 2){
            int returned = searchElement(arr,target);
            check(returned,flag);
        in.close();
        }
    }
    static void check(int returned,boolean flag){
        if(returned == -1 && flag == false)
            System.out.println("Element not found");
        else if(returned == -1 && flag == true)
            System.out.println("Element exists :: -1");
        else
            System.out.println("Element exists :: " + returned);
    }
    static int search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;

    }

    static int searchElement(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                flag = true;
                return arr[i];
            }
        }
        return -1;
    }
}