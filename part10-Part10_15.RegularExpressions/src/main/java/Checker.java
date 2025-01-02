public class Checker {

    public boolean isDayOfWeek(String string){

        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }else {
            return false;
        }
    }

    public boolean allVowels(String string){

        if (string.matches("[aeiouAEIOU]+")){
            return true;
        }else {
            return false;
        }
    }

    public boolean timeOfDay(String string) {
        // Regex pattern to match hh:mm:ss format in 24-hour time
        String regex = "^([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)";
        return string.matches(regex);
    }

    
}
