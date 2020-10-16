package quizapp;

public class Game {
	Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is the Strongest Avenger?","What is Captain America’s shield made of?","Before becoming Vision, what is the name of Iron Man’s A.I. butler?"};
    String[] options1={"Ironman","Adamantium","H.O.M.E.R."};
    String[] options2={"Thor","Vibranium","A.L.F.R.E.D."};
    String[] options3={"Hulk","Promethium","M.A.R.V.I.N."};
    String[] options4={"Dr Strange","Carbonadium","J.A.R.V.I.S."};
    int[] answers={2,2,4};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }


        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Right Answer!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Wrong");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);


    }}
