import java.io.*;
import java.util.ArrayList;
public class SimpleReader {

 /**
  * @param args
  */

 public void readAndPrintFile(String filename){
  String line = null;
  try{
   BufferedReader reader = new BufferedReader(new FileReader(filename));
   while((line = reader.readLine()) != null){
    System.out.println(line);
   }
   reader.close();
  } catch (FileNotFoundException ex){
   System.out.println("Could not find the file: "+ filename);
   filename = FileChooser.pickAFile();
   readAndPrintFile(filename);
  } catch (Exception ex){
   System.out.println("Error reading file: "+filename);
  }
 }
 
  public ArrayList<Integer> readAndCollectIntsFromFile(String filename){
  String line = null;
  ArrayList<Integer> nums = new ArrayList<Integer>();
  // your code here for collecting integers
  return nums;
 }
 
 
 public ArrayList<String> readAndCollectStringsFromFile(String filename){
  String line = null;
  ArrayList<String> text = new ArrayList<String>();
  try{
   BufferedReader reader = new BufferedReader(new FileReader(filename));
   while((line = reader.readLine()) != null){
    System.out.println(100 + Integer.parseInt(line));
    text.add(String.valueOf(100 + Integer.parseInt(line)));
   }
   reader.close();
  } catch (FileNotFoundException ex){
   System.out.println("Could not find the file: "+ filename);
   filename = FileChooser.pickAFile();
   readAndPrintFile(filename);
  } catch (Exception ex){
   System.out.println("Error reading file: "+filename);
  }
  return text;
 }
 
 public static void main(String[] args) {
  SimpleReader reader = new SimpleReader();
  reader.readAndPrintFile("textToRead.txt");
  ArrayList<String> text = reader.readAndCollectStringsFromFile("textToRead.txt");
  SimpleWriter w = new SimpleWriter();
  w.writeGivenStuff(text);
  
 }

}
