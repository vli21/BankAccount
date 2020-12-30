public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int ID, String pass){
    accountID = ID;
    password = pass;
    balance= 0.0;
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
    if (amount > 0 ){
      balance+= amount;
      return true;
    }
    else {
      return false;
    }
  }

  public boolean withdraw(double amount){
    if (amount > this.balance || amount < 0){
      return false;
    }
    else {
      this.balance -= amount;
      return true;
    }
  }

  public String toString(){
    return ("#"+accountID+"/t"+"$"+balance);
  }

   public void setPassword(String newPass){
     password= newPass;
   }
   private boolean authenticate (String password){
     return (this.password.equals(password));
   }

   public boolean transferTo(BankAccount other, double amount, String password){
     if (authenticate(password) && withdraw(amount)){
       other.deposit (amount);
       return true;
     }
     else {
       return false;
     }

     }

}
