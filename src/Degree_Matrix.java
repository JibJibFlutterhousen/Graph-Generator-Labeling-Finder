import Jama.Matrix;

public class Degree_Matrix{
    private Matrix degree_matrix;
/*
    getters and setters
*/
    public Matrix get_degree_matrix(){
        return degree_matrix;
    }

/*
    constructors
*/
    public Degree_Matrix(Adjacency_Matrix input_adjacency_matrix){
        double[][] degree_matrix_array = new double[input_adjacency_matrix.get_number_of_vertexes()][input_adjacency_matrix.get_number_of_vertexes()];
        for(int i = 0; i < input_adjacency_matrix.get_number_of_vertexes(); i++){
            degree_matrix_array[i][i] = input_adjacency_matrix.get_degree_of_vertex(i);
        }
        degree_matrix = new Matrix(degree_matrix_array);
    }

    public Degree_Matrix(Graph input_graph){
        double[][] degree_matrix_array = degree_array(input_graph);
        degree_matrix = new Matrix(degree_matrix_array);
    }
/*
    The idea of this function is to return a double-indexxed array that represents a graph's adjacency matrix
*/
    private double[][] degree_array(Graph input_graph){
        double[][] output = new double[input_graph.get_order()][input_graph.get_order()];
        for(int i = 0; i < input_graph.get_order(); i++){
            output[i][i] = input_graph.get_Vertex_Set().get_vertex_at_index(i).get_degree();
        }
        return output;
    }
/*
    The get_details function
*/
    public void print_details(){
        degree_matrix.print(2,0);
    }
}