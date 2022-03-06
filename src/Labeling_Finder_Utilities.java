import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Labeling_Finder_Utilities{
/*
	This function returns the factorial of a given number

	this function needs:
	import java.math.BigInteger;
*/
	public static BigInteger factorial(int input_n){
		BigInteger output = new BigInteger("1");
		for(int i = 1; i <= input_n; i++){
			output = output.multiply(new BigInteger(String.format("%d", i)));
		}
		return output;
	}
/*

*/
	public static int determine_modulo(Adjacency_Matrix input_matrix){
		int output = 0;
		if(input_matrix.get_number_of_edges() == 4){
			output = 8;
		}else if(input_matrix.get_number_of_edges() == 8){
			output = 15;
		}else if(input_matrix.get_number_of_edges() == 10){
			output = 11;
		}else if(input_matrix.get_number_of_edges() == 12){
			output = 21;
		}else if(input_matrix.get_number_of_edges() == 16){
			output = 32;
		}else if(input_matrix.get_number_of_edges() == 20){
			output = 33;
		}else if(input_matrix.get_number_of_edges() == 24){
			output = 84;
		}else if(input_matrix.get_number_of_edges() == 32){
			output = 96;
		}else if(input_matrix.get_number_of_edges() == 36){
			output = 63;
		}else if(input_matrix.get_number_of_edges() == 40){
			output = 55;
		}else if(input_matrix.get_number_of_edges() == 44){
			output = 92;
		}else if(input_matrix.get_number_of_edges() == 48){
			output = 65;
		}else if(input_matrix.get_number_of_edges() == 56){
			output = 87;
		}else if(input_matrix.get_number_of_edges() == 60){
			output = 93;
		}else if(input_matrix.get_number_of_edges() == 72){
			output = 91;
		}
		return output;
	}
/*
	This function returns an integer array with the input value removed
*/
	public static int[] remove_value_from_int_array(int[] initial_array, int value_to_remove){
		int[] output;
		/*
			We will copy the array (except the value(s) that we wanted to remove) into a list first, so we can dynamicaly size the output array based off of the size we need
		*/
		List<Integer> output_list = new ArrayList<>();
		for(int i = 0; i < initial_array.length; i++){
			if(!(initial_array[i] == value_to_remove)){
				output_list.add(initial_array[i]);
			}
		}/*
			We then create the array we will be returning, and returning it
		*/
		output = new int[output_list.size()];
		for(int i = 0; i < output_list.size(); i++){
			output[i] = output_list.get(i);
		}
		return output;
	}
/*
	This function takes an input element, and adds it to an input array.

	The functionality of this function is to "slide" all the elements over by one, making space for the given element
*/
	public static int[] Int_Array_Add_On_Left(int input_element, int[] input_array){
		int[] output = new int[input_array.length+1];
		output[0] = input_element;
		for(int i = 1; i < input_array.length+1; i++){
			output[i] = input_array[i-1];
		}
		return output;
	}
/*
	This function takes an input graph, and pushes it's edge set and vertex set to the given path
		Note: both of these files are formatted for Gephi
*/
	public static void push_graph_to_files(Graph input_graph, String output_location){
		/*
			Some housekeeping formatting the output vertex set location and output edge set location
		*/
		String output_vertex_set_location = String.format("%s_Vertex_Set_labeling.csv", output_location);
		String output_edge_set_location = String.format("%s_Edge_Set_labeling.csv", output_location);
		/*
			Push the vertex set to a csv file that gephi can import
		*/
		try{
			File vertex_set_file = new File(output_vertex_set_location);
			vertex_set_file.createNewFile();
			try(FileWriter output_vertex_set_stream = new FileWriter(output_vertex_set_location)){
				output_vertex_set_stream.write(input_graph.get_vertex_set_CSV());
				output_vertex_set_stream.close();
			}catch(java.io.FileNotFoundException e){
				System.out.println("Printing stack trace... (couldn't find the csv file for vertexes)");
				e.printStackTrace();
			}
		}catch(IOException e){
			System.out.println("Printing stack trace... (problem creating the csv file for vertexes)");
			e.printStackTrace();
		}
		/*
			Push the edge set to a csv file that gephi can import
		*/
		try{
			File edge_set_file = new File(output_edge_set_location);
			edge_set_file.createNewFile();
			try(FileWriter output_edge_set_stream = new FileWriter(output_edge_set_location)){
				output_edge_set_stream.write(input_graph.get_edge_set_CSV());
				output_edge_set_stream.close();
			}catch(java.io.FileNotFoundException e){
				System.out.printf("Printing stack trace... (couldn't find the csv file for edges at location %s)%n", output_location);
				e.printStackTrace();
			}
		}catch(IOException e){
			System.out.printf("Printing stack trace... (problem creating the csv file for edges at location %s)%n", output_location);
			e.printStackTrace();
		}
	}
/*
	this function is the primary permutation generator. this is where we have to "prune" off the labeling list to only use the first number_to_use numbers. This is a formality since the number of edges on a graph is what we're trying to make a rainbow, while the number of vertexes may be far fewer than the number of edges

	Since it's gotten rather lengthy, here's the argument list and why they're there:
		previous_valud_permutation
			This is a List<Integer> and represents the last valid permutation that was tried. This is needed to make sure that we aren't creating duplicate labelings.
		current_workingList
			This is also a List<Integer> and represents the permutation that we're currently building. We recursively build this, so it is passed from iteration to iteration.
		array_to_permute
			This is a int[] and represents the input array that we are choosing permutations from. This isn't destructively touched through the iterations, because we use current_working_list as a destructable version of this array.
		used_indexes
			This is a boolean[] and represents the indexes of array_to_permute that have been used. This is neccesary so we can keep track of which indexes have been used so we don't label multiple vertexes with the same value. This is necessary because we aren't destructively altering array_to_permute.
		number_to_use
			This is a int and represents the number of vertexes on the graph (aside from the one that we're fixing)
		input_edge_relation
			This is a Edge_Relation and represents the graph we are labeling. This is neccesary since we'll be creating the graph within this funciton. We initially were just creating the list of permutations, but since that'd take too much RAM for the larger graphs (more than 10 vertexes) to be feasible.
		input_modulo
			This is the modulo that we are working under when creating the graph. This is neccesary for the same reason that the input_edge_relation is needed.
		input_fixed_labeling
			This is a int and represents a labeling that is assigned to vertex with name 0 on the graph. This is needed because we want to multithread the process, and this is how we will be determining different threads.
		loop_counter
			This is a Big_Integer_Counter and represents the number of iterations we have tested a graph. This isn't neccesary for proper operation, but for diagnostic reasons we include it.
		output_path
			This is a String and represents where the output will be pushed. This is neccesary because the parralellized nature of this will mean that the command prompt window may be updated out of order, leading to confusion of the user.
		input_thread
			this is the thread that will be executing the iteration of this method. This is neccesary because system.exit() stops all of the currently running threads.

	this function needs:
		import java.math.*;
		import java.util.Locale;
		import java.text.NumberFormat;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
*/
	public static void test_all_labelings(List<Integer> previous_valid_permutation, List<Integer> current_working_list, int[] array_to_permute, boolean[] used_indexes, int number_to_use, Edge_Relation input_edge_relation, int input_modulo, int input_fixed_labeling, Big_Integer_Counter loop_counter, String output_path, Thread_For_Labeling_Finder input_thread){
			if(current_working_list.size() == number_to_use){
				/*
					We've gathered enough elements to try and permute the things, first make sure it's not a duplicate
				*/
				if(!current_working_list.equals(previous_valid_permutation)){
					/*
						at this point, we have gathered enough elements to fill up all the vertexes except the fixed one, so we will add that one in now!
					*/
					current_working_list.add(input_fixed_labeling);
					/*
						now we've got a potentially valid labeling, so we will check it!
					*/
					loop_counter.iterate();
					Graph possible_labeling = new Graph(new Vertex_Set(new Labeling_Set(current_working_list)), input_edge_relation, input_modulo);
					/*
						progress updater: update every .001 of a percent
					*/
					if(loop_counter.show_update()){
						String output_string = loop_counter.update_to_show();
						if(output_string.length() > 3){
							output_string += " || " + possible_labeling.get_vertex_set_values();
						}
						System.out.printf("%s", output_string);
					}
					if (possible_labeling.is_valid()){
						/*
							We've found a valid graph! woo hoo!
						*/
						if(input_thread.get_labelings_found() == 0){
							push_graph_to_files(possible_labeling, output_path);
						}
						input_thread.found_labeling();
						//input_thread.stop();
					}
					/*
						Now we delete the old permutation, and begin working towards the next iteration. It's a formality, however, that we have to first remove the fixed labeling value off of the end of the list
					*/
					current_working_list.remove(current_working_list.size()-1);
					previous_valid_permutation = new ArrayList<>(current_working_list);
				}
			}else{
				/*
					we need to determine the next element we're going to use
				*/
				for(int i = 0; i < array_to_permute.length; i++){
					if(used_indexes[i] || i > 0 && array_to_permute[i] == array_to_permute[i-1] && !used_indexes[i-1]){
						/*
							this is the case where an element is already used, or not valid to use
						*/
						continue;
					}
					/*
						we're good to use the ith index of array_to_permute in our next permutation (:
					*/
					used_indexes[i] = true;
					current_working_list.add(array_to_permute[i]);
					/*
						now we go pick the remaining elements, until we get enough to be another candidate for a unique permutation!
					*/
					test_all_labelings(previous_valid_permutation, current_working_list, array_to_permute, used_indexes, number_to_use, input_edge_relation, input_modulo, input_fixed_labeling, loop_counter, output_path, input_thread);
					/*
						the above line keeps repeating (via the recursion) until all possible permutations with the given element have been listed, so we move on to the next element
					*/
					used_indexes[i] = false;
					current_working_list.remove(current_working_list.size()-1);
				}
			}
	}
}