public class Vertex{
	private int name;
	private int value;
	private Vertex[] neighborhood;
/*
	Getters and setters for name and value
*/
	public int get_name(){
		return name;
	}
	public void set_name(int input_name){
		name = input_name;
	}
	public int get_value(){
		return value;
	}
	public void set_value(int input_value){
		value = input_value;
	}
	public boolean is_connected(){
		if(neighborhood.length == 1){
			return false;
		}else{
			return true;
		}
	}
	public int get_degree(){
		return neighborhood.length-1;
	}
/*
	Constructor for a vertex. Note: we will always have to initialize it with a name (which we will be using the integers as labels) and a value
*/
	public Vertex(int input_name, int input_value){
		name = input_name;
		value = input_value;
		/*
			This next bit is a formality, we will always include the vertex itself inside of it's neighborhood as the first element so we can easily look at the neighborhoods, and see which vertex we are referencing from
		*/
		neighborhood = new Vertex[1];
		neighborhood[0] = this;
	}
/*
	Constructor for a vertex that has a default value of -1, so we can set it later with the set_value() function;
*/
	public Vertex(int input_name){
		name = input_name;
		value = -1;
		/*
			This next bit is a formality, we will always include the vertex itself inside of it's neighborhood as the first element so we can easily look at the neighborhoods, and see which vertex we are referencing from
		*/
		neighborhood = new Vertex[1];
		neighborhood[0] = this;
	}
/*
	This will be used to describe the vertexes neighborhood, which could be usefull later.

	Essentially, we're just going to be collecting all the adjacent vertexes and slapping them into an array
*/
	public void add_neighbor(Vertex input_neighbor){
		/*
			We first must make a new array of neighbors, but allocate enough room for one additional neighbor, so we do that
		*/
		Vertex[] temp_neighborhood = new Vertex[neighborhood.length+1];
		for(int i = 0; i < neighborhood.length; i++){
			temp_neighborhood[i] = neighborhood[i];
		}
		temp_neighborhood[temp_neighborhood.length-1] = input_neighbor;
		neighborhood = new Vertex[neighborhood.length];
		neighborhood = temp_neighborhood;
	}
/*
	Here is a specialized function that will return a formatted string that lists off the neighborhood of a vertex
*/
	public String get_neighborhood(){
		String output = "";
		/*
			Build our descriptive block by:
				1st neighbor, 2nd neighbor, ...
		*/
		for(int i = 0; i < neighborhood.length; i++){
			output += String.format("%s", neighborhood[i].get_name());
			if(i != neighborhood.length - 1){
				output += ", ";
			}
		}
		return output;
	}
/*
	Here's the get_details() function
*/
	public String get_details(){
		/*
			This function needs the function String get_neighborhood()
		*/
		String output = "";
		/*
			Build our descriptive block by:
				first - name
				second - value
				third - number of neighbors
				fourth - neighbor(s)
				fifth - is this isolated
		*/
		output += String.format("Name:  %s%nValue: %d%nNeighbor(s): %d%nNeighborhood: %s%nConnected: %s%n", String.valueOf(get_name()), get_value(), neighborhood.length-1, this.get_neighborhood(), String.valueOf(this.is_connected()));
		return output;
	}
}