import java.util.Scanner;
class InstMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        int input = sc.nextInt();
        printTriple(input + "");
    }

    public static void printTriple(String str) {
        for(int i = 0; i < 3; i++) {
            System.out.println(str);
        }
    }
}