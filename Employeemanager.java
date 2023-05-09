class Employee {

        private String name;

        private double monthlySalary;

        private int age;

    
        public Employee(String name, double monthlySalary, int age) 
{
            this.name = name;

            this.monthlySalary = monthlySalary;

            this.age = age;

 }

    
        public String getName() 
{
            return name;
        }
  
  
        public double getMonthlySalary() 
{
            return monthlySalary;
        }
 
   
        public int getAge()
 {
            return age;
        }
 
   }
 class EmployeeBusinessLogic
 {
        public double calculateYearlySalary(Employee employee)
 {
            return employee.getMonthlySalary() * 12;
        }
    

        public double calculateAppraisal(Employee employee) 
{
            double appraisal = 0;

            if (employee.getMonthlySalary() < 10000) 
{
                appraisal = 500;
            } 
else
 {
                appraisal = 1000;
            }
 
           return appraisal;
 
       }
    }


    public class Employeemanager{

        public static void main(String[] args) 
{
            Employee employee=new Employee("koyel", 500, 25);

            EmployeeBusinessLogic l1=new EmployeeBusinessLogic();

 
          double yearlySalary= l1.calculateYearlySalary(employee);
  
          double appraisal= l1.calculateAppraisal(employee);
  
          System.out.println("yearly salary:"+yearlySalary);
   
         System.out.println("appraisal:"+appraisal);
        }
    }