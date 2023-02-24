
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSHashMap;

import CSComparableVsComparator.Student;
import java.util.ArrayList;

/**
 *
 * @author JCSchneider
 */
public class HashMapTest {

    /**
     * Entry point for the program.
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Open addressing: ");
        HashMapOpen<Integer, String> openHash = new HashMapOpen<>();
        System.out.println("Is openHash empty? " + openHash.isEmpty());
        openHash.put(0, "Schneider");    
        openHash.printAll();
        openHash.put(1, "Bass");
        openHash.printAll();
        openHash.put(2, "Graham");
        openHash.printAll();
        openHash.put(3, "Massey");
        openHash.printAll();
        openHash.put(3, "Krueger");
        openHash.printAll();
        openHash.put(4, "Rollins");
        openHash.printAll();
        openHash.put(3, "Spence");
       
        openHash.printAll();
        openHash.put(5, "Richmond");
        openHash.printAll();
        openHash.put(6, "Knight");
        openHash.printAll();
        System.out.println("get(3)" + openHash.get(3));
        openHash.put(3, "Changed");
        System.out.println("get(3)" + openHash.get(3));
        
        openHash.printAll();

        HashMapChain<Integer, String> chain = new HashMapChain<>();
        chain.put(1, "Bass");
        chain.put(1, "Bass");
        System.out.println("\n\nChaining ");
        chain.put(1, "Graham");
        chain.put(2, "Massey");
        chain.put(0, "Schneider");
        chain.put(3, "Krueger");
        chain.put(4, "Rollins");
        chain.put(5, "Richmond");
        chain.put(6, "Knight");
        System.out.println("Remove 0");
        chain.remove(0);
        System.out.println("Chain size: " + chain.size());
        for (int i = 0; i < chain.size(); i++) {
            System.out.println(chain.get(i));
        }
        
        //HashMapOpen<Integer, Student> HashStudent = new HashMapOpen<>();
        HashMapChain<Integer,Student> HashStudent = new HashMapChain<>();
        ArrayList<Student> studentList = new ArrayList<>();
        
        studentList.add(new Student(3, "Schneider", 59));                
        studentList.add(new Student(1,"Zithromiacin", 32));
        studentList.add(new Student(5,"Acidophilus", 32));        
        studentList.add(new Student(4, "Levothyroxine", 44));
        studentList.add(new Student(2,"Ginkgo Biloba", 35));    

        
        for (Student student : studentList) {
            //System.out.println(student.hashCode());
            HashStudent.put(student.hashCode(), student);
            System.out.println(student);
        }
        
    }
}
