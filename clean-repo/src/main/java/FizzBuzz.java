
public class FizzBuzz {

    // public String say(int i) {
    // if (i % 3 == 0) {
    // return "Fizz";
    // }
    // return i + "";
    // }

    // peut aussi s'écrire

    // public String say(int i) {
    // String resultat;

    // if (i % 3 == 0 && i % 5 == 0) {
    // return "FizzBuzz";
    // } else if (i % 5 == 0) {
    // return "Buzz";
    // } else if (i % 3 == 0) {
    // return "Fizz";
    // } else {
    // resultat = i + "";
    // }
    // return resultat;
    // }

    // peut aussi s'écrire

    public String say(int i) {
        String resultat = "";

        if (i % 3 == 0) {
            resultat = "Fizz";
        }
        if (i % 5 == 0) {
            resultat += "Buzz";
        }
        if (i % 3 != 0 && i % 5 != 0) {
            resultat = i + "";
        }

        return resultat;
    }

}
