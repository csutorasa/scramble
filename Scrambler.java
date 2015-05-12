
public class Scrambler {
	public static String Scramble(String input)
	{
		if(input.length() <= 2)
			return input;
		String[] words = input.split(" ");
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
