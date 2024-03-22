package Exam;

import java.util.Scanner;

public class Assesment {
    public static void main(String[] args) {
        //Q1
        int[] oddArray = {1, 2, 3, 4, 5, 6};
        String getOddNumbers = extractOddNumber(oddArray);
        System.out.println(getOddNumbers);

        //Q2
        int[] sumOfArray = {15, 35, 25, 1};
        int total = getSum(sumOfArray);
        System.out.println(total);

        //Q3
        double[] avgOfArray = {10, 23, 30, 59};
        double average = getAvg(avgOfArray);
        System.out.println(average);

        //Q4
        int randomNum = randomNumber(6);
        System.out.println(randomNum);

        //Q5
        double getEvenNumbers = addEvenNumbers(avgOfArray);
        System.out.println(getEvenNumbers);

        //Q6
        int cube = volumeOfCube(10, 3);
        System.out.println(cube);

        //Q7
        int sentence = numbersOfTimesAWordsIsSeen("Last Lasso La La La", "La");
        System.out.println(sentence);

        //Q8

        //Q9

        //Q10;
        answerQuestion();





    }

    //Q1
    private static String extractOddNumber(int[] oddArray) {
        StringBuilder allOddNumber = new StringBuilder();
        {
            for (int arrayNums : oddArray) {
                if (arrayNums % 2 != 0) {
                    allOddNumber.append(arrayNums).append(" ");
                }
            }
        }
        return allOddNumber.toString();
    }

    //Q2
    public static int getSum(int[] sum) {
        int start = 0;
        for (int numArray : sum) {
            start += numArray;
        }
        return start;
    }

    //Q3
    public static double getAvg(double[] avg) {
        double start = 0;

        for (double arrayNum : avg) {
            start += arrayNum;
        }
    return start / avg.length;
    }

    //Q4
    public static int randomNumber(int noZero) {
        int randomizer = (int) (Math.random() * noZero) + 1;
        return randomizer;
    }

    //Q5
    public static double addEvenNumbers(double[] numbers){
        double start =0;
        for (double arrayNum : numbers) {
            if (arrayNum % 2 == 0) {
                start += arrayNum;
            }
        }
        return start;
    }

    //Q6
    public static int volumeOfCube(int edge, int exponent){
        int  volume = (int) + Math.pow(edge,exponent);
        return volume;
    }

    //Q7
    public static int numbersOfTimesAWordsIsSeen(String mySentence, String wordCount) {
        String[] myAnswer = mySentence.split("\\s");
        int howMany = 0;
        for (String words : myAnswer) {
            if (words.equals(wordCount)) howMany++;
        }
        return howMany;
    }

    //Q8


    //Q9


    //Q10
    public static String answerQuestion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Now Serving Customer Number:");
        int inputTicketNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enjoy your trip to:");
        String inputDestinationName = scan.next();
        scan.nextLine();

        scan.close();
        return inputTicketNumber + inputDestinationName;
    }

}
