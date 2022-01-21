import java.io.File;
import java.util.HashMap;
import java.util.Objects;
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
                //System.out.println(inputLine.length);
                for (int i=0; i<inputLine.length-1; i++){
                    addEdge(inputLine[i++], inputLine[0]);
                    //System.out.println(inputLine[i++]);
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
            if (Objects.equals(v, actor)){
                for (String adj : adjacentTo(v)){
                    //System.out.println(adj);
                    sb.append(adj + "\n");
                }
            }
            //sb.append("\n");
        }
        return sb.toString();
    }
}
