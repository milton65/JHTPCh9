/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jhtpch9;

/**
 *
 * @author miltonbennett
 */
public class BasePlusCommissionEmployeeComposition 
{
CommissionEmployee commissionEmployee;
private double baseSalary; // base salary per week
   
    public BasePlusCommissionEmployeeComposition(
       CommissionEmployee commissionEmployee, double baseSalary)
    {
       this.commissionEmployee = commissionEmployee;

       // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
    }

   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   }

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   public static void main(String[] args)
   {
      CommissionEmployee commissionEmployee = 
          new CommissionEmployee(
              "Bob", "Lewis", "333-33-3333", 5000, .04);
      
      BasePlusCommissionEmployeeComposition bpcc =
         new BasePlusCommissionEmployeeComposition(commissionEmployee, 300);

        System.out.println(commissionEmployee);
        System.out.printf("%s %.2f%n", "base salary is:",
          bpcc.getBaseSalary());

   }
}
