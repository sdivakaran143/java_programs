
public class to_check_the_given_string_is_isomorphic_or_not {
	
	public static void isisomorpic( String str ){
		str+=" ";
		int res=0;
		for(int i=1;i<str.length()-1;i++) {
			if(str.charAt(i+1)==str.charAt(i)){
					res=1;break;
				}else if(str.charAt(i-1)==str.charAt(i)&&str.charAt(i+1)==str.charAt(i)) {
					res=1;break;
					}else {
					res=0;			
				}
		}
		if(res==1) {
			System.out.println(str+" is isomorphic");
		}
		else {
			System.out.println(str+" is not isomorphic");
		}
	}
	public static void main(String[] args) {
		isisomorpic("abcdeffuilfh");
	}

}
