// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class JobApplicant
{
	private String applicantName;
	private String phoneNumber;
	private boolean hasSkillWordProcessing;
	private boolean hasSkillSpreadsheet;
	private boolean hasSkillDatabase;
	private boolean hasSkillGraphics;
	
	public JobApplicant(String applicantName, String phoneNumber, boolean hasSkillWordProcessing, boolean hasSkillSpreadsheet, boolean hasSkillDatabase, boolean hasSkillGraphics)
	{
		this.applicantName = applicantName;
		this.phoneNumber = phoneNumber;
		this.hasSkillWordProcessing = hasSkillWordProcessing;
		this.hasSkillSpreadsheet = hasSkillSpreadsheet;
		this.hasSkillDatabase = hasSkillDatabase;
		this.hasSkillGraphics = hasSkillGraphics;
	}
	
	public String getApplicantName()
	{
		return applicantName;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public boolean getHasSkillWordProcessing()
	{
		return hasSkillWordProcessing;
	}
	
	public boolean getHasSkillSpreadsheet()
	{
		return hasSkillSpreadsheet;
	}
	
	public boolean getHasSkillDatabase()
	{
		return hasSkillDatabase;
	} 
	
	public boolean getHasSkillGraphics()
	{
		return hasSkillGraphics;
	}
}