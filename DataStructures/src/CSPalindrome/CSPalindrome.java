package CSPalindrome;

public class CSPalindrome {

	public static void main(String[] args) {
		 String words = "Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, "
	                + "Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, "
	                + "Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned.";

	        words = words.replaceAll("\\s", "");
	        words = words.replaceAll("[^a-zA-Z0-9]", "");

	        System.out.println(isPalindrome(words));
	    }

	    public static boolean isPalindrome(String words) {
	        CSStack.LinkedStack<Character> theStack = new CSStack.LinkedStack<>();
	        CSQueue.LinkedQueue<Character> theQueue = new CSQueue.LinkedQueue<>();
	        char a;
	        char b;
	        char[] chars = words.toCharArray();

	        for (char aChar : chars) {
	            aChar = Character.toLowerCase(aChar);
	            theStack.push(aChar);
	            theQueue.enqueue(aChar);
	        }

	        while (!theStack.isEmpty()) {
	            a = (char) theStack.pop();
	            b = (char) theQueue.dequeue();
	            if (a != b) {
	                return false;
	            }
	        }
	        return true;

	    
	}

}
