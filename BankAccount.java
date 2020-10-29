public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int accountID, String password){
    this.accountID = accountID;
    this.password = password;
    balance=  0.0;
  }

  public double getBalance (){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }

  public String getpassword (){
    return password;
  }

  public boolean deposit(double amount){
    if (amount < 0 ){
      return false;
    }
    else {
      balance+= amount;
      return true;
    }

  }

  public boolean withdraw(double amount){
    if (amount > balance && amount < 0){
      return false;
    }
    else {
      balance -= amount;
      return true;
    }
  }

  public String toString(){
    return (accountID+"/t"+balance);
  }

   public void setPassword(String newPass){
     password= newPass;
   }

}
