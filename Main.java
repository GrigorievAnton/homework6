import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ������ 1
        Scanner scan = new Scanner(System.in);
        String n1 = scan.nextLine();
        String rslt = n1.replace('�', '0');
        System.out.println(rslt);
        //������ 2
        String n2 = "������ ��� ����?";
        String result = "";
        for(int i = 0; i < n2.length(); i++) {
            if (i % 2 == 0) {
                result = n2.toUpperCase();
                System.out.print(result.charAt(i));
            } else {
                result = n2.toLowerCase();
                System.out.print(result.charAt(i));
            }
        }

        }
}
