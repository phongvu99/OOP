package NaughtyBitch;

import java.io.*;

public class ReportRead {

    protected static void printReportRead() throws IOException {
        File data = new File("# set your path here # \\data.txt");
        File myFile = new File("# set your path here # \\report.txt");
        BufferedReader reader = new BufferedReader(new FileReader(data));
        PrintStream out = new PrintStream(myFile);
        PrintStream stdout = System.out;
        System.setOut(out);
        for (int i = 1; i <= 12; i++) {
            System.out.println("                  Month: " + i);
            System.out.println("==============================================");
            System.out.println("______________________________________________\n");
            System.out.println("                  RON95-IV\n");
            System.out.println("Fund:           " + reader.readLine() + " kVND");
            System.out.println("Interest:       " + reader.readLine() + " kVND");
            System.out.println("______________________________________________\n");
            System.out.println("                  RON95-III\n");
            System.out.println("Fund:           " + reader.readLine() + " kVND");
            System.out.println("Interest:       " + reader.readLine() + " kVND");
            System.out.println("______________________________________________\n");
            System.out.println("                 E5 RON92-II\n");
            System.out.println("Fund:           " + reader.readLine() + " kVND");
            System.out.println("Interest:       " + reader.readLine() + " kVND");
            System.out.println("______________________________________________\n");
            System.out.println("                    TOTAL\n");
            System.out.println("Total Fund:     " + reader.readLine() + " kVND");
            System.out.println("Total Interest: " + reader.readLine() + " kVND");
            System.out.println("============================================== \n \n \n \n");

        }
        out.flush();
        out.close();
        System.setOut(stdout);
        System.out.println("Finished Printing Report");
        System.out.println("Your File Is At: " + myFile.getPath());

    }
}
