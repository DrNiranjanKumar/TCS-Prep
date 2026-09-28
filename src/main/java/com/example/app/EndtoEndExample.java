package com.example.app;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
class SufficientFundsAvailable extends Exception{
    SufficientFundsAvailable(String message){
        super(message);
    }
}
class Account{
    double balance;
    Account(double balance){
        this.balance = balance;
    }
    void withDrawAmount(double withdrawAmount) throws InsufficientFundsException,SufficientFundsAvailable{
        if(withdrawAmount > balance){
            System.out.println("**********************");
            throw  new InsufficientFundsException("Tried to withdraw "+withdrawAmount+" but balance is "+balance);
        }else{
            balance -= withdrawAmount;
            System.out.println("**********************");
            //System.out.println("withdrew amount "+withdrawAmount+ " and balance is now "+balance);
            throw new SufficientFundsAvailable("withdrew amount "+withdrawAmount+ " and balance is now "+balance);
        }

    }
}
public class EndtoEndExample {
    public static void main(String[] args) {
        Account accountOne = new Account(500);
        try{
            accountOne.withDrawAmount(30);
            accountOne.withDrawAmount(500);
        }catch (InsufficientFundsException exception){
            System.out.println("Blocked: "+exception.getMessage());
        }catch (SufficientFundsAvailable exception){
            System.out.println("Success: "+exception.getMessage());
        }

    }
}
