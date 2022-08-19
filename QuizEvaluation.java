import java.io.*;
import java.util.*;
class QuizEvaluation{
    public static void main(String[] args) {
        char arr[]={'b','b','b','d','d','d','c','c','b','a','c','c','a','b','c','b','a','a','b','a'};
        int i=0, ctr=0;
        try {
            File Obj = new File("Questions.txt");
            Scanner sc=new Scanner(System.in);
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
                }
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