import java.io.*;
import java.util.*;
class QuizEvaluation{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\033[H\033[2J"); // Escape Sequence to Clear Terminal Screen
            System.out.println("\n\n\n\t\t\t\t\t\t\t\t\t\t\tJAVA QUIZ");
            System.out.println("STUDENT DETAILS");
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Roll No: ");
            int rollno=sc.nextInt();
            System.out.print("SAPID: ");
            int sapid=sc.nextInt();
            int i=0, ctr=0;
            Random random = new Random();
            try {
                System.out.print("\033[H\033[2J"); // Escape Sequence to Clear Terminal Screen
                int questionset=random.nextInt(1,5);
                System.out.println(questionset);
                File Obj = new File(questionset+".txt");
                Scanner Reader = new Scanner(Obj);
                String answers=Reader.nextLine();
                while (Reader.hasNextLine()) {
                    String data = Reader.nextLine();
                    if(data.startsWith(" ")){
                        char choice;
                        System.out.print("\nYour Answer: ");
                        choice=sc.next().charAt(0);
                        if(choice==answers.charAt(i)){
                            ctr++;
                        }
                        i++;
                        System.out.print("\033[H\033[2J"); // Escape Sequence to Clear Terminal Screen
                    }
                    else
                    System.out.println(data);
                }
                Reader.close();
                System.out.println("Name: "+name);
                System.out.println("Roll No: "+rollno);
                System.out.println("SAPID: "+sapid);
                System.out.println("Score: "+ctr);
            }
            catch (FileNotFoundException e) {
                System.out.println("An error has occurred.");
                e.printStackTrace();
            }
            try {
                FileWriter Writer = new FileWriter("results.txt", true);
                Writer.append("Name: "+name+"\n");
                Writer.append("Roll No: "+rollno+"\n");
                Writer.append("SAPID: "+sapid+"\n");
                Writer.append("Score: "+ctr+"\n\n\n");
                Writer.close();
            }
            catch (IOException e) {
                System.out.println("An error has occurred.");
                e.printStackTrace();
            }
        }
    }
}