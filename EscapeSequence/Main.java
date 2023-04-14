/*
 * 
 * Escape sequences are used to signal an alternative interpretation of a 
 * series of characters. 
 * In Java, a character preceded by a backslash (\) is an escape sequence.
 * 
 */

public class Main {
        public static void main(String[] args) {
                // \n Insert a newline in the text at this point.
                System.out.println("My name is Fahim");
                System.out.println(
                                "I am Fahim. I am currenty a student at United International University. I am currently in my final year of my undergraduate life. I like to play video games, listen to music. I have two computers. One is my Desktop which is my workstation, and the other one is my laptop which I use for the portability. Hey, that's me!");
                System.out.println(
                                "I am Fahim.\nI am currenty a student at United International University.\nI am currently in my final year of my undergraduate life.\nI like to play video games, listen to music.\nI have two computers.\nOne is my Desktop which is my workstation, and the other one is my laptop which I use for the portability.\nHey, that's me!");

                // \b Insert a backspace in the text at this point.
                System.out.println("My name is Fahim\b Bin Amin");

                System.out.println("My name is Fahim\b Bin\b Amin\b");
                /*
                 * The output contains the string "My name is Fahim Bin Amin", with three
                 * backspace escape sequences represented by "\b" in between each word.
                 * When a backspace escape sequence "\b" is encountered, it moves the cursor one
                 * character back to the left in the output, without erasing any characters.
                 * So in this case, each backspace sequence moves the cursor back to the
                 * previous character, but does not erase it.
                 * Therefore, the final output has all the characters from the original string,
                 * but the cursor position has been moved back three times due to the backspace
                 * escape sequences.
                 */
                System.out.println("My name is Fahim\b Bin\b Amin\b ");

                /*
                 * The reason why there is a difference in output between the two code snippets
                 * is due to the presence of a space at the end of the second string,
                 * after the last escape sequence "\b".
                 * 
                 * In the first code snippet, there is no space after the last "\b" escape
                 * sequence. Therefore, when the last "\b" is encountered,
                 * it moves the cursor back to overwrite the letter "n" with "i", but it does
                 * not overwrite any additional characters since there are no characters
                 * after the last "\b". As a result, the final output has the name spelled as
                 * "Amin".
                 * 
                 * In the second code snippet, the last character in the string is a space,
                 * so when the last "\b" escape sequence is encountered, it moves the cursor
                 * back one character to overwrite the letter "n" with "i",
                 * but then it also moves the cursor back again to overwrite the space with a
                 * blank character. As a result, the final output has the name
                 * spelled as "Ami" instead of "Amin".
                 */

                /*
                 * In most code editors, tabs are not the same as 2 spaces or 4 spaces by
                 * default. A tab is stored differently than spaces in the code.
                 * Tabs can be seen as a big “jump” in the text, while spaces are always 1 space
                 * each.
                 */

                // \t Insert a tab in the text at this point.
                System.out.println(
                                "I love  Video Games  Animation Music  Movies  TV Series  Books  Programming  Travelling  Sports  Food  and  Games");

                System.out.println(
                                "I love\tVideo Games\tAnimation\tMusic\tMovies\tTV Series\tBooks\tProgramming\tTravelling\tSports\tFood\tand\tGames");

                // \r Insert a carriage return in the text at this point.
                System.out.print("Hello, world!\r");
                System.out.print("Goodbye");

                /*
                 * This is because the "\r" escape sequence moves the cursor back to the
                 * beginning of the current line, but it does not erase any characters that
                 * were previously printed. Therefore, when the second print statement is
                 * executed,
                 * it overwrites the "Hello" that was already printed on the same line with
                 * "Goodbye",
                 * but it does not remove the comma and the space that were printed by the first
                 * print
                 * statement.
                 */

                /*
                 * More details:
                 * ---------------
                 * The "\r" escape sequence in Java is called a "carriage return".
                 * When Java encounters "\r" in a string that is being printed to the console,
                 * it moves the cursor back to the beginning of the current line.
                 * 
                 * 
                 * For example, if you print the string "Hello, world!\r" to the console,
                 * the cursor will move back to the beginning of the line after printing
                 * "Hello, world!".
                 * Then, anything that you print after the "\r" will overwrite what was already
                 * printed
                 * on that line.
                 * 
                 * 
                 * In the example you provided, the first print statement prints "Hello, world!"
                 * to the console. The "\r" escape sequence then moves the cursor back to the
                 * beginning of the line. The second print statement then prints "Goodbye" to
                 * the console,
                 * which overwrites the "Hello" that was already printed on that line. However,
                 * the comma
                 * and the space that were printed by the first print statement are still
                 * present.
                 * 
                 * 
                 * Therefore, the final output is "Goodbyeworld!" without the comma and the
                 * space.
                 * This is because the "\r" escape sequence moved the cursor back to the
                 * beginning of
                 * the line, but it did not erase any characters that were already printed on
                 * that line.
                 */

                /*
                 * This is because the "\r" escape sequence moves the cursor back to the
                 * beginning of the current line, but it does not erase any characters
                 * that were previously printed. Therefore, when the second print statement
                 * is executed, it overwrites the "Hello" that was already printed on the same
                 * line with "Goodbye", but it does not remove the comma and the space that were
                 * printed by the first print statement.
                 */
                System.out.print("Goodbye ");
                System.out.print("Goodbye  ");

                // \f Insert a form feed in the text at this point.

                /*
                 * The "\f" escape sequence in Java is called a "form feed". When Java
                 * encounters "\f" in
                 * a string that is being printed to the console, it moves the cursor to the
                 * beginning of
                 * the next page or screen.
                 */
                System.out.println();
                System.out.println("Page 1");
                System.out.println("\f");
                System.out.println("Page 2");

                /*
                 * Output
                 * ----------
                 * Page 1
                 * 
                 * 
                 * Page 2
                 */

                // In this example, we use the "\f" escape sequence to
                // simulate the printing of two pages of output.

                /*
                 * Here's how the output was produced:
                 * 
                 * The first System.out.println statement prints the string "Page 1" to the
                 * console,
                 * followed by a newline character which moves the cursor to the beginning of
                 * the next
                 * line.
                 * 
                 * The second System.out.println statement contains only the "\f" escape
                 * sequence,
                 * which moves the cursor to the beginning of the next page or screen.
                 * 
                 * The third System.out.println statement prints the string "Page 2" to the
                 * console,
                 * but because the cursor was moved to the beginning of the next page by the
                 * "\f"
                 * escape sequence, the "Page 2" string is printed on a new page.
                 * 
                 * So, we end up with the output "Page 1" on the first page,
                 * followed by a form feed which moves the cursor to the beginning of the next
                 * page,
                 * and then "Page 2" is printed on the second page.
                 */

                // \' Insert a single quote character in the text at this point.
                System.out.println("I\'m Fahim");

                String message = "He said, \"I'm coming home.\"";
                String quote = "\'";
                System.out.println(message);
                System.out.println("The single quote character is represented by " + quote + " in Java.");

                /*
                 * In this example, we use the "'" escape sequence to represent a single quote
                 * character within a string, and then print a message to the console that
                 * includes
                 * the single quote character.
                 * 
                 * Here's how the output was produced:
                 * 
                 * The first line of the main method creates a string variable message that
                 * contains a
                 * message with a single quote character within double quotes. This is allowed
                 * because
                 * the single quote character is escaped with a backslash.
                 * 
                 * The second line of the main method creates a string variable quote that
                 * contains
                 * only the "'" escape sequence, which represents a single quote character in
                 * Java.
                 * 
                 * The third line of the main method prints the message string to the console.
                 * 
                 * The fourth line of the main method prints a message to the console that
                 * includes
                 * the quote string. This demonstrates how the "'" escape sequence can be used
                 * to
                 * represent a single quote character within a string.
                 */

                // \" Insert a double quote character in the text at this point.
                System.out.println("I said, \"I'm coming home.\"");

                // \\ Insert a backslash character in the text at this point.
                System.out.println("C:\\Users\\Fahim\\Desktop\\Main.java");
                System.out.println("I am using double backslash \\\\ to print a single backslash in Java.");
        }
}