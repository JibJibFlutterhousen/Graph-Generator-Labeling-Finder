import Jama.EigenvalueDecomposition;
import Jama.Matrix;

public class Laplacian_Matrix {
    private Matrix laplacian_Matrix;
    private Adjacency_Matrix adjacency_matrix;
    private Degree_Matrix degree_matrix;

    public Laplacian_Matrix(Adjacency_Matrix input_matrix){
        adjacency_matrix = input_matrix;
        degree_matrix = new Degree_Matrix(input_matrix);
        laplacian_Matrix = degree_matrix.get_degree_matrix().minus(adjacency_matrix.get_adjacency_matrix());
    }

    public Laplacian_Matrix(Graph input_graph){
        adjacency_matrix = new Adjacency_Matrix(input_graph);
        degree_matrix = new Degree_Matrix(input_graph);
        laplacian_Matrix = degree_matrix.get_degree_matrix().minus(adjacency_matrix.get_adjacency_matrix());
    }

    public double get_second_smallest_eigen_value(){
        double output = 0.0;
        EigenvalueDecomposition decomposed = new EigenvalueDecomposition(laplacian_Matrix);
        double[] eigen_values = decomposed.getRealEigenvalues();
        output = eigen_values[1];
        return output;
    }

    public void print_details(){
        laplacian_Matrix.print(2,0);
    }
}
