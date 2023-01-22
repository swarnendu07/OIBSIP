import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 20000;
        String userId = "swarnendu349";
        String userPin = "6789";
        int txn[] = new int[200];
        int bal[] = new int[200];
        int i = 0,j = 0;
        
        System.out.println("ENTER YOUR USER ID : ");
        String user = sc.nextLine();
        System.out.println("ENTER YOUR USER PIN : ");
        String pin = sc.nextLine();

        if (user.equals(userId) && pin.equals(userPin)) {

            while (true) {
                boolean flag = true;
                System.out.println("-------------------------------------");
                System.out.println("<> ENTER 1 TO TRANSACTION HISTORY");
                System.out.println("<> ENTER 2 TO WITHDRAW");
                System.out.println("<> ENTER 3 TO DEPOSIT");
                System.out.println("<> ENTER 4 FOR TRANSFER");
                System.out.println("<> ENTER 5 TO QUIT");
                System.out.println("-------------------------------------");
                int k = sc.nextInt();

                switch (k) {
                    case 1:
                    	System.out.println("<> TRANSACTION HISTORY");
                        System.out.println("TRANSACTION " + "   " + "BALANCE");
                        for (j = 0; j < i; j++) {
                            System.out.println("  " + txn[j] + "        " + bal[j]);
                        }
                        System.out.println("-------------------------------------");
                        break;
                    case 2:
                        System.out.println("<> WITHDRAW");
                        System.out.println("ENTER THE AMOUNT RS: ");
                        int wd = sc.nextInt();
                        balance = balance - wd;
                        txn[i] = -wd;
                        bal[i] = balance;
                        i++;
                        System.out.println("BALANCE RS: " + balance);
                        break;
                    case 3:
                        System.out.println("<> DEPOSIT");
                        System.out.println("ENTER THE AMOUNT RS: ");
                        int dep = sc.nextInt();
                        balance = balance + dep;
                        txn[i] = dep;
                        bal[i] = balance;
                        i++;
                        System.out.println("BALANCE RS: " + balance);
                        break;
                    case 4:
                    	System.out.println("<> TRANSFER");
                        System.out.println("ENTER THE ACCOUNT NUMBER : ");
                        long transferAmount = sc.nextLong();
                        System.out.println("ENTER THE AMOUNT RS: ");
                        int trs = sc.nextInt();
                        System.out.println("THE AMOUNT OF RS. "+trs+" IS SUCCESSFULLY TRANSFERRED TO A/C NO: "+transferAmount);
                        balance = balance - trs;
                        txn[i] = -trs;
                        bal[i] = balance;
                        i++;
                        System.out.println("BALANCE RS: " + balance);
                        break;
                    case 5:
                        System.out.println("THANK YOU FOR USING.....");
                        flag = false;
                        break;
                }

                if (flag == false)
                    break;
            }

        }

        else {
            System.out.println("INCORRECT USER ID OR USER PIN !!!");
            }
        }
}