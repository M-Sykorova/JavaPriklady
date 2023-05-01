/*You've consumed X amount of Mbps on Wikipedia and Y amount of Mbps on memes. The cost of visiting Wikipedia is 0,10$ per Mb and the cost for watching memes is 0,05$ per Mb. If total consumption is more than 100$ print "Too much consumption". If watching meme consumption is greater than reading wikipedia consumption print "WOW MANY MEMES", "SUCH LOL"(in new line).

        Create a program that:

        Reads X(wikipedia Mb consupmtion) and Y(watching meme Mb consumption)
        Calculates the total consumption
        If total consumption greater than 100$ print proper message
        If watching meme consumption is greater than reading wikipedia articles print proper messages
        Warning! For the greater meme consumption you will use one print statement and the output must be in seperate lines

 */

package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class MbpsConsumptionEx12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj kolko dat si minul na wikipedii: ");
        float x = (scanner.nextFloat()) * 0.10f;
        System.out.println("Zadaj kolko dat si minul na memecka: ");
        float y = (scanner.nextFloat()) * 0.05f;

        float sum = y + x;
        System.out.println(sum);

        if(sum > 100){
            System.out.println("Too much consumption");
            if(y > x){
                System.out.println("WOW MANY MEMES\nSUCH LOL");
            }
        }
    }
}
