import java.util.Random;
import java.util.Scanner;

public class magic1 {

    // $$$$$$$$$$
    final static String key = "Kunal";
    // $$$$$$$$$$
    // $$$$$$$$$$

    public static void main(String[] args) {

        System.out.println(" ------------------------------------------");
        System.out.println("|       WELCOME TO MIND GAME               |");
        System.out.println("|       THINK NUMBER IN MIND               |");
        System.out.println("|         Copy right by @" + key + "             |");
        System.out.println(" ------------------------------------------ ");

        System.out.println("Firstly think any number between 1-10 with lefting 1 and 10 Say ok");
        System.out.print("::");
        Scanner n = new Scanner(System.in);

        String s = n.next();
        if (s.equalsIgnoreCase("ok")) {
            String number = "0123456789";
            StringBuffer sb = new StringBuffer();
            Random r = new Random();
            for (int i = 0; i < 2; i++) {

                int no = r.nextInt(number.length());
                char ch = number.charAt(no);
                sb.append(ch);

            }

            String gg = sb.toString();
            int jj = Integer.parseInt(gg);

            if (jj == 00) {
                System.out.println("soory again run");

            }

            else if (jj != 00) {
                float half = 0;
                int newhalf = 0;
                System.out.println("Now add " + sb + " with what you think number say ok");
                System.out.print("::");

                String g = n.next();
                if (g.equalsIgnoreCase("ok")) {
                    String s2 = sb.toString();
                    float k = Float.parseFloat(s2);
                    half = k / 2;
                    newhalf = (int) half;
                    if (half % 1 != 0) {
                        System.out.println("Then now subtract " + half + " from previous answer from  and  say ok:");
                        System.out.print("::");

                    } else {
                        System.out.println("Then now subtract " + newhalf + " from previous answer from  and  say ok:");
                        System.out.print("::");

                    }

                }

                String h = n.next();
                if (h.equalsIgnoreCase("ok")) {
                    System.out.println(" so now also subtract your  think number from previous answer  and say ok ");
                    System.out.print("::");
                    String c = n.next();
                    if (c.equalsIgnoreCase("ok")) {
                        if (half % 1 != 0) {
                            System.out.println("Ok Ok your Answer is " + half);
                            System.out.println("Press exit for quit game");
                            String exit = n.next();
                            if (exit.equalsIgnoreCase("exit")) {
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Ok Ok your Answer is " + newhalf);
                            System.out.println(" exit for quit game");
                            String exit = n.next();
                            if (exit.equalsIgnoreCase("exit")) {
                                System.exit(0);
                            }

                        }
                    }

                }

            }

        }
    }

}
