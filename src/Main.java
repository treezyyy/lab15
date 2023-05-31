import java.io.*;
import java.io.ObjectOutputStream;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            String InputWord = in.next();
            if (Objects.equals(InputWord, "save")){
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("urav.txt"))) {
                    func reply = new func(in.nextInt());
                    reply.matimatic();
                    oos.writeObject(reply);
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            }
            else if (Objects.equals(InputWord, "upload")){
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("urav.txt"))) {
                    func FromReply = (func)ois.readObject();
                    System.out.println("y=" + FromReply.y);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            else{
                System.out.println("команда не распознана");
            }
        }
    }
}