package designPatterns.adapter;

import designPatterns.adapter.thirdParty.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPIAdapter{
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    //though this is a different internal implementation for transfer
    //this doesnt affect the client as the client coded to an interface not to implementation
    public String transfer(String toUserName, String fromUserName, double amount) {
        long fromUserId = returnIdFromUserName(fromUserName);
        long toUserId = returnIdFromUserName(toUserName);
        return iciciBankAPI.doPayment(toUserId, fromUserId, amount);

    }

    @Override
    public double checkBalance(String userName) {
        return iciciBankAPI.balance(returnIdFromUserName(userName));
    }

    @Override
    public boolean authenticate(String userName) {
        return iciciBankAPI.checkUser(returnIdFromUserName(userName));
    }

    private long returnIdFromUserName(String userName){
        return 0;
    }
}