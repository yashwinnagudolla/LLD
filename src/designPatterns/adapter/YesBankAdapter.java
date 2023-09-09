package designPatterns.adapter;

import designPatterns.adapter.thirdParty.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI;

    public YesBankAdapter(){
        this.yesBankAPI = new YesBankAPI();
    }

    public String transfer(String toUserName, String fromUserName,
                           double amount){
        //first check if there is enough balance
        char result = this.yesBankAPI.transfer(toUserName,fromUserName,(int)amount);
        if(result == 'D'){
            return "Success";
        }else{
            return "Failed";
        }
    }

    public double checkBalance(String userName){
        return this.yesBankAPI.checkBalance(userName);
    }

    public boolean authenticate(String userName){
        return this.yesBankAPI.authenticate(userName);
    }





}