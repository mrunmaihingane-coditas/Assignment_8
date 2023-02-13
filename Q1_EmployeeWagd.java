class Employee{
    int hrs;
    int rate;

    public void computeSalary(){
         int salary = hrs*rate;
        System.out.println("The employee salary : " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}
class WageEmployee extends Employee{
    WageEmployee(int hrs, int rate){
        this.hrs=hrs;
        this.rate=rate;
        super.computeSalary();
    }



}

class SalaPerson extends  WageEmployee{
    int sales=0;
    int comission=0;


    SalaPerson(int sales, int comission, int hrs, int rate){
        super(hrs,rate);
        this.sales=sales;
        this.comission=comission;


    }
    public void computeSalary() {
        System.out.println("This by salary of SalePerson :"+sales*comission*hrs*rate);
    }


}
class Manger extends Employee{
    int fixedsalary=0;

    int incentives=0;
    Manger(int fixedsalary, int incentives){
        this.fixedsalary = fixedsalary;
        this.incentives = incentives;
    }

    @Override
    public void computeSalary() {
        System.out.println("Manger salary: "+ (fixedsalary+incentives));
    }
}



public class Q1_EmployeeWagd {

    public static void main(String args[]){
        //WageEmployee emp1 = new WageEmployee(6,100);
//        SalaPerson person = new SalaPerson(1,10,6,100);
//       person.computeSalary();
        Manger manger1 = new Manger(2,10);
        manger1.computeSalary();

        Employee employee[] = new Employee[3];
        employee[0]=new Employee();
        employee[0].hrs=6;
        employee[0].rate=10;
        System.out.println("The employee[0] ");
        employee[0].computeSalary();


    }
}
