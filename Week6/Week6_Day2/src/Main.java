import java.io.*;

public class Main {

    // Task 1. Իրականացնել ծրագիր, որը ստանում է տեքստային ֆայլ, ապակոդավորում է ֆայլի
    //         պարունակությունը և ապակոդավորած ֆայլի պարունակությունը տեղադրում է նոր
    //         ֆայլում։ Իրականացնել խնդիրը Caesar cipher և XOR կոդավորումների հիման վրա։

    public static void main(String[] args) {

/*
        File inputFile = new File("task1_File");
        File outputFile = new File("task1_NewFile");
        try {
            inputFile.createNewFile();
            outputFile.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
 */

        String inputFile = "task1_File";
        String outputFile = "task1_NewFile";

        Main xorDecoder = new Main();
        xorDecoder.decodeAndWrite(inputFile, outputFile);

    }

    public void decodeAndWrite(String inputFile, String outputFile){

//        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//             PrintWriter writer = new PrintWriter(new FileWriter(outputFile)))  {
//
//            String line;
//
//            while((line = reader.readLine()) != null){
//
//                String encode = encode(line, 2);
//                String xorDecoded = xorDecode(line, 0xAB);
//                writer
//                writer.println(xorDecoded);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
    private String encode(String line, int index){

        char[] charArr = line.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            while(i >= 65 && i <= 90) {
               i += index;
            }
        }

        for (int i = 0; i < charArr.length; i++) {
            while(i >= 97 && i <= 122) {
                i += index;
            }
        }
        return new String(charArr);
    }


    private String xorDecode(String line, int key){

        char[] charArr = line.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = (char)(charArr[i] ^ key);
        }
        return new String(charArr);
    }


    // Task 2. Իրականացնել ծրագիր, որը ստանում է ֆայլ և սեղմում է (compress) ֆայլի
    //         պարունակությունը օգտագործելով RLE - Run-Length Encoding ալգորիթմը։


}