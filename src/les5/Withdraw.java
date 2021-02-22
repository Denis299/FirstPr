package les5;

public class Withdraw {

    public static void main(String[] args) {
        //write your code here
        int[] balances = {1000, 500, 8432, -99, 12000, -54, 0, 60};
        String[] clients = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "k77", "k88"};
        System.out.println(withdraw(clients,balances,"k88",90));

    }

    public static int withdraw(String[] clients, int[] balances, String client, int money) {
        //write your code here
        int clNum = findClientIndexByName(clients,client);
        if (balances[clNum]<money){return -1;} else { balances[clNum]= balances[clNum] - money;
        return balances[clNum];}
    }
    public static int findClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) break;
            clientIndex++;
        }
        return clientIndex;
    }
}
