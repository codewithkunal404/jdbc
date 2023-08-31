import java.util.Scanner;

public class magic2 {

    public static void main(String[] args) {
        
        System.out.println("-------------------------------------");
        System.out.println("");

        System.out.println("firstly think any two digit number:---****** and say ok for continue otherwise say exit");
        Scanner sc=new Scanner(System.in);
        String check=sc.next();
        if(check.equalsIgnoreCase("ok")){
            System.out.println("now add two digit number what you think with each like 23 , 2+3=5");
            System.out.println("After getting answer then subtract your new added number from think number like me think 23 so 23-5 say ok");
            check=sc.next();
            final int key=9;
            
            if(check.equalsIgnoreCase("ok")){
                System.out.println("now tell me left side (L:2) or Right side(R:3) number or For Single digit write S");
                String ch=sc.next();
               
                char dr=ch.charAt(0);
                if(dr=='L' || dr=='l'){
                char x=ch.charAt(ch.length()-1);
                int y=Integer.parseInt(String.valueOf(x));
                int subtract=key-y;
                String ans=y+Integer.toString(subtract);
                  System.out.println(" Your answer is "+ans);
                }

                 else if(dr=='R' || dr=='r'){
                char x=ch.charAt(ch.length()-1);
                int y=Integer.parseInt(String.valueOf(x));
                int subtract=key-y;
                String ans=Integer.toString(subtract)+y;
                  System.out.println(" -----------------****-Your answer is "+ans+"  -------------------******");
                }
                else if(dr=='S' || dr=='s'){
                    System.out.println("ok your number is"+key);
                }


                
                
            }
            


        }
        else{
            System.exit(0);
        }

    }
    
}
