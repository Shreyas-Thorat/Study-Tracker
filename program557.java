import java.time.LocalDate;
import java.util.*;
import java.io.*;

// Done
class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Description;
    

    public StudyLog(LocalDate A, String B, double C, String D)
    {
        this.Date = A;
        this.Subject = B;
        this.Duration = C;
        this.Description = D;
    }

    @Override
    public String toString()
    {
        return Date+" | "+Subject+" | "+Duration+" | "+Description;
    }


    //Getter Method
    public LocalDate getDate()
    {
        return Date;
    }

    public String getSubject()
    {
        return Subject;
    }

    public double getDuration()
    {
        return Duration;
    }

    public String getDescription()
    {
        return Description;
    }

}


class StudyTracker
{

    // Data Structure to hold the data about study
    private ArrayList <StudyLog> Database = new ArrayList<StudyLog>();

    public void InsertLog()
    {
        Scanner Scannerobj = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("---------------- Please Enter the Valid Details of your Study-----------------------------");
        System.out.println("------------------------------------------------------------------------------------------");

        LocalDate Dateobj = LocalDate.now();

        System.out.println("Please Enter the Name of Subject like C/C++/Java/OS/DS");
        String Sub = Scannerobj.nextLine();

        System.out.println("Enter the time period of your Study in hours ");
        double Dur = Scannerobj.nextDouble();
        Scannerobj.nextLine();

        System.out.println("Please provide the Description about the Study for Future refrence");
        String desc = Scannerobj.nextLine();

        StudyLog Studyobj = new StudyLog(Dateobj, Sub, Dur, desc);

        Database.add(Studyobj);

        System.out.println("Study log gets stored Sucessfully");
        System.out.println("------------------------------------------------------------------------------------------");
        

    }

    public void DisplayLog()
    {
        System.out.println("------------------------------------------------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to Display as Database is Empty!!");
            System.out.println("------------------------------------------------------------------------------------------");
            return;
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("-----------------------Log Report from Marvellous StudyTracker----------------------------");
        System.out.println("------------------------------------------------------------------------------------------");

        for(StudyLog sobj : Database)
        {
            System.out.println(sobj);
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }

    public void ExportCSV()
    {
        if(Database.isEmpty())
        {
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("Nothing to Export as Database is Empty!!");
            System.out.println("------------------------------------------------------------------------------------------");
            return;
        }

        String FileName = "MarvellousStudy.csv";

        // Create new File
        try(FileWriter fwobj = new FileWriter(FileName)) 
        {
            // write CSV header
            fwobj.write("Date , Subject , Duration , Description\n");

            // Travel Database
            for(StudyLog sobj : Database)
            {
                // Write each record in CSV
                fwobj.write
                (
                    sobj.getDate()+","+
                    sobj.getSubject().replace(","," ") + "," +
                    sobj.getDuration()+"," +
                    sobj.getDescription().replace(","," ") + "\n"
                );
            }

            System.out.println("Log Created Sucessfully!!");


        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured while creating the CSV.");
            System.out.println("Report this issue to Marvellous Infosystems");
        }
    }

    public void SummaryByDate()
    {
        System.out.println("------------------------------------------------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to Display as Database is Empty!!");
            System.out.println("------------------------------------------------------------------------------------------");
            return;
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("---------------------- Summary by date from Marvellous StudyTracker ----------------------");
        System.out.println("------------------------------------------------------------------------------------------");

        TreeMap <LocalDate,Double>tobj = new <LocalDate,Double>TreeMap();

        LocalDate lobj = null;
        double D,old;

        for(StudyLog sobj : Database)
        {
            lobj = sobj.getDate();
            D = sobj.getDuration();

            if(tobj.containsKey(lobj))
            {
                old = tobj.get(lobj);
                tobj.put(lobj,D+old);
            }
            else
            {
                tobj.put(lobj,D);
            }
        }

        //Display the Details as per date
        for(LocalDate ldobj : tobj.keySet())
        {
            System.out.println("Date : "+ldobj +" Total Study "+tobj.get(ldobj));
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }

    public void SummaryBySubject()
    {
        System.out.println("------------------------------------------------------------------------------------------");

        if(Database.isEmpty())
        {
            System.out.println("Nothing to Display as Database is Empty!!");
            System.out.println("------------------------------------------------------------------------------------------");
            return;
        }

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("---------------------- Summary by Subject from Marvellous StudyTracker -------------------");
        System.out.println("------------------------------------------------------------------------------------------");

        TreeMap <String,Double>tobj = new <String,Double>TreeMap();

        String s ;
        double D,old;

        for(StudyLog sobj : Database)
        {
            s = sobj.getSubject();
            D = sobj.getDuration();

            if(tobj.containsKey(s))
            {
                old = tobj.get(s);
                tobj.put(s,D+old);
            }
            else
            {
                tobj.put(s,D);
            }
        }

        //Display the Details as per Subject
        for(String str : tobj.keySet())
        {
            System.out.println("Subject : "+str +" Total Study : "+tobj.get(str));
        }

        System.out.println("------------------------------------------------------------------------------------------");
    }

}

class program557 // StudyTrackerStarter
{
    public static void main(String A[])
    {   
        StudyTracker stobj = new StudyTracker();

        Scanner Scannerobj = new Scanner(System.in);

        int iChoice  = 0;

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------Welcome to Marvellous Study Tracker application ------------------------");
        System.out.println("------------------------------------------------------------------------------------------");

        do
        {
            
            System.out.println("1 : Insert New Study log into Database");
            System.out.println("2 : View all Study logs");
            System.out.println("3 : Summary of Study log by Date");
            System.out.println("4 : Summary of Study log by Subject");
            System.out.println("5 : Export Study Log to CSV file");
            System.out.println("6 : Exit the application");

            System.out.println("Please Select the appropriate option : ");

            iChoice  = Scannerobj.nextInt();

            switch(iChoice)
            {
                case 1 : //Insert New Study log into Database
                    stobj.InsertLog();
                    break;

                case 2 : //View all Study logs
                    stobj.DisplayLog();
                    break;

                case 3 : //Summary of Study log by Date
                    stobj.SummaryByDate();
                    break;

                case 4 : //Summary of Study log by Subject
                    stobj.SummaryBySubject();
                    break;

                case 5 : //Export Study Log to CSV file
                    stobj.ExportCSV();
                    break;

                case 6 : //Exit the application
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("Thank you for using Marvellous Study log Application!");
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;

                default:
                System.out.println("Please enter the Valid Option");

            }

        }while(iChoice != 6);
   
    } 
}