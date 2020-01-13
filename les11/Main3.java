import java.io.*;

public class Main3 {
    public static void main(String args[]) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;
        try
                (BufferedReader br = new BufferedReader(fileIn = new FileReader("C:/Users/user/Desktop/debug/src/Pack1/file.txt"));
                 BufferedWriter bw = new BufferedWriter(fileOut = new FileWriter("C:/Users/user/Desktop/debug/src/Pack1/file1.txt"))) {
            br.readLine();
            br.readLine();
            String s;
            s = br.readLine();
            bw.write(s);
            br.readLine();
            br.readLine();

        }
        try (BufferedReader br2 = new BufferedReader(fileIn = new FileReader("C:/Users/user/Desktop/debug/src/Pack1/file.txt"));
             BufferedWriter bw2 = new BufferedWriter(fileOut = new FileWriter("C:/Users/user/Desktop/debug/src/Pack1/file2.txt"))) {
            br2.readLine();
            br2.readLine();
            br2.readLine();
            String s1;
            s1 = br2.readLine();
            bw2.write(s1);
            br2.readLine();

        }
        try
                (BufferedReader br3 = new BufferedReader(fileIn = new FileReader("C:/Users/user/Desktop/debug/src/Pack1/file.txt"));
                 BufferedWriter bw3 = new BufferedWriter(fileOut = new FileWriter("C:/Users/user/Desktop/debug/src/Pack1/fil4.txt"))) {
            br3.readLine();
            br3.readLine();
            String s;
            s = br3.readLine();
            bw3.write(s.charAt(2));
            br3.readLine();
            br3.readLine();
        }
        try
                (BufferedReader br4 = new BufferedReader(fileIn = new FileReader("C:/Users/user/Desktop/debug/src/Pack1/file.txt"));
                 BufferedWriter bw4 = new BufferedWriter(fileOut = new FileWriter("C:/Users/user/Desktop/debug/src/Pack1/file5.txt"))) {
            br4.readLine();
            br4.readLine();
            String s;
            s = br4.readLine();
            bw4.write(s.toUpperCase());
            br4.readLine();
            br4.readLine();
        }
        try
                (BufferedReader br5 = new BufferedReader(fileIn = new FileReader("C:/Users/user/Desktop/debug/src/Pack1/file.txt"));
                 BufferedWriter bw5 = new BufferedWriter(fileOut = new FileWriter("C:/Users/user/Desktop/debug/src/Pack1/file6.txt"))) {
            br5.readLine();
            br5.readLine();
            String s;
            s = br5.readLine();
            bw5.write(s.toUpperCase());
            String s1;
            s1 = br5.readLine();
            bw5.write(s1.toUpperCase());
            br5.readLine();
        }
    }
}


