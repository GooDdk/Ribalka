/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Tovar;
import entity.History;
import entity.Pokypatel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class SaveToFile {
    
    public void saveTovars(List<Tovar> listTovars){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listTovars);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: на диске нет файла Books.txt");
        } catch (IOException ex) {
            System.out.println("Ошибка: записать в файл не удалось");
        } finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса oos", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса fos", ex);
                }
            }
        }
    }
    public List<Tovar> loadTovars(){
        List<Tovar> listTovars = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Books.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            listTovars = (List<Tovar>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: не найден файл Books.txt");
        } catch (IOException ex) {
            System.out.println("Ошибка: чтение файла Books.txt не удолось");
        } catch (ClassNotFoundException ex) {
            System.out.println("Ошибка: нет класса Book");
        }finally{
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listTovars;
    }   
    public void savePokypatels(List<Pokypatel> listReaders){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Readers.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listReaders);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: на диске нет файла Books.txt");
        } catch (IOException ex) {
            System.out.println("Ошибка: записать в файл не удалось");
        } finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса oos", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса fos", ex);
                }
            }
        }
    }
    public List<Pokypatel> loadPokypatels(){
        List<Pokypatel> listPokypatels = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Readers.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            listPokypatels = (List<Pokypatel>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: не найден файл Readers.txt");
        } catch (IOException ex) {
            System.out.println("Ошибка: чтение файла Readers.txt не удолось");
        } catch (ClassNotFoundException ex) {
            System.out.println("Ошибка: нет класса Readers");
        }finally{
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listPokypatels;
    }   

    void saveHistories(List<History> listHistories) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Histories.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listHistories);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: на диске нет файла Histories.txt");
        } catch (IOException ex) {
            System.out.println("Ошибка: записать в файл не удалось");
        } finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса oos", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса fos", ex);
                }
            }
        }
    }

    List<History> loadHistories() {
        List<History> listHistories = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Histories.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            listHistories = (List<History>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Ошибка: не найден файл Histories.txt");
        } catch (IOException ex) {
            System.out.println("Ошибка: чтение файла Histories.txt не удолось");
        } catch (ClassNotFoundException ex) {
            System.out.println("Ошибка: нет класса History");
        }finally{
            if(objectInputStream != null){
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return listHistories;
    }

}