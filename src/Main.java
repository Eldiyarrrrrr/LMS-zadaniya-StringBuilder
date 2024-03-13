import javax.swing.plaf.PanelUI;

public class Main {
    public static void main(String[] args) {
        

        /** 1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз. **/
        // TODO: 12.03.2024
//        StringBuilder stringBuilder = new StringBuilder("eldiyar avazbekov");
//        reverseMethod(stringBuilder);
//    }
//    public static void reverseMethod(StringBuilder reverse) {
//
//        reverse.reverse();
//        System.out.println(reverse);


        /** 2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.  **/
        // TODO: 12.03.2024
//    }
//    public static void method() {
//
//
//        StringBuilder[] stringBuilderArray = new StringBuilder[5];
//
//        for (int i = 0; i < stringBuilderArray.length; i++) {
//            stringBuilderArray[i] = new StringBuilder();
//            stringBuilderArray[i].append("слово eldiyar " + " ");
//        }
//
//        for (StringBuilder sb : stringBuilderArray) {
//            System.out.print(sb.toString());
//        }

      /**  3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.  **/
        // TODO: 12.03.2024

//        String word = "Eldiyar";
//        int vowelCount = countVowels(word);
//        System.out.println("Количество гласных в слове \"" + word + "\": " + vowelCount);
//    }
//
//    public static int countVowels(String word) {
//        int count = 0;
//        word = word.toLowerCase();
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                count++;
//            }
//        }
//        return count;


       /** 4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз. **/
        // TODO: 12.03.2024

//        String word = "eldiyar";
//        boolean isPalindrome = isPalindrome(word);
//        if (isPalindrome) {
//            System.out.println("\"" + word + "\" palindrom soz!!! ");
//        } else {
//            System.out.println("\"" + word + "\" palindrom emes soz!!! ");
//        }
//    }
//
//    public static boolean isPalindrome(String word) {
//        StringBuilder reversedWord = new StringBuilder(word);
//        reversedWord.reverse();
//        return word.equalsIgnoreCase(String.valueOf(reversedWord));


        /** 5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу  метод туз.  **/
        // TODO: 12.03.2024

//        String sentence = "eldiyar avazbekov che tam however another between order other another real";
//        String capitalizedSentence = capitalizeWords(sentence);
//        System.out.println("Kichine tamga menen jazylgan suilom: " + sentence);
//        System.out.println("Chon tamga menen jazylgan suilom: " + capitalizedSentence);
//    }
//
//    public static String capitalizeWords(String sentence) {
//        StringBuilder sb = new StringBuilder();
//        boolean capitalizeNext = true;
//
//        for (int i = 0; i < sentence.length(); i++) {
//            char ch = sentence.charAt(i);
//
//            if (Character.isLetter(ch)) {
//                if (capitalizeNext) {
//                    sb.append(Character.toUpperCase(ch));
//                    capitalizeNext = false;
//                } else {
//                    sb.append(Character.toLowerCase(ch));
//                }
//            } else {
//                sb.append(ch);
//                capitalizeNext = true;
//            }
//        }
//
//        return sb.toString();

       /** 6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.  **/
        // TODO: 12.03.2024
//        String sentence = "menin atym eldiyar cho tam hahahahahaha"; 
//        int wordCount = countWords(sentence); 
//        System.out.println("Количество слов в предложении: " + wordCount);
//    }
//
//    public static int countWords(String sentence) {
//        String[] words = sentence.split("\\s+");
//        return words.length;
//    }
//
//    public static int countWords(StringBuilder sentence) {
//        int count = 0;
//        boolean inWord = false;
//
//        for (int i = 0; i < sentence.length(); i++) {
//            char ch = sentence.charAt(i);
//
//            if (!Character.isWhitespace(ch) && (i == 0 || Character.isWhitespace(sentence.charAt(i - 1)))) {
//                count++;
//                inWord = true;
//            } else if (Character.isWhitespace(ch)) {
//                inWord = false;
//            }
//        }
//        return count;
        
        /**  7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.  **/
        // TODO: 12.03.2024
//        String input = "Hello, World!";
//        String asciiString = convertToASCII(input);
//        System.out.println("Строка с символами ASCII: " + asciiString);
//    }
//
//    public static String convertToASCII(String input) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            sb.append((int) ch);
//            sb.append(" ");
//        }
//
//        if (sb.length() > 0) {
//            sb.deleteCharAt(sb.length() - 1);
//        }
//
//        return sb.toString();
        
        /**  8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.    **/
        // TODO: 12.03.2024
//        String input = "Это строка с пробелами";
//        String result = removeSpaces(input);
//        System.out.println("Строка без пробелов: " + result);
//    }
//
//    public static String removeSpaces(String input) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (ch != ' ') {
//                sb.append(ch);
//            }
//        }
//
//        return sb.toString();
    }
}