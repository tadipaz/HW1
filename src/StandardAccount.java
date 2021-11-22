public class StandardAccount implements IAccount{

   protected int AccountNumber;
   protected double CreditLimit;

   public StandardAccount(int accountNumber, double creditLimit)
   {
       this.AccountNumber = accountNumber;
       this.CreditLimit = creditLimit;
   }


    @Override
    public void Deposit(double amount) {

    }

    @Override
    public void Withdraw(double amount) {
       if (amount > creditLimit )
       {
           return creditLimit;
           {
               else
               {
                   return amount;
               }
           }
    }

    @Override
    public double GetCurrentBalance() {
        return GetCurrentBalance;
    }

    @Override
    public int GetAccountNumber() {
        return GetAccountNumber;
    }
}
