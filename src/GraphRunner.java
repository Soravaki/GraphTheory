import java.util.Scanner;

public class GraphRunner {
    public static void main(String[] args) {
        /*Graph g = new Graph(
                "U:\\COMPUTER SCIENCE 3" +
                        "\\GraphTheory\\src\\graph1.txt",
                " ");
        System.out.println(g);*/

        Movies m = new Movies(
                "U:\\COMPUTER SCIENCE 3" +
                        "\\GraphTheory\\src\\movies.txt",
                "/");


        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Type actor name :: ");
            String actor = sc.nextLine();
            /*for (String adj : g.adjacentTo(actor))
                System.out.println(adj);
            System.out.println();*/
            m.actorList(actor);

        }

    }
}
