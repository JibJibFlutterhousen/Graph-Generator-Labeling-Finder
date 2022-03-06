public class Labeling_Finder_Data{
	Edge_Relation k_4_snake_edge_relation_object;
	Edge_Relation k_5_snake;
	Edge_Relation windmill_edge_relation_object;
	Edge_Relation fancy_pentagon_object;
	Edge_Relation fancy_hexagon_object;
	Edge_Relation fancy_octagon_object;
	Edge_Relation fancy_crab_object;
	Edge_Relation lopsided_fancy_crab;
	Edge_Relation fancy_fish;
	Edge_Relation fancy_emerald_object;
	Edge_Relation c_20;
	Edge_Relation fancy_K_4xK_2;
	Edge_Relation K_4xK_2;
	Edge_Relation Tree_1;
	Edge_Relation fancy_square;
	Edge_Relation fancy_pseudotriangle;
	Edge_Relation c_11;
	Edge_Relation disconnected;

	int[] U8 = { 1, 3, 5, 7 };
	int[] U15 = { 1, 2, 4, 7, 8, 11, 13, 14 };
	int[] U11 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int[] U21 = { 1, 2, 4, 5, 8, 10, 11, 13, 16, 17, 19, 20 };
	int[] U32 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 };
	int[] U33 = { 1, 2, 4, 5, 7, 8, 10, 13, 14, 16, 17, 19, 20, 23, 25, 26, 28, 29, 31, 32 };
	int[] U84 = { 1, 5, 11, 13, 17, 19, 23, 25, 29, 31, 37, 41, 43, 47, 53, 55, 59, 61, 65, 67, 71, 73, 79, 83 };
	int[] U96 = { 1, 5, 7, 11, 13, 17, 19, 23, 25, 29, 31, 35, 37, 41, 43, 47, 49, 53, 55, 59, 61, 65, 67, 71, 73, 77, 79, 83, 85, 89, 91, 95 };
	int[] U63 = { 1, 2, 4, 5, 8, 10, 11, 13, 16, 17, 19, 20, 22, 23, 25, 26, 29, 31, 32, 34, 37, 38, 40, 41, 43, 44, 46, 47, 50, 52, 53, 55, 58, 59, 61, 62 };
	int[] U55 = { 1, 2, 3, 4, 6, 7, 8, 9, 12, 13, 14, 16, 17, 18, 19, 21, 23, 24, 26, 27, 28, 29, 31, 32, 34, 36, 37, 38, 39, 41, 42, 43, 46, 47, 48, 49, 51, 52, 53, 54 };
	int[] U92 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91 };
	int[] U65 = { 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 14, 16, 17, 18, 19, 21, 22, 23, 24, 27, 28, 29, 31, 32, 33, 34, 36, 37, 38, 41, 42, 43, 44, 46, 47, 48, 49, 51, 53, 54, 56, 57, 58, 59, 61, 62, 63, 64 };
	int[] U87 = { 1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22, 23, 25, 26, 28, 31, 32, 34, 35, 37, 38, 40, 41, 43, 44, 46, 47, 49, 50, 52, 53, 55, 56, 59, 61, 62, 64, 65, 67, 68, 70, 71, 73, 74, 76, 77, 79, 80, 82, 83, 85, 86 };
	int[] U93 = { 1, 2, 4, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 22, 23, 25, 26, 28, 29, 32, 34, 35, 37, 38, 40, 41, 43, 44, 46, 47, 49, 50, 52, 53, 55, 56, 58, 59, 61, 64, 65, 67, 68, 70, 71, 73, 74, 76, 77, 79, 80, 82, 83, 85, 86, 88, 89, 91, 92 };
	int[] U85 = { 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 16, 18, 19, 21, 22, 23, 24, 26, 27, 28, 29, 31, 32, 33, 36, 37, 38, 39, 41, 42, 43, 44, 46, 47, 48, 49, 52, 53, 54, 56, 57, 58, 59, 61, 62, 63, 64, 66, 67, 69, 71, 72, 73, 74, 76, 77, 78, 79, 81, 82, 83, 84 };
	int[] U91 = { 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25, 27, 29, 30, 31, 32, 33, 34, 36, 37, 38, 40, 41, 43, 44, 45, 46, 47, 48, 50, 51, 53, 54, 55, 57, 58, 59, 60, 61, 62, 64, 66, 67, 68, 69, 71, 72, 73, 74, 75, 76, 79, 80, 81, 82, 83, 85, 86, 87, 88, 89, 90 };

	public String get_graph_names(){
		String output = "";

		output += 
		"K_4 Snake" +
		"K_5 Snake" +
		"Windmill with 9 nodes" +
		"5 pointed wheel" +
		"6 pointed wheel" +
		"8 pointed wheel" +
		"Fancy crab" +
		"Lopsided fancy crab" +
		"Fancy fish" +
		"Fancy emerald" +
		"Weird K_4xK_2" +
		"K_4 x K_2" +
		"Tree 1" + 
		"Fancy square" + 
		"Fancy Pseudotriangle" +
		"12 edged cycle" +
		"Disconnected"
		;

		return output;
	}

	public int[] get_labeling_set(String input_request){
		int[] output;
		Edge_Relation relation_to_use = get_edge_relation(input_request);

		if(relation_to_use.get_number_of_edges() == 4){
			output = U8;
		}else if(relation_to_use.get_number_of_edges() == 8){
			output = U15;
		}else if(relation_to_use.get_number_of_edges() == 10){
			output = U11;
		}else if(relation_to_use.get_number_of_edges() == 12){
			output = U21;
		}else if(relation_to_use.get_number_of_edges() == 16){
			output = U32;
		}else if(relation_to_use.get_number_of_edges() == 20){
			output = U33;
		}else if(relation_to_use.get_number_of_edges() == 24){
			output = U84;
		}else if(relation_to_use.get_number_of_edges() == 32){
			output = U96;
		}else if(relation_to_use.get_number_of_edges() == 36){
			output = U63;
		}else if(relation_to_use.get_number_of_edges() == 40){
			output = U55;
		}else if(relation_to_use.get_number_of_edges() == 44){
			output = U92;
		}else if(relation_to_use.get_number_of_edges() == 48){
			output = U65;
		}else if(relation_to_use.get_number_of_edges() == 56){
			output = U87;
		}else if(relation_to_use.get_number_of_edges() == 60){
			output = U93;
		}else if(relation_to_use.get_number_of_edges() == 72){
			output = U91;
		}else{
			System.out.printf("Graph not found!(in get_labeling_set%n");
			output = new int[0];
		}

		return output;
	}

	public Edge_Relation get_edge_relation(String input_request){
		if(input_request == "K_4 Snake"){
			return k_4_snake_edge_relation_object;
		}else if(input_request == "K_5 Snake"){
			return k_5_snake;
		}else if(input_request == "Windmill with 9 nodes"){
			return windmill_edge_relation_object;
		}else if(input_request == "5 pointed wheel"){
			return fancy_pentagon_object;
		}else if(input_request == "6 pointed wheel"){
			return fancy_hexagon_object;
		}else if(input_request == "8 pointed wheel"){
			return fancy_octagon_object;
		}else if(input_request == "Fancy crab"){
			return fancy_crab_object;
		}else if(input_request == "Lopsided fancy crab"){
			return lopsided_fancy_crab;
		}else if(input_request == "Fancy fish"){
			return fancy_fish;
		}else if(input_request == "Fancy emerald"){
			return fancy_emerald_object;
		}else if(input_request == "Weird K_4xK_2"){
			return fancy_K_4xK_2;
		}else if(input_request == "K_4 x K_2"){
			return K_4xK_2;
		}else if(input_request == "Tree 1"){
			return Tree_1;
		}else if(input_request == "Fancy square"){
			return fancy_square;
		}else if(input_request == "Fancy Pseudotriangle"){
			return fancy_pseudotriangle;
		}else if(input_request == "12 edged cycle"){
			return c_11;
		}else if(input_request == "Disconnected"){
			return disconnected;
		}else{
			System.out.printf("Graph not found!(in get_edge_relation)%n");
			return new Edge_Relation(1);
		}
	}
	public int get_number_of_vertexes_in(String input_request){
		if(input_request == "K_4 Snake"){
			return 7;
		}else if(input_request == "K_5 Snake"){
			return 9;
		}else if(input_request == "Windmill with 9 nodes"){
			return 9;
		}else if(input_request == "5 pointed wheel"){
			return 6;
		}else if(input_request == "6 pointed wheel"){
			return 7;
		}else if(input_request == "8 pointed wheel"){
			return 9;
		}else if(input_request == "Fancy crab"){
			return 9;
		}else if(input_request == "Lopsided fancy crab"){
			return 8;
		}else if(input_request == "Fancy fish"){
			return 6;
		}else if(input_request == "Fancy emerald"){
			return 7;
		}else if(input_request == "Weird K_4xK_2"){
			return 8;
		}else if(input_request == "K_4 x K_2"){
			return 8;
		}else if(input_request == "Tree 1"){
			return 13;
		}else if(input_request == "Fancy square"){
			return 5;
		}else if(input_request == "Fancy Pseudotriangle"){
			return 3;
		}else if(input_request == "12 edged cycle"){
			return 12;
		}else if(input_request == "Disconnected"){
			return 6;
		}else{
			System.out.printf("Graph not found!(in get_number_of_vertexes_in)%n");
			return -1;
		}
	}
/*
	This function returns a boolean representing if a graph is a tree or not
*/
	public boolean is_tree(String input_request){
		if(input_request == "K_4 Snake"){
			return false;
		}else if(input_request == "K_5 Snake"){
			return false;
		}else if(input_request == "Windmill with 9 nodes"){
			return false;
		}else if(input_request == "5 pointed wheel"){
			return false;
		}else if(input_request == "6 pointed wheel"){
			return false;
		}else if(input_request == "8 pointed wheel"){
			return false;
		}else if(input_request == "Fancy crab"){
			return false;
		}else if(input_request == "Lopsided fancy crab"){
			return false;
		}else if(input_request == "Fancy fish"){
			return false;
		}else if(input_request == "Fancy emerald"){
			return false;
		}else if(input_request == "Weird K_4xK_2"){
			return false;
		}else if(input_request == "K_4 x K_2"){
			return false;
		}else if(input_request == "Tree 1"){
			return true;
		}else if(input_request == "Fancy square"){
			return false;
		}else if(input_request == "Fancy Pseudotriangle"){
			return false;
		}else if(input_request == "12 edged cycle"){
			return false;
		}else if(input_request == "Disconnected"){
			return false;
		}else{
			System.out.printf("Graph not found!(in is_tree)%n");
			return false;
		}
	}

	public Labeling_Finder_Data(){
		/*
			this corresponds to K_4 snake 
		*/
		k_4_snake_edge_relation_object = new Edge_Relation(12);
			k_4_snake_edge_relation_object.add_relation(0, 1);
			k_4_snake_edge_relation_object.add_relation(0, 2);
			k_4_snake_edge_relation_object.add_relation(0, 6);
			k_4_snake_edge_relation_object.add_relation(1, 2);
			k_4_snake_edge_relation_object.add_relation(1, 6);
			k_4_snake_edge_relation_object.add_relation(6, 2);
			k_4_snake_edge_relation_object.add_relation(3, 4);
			k_4_snake_edge_relation_object.add_relation(3, 2);
			k_4_snake_edge_relation_object.add_relation(3, 5);
			k_4_snake_edge_relation_object.add_relation(4, 2);
			k_4_snake_edge_relation_object.add_relation(4, 5);
			k_4_snake_edge_relation_object.add_relation(5, 2);

		/*
			This responds to the windmil
		*/
		windmill_edge_relation_object = new Edge_Relation(12);
			windmill_edge_relation_object.add_relation(0, 1);
			windmill_edge_relation_object.add_relation(0, 2);
			windmill_edge_relation_object.add_relation(0, 3);
			windmill_edge_relation_object.add_relation(0, 4);
			windmill_edge_relation_object.add_relation(0, 5);
			windmill_edge_relation_object.add_relation(0, 6);
			windmill_edge_relation_object.add_relation(0, 7);
			windmill_edge_relation_object.add_relation(0, 8);
			windmill_edge_relation_object.add_relation(1, 2);
			windmill_edge_relation_object.add_relation(3, 4);
			windmill_edge_relation_object.add_relation(5, 6);
			windmill_edge_relation_object.add_relation(7, 8);

		/*
			This corresponds to the fancy pentagon
		*/
		fancy_pentagon_object = new Edge_Relation(10);
			fancy_pentagon_object.add_relation(0, 1);
			fancy_pentagon_object.add_relation(0, 2);
			fancy_pentagon_object.add_relation(0, 3);
			fancy_pentagon_object.add_relation(0, 4);
			fancy_pentagon_object.add_relation(0, 5);
			fancy_pentagon_object.add_relation(1, 2);
			fancy_pentagon_object.add_relation(2, 3);
			fancy_pentagon_object.add_relation(3, 4);
			fancy_pentagon_object.add_relation(4, 5);
			fancy_pentagon_object.add_relation(5, 1);

		/*
			this is the fancy hexagon
		*/
		fancy_hexagon_object = new Edge_Relation(12);
			fancy_hexagon_object.add_relation(0, 1);
			fancy_hexagon_object.add_relation(0, 2);
			fancy_hexagon_object.add_relation(0, 3);
			fancy_hexagon_object.add_relation(0, 4);
			fancy_hexagon_object.add_relation(0, 5);
			fancy_hexagon_object.add_relation(0, 6);
			fancy_hexagon_object.add_relation(1, 2);
			fancy_hexagon_object.add_relation(2, 3);
			fancy_hexagon_object.add_relation(3, 4);
			fancy_hexagon_object.add_relation(4, 5);
			fancy_hexagon_object.add_relation(5, 6);
			fancy_hexagon_object.add_relation(6, 1);

		/*
			this is the fancy octogon
		*/
		fancy_octagon_object = new Edge_Relation(16);
			fancy_octagon_object.add_relation(0, 1);
			fancy_octagon_object.add_relation(0, 2);
			fancy_octagon_object.add_relation(0, 3);
			fancy_octagon_object.add_relation(0, 4);
			fancy_octagon_object.add_relation(0, 5);
			fancy_octagon_object.add_relation(0, 6);
			fancy_octagon_object.add_relation(0, 7);
			fancy_octagon_object.add_relation(0, 8);
			fancy_octagon_object.add_relation(1, 2);
			fancy_octagon_object.add_relation(2, 3);
			fancy_octagon_object.add_relation(3, 4);
			fancy_octagon_object.add_relation(4, 5);
			fancy_octagon_object.add_relation(5, 6);
			fancy_octagon_object.add_relation(6, 7);
			fancy_octagon_object.add_relation(7, 8);
			fancy_octagon_object.add_relation(8, 1);

		/*
			this is the fancy crab
		*/
		fancy_crab_object = new Edge_Relation(12);
			fancy_crab_object.add_relation(0, 1);
			fancy_crab_object.add_relation(0, 2);
			fancy_crab_object.add_relation(1, 2);
			fancy_crab_object.add_relation(1, 4);
			fancy_crab_object.add_relation(3, 4);
			fancy_crab_object.add_relation(4, 5);
			fancy_crab_object.add_relation(4, 7);
			fancy_crab_object.add_relation(4, 6);
			fancy_crab_object.add_relation(6, 7);
			fancy_crab_object.add_relation(6, 8);
			fancy_crab_object.add_relation(7, 8);
			fancy_crab_object.add_relation(2, 4);

		/*
			this is the lopsided fancy crab
		*/
		lopsided_fancy_crab = new Edge_Relation(12);
			lopsided_fancy_crab.add_relation(0, 1);
			lopsided_fancy_crab.add_relation(0, 2);
			lopsided_fancy_crab.add_relation(1, 2);
			lopsided_fancy_crab.add_relation(2, 3);
			lopsided_fancy_crab.add_relation(3, 4);
			lopsided_fancy_crab.add_relation(1, 3);
			lopsided_fancy_crab.add_relation(0, 4);
			lopsided_fancy_crab.add_relation(3, 5);
			lopsided_fancy_crab.add_relation(3, 6);
			lopsided_fancy_crab.add_relation(6, 7);
			lopsided_fancy_crab.add_relation(5, 6);
			lopsided_fancy_crab.add_relation(5, 7);
		
		/*
			this is the lopsided fancy crab
		*/
		fancy_fish = new Edge_Relation(8);
			fancy_fish.add_relation(0, 1);
			fancy_fish.add_relation(0, 2);
			fancy_fish.add_relation(1, 2);
			fancy_fish.add_relation(2, 3);
			fancy_fish.add_relation(2, 4);
			fancy_fish.add_relation(3, 4);
			fancy_fish.add_relation(3, 5);
			fancy_fish.add_relation(4, 5);

		/*
			this is the fancy emerald derived from K_4 snake
		*/
		fancy_emerald_object = new Edge_Relation(12);
			fancy_emerald_object.add_relation(0, 1);
			fancy_emerald_object.add_relation(0, 2);
			fancy_emerald_object.add_relation(0, 3);
			fancy_emerald_object.add_relation(1, 4);
			fancy_emerald_object.add_relation(1, 3);
			fancy_emerald_object.add_relation(1, 2);
			fancy_emerald_object.add_relation(2, 3);
			fancy_emerald_object.add_relation(2, 5);
			fancy_emerald_object.add_relation(3, 4);
			fancy_emerald_object.add_relation(3, 5);
			fancy_emerald_object.add_relation(6, 4);
			fancy_emerald_object.add_relation(6, 5);

		/*
			this is K_5 snake
		*/
		k_5_snake = new Edge_Relation(20);
			k_5_snake.add_relation(4, 0);
			k_5_snake.add_relation(4, 1);
			k_5_snake.add_relation(4, 2);
			k_5_snake.add_relation(4, 3);
			k_5_snake.add_relation(4, 5);
			k_5_snake.add_relation(4, 6);
			k_5_snake.add_relation(4, 7);
			k_5_snake.add_relation(4, 8);
			k_5_snake.add_relation(0, 1);
			k_5_snake.add_relation(0, 2);
			k_5_snake.add_relation(0, 3);
			k_5_snake.add_relation(1, 2);
			k_5_snake.add_relation(1, 3);
			k_5_snake.add_relation(2, 3);
			k_5_snake.add_relation(8, 5);
			k_5_snake.add_relation(8, 6);
			k_5_snake.add_relation(8, 7);
			k_5_snake.add_relation(5, 6);
			k_5_snake.add_relation(5, 7);
			k_5_snake.add_relation(6, 7);

		/*
			this is C_20
		*/
		c_20 = new Edge_Relation(20);
			c_20.add_relation(0, 1);
			c_20.add_relation(1, 2);
			c_20.add_relation(2, 3);
			c_20.add_relation(3, 4);
			c_20.add_relation(4, 5);
			c_20.add_relation(5, 6);
			c_20.add_relation(6, 7);
			c_20.add_relation(7, 8);
			c_20.add_relation(8, 9);
			c_20.add_relation(9, 10);
			c_20.add_relation(10, 11);
			c_20.add_relation(11, 12);
			c_20.add_relation(12, 13);
			c_20.add_relation(13, 14);
			c_20.add_relation(14, 15);
			c_20.add_relation(15, 16);
			c_20.add_relation(16, 17);
			c_20.add_relation(17, 18);
			c_20.add_relation(18, 19);
			c_20.add_relation(19, 0);
		/*
			this is (an incorrect version of) K_4 x K_2
		*/
		fancy_K_4xK_2 = new Edge_Relation(16);
			fancy_K_4xK_2.add_relation(0,1);
			fancy_K_4xK_2.add_relation(0,3);
			fancy_K_4xK_2.add_relation(0,4);
			fancy_K_4xK_2.add_relation(1,2);
			fancy_K_4xK_2.add_relation(1,3);
			fancy_K_4xK_2.add_relation(3,2);
			fancy_K_4xK_2.add_relation(0,7);
			fancy_K_4xK_2.add_relation(1,5);
			fancy_K_4xK_2.add_relation(2,6);
			fancy_K_4xK_2.add_relation(3,4);
			fancy_K_4xK_2.add_relation(4,5);
			fancy_K_4xK_2.add_relation(4,6);
			fancy_K_4xK_2.add_relation(4,7);
			fancy_K_4xK_2.add_relation(5,6);
			fancy_K_4xK_2.add_relation(5,7);
			fancy_K_4xK_2.add_relation(6,7);
		/*
			this is K_4 x K_2
		*/
		K_4xK_2 = new Edge_Relation(16);
			K_4xK_2.add_relation(0,1);
			K_4xK_2.add_relation(0,3);
			K_4xK_2.add_relation(0,2);
			K_4xK_2.add_relation(1,2);
			K_4xK_2.add_relation(1,3);
			K_4xK_2.add_relation(3,2);
			K_4xK_2.add_relation(0,7);
			K_4xK_2.add_relation(1,5);
			K_4xK_2.add_relation(2,6);
			K_4xK_2.add_relation(3,4);
			K_4xK_2.add_relation(4,5);
			K_4xK_2.add_relation(4,6);
			K_4xK_2.add_relation(4,7);
			K_4xK_2.add_relation(5,6);
			K_4xK_2.add_relation(5,7);
			K_4xK_2.add_relation(6,7);
		/*
			this is Tree 1
		*/
		Tree_1 = new Edge_Relation(12);
			Tree_1.add_relation(0,1);
			Tree_1.add_relation(0,2);
			Tree_1.add_relation(1,3);
			Tree_1.add_relation(1,4);
			Tree_1.add_relation(3,7);
			Tree_1.add_relation(3,8);
			Tree_1.add_relation(4,9);
			Tree_1.add_relation(2,5);
			Tree_1.add_relation(2,6);
			Tree_1.add_relation(5,10);
			Tree_1.add_relation(6,11);
			Tree_1.add_relation(6,12);
		/*
			this is the wheel with 4 spokes
		*/
		fancy_square = new Edge_Relation(8);
			fancy_square.add_relation(0,1);
			fancy_square.add_relation(1,2);
			fancy_square.add_relation(2,3);
			fancy_square.add_relation(3,0);
			fancy_square.add_relation(4,0);
			fancy_square.add_relation(4,1);
			fancy_square.add_relation(4,2);
			fancy_square.add_relation(4,3);
		/*
			this is the fancy triangle with one loop
		*/
		fancy_pseudotriangle = new Edge_Relation(4);
			fancy_pseudotriangle.add_relation(0,0);
			fancy_pseudotriangle.add_relation(0,1);
			fancy_pseudotriangle.add_relation(0,2);
			fancy_pseudotriangle.add_relation(1,2);
		/*
			this is the 12 edged cycle
		*/
		c_11 = new Edge_Relation(12);
			c_11.add_relation(0,1);
			c_11.add_relation(1,2);
			c_11.add_relation(2,3);
			c_11.add_relation(3,4);
			c_11.add_relation(4,5);
			c_11.add_relation(5,6);
			c_11.add_relation(6,7);
			c_11.add_relation(7,8);
			c_11.add_relation(8,9);
			c_11.add_relation(9,10);
			c_11.add_relation(10,11);
			c_11.add_relation(11,0);
		/*
			This is two K_2 s, disconnected
		*/
		disconnected = new Edge_Relation(4);
			disconnected.add_relation(0, 1);
			disconnected.add_relation(1, 2);
			disconnected.add_relation(3, 4);
			disconnected.add_relation(4, 5);
	}

}