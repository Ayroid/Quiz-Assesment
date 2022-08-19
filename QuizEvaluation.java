import java.io.*;
import java.util.*;
class QuizEvaluation{
    public static void main(String[] args) {
        char arr[]={'a','b'};
        int i=0, ctr=0;
        try {
            File Obj = new File("Questions.txt");
            Scanner sc=new Scanner(System.in);
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                if(data.startsWith(" ")){
                    char choice;
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