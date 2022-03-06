public class Edge_Set{
	/*
		This object will constitute the edge set of a graph, by being a double indexxed array where the second dimension is pairs of vertexes
	*/
	private int number_of_edges;
	private Edge[] edges;
	private int current_index;
	/*
		getters and setters
	*/
	public int get_number_of_edges(){
		return number_of_edges;
	}
	public String get_name_of_edge_at_index(int input_index){
		return edges[input_index].get_name();
	}
	public Edge get_edge_at_index(int input_index){
		return edges[input_index];
	}
	public int get_value_of_edge_at_index(int input_index){
		return edges[input_index].get_value();
	}
	public int[] get_edge_value_array(){
		int[] output = new int[number_of_edges];
		for(int i = 0; i < number_of_edges; i++){
			output[i] = get_value_of_edge_at_index(i);
		}
		return output;
	}
/*
	The default constructor for an edge set /still/ needs to know how many edges will be in it
*/
	public Edge_Set(int input_number_of_edges){
		number_of_edges = input_number_of_edges;
		current_index = 0;
		edges = new Edge[number_of_edges];
	}
	public Edge_Set(){
		number_of_edges = 0;
		current_index = 0;
		edges = new Edge[0];
	}
/*
	This constructor allows the construction of an edge set from a vertex set and an edge relationship

	the edge relationship looks like:
		(2,3)
		(4,2)
		.....
		Names start at 1
	the vertex set looks like
*/
	public Edge_Set(Vertex_Set vertexes, Edge_Relation relationships, int input_modulo){
		this(relationships.get_number_of_edges());
		for(int i = 0; i < number_of_edges; i++){
			add_edge(new Edge(i, vertexes.get_vertex_at_index(relationships.get_left_relation_at_index(i)), vertexes.get_vertex_at_index(relationships.get_right_relation_at_index(i)), input_modulo));
		}
	}
/*
	The following method adds an edge to our underlying edge array
*/
	public void add_edge(Edge input_edge){
		if(current_index < number_of_edges){
			edges[current_index++] = input_edge;
		}
	}
/*
	Here's the get_details() function
*/
	public String get_details(){
		String output = "";
		output += "In the following, replace \"Name\" with \"Index in Edge Set\":\n";
		for(int i = 0; i < number_of_edges; i++){
			output += String.format("%n%s%n----------%n", edges[i].get_details());
		}
		return output;
	}
}