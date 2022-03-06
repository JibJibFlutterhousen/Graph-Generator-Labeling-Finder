public class Edge_Relation{
	private int number_of_edges;
	private int[][] relationships;
	private int current_index;

/*
	setters and getters
*/
	public int get_number_of_edges(){
		return number_of_edges;
	}
	public int get_left_relation_at_index(int input_index){
		return relationships[input_index][0];
	}
	public int get_right_relation_at_index(int input_index){
		return relationships[input_index][1];
	}

/*
	Constructor that initializes the double indexxed array
*/
	public Edge_Relation(int input_number_of_edges){
		number_of_edges = input_number_of_edges;
		relationships = new int[number_of_edges][2];
		current_index = 0;
	}

/*
	This function takes two vertex names and adds them to the list of relations (this is needed because an "edge" is an object that we haven't created yet)
*/
	public void add_relation(int name_vertex_1, int name_vertex_2){
		relationships[current_index][0] = name_vertex_1;
		relationships[current_index][1] = name_vertex_2;
		current_index++;
	}
/*
	Here's the get_details() function
*/
	public String get_details(){
		String output = "";
		for(int i = 0; i < number_of_edges; i++){
			output += String.format("(%s,%s)", get_left_relation_at_index(i), get_right_relation_at_index(i));
			if(i < number_of_edges-1){
				output += ", ";
			}
		}
		output += "\n";
		return output;
	}
}