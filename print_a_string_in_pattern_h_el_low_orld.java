public class print_a_string_in_pattern_h_el_low_orld {
    public static void main(String[] args) {
		String str="helloWorld";
		int m=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=m;j++,i++) {
				if(i<str.length()) {
					System.out.print(str.charAt(i));
				}
			}
			m++;i--;
			System.out.println();
		}
	}
}
