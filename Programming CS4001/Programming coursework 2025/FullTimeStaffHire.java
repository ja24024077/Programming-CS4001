
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire
{
    double salary;
    int weeklyFractionalHours;
    
    public FullTimeStaffHire(int aVacancyNumber, 
                            String aDesignation, 
                            String aJobType, 
                            String aStaffName, 
                            String aJoiningDate, 
                            String aQualification, 
                            String aAppointedBy, 
                            boolean aJoined,
                            double aSalary,
                            int aWeeklyFractionalHours){
        super(aVacancyNumber,aDesignation,aJobType,aStaffName,aJoiningDate,aQualification,aAppointedBy,aJoined);
        salary=aSalary;
        weeklyFractionalHours=aWeeklyFractionalHours;
    }
    
    public double getSalary()
    {
        return salary;
            
    }
    
    public void setSalary(double newSalary)
    {
        salary = newSalary;
    }
    
    public int getWeeklyFractionalHours()
    {
        return weeklyFractionalHours;
    }
    
    public void setWeeklyFractionlHours(int newHours)
    {
        weeklyFractionalHours = newHours;
    }
    
    public void display()
    {
        super.display();
        if (salary !=0)
        {
            System.out.println("Salary: " + salary);
            System.out.println("Weekly fractional hours: " + weeklyFractionalHours);
        }
    }
}     

