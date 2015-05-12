
public class Scrambler {
	public static String Scramble(String input)
	{
		String[] words = input.split(" ");
		if(words.length == 0)
			return "";
		StringBuilder output = new StringBuilder();
		for(String word : words)
		{
			if(word.length() <= 2) {
				output.append(word);
			}
			else {
				output.append(word.charAt(0));
				StringBuilder reverse = new StringBuilder(word.substring(1, word.length() - 1));
				reverse.reverse();
				output.append(reverse);
				output.append(word.charAt(word.length() - 1));
			}
			output.append(" ");
		}
		return output.substring(0, output.length() - 1);
	}
}
