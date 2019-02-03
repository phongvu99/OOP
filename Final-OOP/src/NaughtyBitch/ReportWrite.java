package NaughtyBitch;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;


public class ReportWrite {

    private static double totalFund = 0, totalInterest = 0;
    private static double fund, interest;

    private static void total(int month, Ron95IV[] IV, Ron95III[] III, E5[] e5) {
        totalFund = IV[month].getFund() + III[month].getFund() + e5[month].getFund();
        totalInterest = IV[month].calInterest() + III[month].calInterest() + e5[month].calInterest();
    }

    private static void getData(Fuel fuel) {
        fund = fuel.getFund();
        interest = fuel.calInterest();
    }

    protected static void printReportWrite(Ron95IV[] IV, Ron95III[] III, E5[] e5) throws IOException {
        DecimalFormat df2 = new DecimalFormat(".##");
        File myFile = new File("# set your path here # \\data.txt");
        PrintStream stdout = System.out;
        PrintStream out = new PrintStream(myFile);
        System.setOut(out);
        for (int i = 1; i <= 12; i++) {
            total(i, IV, III, e5);
            getData(IV[i]);
            //System.out.println("Writing IV");
            System.out.println(df2.format(fund));
            System.out.println(df2.format(interest));
            getData(III[i]);
            //System.out.println("Writing III");
            System.out.println(df2.format(fund));
            System.out.println(df2.format(interest));
            getData(e5[i]);
            //System.out.println("Writing E5");
            System.out.println(df2.format(fund));
            System.out.println(df2.format(interest));
            System.out.println(df2.format(totalFund));
            System.out.println(df2.format(totalInterest));
            totalFund = 0;
            totalInterest = 0;
        }
        out.flush();
        out.close();
        System.setOut(stdout);
        System.out.println("Writing Report...");
        System.out.println("Printing...");
    }

}
