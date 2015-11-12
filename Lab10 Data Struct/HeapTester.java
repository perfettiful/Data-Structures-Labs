
import junit.framework.TestCase;
import junit.*;
import java.util.ArrayList;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class HeapTester extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testHeapInsert() throws MyHeapException, ClassCastException{
    Heap<Integer> p = new Heap<Integer>();
    p.heapInsert(100);
    assertEquals((Integer) 100, p.heapDelete());
  }
  
  public void testHeapFileStuff(){
    ArrayList<Integer> ints = new ArrayList<Integer>();
    SimpleReader reader = new SimpleReader();
    ints = reader.readAndCollectIntsFromFile("zzNumbersFile2.txt");
    System.out.print("Here are the numbers from the file: \n" + ints + "(done)\n");
    Heap<Integer> myHeap = new Heap<Integer>(ints);
    System.out.println(ints);
    System.out.println(myHeap.heapDelete());
    System.out.println(myHeap.heapDelete());
    System.out.println(myHeap.heapDelete());
    myHeap.saveHeap();
    ArrayList<Integer> ints2 = reader.readAndCollectIntsFromFile("zzTextToRead.txt");
    assertEquals(ints2.get(0), myHeap.heapDelete());
    myHeap.saveHeap();
    myHeap.serializeHeap();
    Heap<Integer> myNewHeap = Heap.deserializeIntHeap("Heap.ser");
    ArrayList<Integer> ints3 = reader.readAndCollectIntsFromFile("zzTextToRead.txt");
    assertEquals(ints3.get(0), myNewHeap.heapDelete());
  }
  
  public static void main (String[] args){
    ArrayList<Integer> ints = new ArrayList<Integer>();
    SimpleReader reader = new SimpleReader();
    ints = reader.readAndCollectIntsFromFile("zzNumbersFile2.txt");
    System.out.print("Here are the numbers from the file: \n" + ints);
    Heap<Integer> myHeap = new Heap<Integer>(ints);
    System.out.print("\nHere is the heap info:\n" + myHeap);
    SimpleWriter writer = new SimpleWriter();
    writer.writeGivenInts(ints);
    myHeap.show();
    myHeap.serializeHeap();
    //ADD STUFFS
  }
}
