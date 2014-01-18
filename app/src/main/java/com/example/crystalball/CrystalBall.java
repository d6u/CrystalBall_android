package com.example.crystalball;

import java.util.Random;

/**
 * Created by daiweilu on 1/14/14.
 */
public class CrystalBall {
    public String getAnAnswer() {

        String[] answers = {
                "It is certain",
                "It is decidedly so",
                "All signs say YES",
                "The stars are not aligned",
                "My reply is no",
                "It is doubtful",
                "Better not tell you now",
                "Concentrate and ask again",
                "Unable to answer now"};

        String answer = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(answers.length);

        answer = answers[randomNumber];

        return answer;
    }
}
