package javasweeftsecondsteptasks.tasks;

public class Fifth {
	
	/* პრობლება:
	გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით. დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
	Int countVariants(Int stearsCount);
	*/
	
	/* გადაწყვეტა:
	1 სართულზე - 1 ვარიანტი (1 ბიჯით)
	2 სართულზე - 2 ვარიანტი (1-1, 2 ბიჯით)
	3 სართულზე - 3 ვარიანტი (1-1-1,1-2,2-1 ბიჯით)
	4 სართულზე - 5 ვარიანტი (1-1-1-1, 2-2, 1-1-2, 2-1-1, 1-2-1 ბიჯით)
	
	თანმიმდევრობა გაგრძელდება ფიბონაჩის მიმდევრობით, სადაც პირველი და მეორე წევრები შესაბამისად 1 და 2 არიან,
	ხოლო მესამე წევრიდან დაწყებული ყველა მომდევნო წევრი, წინა ორი წევრის ჯამის იქნება.
	შესაბამისაც n სართულზე ასვლის ვარიანტი იქნება (n-2) და (n-1) საფეხურებზე ასასვლელი ვარიანტების ჯამი.
	
	*/
	
	// main მეთოდში დატესტვისას countVariants მეთოდი იყო სტატიკური
	public int countVariants(int stearsCount) {
		
		// როგორც ავღნიშნეთ 1-ს შემთხვევაში მხოლოდ 1 ვარიანტია, ხოლო 2-ის შემთხვევაში 2. თუ შემოტანილი რიცხვი ამ ორიდან რომელიმე იქნება,
		// აქვე დაუბრუნდება პასუხი, რადგაც მინიმუმ ორი რიცხვის ხელოვნურად განსაზღვრა გვიწევს, რომ მათი ჯამით შევქმნათ შემდეგი.
		if(stearsCount == 1) return 1;
		if(stearsCount == 2) return 2;
		
		// ვამატებთ ცვლადებს, და პირველ ორ ცვლადად 1-იანს და 2-იანს ვიღებთ(ვარიანტების შესაბამისად, ხოლო current ცვლადში ჩავწერთ ფიბონაჩის მიმდევრობით
		// მიღებულ რიცხვებს, სანამ for ციკლში მოცემული მთვლელი(i) არ გაუტოლდება stearsCount-ს;
		int current = 0;
		int prev1 = 2;
		int prev2 = 1;
		
		// i-ს ვიწყებთ 3-იდან, რადგან პირველი ორი ციფრი ხელოვნურად განვსაზღვრეთ.
		for(int i = 3; i <= stearsCount; i++) {
			
			// current ცვლადში ჩაიწერება წინა ორი წევრის ჯამი.
			current = prev1 + prev2;
			prev2 = prev1;
			prev1 = current;
			
		}
		
		return current;
		
	}
	
	public static void main(String[] args) {
		
//		System.out.println(countVariants(1));  // -> 1
//		System.out.println(countVariants(2));  // -> 2
//		System.out.println(countVariants(3));  // -> 3
//		System.out.println(countVariants(4));  // -> 5
//		System.out.println(countVariants(5));  // -> 8
		
	}

}
