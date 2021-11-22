public interface IAccount {
    void Deposit(double amount);
    void Withdraw(double amount);
    double GetCurrentBalance();
    int GetAccountNumber();
}
