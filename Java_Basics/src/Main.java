// Implement in java the following algorithms:
// 1. Calculate the sum of the first 100 numbers higher than 0
// 2. Display the smallest number from an array of number
// 3. Display the max digit from a number.
// 4. Check if a number is palindrom( e.g palindrom 1221, 34143)
// 5. Display all the prime numbers lower than a given number

public class Main {
    public static void main(String[] args) {
        //Sum of the first 100 number higher than 0
        int sum=0;
        for (int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        System.out.println("The sum of the first 100 number higher than 0 is: " + sum);

        //Display the smallest number from an array of number
        int[] arr = {11, 10, 100, 980, 4, 89};
        int minim = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minim > arr[i]) {
                minim = arr[i];
            }
        }
        System.out.println("The smallest number from an array of number is: " + minim);

        //Display the max digit from a number.
        int largest = 0;
        int nr = 27449321;
        while(nr != 0) {
            int r = nr % 10;
            largest = Math.max(r, largest);
            nr = nr / 10;
        }
        System.out.println("The maxim digit from the number is: " + largest);

        //Check if a number is palindrom( e.g palindrom 1221, 34143)
        int r, sum_pal = 0, temp;
        int n = 1221;//It is the number variable to be checked for palindrome
        temp = n;
        while(n > 0) {
            r = n%10;  //getting remainder
            sum_pal = (sum_pal * 10) + r;
            n = n/10;
        }
        if(temp == sum_pal)
            System.out.println("The number is palindrom!");
        else
            System.out.println("The number is not palindrom!");

        //Display all the prime numbers lower than a given number
        int primeNumber = 80;
        System.out.printf("The prime numbers lower than " + primeNumber + " are: ");
        for (int num = 2; num < primeNumber; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                }
            }
        }
    }
