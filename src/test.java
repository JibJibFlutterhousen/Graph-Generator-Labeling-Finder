import java.util.Arrays;

public class test{

	public static void main(String args[]){
		String graph_to_label = "K_4 Snake";
		Labeling_Finder_Data listing = new Labeling_Finder_Data();
		int[] labeling_set = listing.get_labeling_set(graph_to_label);
		Edge_Relation relation_to_use = listing.get_edge_relation(graph_to_label);
		int modulo = labeling_set[labeling_set.length-1]+1;
		Vertex_Set thingie = new Vertex_Set(Arrays.copyOfRange(labeling_set, 0, listing.get_number_of_vertexes_in(graph_to_label)));
		Graph graph = new Graph(thingie, relation_to_use, modulo);
		// System.out.printf("graph.get_edge_set().get_details(): %s%n",graph.get_edge_set().get_details());
		// System.out.printf("Order: %d%nSize: %d%n", graph.get_order(), graph.get_size());
		// System.out.printf("Vertex_Set length: %d%n", thingie.get_number_of_vertexes());
		// System.out.printf("labeling_set length: %d%n", labeling_set.length);
		// System.out.printf("%s%n%n%s", graph.get_vertex_set_CSV(), graph.get_edge_set_CSV());
		// System.out.printf("graph.get_vertex_set_CSV(): %s%n", graph.get_vertex_set_CSV());
		// System.out.printf("graph.get_edge_set_CSV(): %s%n", graph.get_edge_set_CSV());
		double[] test_double = {0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0};
		Adjacency_Matrix adjacency_matrix = new Adjacency_Matrix(test_double);
		System.out.printf("Adjacency Matrix: %n");
		adjacency_matrix.print_details();
		System.out.printf("Number of vertices needed: %d%n", adjacency_matrix.vertices_needed(test_double));
		// Degree_Matrix degree_matrix = new Degree_Matrix(adjacency_matrix);
		// System.out.printf("Degree Matrix: %n");
		// degree_matrix.print_details();
		// Laplacian_Matrix laplacian_matrix = new Laplacian_Matrix(adjacency_matrix);
		// System.out.printf("Laplacian Matrix: %n");
		// laplacian_matrix.print_details();

		// System.out.printf("Second smallest eigen value is: %f%n", laplacian_matrix.get_second_smallest_eigen_value());

		// System.out.printf("Is the graph connected? %s", String.valueOf(adjacency_matrix.is_connected()));
		System.out.printf("Edge_Relation:%n%s", adjacency_matrix.convert_to_edge_relation().get_details());
		Graph test_graph = new Graph(adjacency_matrix);
		System.out.printf("Graph:%n%s", test_graph.get_details());
	}
}