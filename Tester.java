public class Tester{
  public static void main(String[]args){

    BankAccount mine = new BankAccount (1234567, "redorangeyellow");

     System.out.println (mine.toString());

     System.out.println (mine.getBalance());

     mine.deposit (-100.00);

     System.out.println (mine.getBalance());

     mine.deposit(1234.69);

     System.out.println (mine.getBalance());

     mine.withdraw (-100.00);

     mine.withdraw (100.00);

     System.out.println (mine.getBalance());

     System.out.println (mine.getAccountID());

     System.out.println (mine.getpassword());

     mine.setPassword("greenbluepurple");

     System.out.println (mine.getpassword());


   }
}
