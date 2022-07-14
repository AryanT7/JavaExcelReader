import java.util.*;
import java.io.*;

public class JavaExcel {

    public void write() {

        // C:\\Users\\HP\\OneDrive\\Desktop\\Test\\test2.csv

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the file path: ");
        String file = sc.nextLine(); // Input

        try (PrintWriter writer = new PrintWriter(file)) {

            writer.write("Date" + ",");
            writer.write("Amount" + ",");
            writer.write("Expenditure" + "\n");
            writer.write("6/7/22" + ",");
            writer.write("3000" + ",");
            writer.write("Electronics" + ",");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // public void read() {

    // // C:\\Users\\HP\\OneDrive\\Desktop\\Test\\test.csv

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Please enter the file path: ");
    // String file = sc.nextLine(); // Input

    // BufferedReader reader = null;
    // String line = "";

    // try {
    // reader = new BufferedReader(new FileReader(file));
    // while ((line = reader.readLine()) != null) {
    // String[] row = line.split(",");
    // // Splitting rows after every ","

    // for (String index : row) {
    // System.out.printf("%-20s", index);
    // // Spacing between columns by 20 units
    // }
    // System.out.println();
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // } finally {
    // try {
    // reader.close();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }
    // }

    public static void main(String[] args) {
        JavaExcel jw = new JavaExcel();
        jw.write();
        // JavaExcel jr = new JavaExcel();
        // jr.read();
    }
}