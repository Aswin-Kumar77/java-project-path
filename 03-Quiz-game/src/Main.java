import java.util.Scanner;

public static void main(String[] args){
    System.out.println("*************WELCOME*************");
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    int answer = 0;
    int correctanswer = 0;
    for (int i=1 ; i<=5 ; i++ )
    {
        System.out.println("Question NO "+ i);
        if (i==1)
        {
            System.out.println("What does ninja gaiden expel at?");
            System.out.println("1.Story     2.Gameplay     3.Art     4.tactics");
            answer = scanner.nextInt();
            score = reps(answer, 2, score);
        }
        if (i==2)
        {
            System.out.println("Why do people use heaphones?");
            System.out.println("1.immersive       2.no damage for ears       3.dnd       4.all of the above");
            answer = scanner.nextInt();
            score = reps(answer,4,score);
        }
        else if (i==3)
        {
            System.out.println("why is KBM better than controller in Shooters");
            System.out.println("1.raw input       2.has aim assist       3.has axis       4.low accuracy");
            answer = scanner.nextInt();
            score = reps(answer,1,score);
        }
        else if (i==4)
        {
            System.out.println("what type is rock type pokemon weak to");
            System.out.println("1.fire       2.steel       3.ICE       4.Flying");
            answer = scanner.nextInt();
            score = reps(answer,3,score);
        }
        else if (i==5)
        {
            System.out.println("which is the best drink in the morning");
            System.out.println("1.BOOST       2.Horlicks       3.Coke       4.Tea");
            answer = scanner.nextInt();
            score = reps(answer,4,score);
        }
    }
    System.out.println("Score : "+score);
}
public static int reps(int answer, int correctanswer, int score)
{
    if (correctanswer == answer)
    {
        System.out.println("You are Right!");
        score++;
    }
    else
    {
        System.out.println("You are wrong :( ");
    }
    return score;
}
