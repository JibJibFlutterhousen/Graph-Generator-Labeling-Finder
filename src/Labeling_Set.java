import java.util.*;

public class Labeling_Set{
/*
	This class needs:
		import java.io.*;
		import java.util.*;
*/
	private int number_of_vertexes;
	private int[] vertex_labels;
/*
	Getters and setters
*/
	public int[] get_labeling_array(){
		return vertex_labels.clone();
	}
	public int get_length(){
		return number_of_vertexes;
	}
/*
	here's the constructor, basically we just 
*/
	public Labeling_Set(int[] input_vertex_labels){
		number_of_vertexes = input_vertex_labels.length;
		vertex_labels = input_vertex_labels.clone();
	}
	public Labeling_Set(List<Integer> input_list){
		int[] input_vertex_labels = convert(input_list);
		number_of_vertexes = input_vertex_labels.length;
		vertex_labels = input_vertex_labels.clone();
	}
/*
	here's a helper function that converts a List<Integer> into an int[]
*/
	private int[] convert(List<Integer> input_list){
		int[] output = new int[input_list.size()];
		for(int i = 0; i < input_list.size(); i++){
			output[i] = input_list.get(i);
		}
		return output;
	}
/*
	Here's the get_details() function

	this function needs:
		import java.io.*;
		import java.util.*;
*/
	public String get_details(){
		String output = "";
		output += Arrays.toString(vertex_labels);
		return output;
	}
}