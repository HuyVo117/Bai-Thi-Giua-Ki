package QL_PTGT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Quan_Ly_Xe {
private static String FILE_NAME = "XE.txt";
public static void writeXeToFile(List<Xe> xe) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
        oos.writeObject(xe);
        System.out.println("Thong tin Xe da duoc luu : ");
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static List<Xe> readXeFromFile() {
    List<Xe> xe = null;
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
        xe = (List<Xe>) ois.readObject();
        System.out.println("Thong tin Xe da duoc luu : ");
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    return xe;
}
}
