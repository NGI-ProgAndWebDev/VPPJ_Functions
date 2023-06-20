//Example 4: print the numbers from 10 to 1 in reverse order
//TODO: write a for loop that prints numbers from 1 to 10 in reverse order

public class ForLoopExamples{
    public static void main(String[] args) {
        for(int i = 10; i >=1; i--){
        System.out.println(i);
    }
    
}
}
//Example 5: print the first 10 even numbers
//TODO: write a for loop thta prinst the first 10 even numbers

for (int i = 0; i < 19; i+=2){
System.out.println(i);
}

//way 2
for(i = 2; i <= 10; i++){
    System.out.println(2 * i);
}
//way 3, a nested loop
for(int i = 2; i <21; i++){
    if(i%2 == 0){
        System.out.println(i);
    }
}

