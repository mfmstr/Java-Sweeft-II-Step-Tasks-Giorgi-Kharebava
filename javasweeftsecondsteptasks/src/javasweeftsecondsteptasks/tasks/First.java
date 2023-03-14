package javasweeftsecondsteptasks.tasks;

import java.util.HashMap;
import java.util.Map;

public class First {
	
	/* პრობლება:
	გვაქვს მთელი რიცხვების ჩამონათვალი სადაც  ერთის გარდა ყველა რიცხვი  მეორდება, 
	იპოვეთ ის რიცხვი რომელიც არ მეორდება.int singleNumber(int[] nums)
	*/
	
	/* გადაწყვეტა:
	შევქმნით HashMap-ს, რომელსაც key და value ექნება ორივე ინტეჯერი. key-ში ჩაიწერება მასივიდან ამოღებული რიცხვი,
	ხოლო value დაითვლის თუ რამდენჯერ მოხდა ამ ციფრის ჩაწერა. მოგეხსენებათ Hashmap არ გვაძლევს key-ს გამეორების 
	საშუალებას, შესაბამისად დავაბრუნებთ იმ რიცხვს, რომლის value-ც იქნება 1, ანუ 1-ხელ მოხდება HashMap-ში ჩაწერა.
	შესაბამისად ეს რიცხვი იქნება უნიკალური.
	*/
	
	
	// main მეთოდში დატესტვისას singleNumber მეთოდი იყო სტატიკური
	public int singleNumber(int[] nums) {
		
		// შევქმენით HashMap
	    Map<Integer, Integer> frequency = new HashMap<>();
	    
	    // ვითვლით რიცხვების მოხვედრის სიხშირეს frequency HashMap-ში.
	    for (int num : nums) {
	        frequency.put(num, frequency.getOrDefault(num, 0) + 1);
	    }
	    
	    // ვეძებთ რიცხვს, რომლის HashMap-ში მოხვედრის სიხშირე 1-ის ტოლია, ანუ უნიკალურია. 
	    for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
	        if (entry.getValue() == 1) {
	            return entry.getKey();
	        }
	    }
	    
	    // იმ შემთხვევაში თუ მასივში უნიკალური ციფრი/რიცხვი არ იქნება, გავისვრით IllegalArgumentException-ს;
	    throw new IllegalArgumentException("მასივში უნიკალური ციფრი/რიცხვი არ მოიძება.");
	
	}
	
	
	public static void main(String[] args) {
		
		
		// int[] nums = {40, 40, 50, 50, 5, 12, 13, 13, 5}; // --> 12
		// int[] nums = {1}; // --> 1
		// int[] nums = {11, 11, 12, 12, 5, 0, -10, 0, 5, -10, 5};// --> ისვრის ექსეფშენს: მასივში უნიკალური ციფრი/რიცხვი არ მოიძება.
		// System.out.println(singleNumber(nums));
		// ერთზე მეტი უნიკალური რიცხვის შემთხვევაში, HashMap ამოიღებს რომელიმე 1-ს.
	}

}
