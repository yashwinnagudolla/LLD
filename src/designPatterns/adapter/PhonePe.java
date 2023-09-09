package designPatterns.adapter;

public class PhonePe{
    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(){
        this.bankAPIAdapter = new ICICIBankAdapter();
    }
    public String transferMoney(String fromUserName, String toUserName,
                                double amount){
        return bankAPIAdapter.transfer(toUserName,fromUserName,amount);
    }


    public double checkBalance(String userName){
        return this.bankAPIAdapter.checkBalance(userName);
    }

    public boolean login(String userName){
        return this.bankAPIAdapter.authenticate(userName);
    }

}