package com.bridgelabz;

public class MoodAnalyser {

    String message;


    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyzeMood(){

   if(message.equalsIgnoreCase(message)) {
       String mood = "SAD";
       System.out.println("Mood is sad");
       return  mood;
   }else {
       String mood = "Happy";
       System.out.println("Mood is Happy");
       return mood;
   }

    }
}
