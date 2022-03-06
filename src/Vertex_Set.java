public class Vertex_Set{
	private Vertex[] vertexes;
	private int number_of_vertexes;
/*
	setters and getters
*/
	public int get_number_of_vertexes(){
		// number_of_vertexes = 0;
		// for(int i = 0; i < vertexes.length; i++){
		// 	if(vertexes[i].is_connected()){
		// 		number_of_vertexes++;
		// 	}
		// }
		return number_of_vertexes;
	}
	public Vertex get_vertex_at_index(int input_index){
		return vertexes[input_index];
	}
/*
	Here are the constructors
		one that accepts the labeling set as an integer array
		one that accepts an actual labeling set object
		one that instanciates the value of the vertexes with no value
*/

	public Vertex_Set(int[] labeling_set){
		this(labeling_set.length);
		this.set_values(labeling_set);
	}
	public Vertex_Set(Labeling_Set input_labeling_set){
		this(input_labeling_set.get_labeling_array());
	}
	public Vertex_Set(int input_number_of_vertexes){
		number_of_vertexes = input_number_of_vertexes;
		vertexes = new Vertex[number_of_vertexes];
		for(int i = 0; i < number_of_vertexes; i++){
			vertexes[i] = new Vertex(i+1);
		}
	}
	public Vertex_Set(){
		number_of_vertexes = 0;
		vertexes = new Vertex[0];
	}
/*
	Since the constructor doesn't need to have a labeling set, here is the function that sets the values of the vertexes in correspondance with the labeling set
*/
	public void set_values(int[] labeling_set){
		for(int i = 0; i < labeling_set.length; i++){
			vertexes[i].set_value(labeling_set[i]);
		}
	}
	public String list_vertex_labels(){
		String output = "[";
		for(int i = 0; i < number_of_vertexes; i++){
			output += String.format("%s", vertexes[i].get_value());
			if(i < number_of_vertexes-1){
				output += ", ";
			}
		}
		output += "]";
		return output;
	}
/*
	Here's the get_details() function
*/
	public String get_details(){
		String output = "";
		for(int i = 0; i < number_of_vertexes; i++){
			output += String.format("%s%n----------%n", vertexes[i].get_details());
		}
		return output;
	}
}