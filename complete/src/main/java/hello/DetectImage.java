package hello;

import java.io.*;
class DetectImage {
public static String detectImage(String name) {
        String s = "";
        String t = null;


        try {

            BufferedReader stdInput = new BufferedReader(new
                 InputStreamReader(p.getInputStream()));

            BufferedReader stdError = new BufferedReader(new
                 InputStreamReader(p.getErrorStream()));

            // read the output from the command
           // System.out.println("Here is the standard output of the command:\n");
           while(true) {
             t = stdInput.readLine();
             if( t == null ) break;
             else s += t + "\n";
           }


            // read any errors from the attempted command
            //~ System.out.println("Here is the standard error of the command (if any):\n");
            //~ while ((s = stdError.readLine()) != null) {
                //~ System.out.println(s);
            //~ }
            return s;
            //System.exit(0);
        }
        catch (IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            return "";
            //~ System.exit(-1);
        }
    }
}

