

public class StaffHire
{
    // instance variables
    private int vacancyNumber;
    private String designation;
    private String jobType;
    private String staffName;// First name, last name
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    
     /**
      * constructor for objects of class staffhire
      */
     public StaffHire(int aVacancyNumber, String aDesignation, String aJobType, String aStaffName, String aJoiningDate, String aQualification, String aAppointedBy, boolean aJoined){
        this.vacancyNumber = aVacancyNumber;
        this.designation = aDesignation;
        this.jobType = aJobType;
        this.staffName = aStaffName;
        this.joiningDate = aJoiningDate;
        this.qualification = aQualification;
        this.appointedBy = aAppointedBy;
        this.joined = aJoined;
    }
    
    public int getVacancyNumber() 
    {
        return vacancyNumber;
    }
    
    public void setVacancyNumber(int newNumber)
    {
        
        vacancyNumber = newNumber;
    }
    public String getDesignation()
    {
        return designation;
    } 
    
    public void setdesignation(String newDesignation)
    {
    designation = newDesignation;
    }
    
    public String getJobType()
    {
        return jobType;
    }
    
    public void setJobType(String newJobType)
    {
        jobType = newJobType;
    }
    
    public String getStaffName()
    {
        return staffName;
    }
    
    public void setStaffName(String newStaffName)
    {
        staffName = newStaffName;
    }
    
    public String getJoiningDate()
    {
        return joiningDate;
    }
    
    public void setJoiningDate(String newJoiningDate)
    {
        joiningDate = newJoiningDate;
    }
    
    public String getQualification()
    {
        return qualification;
    }
    
    public void setQualification(String newQualification)
    {
        qualification = newQualification;
    }
    
    public String getAppointedBy()
    {
        return appointedBy;
    }
    
    public void setAppointedBy(String newAppointedBy)
    {
        appointedBy = newAppointedBy;
    }
    
    public boolean getJoined()
    {
        return joined;
    }
    
    public void setJoined(boolean newJoined)
    {
        joined = newJoined;
    }


    public void display()
    
    {System.out.println("vacancyNumber int is: "+vacancyNumber);
     System.out.println("designation String is: "+designation);
     System.out.println("jobType String is: "+ jobType);
     System.out.println("staffName String is:"+staffName);
     System.out.println("joiningDate String is:"+joiningDate);
     System.out.println("qualification String is:"+qualification);
     System.out.println("appointedBy String is:"+appointedBy);
     System.out.println("joined boolean is:"+joined);
    }
    
}
