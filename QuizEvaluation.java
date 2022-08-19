import java.io.*;
import java.util.*;
class QuizEvaluation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("\033[H\033[2J"); // Escape Sequence to Clear Terminal Screen
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t\tJAVA QUIZ\n Enter a number to Start!");
        int x=sc.nextInt();
        char arr[]={'b','b','b','d','d','d','c','c','b','a','c','c','a','b','c','b','a','a','b','a'};
        int i=0, ctr=0;
        try {
            System.out.print("\033[H\033[2J"); // Escape Sequence to Clear Terminal Screen
            File Obj = new File("Questions.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                if(data.startsWith(" ")){
                    char choice;
                    System.out.print("\nYour Answer: ");
                    choice=sc.next().charAt(0);
                    if(choice==arr[i]){
                        ctr++;
                    }
                    i++;
                    System.out.print("\033[H\033[2J"); // Escape Sequence to Clear Terminal Screen
                }
                else
                System.out.println(data);
            }
            Reader.close();
            System.out.println("Your Score: "+ctr);
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}