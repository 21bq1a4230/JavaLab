package LAB.forGitRepo.saketh.Java_Lab.Employee;

class Employee{
    protected String emp_name,emp_id,address,mail_id,mobile_no;
    double basicPay;
    Employee(String name , String id, String add, String mail, String contact,double pay){
        emp_name = name;
        emp_id = id;
        address = add;
        mail_id = mail;
        mobile_no = contact;
        basicPay = pay;
    }
    public double getPaySlip(){
        double da = 0.97*basicPay;
        double hra = 0.1*basicPay;
        double pf = 0.12*basicPay;
        double scf = 0.01*basicPay;
        double netPay = basicPay + da + hra - pf - scf;
        return netPay;
    }
}
class Programmer extends Employee{
    Programmer(String name , String id, String add, String mail, String contact, double pay){
        super(name , id, add, mail, contact,pay);
    }
}
class AssistantProfessor extends Employee{
    AssistantProfessor(String name , String id, String add, String mail, String contact, double pay){
        super(name , id, add, mail, contact,pay);
    }
}
class AssociateProfessor extends Employee{
    AssociateProfessor(String name , String id, String add, String mail, String contact, double pay){
        super(name , id, add, mail, contact,pay);
    }
}
class Professor extends Employee{
    Professor(String name , String id, String add, String mail, String contact, double pay){
        super(name , id, add, mail, contact,pay);
    }
}
class EmployeeDemo {
    public static void main(String[] args) {
        Employee arr[] = new Employee[4];
        Professor Saketh = new Professor("saketh","12849837584", "10931023", "neeBonda@gmail.com", "nekuEnduku", 1000000);
        arr[0] = Saketh;
        System.out.println(arr[0].getPaySlip());
    }
    
}
