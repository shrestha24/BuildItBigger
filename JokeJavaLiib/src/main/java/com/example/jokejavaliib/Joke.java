package com.example.jokejavaliib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Joke {
    private static List<String> mList=asList("Whenever you feel worthless, remember. You were once the quickest sperm cell.",
            "Pappu went to a doctor to get a solution of loose motions.\n" +
                    "Doctor: tell me, what’s your problem?\n" +
                    "Pappu: Suffering from unlimited free outgoing with different ringtones.",
            "Manager: What is your qualification?\n" +
                    "Pappu: I’m Ph.D.\n" +
                    "Manager: What do you mean by Ph.D.?\n" +
                    "Pappu: Passed high school with difficulty.",
            "Once Rajnikanth went to Switzerland and accidentally dropped his wallet in a building. Since then the building is known as ‘Swiss Bank’"
            ,"Heated gold becomes ornaments, beaten copper become wires, compressed rocks become diamonds and mentally tortured men become ‘Best Husbands’",
            "Q: Why did titu take his pregnant wife tiya to Pizza Hut?\n" +
                    "A: Because they advertised ‘Free Delivery’","How to reduce weight?\n" +
                    "First turn your head to the right and then to the left.\n" +
                    "Repeat this one whenever you have given something to eat!");

    public static String getJoke(){
        return mList.get(new Random().nextInt(mList.size()));
    }
}