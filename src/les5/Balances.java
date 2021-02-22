package les5;
import java.util.Arrays;
public class Balances {
    public static void main(String[] args) {
        int[] balances = {1000, 500, 8432, -99, 12000, -54, 0, 60};
        String[] clients = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "k77", "k88"};
        System.out.println(Arrays.toString(findClientsByBalance(clients, balances, 10)));
        System.out.println(Arrays.toString(findClientsWithNegativeBalance(clients, balances)));
      //  System.out.println(Arrays.toString(balances));
      //  System.out.println(depositMoney(clients, balances, "Denis", 99));
      //  System.out.println(depositMoney(clients, balances, "Ann", 1000));
      //  System.out.println(Arrays.toString(balances));
    }

    public static String[] findClientsByBalance(String[] clients, int[] balances, int n) {
        //write code here
        int count = 0;

        for (int element : balances) {
            if (element >= n) {
                count++;
            }
        }
        String[] res = new String[count];
        int resindex = 0;
        int index = 0;
        for (int element : balances) {
            if (element >= n) {
                res[resindex] = clients[index];
                resindex++;
                //       System.out.println(clients[j]);
            }
            index++;
        }

        return res;
    }

    public static String[] findClientsWithNegativeBalance(String[] clients, int[] balances) {
        //write code here
        int count = 0;

        for (int element : balances) {
            if (element < 0) {
                count++;
            }
        }
        String[] res = new String[count];
        int resindex = 0;
        int index = 0;
        for (int element : balances) {
            if (element < 0) {
                res[resindex] = clients[index];
                resindex++;
                //  System.out.println(clients[j]);
            }
            index++;
        }

        return res;
    }

    public static int depositMoney(String [] clients, int[] balances, String client, int money) {
        //write code here

 //       int moneyToDeposit = money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01);
        balances[findClientIndexByName(clients,client)] += calculateDepositAmountAfterComission(money);
        return balances[findClientIndexByName(clients,client)];
    }

    public static int findClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) break;
            clientIndex++;
        }
        return clientIndex;
    }
    static int calculateDepositAmountAfterComission(int money){
        int res;
        res=money;
//        res = (money <= 100 ? (int) (money - money * 0.02) : (int) (money - money * 0.01));
        return res;
    };


}
