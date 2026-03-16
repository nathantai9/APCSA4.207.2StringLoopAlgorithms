public class StringLoopAlgorithms {
    // Directions:
    // Pick any 5 of the following algorithms and write static methods for them (ask Mr. Riley if you need clarification about how an algorithm should work):

    // countTimesLetterAppears()
    public static int countTimesLetterAppears(String word, String characterBeingCounted){
            int numOfTimesLetterAppears = 0;
            for(int i = 0; i < word.length(); i++){
                String letter = word.substring(i, i + 1);
                if(letter.equals(characterBeingCounted)){
                    numOfTimesLetterAppears++;
                }
            }
            return numOfTimesLetterAppears;
    }

    // boolean hasNumbers(String myString)
    public static boolean hasNumbers(String word){
        int numOfAppear = 0;
        for(int i = 0; i < word.length(); i++){
            String letter = word.substring(i, i + 1);
            if(letter.equals("0") || letter.equals("1") || letter.equals("2") || letter.equals("3") || letter.equals("4") || letter.equals("5") || letter.equals("6") || letter.equals("7") || letter.equals("8") || letter.equals("9")){
                numOfAppear++;
            }
        }
        if(numOfAppear > 0){
            return true;
        }
        else {
            return false;
        }
    }

    // hasOnlyConsonants()
    public static boolean hasOnlyConsonants(String word){
            int numOfVowels = 0;
            for(int i = 0; i < word.length(); i++){
                String letter = word.substring(i, i + 1).toLowerCase();
                if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
                    numOfVowels++;
                }
            }
            if(numOfVowels > 0){
                return false;
            }
            else {
                return true;
            }
    }

    // countVowels()
    public static int countVowels(String myString){
            int numOfVowels = 0;
            for(int i = 0; i < myString.length(); i++){
                String letter = myString.substring(i, i + 1).toLowerCase();
                if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
                    numOfVowels++;
                }
            }
            return numOfVowels;
    }

    // doesLetterAppear()
    public static boolean doesLetterAppear(String word, String booleanLetter){
            int doesItAppear = 0;
            for(int i = 0; i < word.length(); i++){
                String letter = word.substring(i, i + 1);
                if(letter.equals(booleanLetter)){
                    doesItAppear++;
                }
            }
            if(doesItAppear == 0){
                return false;
            }
            else {
                return true;
            }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("--==++** Starting String Loop Algorithms Tests **++==--");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("-=+* Testing countVowels *+=-");
                    System.out.println("Expect: 2 from 'Apple' \nActual: " + countVowels("Apple"));
                    System.out.println("Expect: 5 from 'Pomegranate' \nActual: " + countVowels("Pomegranate"));
                    System.out.println("Expect: 4 from 'Gladiolus' \nActual: " + countVowels("Gladiolus"));
                    System.out.println("Expect: 3 from 'Cordial' \nActual: " + countVowels("Cordial"));
                    System.out.println("Expect: 8 from 'Onomatopoeia' \nActual: " + countVowels("Onomatopoeia"));
                System.out.println("-=+* Finished testing countVowels *+=-");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("-=+* Testing countTimesLetterAppears *+=-");
                    System.out.println("Expect: 2 from 'apple', 'p' \nActual: " + countTimesLetterAppears("apple", "p"));
                    System.out.println("Expect: 3 from 'banana', 'a' \nActual: " + countTimesLetterAppears("banana", "a"));
                    System.out.println("Expect: 0 from 'hello', 'z' \nActual: " + countTimesLetterAppears("hello", "z"));
                    System.out.println("Expect: 4 from 'Mississippi', 's' \nActual: " + countTimesLetterAppears("Mississippi", "s"));
                    System.out.println("Expect: 0 from '', 'a' \nActual: " + countTimesLetterAppears("", "a"));
                System.out.println("-=+* Finished testing countTimesLetterAppears *+=-");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("-=+* Testing doesLetterAppear *+=-");
                    System.out.println("Expect: true from 'Apple', 'p' \nActual: " + doesLetterAppear("Apple", "p"));
                    System.out.println("Expect: false from 'Banana', 'z' \nActual: " + doesLetterAppear("Banana", "z"));
                    System.out.println("Expect: false from 'Apple', 'a' \nActual: " + doesLetterAppear("Apple", "a"));
                    System.out.println("Expect: true from 'Mississippi', 'i' \nActual: " + doesLetterAppear("Mississippi", "i"));
                    System.out.println("Expect: false from '', 'e' \nActual: " + doesLetterAppear("", "e"));
                System.out.println("-=+* Finished testing doesLetterAppear *+=-");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("-=+* Testing hasOnlyConsonants *+=-");
                    System.out.println("Expect: false from 'Apple' \nActual: " + hasOnlyConsonants("Apple"));
                    System.out.println("Expect: true from 'Rhythm' \nActual: " + hasOnlyConsonants("Rhythm"));
                    System.out.println("Expect: true from 'Gym' \nActual: " + hasOnlyConsonants("Gym"));
                    System.out.println("Expect: true from 'Fly' \nActual: " + hasOnlyConsonants("Fly"));
                    System.out.println("Expect: true from 'Ssh' \nActual: " + hasOnlyConsonants("Ssh"));
                System.out.println("-=+* Finished testing hasOnlyConsonants *+=-");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("-=+* Testing hasNumbers *+=-");
                    System.out.println("Expect: true from 'H3llo' \nActual: " + hasNumbers("H3llo"));
                    System.out.println("Expect: false from 'Apple' \nActual: " + hasNumbers("Apple"));
                    System.out.println("Expect: true from '7' \nActual: " + hasNumbers("7"));
                    System.out.println("Expect: true from 'Agent007!' \nActual: " + hasNumbers("Agent007!"));
                    System.out.println("Expect: false from '' \nActual: " + hasNumbers(""));
                System.out.println("-=+* Finished testing hasNumbers *+=-");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("--==++** Finished String Loop Algorithms Tests **++==--");
    }
}
