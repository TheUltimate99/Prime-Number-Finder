import java.util.Scanner;
class Prime {
public static void main(String args[]){

boolean prime = true;
int a = 2;
int leftOver;

System.out.println("What is your input");
Scanner scan = new Scanner(System.in);
int input = scan.nextInt();

while (a < input){
leftOver = input % a;
if (leftOver == 0) {
prime = false;
break;
}
a = a + 1;
}

if (prime) {
System.out.println("The value is prime.");

} else {
System.out.println("The value is not prime.");
}


}
}