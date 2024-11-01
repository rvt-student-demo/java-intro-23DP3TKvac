package lv.rvt;


public class App 
{
    public static void main( String[] args ) {

        String[] words = {"sebastian", "lucas", "lily", "hanna", "gabriel"};
        String[] years = {"2017", "2017", "2017", "2014", "2009"};

        int sum = 0;
        for (String year : years) {
            sum += Integer.parseInt(year);
        }
        int averageYear = (int) sum / years.length;

        String longestWord = "";
        int maxLenght = 0;

        for (String word : words) {
            if (word.length() > maxLenght) {
                longestWord = word;
                maxLenght = word.length();
            }
        }
        System.out.println("Longest name:" + longestWord);
        System.out.println("Average of the birth years:" + averageYear);
    }
}


