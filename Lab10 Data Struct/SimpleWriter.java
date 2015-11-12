
import java.io.*;
import java.util.ArrayList;

public class SimpleWriter{


 public void writeSillyFile()
 {
  try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("silly.txt"));
      writer.write("Data Structures rocks!");
      writer.newLine();
      writer.write("UMM is the best!");
      writer.close();
      } catch (Exception ex) {
       System.out.println("Error during writing of silly file");
      }
  }
 public void writeGivenStrings(ArrayList<String> ar){
   try {
       BufferedWriter writer = new BufferedWriter(new FileWriter("textToRead.txt"));
       for (String s : ar){
       writer.write(s);
       writer.newLine();
       }
       writer.close();
       } catch (Exception ex) {
        System.out.println("Error during writing of silly file");
       }
 }
 public void writeGivenInts(ArrayList<Integer> ar){
   // your code here for writing Integers to a file
 }
 public void writeGivenStuff(ArrayList ar){
   try {
       BufferedWriter writer = new BufferedWriter(new FileWriter("zzTextToRead.txt"));
       for (Object s : ar){
       writer.write(s.toString());
       writer.newLine();
       }
       writer.close();
       } catch (Exception ex) {
        System.out.println("Error during writing of silly file");
       }
 }

 public static void main(String[] args){
 SimpleWriter writer = new SimpleWriter();
 writer.writeSillyFile();
 
 }
}
