public class Edge{
	private int name;
	private int value;
	private int modulo;
	private Vertex[] endpoints;
/*
	Getters and setters for name and value
*/
	public String get_name(){
		return String.valueOf(name);
	}
	public void set_name(int input_name){
		name = input_name;
	}
	public int get_value(){
		return value;
	}
/*
	Getter for the endpoints
*/
	public Vertex get_endpoint_one(){
		return endpoints[0];
	}
	public Vertex get_endpoint_two(){
		return endpoints[1];
	}
/*
	This is where we'd change our "evaluation function" that determines the value of the edge
*/
	public int calculate_value(int vertex_1_value, int vertex_2_value){
		int output = 0;
		output = (vertex_1_value * vertex_2_value)%modulo;
		return output;
	}

/*
	Constructor for an edge. 
	Notes: 
		we don't allow an edge to be created without endpoints
		since the value is calculated, we do that here and assign value on creation of the edge

	This constructor needs the function int calculate_value(int vertex_1_value, int vertex_2_value)
*/	
	public Edge(int input_name, Vertex input_endpoint_1, Vertex input_endpoint_2, int input_modulo){
		/*
			set the name and modulo
		*/
		name = input_name;
		modulo = input_modulo;
		/*
			create and set the endpoints array
		*/
		endpoints = new Vertex[2];
		endpoints[0] = input_endpoint_1;
		endpoints[1] = input_endpoint_2;
		/*
			calculate and assign the value of the edge as a function of the endpoints
		*/
		value = calculate_value(endpoints[0].get_value(), endpoints[1].get_value());
		endpoints[0].add_neighbor(endpoints[1]);
		endpoints[1].add_neighbor(endpoints[0]);
	}
/*
	Here's the get_details() function
*/
	public String get_details(){
		String output = "";
		/*
			Build our descriptive block like:
				first - name
				second - value
				third - (first endpoint)-(second endpoint)

		*/
		output += String.format("Name:  %s%nValue: %d%nEndpoints: (%s)--->(%s)", get_name(), get_value(), endpoints[0].get_name(), endpoints[1].get_name());
		return output;
	}
}