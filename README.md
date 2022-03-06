The intent of this program is as follows:

There are two fundamental steps- graph generation, and labeling finder.

The graph generation aspect should iteratively generate each regular graph (with loops) of a given size, then hand this graph over to the labeling finder project.

There are two basic parts of the LabelingFinder project. The first part of this project is fundamentally holding a graph object in java. The second part is calculating a derived edge labeling based off of a vertex labeling. (To change the function that determines the edge labeling, it is as simple as editing the calculate_value() method inside of the Edge object.

The project will be used to test all possible labelings, and as such it is multithreaded based off of the labeling set. The method that the program uses to determine which thread does what is simple. Each thread fixes the last vertex in the vertex set to a unique member of the labeling set. It then saves it's results (if it finds a valid rainbow labeling) to a file that is named relevantly.