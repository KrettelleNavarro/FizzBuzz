import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestFizzBuzz {

    @Test
    public void number1ShouldReturn1() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String number = fizzBuzz.say(1);
        // Then
        assertThat(number).isEqualTo("1");
    }

    @Test
    public void number2ShouldReturn2() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String number2 = fizzBuzz.say(2);
        // Then
        assertThat(number2).isEqualTo("2");
    }

    @Test
    public void number3ShouldReturnFizz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String fizz = fizzBuzz.say(3);
        // Then
        assertThat(fizz).isEqualTo("Fizz");
    }

    @Test
    public void number5ShouldReturnBuzz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String buzz = fizzBuzz.say(5);
        // Then
        assertThat(buzz).isEqualTo("Buzz");
    }

    @Test
    public void number15ShouldReturnFizzBuzz() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String multiple15 = fizzBuzz.say(15);
        // Then
        assertThat(multiple15).isEqualTo("FizzBuzz");
    }

    @Test
    public void shouldValidateWithMultipleNumbers() {
        // Given
        FizzBuzz fizzBuzz = new FizzBuzz();
        // when
        String result = "";
        for (int i = 1; i <= 100; i++) {
            result += fizzBuzz.say(i) + "";

        }
        // Then
        assertThat(result).isEqualTo(
                "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz");
    }
}