
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Define the knowledge base
    Map<String, String[]> knowledgeBase = new HashMap<>();
    knowledgeBase.put("Republican", new String[] { "yes", "no", "yes" });
    knowledgeBase.put("Democrat", new String[] { "no", "yes", "no" });
    knowledgeBase.put("Green Party Supporter", new String[] { "yes", "yes", "no" });

    // Ask the user three questions and store their answers
    System.out.println("\t\t\t [ ############################################################## ]");
    System.out.println("\t\t\t\t\t [ ######### ] Political Guess Game [ ########### ]");
    System.out.println("\t\t\t [ ############################################################## ]");
    System.out
        .println("\n [ + ] Rule : Answer Yes or No to the questions and i would guess your political party [ + ]");
    System.out.print("\n");

    System.out.print("What is your Name \n\n ==> ");
    String name = input.nextLine(); // .toLowerCase();
    System.out.print("\n\n");

    System.out.print("Do you believe in a limited government ? \n\n ==> ");
    String question1 = input.nextLine();
    System.out.print("\n\n");

    System.out.print("\nDo you think the government should work on eradicating inequality ?  \n\n ==> ");
    String question2 = input.nextLine();
    System.out.print("\n\n");

    System.out.print("\nDo you believe in strong national defense and maintaining a powerful military? \n\n ==> ");
    String question3 = input.nextLine();

    // Check the party
    String politicalParty = "Indepent";
    for (Map.Entry<String, String[]> entry : knowledgeBase.entrySet()) {
      String[] answers = entry.getValue();
      if (question1.equals(answers[0]) && question2.equals(answers[1]) && question3.equals(answers[2])) {
        politicalParty = entry.getKey();
        break;
      }
    }

    String pattern = ".*\\b(yes|no)\\b.*";
    Pattern p = Pattern.compile(pattern);
    Matcher q1 = p.matcher(question1);
    Matcher q2 = p.matcher(question2);
    Matcher q3 = p.matcher(question3);

    if (q1.matches() && q2.matches() && q3.matches()) {
      System.out.println("\n\nWait " + name + " let me guess........ You are  \n\n");
      try {
        Thread.sleep(1000); // pause
      } catch (InterruptedException e) {
        System.out.println("Try Again...");
        e.printStackTrace();
      }
      System.out.println(">>>>>>>>>>>>>   " + politicalParty + "   <<<<<<<<<<<<<<<<<\n\n");
      try {
        Thread.sleep(700); // pause
      } catch (InterruptedException e) {
        System.out.println("Try Again...");
        e.printStackTrace();
      }

      System.out.print(
          "Ok What is your accurate political party ??\n\n <>  Options : [ + ] Republican | Democrat | Green | Independent [+] <> \n\n ==> ");
      String realParty = input.nextLine();
      System.out.print("\n\n");

      if (realParty.equals("Republican")) {
        // Store the user's answers in a text file for future reference
        try {
          FileWriter writer = new FileWriter("Republican.csv", true);
          writer.write("\n" + "{ " + "\"Name\"" + " : " + "\"" + name + "\"" + "," + " \"Limit Government\"" + " : "
              + "\"" + question1 + "\"" + "," + " \"Eradicate Inequality\"" + " : "
              + "\"" + question2 + "\"" + "," + " \"Powerful military\"" + " : " + "\"" + question3 + "\"" + " }"
              + " , ");
          writer.close();
          System.out.println("*** Thank For Participating.. ***");
        } catch (IOException e) {
          System.out.println("** Error Exporting Results **");
        }
      }

      else if (realParty.equals("Democrat")) {
        // Store the user's answers in a text file for future reference
        try {
          FileWriter writer = new FileWriter("Democrat.csv", true);
          writer.write("\n" + "{ " + "\"Name\"" + " : " + "\"" + name + "\"" + "," + " \"Limit Government\"" + " : "
              + "\"" + question1 + "\"" + "," + " \"Eradicate Inequality\"" + " : "
              + "\"" + question2 + "\"" + "," + " \"Powerful military\"" + " : " + "\"" + question3 + "\"" + " }"
              + " , ");
          writer.close();
          System.out.println("*** Thank For Participating.. ***");
        } catch (IOException e) {
          System.out.println("** Error Exporting Results **");
        }
      }

      else if (realParty.equals("Green")) {
        // Store the user's answers in a text file for future reference
        try {
          FileWriter writer = new FileWriter("Green.csv", true);
          writer.write("\n" + "{ " + "\"Name\"" + " : " + "\"" + name + "\"" + "," + " \"Limit Government\"" + " : "
              + "\"" + question1 + "\"" + "," + " \"Eradicate Inequality\"" + " : "
              + "\"" + question2 + "\"" + "," + " \"Powerful military\"" + " : " + "\"" + question3 + "\"" + " }"
              + " , ");
          writer.close();
          System.out.println("*** Thank For Participating.. ***");
        } catch (IOException e) {
          System.out.println("** Error Exporting Results **");
        }
      }

      else if (realParty.equals("Independent")) {
        // Store the user's answers in a text file for future reference
        try {
          FileWriter writer = new FileWriter("Independent.csv", true);
          writer.write("\n" + "{ " + "\"Name\"" + " : " + "\"" + name + "\"" + "," + " \"Limit Government\"" + " : "
              + "\"" + question1 + "\"" + "," + " \"Eradicate Inequality\"" + " : "
              + "\"" + question2 + "\"" + "," + " \"Powerful military\"" + " : " + "\"" + question3 + "\"" + " }"
              + " , ");
          writer.close();
          System.out.println("*** Thank For Participating.. ***");
        } catch (IOException e) {
          System.out.println("** Error Exporting Results **");
        }
      } else {
        System.out.println("*** Thank For Participating.. ***");
      }
    } else {
      System.out.print("\n\n");
      System.out.println("** You have to answer Yes or No to the questions to play **");
    }
  }
}