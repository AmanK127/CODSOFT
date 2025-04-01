import java.util.*;

public class User {
    private String userId = "Aman07";
    private int balance = 100000;
    private Map<String,Integer> transactionHistory = new LinkedHashMap<>();

    public User(){}

    public String getUserId() {
        return userId;
    }

    public int getBalance() {
        return balance;
    }

    public Map<String, Integer> getTransactionHistory() {
        return transactionHistory;
    }

    public void updateTransaction(String service, int amount){
        transactionHistory.put(service,amount);
    }

    public void updateBalance(String service, int amount){
        if(service.equalsIgnoreCase("Withdraw")){
            balance -= amount;
        }
        else
        {
            balance += amount;
        }
    }
}
