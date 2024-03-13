import java.io.*;

public class Main {

// Task 1. Իրականացնել ծրագիր, որը ստանում է երկու տեքստային ֆայլ և համեմատում նրանց պարունակությունը։
//         Ծրագիրը ստեղծում է նոր ֆայլ, որում տեղադրում է երկու ֆայլերի միջև տարբերությունները՝
//         նշելով որ տողերում և որ նախադասություններում է տարբերությունը։

/*
    public static void main(String[] args) {

        File file1 = new File("task1File1.txt");
        File file2 = new File("task1File2.txt");
        File file3 = new File("task1File3.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file3));
            String line1;
            String line2;

            int lineNumber = 1;
            while((line1 = br1.readLine()) != null && (line2 = br2.readLine()) != null){

                if(!line1.equals(line2)){
                    System.out.println(lineNumber + " line the content of file1 don't equals to file2.");
                    writer.write("file1 contents of "+ lineNumber + " is " + line1);
                    writer.write("\nfile2 contents of "+ lineNumber + " is " + line2);
                    writer.write("\ndiferrence line = " + lineNumber + " ");
                }
                lineNumber++;
            }

            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
 */


// Task 2. Իրականացնել ծրագիր, որը ստանում է տեքստային ֆայլ և ֆայլում փնտրում որոշակի բառ կամ արտահայտություն։
//         Վերադարձնել այն տողերի համարները, որում առկա է փնտրվող բառը կամ արտահայտությունը։

    public static void main(String[] args) {

        String word = "Hello";
        File file = new File("task2File.txt");
        StringBuilder sb = new StringBuilder(word);

        try {
            //file.createNewFile();
            BufferedReader buffReader =  new BufferedReader(new FileReader(file));

            String line;
            int lineNumber = 1;

            while((line = buffReader.readLine()) != null){
                if(line.contains(sb)){
                    System.out.println(" In line " + lineNumber + " there is the word");
                }
                lineNumber++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
