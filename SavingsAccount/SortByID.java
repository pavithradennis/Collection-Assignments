package SavingsAccount;
import java.util.Comparator;
public class SortByID implements Comparator<SavingAccount>
//class to sort the accounts by ID to avoid jumbling of accounts
{
 public int compare( SavingAccount a, SavingAccount b)
 {
	 return a.getAcc_ID() - b.getAcc_ID();
 }
}

