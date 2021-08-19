/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.pizzashop.receiptfilehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;


/**
 *
 * @author benov
 */
public class ReceiptFileHandling {
      // open a file 
//    String filePath = "./CustomerReceipt.txt";
    String filePath;
    File fileName;
     private FileWriter file;
     private FileReader fileReader;
    
    public ReceiptFileHandling(){
        this.filePath = "./CustomerReceipt.txt";
        this.fileName = new File(filePath);
     }
    
    public ReceiptFileHandling(String filePath){
        this.filePath = filePath;
        this.fileName = new File(filePath);
    }
    
    
    // write to a file
    public void writeToFile(String message,boolean value)throws IOException{
        file = new FileWriter(fileName,value);
        
        // append the mesasge to the file
        file.append(message);
        file.append("\n");
        // close the filewriter 
        file.close();
         
    }
    
    // Read from a file 
    public String readFromFile()throws IOException{
        String message  = "";
        int words;
        
        fileReader  = new FileReader(fileName);
        
        // get each letter in the text file
        while((words = fileReader.read()) !=-1){
            // append each character to the message
            message += String.valueOf((char)words);
        }

        fileReader.close();

        return message;
    }
}
