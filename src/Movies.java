import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Movies extends Graph{
    private HashMap<String, TreeSet<String>> adjmap;
    private int numEdges;

    public Movies (String filename, String delim){
        adjmap = new HashMap<>();
        try {
            // read file
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                String[] inputLine = sc.nextLine().split(delim);
                for (int i=0; i<inputLine.length-1; i++){
                    addEdge(inputLine[0], inputLine[i++]);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String actorList(String actor) {

        StringBuilder sb = new StringBuilder();
        for (String v : vertices()){
            //sb.append(v + " : ");
            for (String adj : adjacentTo(v))
                if (adj == actor){
                    sb.append(v + " ");
                }
            //sb.append("\n");
        }
        return sb.toString();
    }
}
