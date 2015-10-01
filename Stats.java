
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Stats {
	static String[] names;
	public static Map<String, Integer> win() {
		String test;
		int win1 = 1;
		String[] winners;
		Map<String,Integer> map = new HashMap<String,Integer>();
		File file = new File("lab14inputfile.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			int i;
			while((test = reader.readLine()) != null) {
				names = test.split(" vs. ");

				char win = ((names[0].charAt(0)));
				names[0] = names[0].substring(2,names[0].length() - 1);
				if(win == '0') {
					winners = names[1].split(" ");
					for(i = 0; i < winners.length; i++) {
						if(map.get(winners[i]) != null) {
							win1 += map.get(winners[i]);
							map.put((winners[i]), win1);
							win1 = 1;
						}
						else {
							map.put((winners[i]),win1);
						}
					}
				}
				else if(win == '1') {
					winners = names[0].split(" ");
					for(i = 0; i < winners.length; i++) {
						if(map.get(winners[i]) != null) {
							win1 += map.get(winners[i]);
							map.put((winners[i]), win1);
							win1 = 1;
						}
						else {
							map.put((winners[i]),win1);
						}
					}
				}
			} 		reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return map;
	}
	public static String winner(Map<String, Integer> a) {
		int max = 0;
		String winner = null;
		for(Object s : a.keySet()) {
			int b = (int) a.get(s);
			if(b > max) {
				max = b;
				winner = (String) s;
			}
		}
		return winner;
	}
	public static void main(String[] args) {
		Map<String, Integer> a = win();
		String b = winner(a);
		System.out.print(b);
	}
}
