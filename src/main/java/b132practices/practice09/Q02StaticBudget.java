package b132practices.practice09;

public class Q02StaticBudget {
    public static void main(String[] args) {
        //Type a basic home budget
        Budget father=new Budget();
        father.getSalary(5000);
        father.getPocketMoney(500);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        Budget mother=new Budget();
        mother.getPocketMoney(1000);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);
        System.out.println("mother.familyBudget = " + mother.familyBudget);
        System.out.println("father.familyBudget = " + father.familyBudget);
        mother.spendPocketBudget(900);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);
        mother.getSalary(3000);
        mother.spendFamilyBudget(2000);
        Budget.spendFamilyBudget(500);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);

    }
}
