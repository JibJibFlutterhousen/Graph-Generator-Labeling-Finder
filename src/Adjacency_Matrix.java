import Jama.Matrix;

public class Adjacency_Matrix{
    private Matrix adjacency_matrix;
    private double[][] adjacency_matrix_array;
    private int number_of_edges;
/*
    getters and setters
*/
    public Matrix get_adjacency_matrix(){
        return adjacency_matrix;
    }
    public int get_number_of_edges(){
        return number_of_edges;
    }
    public int get_number_of_vertexes(){
        return adjacency_matrix_array.length;
    }
    public int get_degree_of_vertex(int input_vertex){
        int output = 0;
        for(int i = 0; i < adjacency_matrix_array.length; i++){
            if(adjacency_matrix_array[input_vertex][i] > 0.00001){
                output++;
            }
        }
        return output;
    }
/*
    constructors
*/
    public Adjacency_Matrix(double[] input_array){
        adjacency_matrix_array = new double[vertices_needed(input_array)][vertices_needed(input_array)];
        /*
            The idea of this part, is we have i, j, and k as iterators
                i represents the column in the new adacency matrix array
                j represents the row in the new adjacency matrix array
                k represents the position in the input array we wish to copy along the diagonal of our new adjacency matrix array
        */
        for(int i = 0, k = 0; i < vertices_needed(input_array) && k < input_array.length; i++){
            for(int j = 0; j <= i && k < input_array.length; j++){
                adjacency_matrix_array[i][j] = input_array[k];
                adjacency_matrix_array[j][i] = input_array[k++];
            }
        }
        adjacency_matrix = new Matrix(adjacency_matrix_array);
        number_of_edges = get_order(input_array);
    }

    public Adjacency_Matrix(Graph input_graph){
        adjacency_matrix_array = adjacency_array(input_graph);
        adjacency_matrix = new Matrix(adjacency_matrix_array);
        number_of_edges = input_graph.get_size();
    }
/*
    The idea of this function is to return a double-indexxed array that represents a graph's adjacency matrix
*/
    private double[][] adjacency_array(Graph input_graph){
        double[][] output = new double[input_graph.get_order()][input_graph.get_order()];
        Edge_Set input_graph_edge_set = input_graph.get_edge_set();
        for(int i = 0; i < input_graph_edge_set.get_number_of_edges(); i++){
            output[input_graph_edge_set.get_edge_at_index(i).get_endpoint_one().get_name()-1][input_graph_edge_set.get_edge_at_index(i).get_endpoint_two().get_name()-1] = 1;
            output[input_graph_edge_set.get_edge_at_index(i).get_endpoint_two().get_name()-1][input_graph_edge_set.get_edge_at_index(i).get_endpoint_one().get_name()-1] = 1;
        }
        return output;
    }
/*
    The idea of this function is to return the number of vertices needed to create a valid adjacency matrix from a double array

    The way that it works, it find how many succesive natrual numbers need added together to get to the length of our array (since it's holding the bottom half of a square matrix)
*/
    public int vertices_needed(double[] input_array){
        int output = 0;
        for(int i = 1; i <= input_array.length+1; i+=i){
            output++;
        }
        return output;
    }
/*
    This just counts the number of nonzero elements in a double array, the consequence of this is that the half-matrix is counted and the number of edges is determined
*/
    private int get_order(double[] input_array){
        int output = 0;
        for(int i = 0; i < input_array.length; i++){
            if(input_array[i] > 0.00001){
                output++;
            }
        }
        return output;
    }
/*
    here is a function that determines if the associated graph is connected by way of calculating the laplacian matrix, and moreover the second smallest eigen value (if this is larger than zero, then the graph will be connected because there are more than zero connected components)
*/
    public boolean is_connected(){
        boolean output = true;
        Laplacian_Matrix laplacian_Matrix = new Laplacian_Matrix(this);
		/*
			This is a bodge. For some reason there is an issue with floating point precision here that is making it such that what should be zero isnt equal to zero. In this case 0.000001 should be small enough for our purposes.
		*/
		if(laplacian_Matrix.get_second_smallest_eigen_value() <= 0.000001){
			output = false;
		}
        return output;
    }
/*

*/
    public Edge_Relation convert_to_edge_relation(){
        Edge_Relation output = new Edge_Relation(number_of_edges);
        for(int i = 0; i < adjacency_matrix_array.length; i++){
            for(int j = 0; j <= i; j++){
                if(adjacency_matrix_array[i][j] > 0.00001){
                    output.add_relation(i, j);
                }
            }
        }
        return output;
    }
/*
    The get_details function
*/
    public void print_details(){
        adjacency_matrix.print(2,0);
    }
}