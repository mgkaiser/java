// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class TestJobApplicant
{
	public static void main(String[] args)
	{
		JobApplicant[] applicants = GetApplicants();
		
		for (int i = 0; i < applicants.length; i++)
		{
			DisplayJobApplicant(applicants[i]);
		}
	}
	
	public static void DisplayJobApplicant(JobApplicant jobApplicant)
	{
		System.out.println();
		System.out.println("Applicant: " + jobApplicant.getApplicantName());
		System.out.println("Phone Number: " + jobApplicant.getPhoneNumber());
		
		if (jobApplicant.getHasSkillWordProcessing() || jobApplicant.getHasSkillSpreadsheet() || jobApplicant.getHasSkillDatabase() || jobApplicant.getHasSkillGraphics())
		{
			System.out.println("Skills:");
			if(jobApplicant.getHasSkillWordProcessing())
			{
				System.out.println("Word Processing");
			}
			
			if(jobApplicant.getHasSkillSpreadsheet() )
			{
				System.out.println("Spreadsheet");
			}
			
			if(jobApplicant.getHasSkillDatabase())
			{
				System.out.println("Database");
			}
			
			if(jobApplicant.getHasSkillGraphics())
			{
				System.out.println("Graphics");
			}
		}
		else
		{
			System.out.println("Applicant has no relevant skills.");
		}	
	}
		
	public static JobApplicant[] GetApplicants()
	{
		return new JobApplicant[] {
			new JobApplicant("Charles Emmerson Winchester, III", "941-555-1000", true, true, true, true),
			new JobApplicant("Benjamin Franklin Pierce", "941-555-1001", true, false, false, false),
			new JobApplicant("Sherman Potter", "941-555-1002", false, true, false, false),
			new JobApplicant("John McIntyre", "941-555-1003", false, false, true, false),		
			new JobApplicant("Henry Blake", "941-555-1005", false, false, false, true),
			new JobApplicant("Frank Burns", "941-555-1006", false, false, false, false)
		};
	}
}