import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Advent {
	String filePath = "coded.txt"; 
	String number_word[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; 
	Map<String, Integer> number_map = create_map();
	
	public Map<String, Integer> create_map() {
        Map<String, Integer> number_map = new HashMap<>();
        for(int i = 0; i < number_word.length; i++) {
        	number_map.put(number_word[i], i+1); 
        }
        return number_map; 
	}
	public String convert_words_numeric(String code) {
		StringBuilder ans = new StringBuilder(); 
		int length = code.length(), current_start_ind = 0; 
		String current;
		char digit; 
		for(int i = 0; i < length; i++) {
			current = code.substring(current_start_ind, i+1); 
			digit = current.charAt(current.length()-1);
			if(isDigit(digit)) {
				ans.append(String.valueOf(digit)); 
				current_start_ind = i+1; 
			}
			else {
				for(String s : number_map.keySet()) {
					if(current.contains(s)) {
						ans.append( number_map.get(s)); 
						current_start_ind = i; 
					}
				}
			}
		}
		return ans.toString();
	}
	
	public boolean isDigit(char c) {
		return c >= '0' && c <= '9'; 
	}
	public List<String> read_file(){
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return lines; 
	}
	public String get_digit(String code) {
		String ans = ""; 
		int length = code.length(), left_ind = 0, right_ind = length-1; 
		while(left_ind < length) {
			if(isDigit(code.charAt(left_ind++))) {
				ans += code.charAt(--left_ind); 
				break;
			}
		}
		while(right_ind >= 0) {
			if(isDigit(code.charAt(right_ind--))) {
				ans += code.charAt(++right_ind);
				break;
			}
		}
		return ans; 
	}
	
	public void day_1() {
		long tot = 0, curr = 0; 
		List<String> lines = read_file();
		if(lines != null) {
			for(String s : lines) {
				curr =  Integer.valueOf(get_digit(s));
				System.out.printf("%s,  %d\n", s, curr);
				tot += curr; 
			}
		}
		System.out.println(tot);
	}
	
	public void day_1_part2() {
		long tot = 0, curr = 0; 
		List<String> lines = read_file();
		if(lines != null) {
			for(String s : lines) {
				curr =  Integer.valueOf(get_digit(convert_words_numeric(s)));
				System.out.printf("%s,  %d\n", s, curr);
				tot += curr; 
			}
		}
		System.out.println(tot);
	}
	
}
