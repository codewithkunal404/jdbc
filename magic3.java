import java.util.Random;
import java.util.Scanner;

public class magic3 {
    public static void main(String[] args) {

        System.out.println("Think any related name like your friend ,father,sister etc.");
        System.out.println("then Calculate total length of name which you think then multiply by 5 say ok");
        System.out.println("::");
        Scanner sc = new Scanner(System.in);
        String check = sc.next();
        if (check.equalsIgnoreCase("ok")) {

            System.out.println("ok now multiply your answer by 2 and say ok");
            check = sc.next();
            if (check.equalsIgnoreCase("ok")) {
                String data = "123456789";
                Random rnd = new Random();
                final int KEY = 10;
                int x = 0;
                int no = rnd.nextInt(data.length());

                for (int i = 1; i < 2; i++) {

                    char ch = data.charAt(no);
                    String s = String.valueOf(ch);
                    x = Integer.parseInt(s);

                    System.out.println("Now  subtract " + x + " from answer say ok");

                }

                check = sc.next();
                if (check.equalsIgnoreCase("ok")) {
                    System.out.println("Ok then  choose movie name in your mind with movie no");
                    System.out
                            .println("movie number should be right side number of your answer like 23 its Right is 3 ");
                    System.out.println("Movies");
                    System.out.println(
                            "1.\tBaahubali \r\n" + //
                                    "2.\tKGF Chapter \r\n" + //
                                    "3.\tRRR \r\n" + //
                                    "4.\tPathaan \t\r\n" + //
                                    "5.\tGadar  \t\r\n" + //
                                    "6.\tBaahubali \t\r\n" + //
                                    "7.\tAvatar\t\r\n" + //
                                    "8.\tDangal\r\n" + //
                                    "9. sholay\r\n" + //
                                    "");
                    System.out.println("Say ok for continue:");
                    check = sc.next();
                    if (check.equalsIgnoreCase("ok")) {
                        System.out.println("i think your are thinking number " + (KEY - x) + " movie");
                    }

                }

            }

        }

    }
}
