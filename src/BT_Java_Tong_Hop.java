import java.util.Scanner;
public class BT_Java_Tong_Hop {
    public static void main(String[] args) {
        int choice;
        int[] arr = new int[100];
        int size = 0;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    size = inputSize();
                    inputArray(arr, size);
                    break;
                case 2:
                    System.out.println("2. Display Array");
                    disPlayArray(arr, size);
                    break;
                case 3:
                    System.out.println("3. Find Largest Even Number of Array");
                    FindEvenNumber(arr, size);
                    break;
                case 4:
                    System.out.println("4. Display List Even Number of Array");
                    DisplayEvenNumber(arr,size);
                    break;
                case 5:
                    System.out.println("5. Total Even Number of Array");
                    TotalEvenNumber(arr,size);
                    break;
                case 6:
                    System.out.println("6. Nhập vào giá trị và vị trí cần chèn của giá trị đó trong mảng, chèn giá trị đó vào mảng");
                    insertValue(arr,size);
                    break;
                case 7:
                    System.out.println("7. Xoá tất cả các phần tử có giá trị bằng X (được nhập từ bàn phím) khỏi mảng");
                    DeleteElement(arr,size);
                    break;
                case 8:
                    System.out.println("8. Invert The Array");
                    InvertArray(arr , size);
                    break;
                case 9:
                    System.out.println("9. Display list Prime of Array");
                    displayPrime(arr,size);
                    break;
                case 10:
                    System.out.println("10. Sort Arrays Down");
                    SortArray(arr,size);
                    break;
                case 11:
                    System.out.println("11. Exit");
                    break;
            }
            System.out.println("Enter u choice");
        } while (choice >= 1 && choice <= 11);
    }
    static void menu() {
        System.out.println("========MENU========");
        System.out.println("1. Enter size N of Array (0<N<100)");
        System.out.println("2. Display Array :");
        System.out.println("3. Find Largest Even Number of Array ");
        System.out.println("4. Display List Even Number of Array ");
        System.out.println("5. Total Even Number of Array ");
        System.out.println("6. Nhập vào giá trị và vị trí cần chèn của giá trị đó trong mảng, chèn giá trị đó vào mảng ");
        System.out.println("7. Xoá tất cả các phần tử có giá trị bằng X (được nhập từ bàn phím) khỏi mảng ");
        System.out.println("8. Invert The Array ");
        System.out.println("9. Display list Prime of Array ");
        System.out.println("10. Sort Arrays Down ");
        System.out.println("11. Exit");
    }
    static int inputSize() {
        int N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter size N of Array (0<N<100)");
            N = sc.nextInt();
        } while (N <= 0 || N >= 100);
        return N;
    }
    static void inputArray(int[] arr, int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size N of Array (0<N<100)");
        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "]= ");
            arr[i] = sc.nextInt();
        }
    }
    static void disPlayArray(int[] arr, int N) {
        System.out.println("Array is :");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    static int FindEvenNumber(int[] arr, int N) {
        int[] even = new int[N];
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                even[c] = arr[i];
                c++;
            }else {
                System.out.println("Array not have Even number");
                break;
            }
        }
        int max = even[0];
        System.out.println("Max Even Number of Array is: ");
        for (int i = 0; i < c; i++) {
            if (even[i] > max) {
                max = even[i];
            }
        }
        System.out.println(max);
        return max;
    }
    static void DisplayEvenNumber(int[] arr, int N) {
        int[] even = new int[N];
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                even[c] = arr[i];
                c++;
            }else {
                System.out.println("Array not have Even number");
                break;
            }
        }
        System.out.println("Even Numbers is: ");
        for (int i = 0; i < c; i++) {
            System.out.println(even[i] + " ");
        }
    }
    static int TotalEvenNumber(int[]arr , int N){
        int[] even = new int[N];
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                even[c] = arr[i];
                c++;
            }else {
                System.out.println("Array not have Even number");
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < c; i++) {
            sum += even[i];
        }
        System.out.println("Total Number of Array is: "+ sum);
        return sum;
    }
    static void insertValue(int [] arr, int N){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number U Want Insert :");
        int number = sc.nextInt();
        System.out.println("Enter Location U Want Insert ");
        int index = sc.nextInt();
        System.out.println("Array After Insert Is :");
            if (index>N){
                System.out.println("The insertion position must be less than " +N);
            }
        for (int i = 0; i < N; i++) {
            if (index<N) {
                arr[index] = number;
                System.out.println(arr[i] + " ");
            }
        }
    }
    static void DeleteElement(int[] arr, int N){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number U Want Delete: ");
        int number = sc.nextInt();
        System.out.println("Array after Delete is : ");
        int [] arrAfter = new int[N];
        int n =0;
        for (int i = 0; i < N; i++) {
            if (arr[i]!=number) {
                arrAfter[n] = arr[i];
                n++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arrAfter[i]+" ");
        }
    }
    static void InvertArray (int[] arr , int N){
        for (int i = 0; i < N/2; i++) {
            int temp = arr[i];
            arr[i]=arr[N-1-i];
            arr[N-1-i]=temp;
        }
        System.out.println("Array After Invert is: ");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    static boolean checkPrime(int n){
        if (n<2){
            return false;
        }else {
            for (int i = 2; i < n; i++) {
                if (n%i==0)
                    return false;
            }
        }
        return true;
    }
    static void displayPrime(int[]arr , int N){
        System.out.println("List Prime of Array is : ");
        int [] prime = new int[N];
        int p = 0;
        for (int i = 0; i < N; i++) {
            if (checkPrime(arr[i])) {
                prime[p] =  arr[i];
                p++;
            }
        }
        for (int i = 0; i < p; i++) {
            System.out.println(prime[i] + " ");
        }
    }
    static void SortArray(int [] arr , int N){
        int temp ;
        System.out.println("Array after sort is: ");
        for (int i = 0; i < N ; i++) {
            for (int j = i+1; j < N ; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}


