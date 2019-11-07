package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
public class Resume
{
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        String name, emailAddress, degreeType, major, graduationYear, universityName, jobTitle, company, startDate,
                endDate, description, skill, skill2, skill3, level, level2, level3;

        List<String> resumeDetails = new ArrayList<String>();
        System.out.print("Enter Name: ");
        name=SC.nextLine();
        name= Validate( SC, name, "Name is required", "Enter Name: " );

        System.out.print("Enter Email Address: ");
        emailAddress=SC.nextLine();

        if (!isValidEmail(emailAddress))
        {
            emailAddress= Validate( SC, emailAddress, "Not a correct email address", "Enter Email Address: " );
        }
        System.out.print("Education"+ "\n");
        System.out.print("Degree: ");
        degreeType=SC.nextLine();
        degreeType=Validate( SC, degreeType, "Please enter at least one education achievement","Enter Degree: " );

        System.out.print( "Enter Major: ");
        major=SC.nextLine();
        major=Validate( SC, major, "Please enter at least one education achievement", "Enter Major: " );

        System.out.print("Enter GraduationYear: ");
        graduationYear=SC.nextLine();
        graduationYear=Validate( SC, graduationYear, "Please enter atleast one education achievement", "Enter GraduationYear: " );

        System.out.print("Enter UniversityName: ");
        universityName=SC.nextLine();
        universityName=Validate( SC, universityName, "Please enter at least one education achievement", "Enter UniversityName: " );

        System.out.print("Work Experience"+ "\n");
        System.out.print("Job Title: ");
        jobTitle=SC.nextLine();
        jobTitle=Validate( SC, jobTitle, "Please enter at least one work experience","Enter Work Experience: " );

        System.out.print("Company Name: ");
        company=SC.nextLine();
        company=Validate( SC, company, "Please enter at least one work experience","Enter Work Experience: " );

        System.out.print("Start Date: ");
        startDate=SC.nextLine();
        startDate=Validate( SC, startDate, "Please enter at least one work experience","Enter Work Experience: " );

        System.out.print("End Date: ");
        endDate=SC.nextLine();
        endDate=Validate( SC, endDate, "Please enter at least one work experience","Enter Work Experience: " );

        System.out.print("Description: ");
        description=SC.nextLine();
        description=Validate( SC, description, "Please enter at least one work experience","Enter Work Experience: " );

        System.out.print("Skills"+ "\n");
        System.out.print("Skill: ");
        skill=SC.nextLine();
        skill=Validate( SC, skill, "Please enter at least 3 skills","Enter Skill: " );

        System.out.print("Skill: ");
        skill2=SC.nextLine();
        skill2=Validate( SC, skill2, "Please enter at least 2 more skills", "Enter Skill: " );

        System.out.print("Skill: ");
        skill3=SC.nextLine();
        skill3=Validate( SC, skill3, "Please enter at least 1 more skill", "Enter Skill: " );

        System.out.print("Proficiency: ");
        level=SC.nextLine();
        level=Validate( SC, level, "Please enter at least 3 proficiency levels","Enter level: " );

        System.out.print("Proficiency: ");
        level2=SC.nextLine();
        level2=Validate( SC, level2, "Please enter at least 2 more proficiency levels","Enter level: " );

        System.out.print("Proficiency: ");
        level3=SC.nextLine();
        level3=Validate( SC, level3, "Please enter at least 1 more proficiency level","Enter level: " );

        resumeDetails.add(name);
        resumeDetails.add(emailAddress);
        resumeDetails.add("Education");
        resumeDetails.add(degreeType + " in " + major);
        resumeDetails.add(universityName + " " + graduationYear + ", ");
        resumeDetails.add("Experience");
        resumeDetails.add(jobTitle);
        resumeDetails.add(company + ", " + startDate + " - " + endDate);
        resumeDetails.add(description);
        resumeDetails.add("Skills");
        resumeDetails.add(skill + ", " + level);
        resumeDetails.add(skill2 + ", " + level2);
        resumeDetails.add(skill3 + ", " + level3);

        System.out.println("\n"+"============================Resume=================================");
        for (Object el : resumeDetails) {

            System.out.println(el);
        }
    }
    private static String Validate(Scanner SC, String value, String requiredValueText, String valueText )
    {
        while(value.isEmpty())
        {
            System.out.print(requiredValueText+ "\n");
            System.out.print(valueText);
            value=SC.nextLine();
        }
        return value;
    }
    private static boolean isValidEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}