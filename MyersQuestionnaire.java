package myersBriggs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyersQuestionnaire {
    public static Scanner collectInput = new Scanner(System.in);
    public static char[] response;
    public static String [] questions;

    public static ArrayList<String> displayQuestions(){
        ArrayList<String> questions = new ArrayList<>();
        questions.add("QuestionPractice 1:\n" +
                 "A:expend energy, enjoy groups\n"
                + "B:conserve energy, enjoy one-on-one");
        questions.add("QuestionPractice 2:\n" +
                "A:interpret literally\n"
                + "B:look for meaning and possibilities");
        questions.add("QuestionPractice 3:\n" +
                "A:logical, thinking, questioning\n"
                + "B:empathetic, feeling, accommodating");
        questions.add("QuestionPractice 4:\n" +
                "A:organized, orderly\n"
                + "B:flexible, adaptable");
        questions.add("QuestionPractice 5:\n" +
                "A:more outgoing, think out loud\n"
                + "B:more reserved, think to yourself");
        questions.add("QuestionPractice 6:\n" +
                "A:practical, realistic, experiential\n"
                + "B:imaginative, innovative, theoretical");
        questions.add("QuestionPractice 7:\n" +
                "A:candid, straight forward, frank\n"
                + "B:tactful, kind, encouraging");
        questions.add("QuestionPractice 8:\n" +
                "A:plan, schedule\n"
                + "B:unplanned, spontaneous");
        questions.add("QuestionPractice 9:\n" +
                "A:seek many tasks, public activities, interaction with others\n"
                + "B:seek private, solitary activities with quiet to concentrate");
        questions.add("QuestionPractice 10:\n" +
                "A:standard, usual, conventional\n"
                + "B:different, novel, unique");
        questions.add("QuestionPractice 11:\n" +
                "A:firm, tend to criticize, hold the line\n"
                + "B:gentle, tend to appreciate, conciliate");
        questions.add("QuestionPractice 12:\n" +
                "A:regulated, structured\n"
                + "B:easygoing, \"live\" and \"let live\"");
        questions.add("QuestionPractice 13:\n" +
                "A:external, communicative, express your\n"
                + "B:internal, reticent, keep to yourself");
        questions.add("QuestionPractice 14:\n" +
                "A:focus on here-and-now\n"
                + "B:look to the future, global perspective, \"big picture\"");
        questions.add("QuestionPractice 15:\n" +
                "A:tough-minded, just\n"
                + "B:tender-hearted, merciful");
        questions.add("QuestionPractice 16:\n" +
                "A:preparation, plan ahead\n"
                + "B:go with the flow, adapt as you go");
        questions.add("QuestionPractice 17:\n" +
                "A:active initiate\n"
                + "B:reflective, deliberate");
        questions.add("QuestionPractice 18:\n" +
                "A:facts, things, \"what is\"\n"
                + "B:ideas, dreams, \"what could be\", philosophical");
        questions.add("QuestionPractice 19:\n" +
                "A:matter of fact, issue-oriented\n"
                + "B:sensitive, people=oriented, compassionate");
        questions.add("QuestionPractice 20:\n" +
                "A:control, govern\n"
                + "B:latitude, freedom");


        return questions;
    }
    public static void userAnswers(){
        questions = displayQuestions().toArray(new String[0]);
        response = new char[questions.length];
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            char allAnswers = collectInput.next().charAt(0);
            response[i] = allAnswers;
        }
    }
    public static void formATableForUserAnswers(){
        String heading = String.format("%8s%8s%8s", " ", "A", "B");
        System.out.println(heading.repeat(4));
        System.out.println();
        System.out.println("=".repeat(100));
    }
    public static void tableForUserAnswers(){
        for(int i = 1; i < questions.length; i += 4){
            System.out.printf("%8d", i);
            if(response[i] == 'A'){
                System.out.printf("%8s%8s", "A", " ");
                }else {
                System.out.printf("%8s%8s", " ", "B");
            }



            System.out.printf("%8d", i + 1);
            if(response[i] == 'A'){

                System.out.printf("%8s%8s", "A", " ");
            } else {
                System.out.printf("%8s%8s", " ", "B");
            }



            System.out.printf("%8d", i + 2);
            if(response[i] == 'A'){
                System.out.printf("%8s%8s", "A", " ");
            } else {
                System.out.printf("%8s%8s", " ", "B");
            }



            System.out.printf("%8d", i + 3);
            if(response[i] == 'A'){
                System.out.printf("%8s%8s", "A", " ");
            } else {
                System.out.printf("%8s%8s", " ", "B");
            }
            System.out.println();
        }
        System.out.println("=".repeat(100));
    }
    public static void sumOfAsAndBsInUserResponse(){
       int totalAs = 0;
       int totalBs = 0;
        String [] personalityEquivalent = new String[4];
        System.out.printf("%8s", "Total");
        for(int i = 0; i < 4; i++){
            if(response[i] == 'A'){
                totalAs++;
            } else {
                totalBs++;
            }if(response[i+1] == 'A'){
                totalAs++;
            } else{
                totalBs++;
            }if(response[i+2] == 'A'){
                totalAs++;
            } else{
                totalBs++;
            }
            if(response[i+3] == 'A'){
                totalAs++;
            } else {
                totalBs++;
            }if(response[i+4] == 'A'){
                totalAs++;
            } else {
                totalBs++;
            }
            System.out.printf("%8d%8d%8s", totalAs, totalBs, " ");

            switch (i){
                case 0:{
                    if(totalAs > totalBs){
                        personalityEquivalent[i] = "E";
                    } else {
                        personalityEquivalent[i] = "I";
                    }
                }
                case 1:{
                    if(totalAs > totalBs){
                        personalityEquivalent[i] = "S";
                    } else {
                        personalityEquivalent[i] = "I";
                    }
                }
                case 2:{
                    if(totalAs > totalBs){
                        personalityEquivalent[i] = "T";
                    } else {
                        personalityEquivalent[i] = "F";
                    }
                }
                case 4:{
                    if(totalAs > totalBs){
                        personalityEquivalent[i] = "J";
                    } else {
                        personalityEquivalent[i] = "P";
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Personality equivalent is:");
        System.out.println(Arrays.toString(personalityEquivalent));
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("PERSONALITY TEST");
        System.out.println("=".repeat(100));
        System.out.println("There are twenty (20) questions. Please the option that best describe you");

        displayQuestions();
        userAnswers();
        formATableForUserAnswers();
        tableForUserAnswers();
        sumOfAsAndBsInUserResponse();





    }
}
