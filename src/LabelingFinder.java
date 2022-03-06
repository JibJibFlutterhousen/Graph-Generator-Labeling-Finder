import java.util.*;
import java.math.BigInteger;
import java.util.Locale;
import java.text.NumberFormat;

public class LabelingFinder{
	public static void main(String args[]){		
		String graph_to_label = "12 edged cycle";
		/*
			Set up the attributes that are dependent on our graph
		*/
		Labeling_Finder_Data listing = new Labeling_Finder_Data();
		int[] labeling_set = listing.get_labeling_set(graph_to_label);
		int number_of_vertexes = listing.get_number_of_vertexes_in(graph_to_label);
		Edge_Relation relation_to_use = listing.get_edge_relation(graph_to_label);
		int modulo = labeling_set[labeling_set.length-1]+1;
		BigInteger unique_cases_to_try = Labeling_Finder_Utilities.factorial(labeling_set.length).divide(Labeling_Finder_Utilities.factorial(labeling_set.length - number_of_vertexes));
		System.out.printf("The labeling set is: ");
			for(int i = 0; i < labeling_set.length; i++){
				System.out.printf("%s,", String.valueOf(labeling_set[i]));
			}
		System.out.printf("%nUnique permutations we're trying: %s%n", NumberFormat.getNumberInstance(Locale.US).format(unique_cases_to_try));
		Big_Integer_Counter loop_counter = new Big_Integer_Counter(unique_cases_to_try);

		/*
			Now we set up each of our different threads with their respective information
		*/
		Thread_For_Labeling_Finder[] threads = new Thread_For_Labeling_Finder[labeling_set.length];
		for(int i = 0; i < threads.length; i++){
			threads[i] = new Thread_For_Labeling_Finder();
			threads[i].set_previous_valid_permutation(new ArrayList<>());
			threads[i].set_current_working_list(new ArrayList<>());
			threads[i].set_array_to_permute(labeling_set);
			threads[i].set_used_indexes(new boolean[labeling_set.length]);
			threads[i].set_number_to_use(number_of_vertexes);
			threads[i].set_input_edge_relation(relation_to_use);
			threads[i].set_input_modulo(modulo);
			threads[i].set_loop_counter(loop_counter);
			threads[i].set_fixed_label(labeling_set[i]);
			threads[i].set_output_path(String.format("Outputs\\Thread (%s) labeling (%s) by forcing vertex (%s) to have value (%s)", String.valueOf(i), graph_to_label, String.valueOf(number_of_vertexes), String.valueOf(labeling_set[i])));
			threads[i].set_is_tree(listing.is_tree(graph_to_label));
		}
		/*
			Now we tell all the respective threads to run! :)
		*/
		for(int i = 0; i < threads.length; i++){
			threads[i].start();
		}
		
	}
}