/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        File myObj = new File("filename.txt");

//        Scanner myReader = new Scanner(System.in);
//        String string = myReader.nextLine();

        try {
            myObj.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter = new FileWriter(myObj);
            //fileWriter.write(string);
            fileWriter.write("vahan");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //--------------------------------------------------------

//        if(myObj.exists()) {
//            System.out.println("File name = " + myObj.getName());
//            System.out.println("Absolute path = " + myObj.getAbsolutePath());
//            System.out.println("Writeable = " + myObj.canWrite());
//            System.out.println("Readable = " + myObj.canRead());
//            System.out.println("File size in bytes = " + myObj.length());
//
//        } else {
//            System.out.println("File not exist.");
//        }
//
//        if(myObj.delete()){
//            System.out.println("Deleted the file " + myObj.getName());
//        }  else{
//            System.out.println("Failed to delete the file.");
//        }

    }
*/

/*
import java.io.*;

public class Main {
    public static void main(String[] args) {

/*
        try {
            Reader reader = new FileReader("filename.txt");
            char[] chars = new char[100];
            reader.read(chars);
            System.out.println(Arrays.toString(chars));
        } catch (IOException e) {}
*/

/*
        int i = 1;
        try {
            i = System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println((char) i);
    }
 */

/*
        try {
            FileOutputStream fout = new FileOutputStream("filename.txt");
            fout.write(66);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
 */

/*
        try {
            FileOutputStream fout = new FileOutputStream("filename.txt");
            String s = "Welcome to javaTpoint.";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch(Exception e) {
            System.out.println(e);
        }
*/

/*
        byte[] buf = { 35, 36, 37, 38 };
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k = 0;
        while ((k = byt.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }
}
*/


// Task 1. Գրել ծրագիր, որը որպես մուտքային տվյալ ստանում է տեքստային text.txt ֆայլ և երկու
//         սիմվոլ՝ a և b։ Ծրագիրը ստեղծում է մեկ այլ ֆայլ՝ text.txt.replace անունով, որում
//         պատճենում է առաջին ֆայլի պարունակությունը, բոլոր a սիմվոլները փոխարինելով b-ով։

/*
import java.io.*;

public class Main {
    public static void main(String[] args) {

//        File file = new File("text.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        String fileName = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt.replace"))) {

            StringBuilder sb = new StringBuilder();

            while(reader.ready()){
                String str = reader.readLine();
                char[] arr = str.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == 'a'){
                        arr[i] = 'b';
                    }
                    sb.append(arr[i]);
                }
                sb.append("\n");
            }
            writer.write(sb.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
*/

// Task 2. Իրականացնել ծրագիր, որը ստանում է ֆայլ և տրամադրում տեքստի մասին
//         վիճակագրություն՝ տողերի քանակը, բառերի քանակը և նիշերի քանակը։

import java.io.*;

public class Main {
    public static void main(String[] args) {

//        File file = new File("Task2.Text.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        String fileName = "Task2.Text.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;

            while (reader.ready()) {

                String line = reader.readLine();

                if (line != null) {
                    String regex = "\\s+";
                    String[] words = line.split(regex);

                    wordCount += words.length;
                    charCount += line.replaceAll("\\s", "").length();
                    lineCount++;
                }
            }

            System.out.println("\nLineCount = " + lineCount);
            System.out.println("WordCount = " + wordCount);
            System.out.println("CharCount = " + charCount);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
