import java.util.TreeSet;

public class RemoveGreaterThan {
    public static void main(String[] args) {
        // Create a TreeSet and add some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(10);

        // Specified element
        int specifiedElement = 6;

        // Display the original TreeSet
        System.out.println("Original TreeSet: " + treeSet);

        // Remove all elements greater than the specified element
        treeSet = (TreeSet<Integer>) treeSet.headSet(specifiedElement, true);

        // Display the TreeSet after removal
        System.out.println("TreeSet after removing elements greater than " + specifiedElement + ": " + treeSet);
    }
}
