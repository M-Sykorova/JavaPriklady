/*It's the end of the semester and you got your grades from three classes: Geometry, Algebra, and Physics.

        Create a program that:

        Reads the grades of these 3 classes (Grades range from 0 - 10)
        Calculate the average of your grades
        Example: Geometry = 6, Algebra = 7, Physics = 8
        Output: average_score = 7
The exercise is almost identical to a previous exercise with a minor change. It's the end of the semester and you got your marks from, Geometry, Algebra, Physics classes. If the average score is 7 and above print "Good job!", if the average score is between 6 and 4 print "You need to work harder!", if the average score is below 4 print "Failed, you really need to work harder!".

        Create a program that:

        Reads the values of these 3 lessons
        Calculate the average of your grades
        Example: Geometry = 6, Algebra = 7, Physics = 8
        Output: Your average score is 7, Good job!"

 */

package sk.macuska.project.easy_exercises;

import java.util.Scanner;

public class GradesEx2Ex9 {
    public static void main(String[] args) {
        int geometry = 0;
        int algebra = 0;
        int physics = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj znamky z predmetu geometria: ");
        geometry = scanner.nextInt();
        System.out.println("Zadaj znamky z predmetu algebra: ");
        algebra = scanner.nextInt();
        System.out.println("Zadaj znamky z predmetu fyzika: ");
        physics = scanner.nextInt();

        System.out.println("Geometry = " + geometry);
        System.out.println("Algebra = " + algebra);
        System.out.println("Physics = " + physics);



        int average = (geometry + algebra + physics) / 3;
        System.out.println("priemerne_skore = " + average);
        if(average >= 7 ){
            System.out.println("Dobra praca!");
        } else if(average >= 4 && average <= 6){
            System.out.println("Musite tvrdsie pracovat!");
        } else if(average > 0 && average < 4) {
            System.out.println("Nepodarilo sa, naozaj musite pracovat tvrdsie!");
        }
    }
}

