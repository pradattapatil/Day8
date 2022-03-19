package Day8.EmployeeWageComputation;

public class EmpWageMethod {
    public static final int partTimeHr = 1;
    public static final int fullTimeHr = 2;
    public static final int wageRatePerHr = 20;
    public static final int workingDaysMonth = 20;
    public static final int totalWorkingHrs = 100;

    public static int calculateEmpWage(){
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 1;

        //variable declared
        while (totalEmpHrs <= totalWorkingHrs && totalWorkingDays <= workingDaysMonth){
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck){
                case partTimeHr:
                    empHrs = 4;
                    break;
                case fullTimeHr:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
        }
        //while loop
        int totalWage = totalEmpHrs * wageRatePerHr;
        System.out.println("The total Employee Wage is = " + totalWage);
        return totalWage;
    }
    //static method
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        calculateEmpWage();
    }
}
