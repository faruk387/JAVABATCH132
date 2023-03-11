package b132practices.practice09;

public class Budget {
    public static int familyBudget;
    public int pocketMoney;

    public void getPocketMoney(int money){
        if(familyBudget>=money){
        familyBudget=familyBudget-money;
        pocketMoney=pocketMoney+money;
    }
    }
    public void getSalary(int salary){
        familyBudget+=salary;
    }
    public static void spendFamilyBudget(int money){
        familyBudget-=money;
    }
    public void spendPocketBudget(int money){
      pocketMoney-=money;
    }
}
