//3. Write a Java program to find the index of the first occurrence of the character 'a' in the string "Banana".
public class FindIndexOfA {
  public static void main(String[] args) {
    String str = "Banana";
    char targetChar = 'a';
    int index = str.indexOf(targetChar);
    if (index != -1) {
      System.out.println("The first occurrence of '" + targetChar + "' is at index: " + index);
} 
else {
      System.out.println("Character '" + targetChar + "' not found in the string.");
    }
  }
}