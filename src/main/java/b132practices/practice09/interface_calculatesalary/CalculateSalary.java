package b132practices.practice09.interface_calculatesalary;

public class CalculateSalary implements IncreaseSalary,Tax {
    @Override
    public double extraForYear(int workingYear) {
        System.out.println("Extra money for working year: " + workingYear * 100);
        return workingYear * 100;
    }

    @Override
    public double extraForHour(int workingHours) {
        if (workingHours > 160) {
            System.out.println("Extra money for working hour: " + (workingHours - 160) * 10);
            return (workingHours - 160) * 10;
        } else {
            System.out.println("No extra money for working hour less than 160");
            return 0;
        }
    }

    @Override
    public double tax(double grossSalary, int workingYears) {
        {
            if (workingYears >= 10) {
                System.out.println("Tax: " + grossSalary * 0.3);
                return grossSalary * 0.3;
            } else {
                System.out.println("Tax: " + grossSalary * 0.2);
                return grossSalary * 0.2;
            }
        }

    }

    public double netSalary(double grossSalary, int workingYear, int workingHours) {
        return grossSalary + extraForYear(workingYear) + extraForHour(workingHours) - tax(grossSalary, workingYear);
    }
}
