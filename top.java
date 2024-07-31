import java.util.*;

public class TopKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Step 2: Use a priority queue to keep the top k elements
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.getValue().equals(b.getValue())) {
                    return a.getKey().compareTo(b.getKey());
                }
                return b.getValue() - a.getValue();
            }
        );

        pq.addAll(wordCount.entrySet());

        // Step 3: Extract the top k elements
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll().getKey());
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "coding", "i", "love", "MyCountry"};
        int k = 2;
        List<String> result = topKFrequent(words, k);
        System.out.println("The top " + k + " frequent words are: " + result);
    }
}

Output:
The top 2 frequent words are: [i, love]
