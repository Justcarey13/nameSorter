import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;


public class nameSorter {
    /**
     * Read file from argument fileName
     * @param args
     * @return 
     * @throws IOException
     */
    public static ArrayList<String> readFile(String[] args) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        try {
            while (br.ready()) {
                result.add(br.readLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find the file");
        } finally {
            br.close();
        }
        return result;
    }
    
    /**
     * Sorter for all names first by last name then by any given names they may have
     * @param persons
     * @return sortedNames
     */
    public static ArrayList<String> sorter(ArrayList<Person> persons) {
        ArrayList<String> sortedNames = new ArrayList<String>();
        Collections.sort(persons, new PersonComparator());
        for (Person p : persons) {
            sortedNames.add(p.getFullName());
        }
		return sortedNames;
    }

    /**
     * Write/overwrite the sorted list of names to a file called sorted-names-list.txt
     * @param data
     * @throws IOException
     */
    public static void writeFile(ArrayList<String> data) throws IOException {
        try {
            FileWriter writer = new FileWriter("sorted-names-list.txt"); 
            for(String str: data) {
                writer.write(str + System.lineSeparator());
            } 
            writer.close();
        } catch (IOException e) {
            System.err.println("Catch IOException");
        }  
    }

    public static void main(String[] args) throws Exception{
        ArrayList<String> unsortedNames;
        ArrayList<String> sortedNames;
        // Arraylist to store all person
        ArrayList<Person> persons = new ArrayList<Person>();

        // read file
        unsortedNames = readFile(args);
        // Add all name to persons
        for (String s : unsortedNames) {
            // Create a person
            Person p = new Person();
            p.setFullName(s);
            // Add to persons
            persons.add(p);
        }
        // sort
        sortedNames = sorter(persons);
        // write file
        writeFile(sortedNames);
    }

}
