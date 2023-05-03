public class ANSIcolor
{
    // Also, if you wish to change the background color of the text to a different color, you could try the following as well:
    	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	public static final String ANSI_RESET = "\u001B[0m";
    	public static final String ANSI_BLACK = "\u001B[30m";
    	public static final String ANSI_RED = "\u001B[31m";
    	public static final String ANSI_GREEN = "\u001B[32m";
    	public static final String ANSI_LIGHT_YELLOW = "\u001B[93m";
    	public static final String ANSI_YELLOW = "\u001B[33m";
    	public static final String ANSI_BLUE = "\u001B[34m";
    	public static final String ANSI_UNDERLINE = "\u001B[4m";
    	public static final String ANSI_PURPLE = "\u001B[35m";
    	public static final String ANSI_CYAN = "\u001B[36m";
    	public static final String ANSI_WHITE = "\u001B[37m";
    	public static final String ANSI_STOP_UNDERLINE = "\u001B[24m";
    	public static final String ANSI_BLINK = "\u001B[5m";
    
	public static void main(String[] args) {
		System.out.println(ANSI_BLACK_BACKGROUND+"Hello World");
		System.out.println(ANSI_RED_BACKGROUND+"Hello World");
		System.out.println(ANSI_GREEN_BACKGROUND+"Hello World");
		System.out.println(ANSI_YELLOW_BACKGROUND+"Hello World");
		System.out.println(ANSI_BLUE_BACKGROUND+"Hello World");
		System.out.println(ANSI_PURPLE_BACKGROUND+"Hello World");
		System.out.println(ANSI_CYAN_BACKGROUND+"Hello World");
		System.out.println(ANSI_WHITE_BACKGROUND+"Hello World");
		System.out.println(ANSI_RESET+"Hello World");
		System.out.println(ANSI_BLACK+"Hello World");
		System.out.println(ANSI_RED+"Hello World");
		System.out.println(ANSI_GREEN+"Hello World");
		System.out.println(ANSI_LIGHT_YELLOW+"Hello World");
		System.out.println(ANSI_YELLOW+"Hello World");
		System.out.println(ANSI_UNDERLINE+"Hello World");
		System.out.println(ANSI_STOP_UNDERLINE+"Hello World");
		System.out.println(ANSI_BLINK+"Hello World");
		System.out.println(ANSI_RESET+"Hello World");
	}
}
