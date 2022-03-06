import java.util.List;
import java.math.BigInteger;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Thread_For_Labeling_Finder extends Thread{
	private List<Integer> previous_valid_permutation;
	private List<Integer> current_working_list;
	private int[] array_to_permute;
	private boolean[] used_indexes;
	private int number_to_use;
	private Edge_Relation input_edge_relation;
	private int input_modulo;
	private Big_Integer_Counter loop_counter;
	private int fixed_label;
	private String output_path;
	private boolean is_tree;
	private int labelings_found;

	public void set_previous_valid_permutation(List<Integer> input){
		this.previous_valid_permutation = input;
	}
	public void set_current_working_list(List<Integer> input){
		this.current_working_list = input;
	}
	public void set_array_to_permute(int[] input){
		this.array_to_permute = input;
	}
	public void set_used_indexes(boolean[] input){
		this.used_indexes = input;
	}
	public void set_number_to_use(int input){
		this.number_to_use = input;
	}
	public void set_input_edge_relation(Edge_Relation input){
		this.input_edge_relation = input;
	}
	public void set_input_modulo(int input){
		this.input_modulo = input;
	}
	public void set_loop_counter(Big_Integer_Counter input){
		this.loop_counter = input;
	}
	public void set_fixed_label(int input){
		this.fixed_label = input;
	}
	public void set_output_path(String input){
		this.output_path = input;
	}
	public void set_is_tree(boolean input){
		this.is_tree = input;
	}
	public void found_labeling(){
		this.labelings_found++;
	}
	public int get_labelings_found(){
		return this.labelings_found;
	}

	private void push_final_file(){
		try{
			String output_location = String.format("%s_final.txt", output_path);
			String final_text = String.format("A total of %s labelings have been found in %s iterations%n", String.valueOf(labelings_found), loop_counter.get_counter());
			File final_file = new File(output_location);
			final_file.createNewFile();
			try(FileWriter output_final_stream = new FileWriter(output_location)){
				output_final_stream.write(final_text);
				output_final_stream.close();
			}catch(java.io.FileNotFoundException e){
				System.out.printf("Printing stack trace... (couldn't find the txt file at location %s)%n", output_path);
				e.printStackTrace();
			}
		}catch(IOException e){
			System.out.printf("Printing stack trace... (problem creating the txt file at location %s)%n", output_path);
			e.printStackTrace();
		}
	}

	public void run(){
		System.out.printf("%nForcing vertex [%s] to have value [%s]. ", String.valueOf(number_to_use), String.valueOf(fixed_label));
		this.labelings_found = 0;
		/*
			First we must set up our labeling set. This means that we remove the fixed_label from the set
			Note: we only do this in the event of a tree
		*/
		if(!is_tree){
			array_to_permute = Labeling_Finder_Utilities.remove_value_from_int_array(array_to_permute, fixed_label);
		}
		/*
			Since we're still "fixing" one of the possible values, we still are only looking for a permutation that has one less element, so we decrement number_to_use
		*/
		number_to_use--;
		/*
			Now we set up our loop counter
		*/
		BigInteger unique_cases_to_try = Labeling_Finder_Utilities.factorial(array_to_permute.length).divide(Labeling_Finder_Utilities.factorial(array_to_permute.length - number_to_use));
		Big_Integer_Counter new_loop_counter = new Big_Integer_Counter(unique_cases_to_try);
		set_loop_counter(new_loop_counter);
		/*
			Now we run the function that permutes everything that's left :)
		*/
		Labeling_Finder_Utilities.test_all_labelings(previous_valid_permutation, current_working_list, array_to_permute, used_indexes, number_to_use, input_edge_relation, input_modulo, fixed_label, loop_counter, output_path, this);
		/*
			Push the final file
		*/
		push_final_file();
	}
}