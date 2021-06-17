package week1.day2;

public class CharOccuranceAss1 {

	public static void main(String[] args) {

		// find the occurrence of 'e' in the given string "Welcome to Chennai"

		String inputStr = "Welcome to Chennai";

		char findOccurance = 'W';

		int countOccur = 0;

		char[] charArray = inputStr.toCharArray();

		int charLength = inputStr.toCharArray().length;

		for (int i = 0; i < charLength; i++) {

			if (charArray[i] == findOccurance) {

				countOccur++;
			}

		}
		System.out.println("occurrence of char " + findOccurance + " is " + countOccur);

	}

}
/* Char array for reference
        String test = "Happy Days Ever-for us";
        
        int len = test.length();
        System.out.println("Length :"+len);
        int position = test.indexOf('s'); // first occurence
        System.out.println("position:"+position );
        int lastInd = test.lastIndexOf('s');
        System.out.println("lastInd:"+lastInd);
        char ch = test.charAt(10);
        System.out.println(" ch:"+ ch);
        
        
        char[] chArr=test.toCharArray();
        
        
        System.out.println(" Char Array");
        for (int i = 0; i < chArr.length; i++) {
            System.out.println("chArr["+i+"]: " + chArr[i]);
        }
 */
