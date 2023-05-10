import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Student implements Contract{

 public int Good_Student_Score;
 public int Bad_Student_Score;
 public Number Brain_size;
 public boolean playedHooky;




public Student (){
    this.Good_Student_Score = 0;
    this.Bad_Student_Score = 0;
    Scanner input = new Scanner(System.in); //Created a scanner
    this.Brain_size = 0;
    this.playedHooky = false;



}

public void grab(String item){
    if (item.equals("A")){
        this.Bad_Student_Score++;
    System.out.println("You have grabbbed your phone");
    }
    else if (item.equals("B")){
        this.Good_Student_Score++;
        System.out.println("You have grabbed your calculator");


    }

}
public String drop(String item){
    if (item.equals("A")){
        this.Good_Student_Score++;
    System.out.println("You have dropped your phone");
    }
    else if (item.equals("B")){
        this.Bad_Student_Score++;
        System.out.println("You have dropped your pencil");
    }

    
    return item;
}

public void examine(String item){
    if (item.equals("A")){
        this.Good_Student_Score++;
    System.out.println("You examined your own test and recieved a good grade!");
    }
    else if (item.equals("B")){
        this.Bad_Student_Score++;
        System.out.println("You cheated, BOO!");
    }

}
public void use(String item){
    if (item.equals("A")){
        this.Good_Student_Score++;
    System.out.println("You used your textbook to study!");
    }
    else if (item.equals("B")){
        this.Bad_Student_Score++;
        System.out.println("You used your video-game to procrastinate");
    }
}
public boolean walk(String direction){
    if (direction.equals("A")){
        this.Good_Student_Score++;
        System.out.println("You walked to the library!");
        this.playedHooky = false;
    }
    else if (direction.equals("B")){
        this.Bad_Student_Score++;
        System.out.println("You walked back home!");
        this.playedHooky = true;
    }
    else {
        System.out.println("Oops, wrong selection. Try again.");
    }
    return this.playedHooky;
    
}
public boolean fly(int x, int y){
    if (x==0 && y==0){
        System.out.println("You chose to be in class today!");
        this.Good_Student_Score++;
        this.playedHooky = false;
    }
    else{
        System.out.println("You skipped class today");
        this.Bad_Student_Score++;
        this.playedHooky = true;
    }
    return this.playedHooky = true;
}
public Number shrink(){
    System.out.println("You chose to shrink your screentime");
    this.Good_Student_Score++;

    return this.Good_Student_Score;
}
public Number grow(){
    System.out.println("You learned something new today!");
    this.Brain_size=+1;
    this.Good_Student_Score++;
    return this.Brain_size;
}
public void rest(){
    System.out.println("You chose to sleep in class");
    this.Bad_Student_Score++;
    
}
public void undo(){
    System.out.println("You noticed your mistakes on an exam and undid them, congrats!");
    this.Good_Student_Score++;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Student bob = new Student();
    System.out.println("Do you want to grab your phone or your calculator?");
    System.out.println("Select A for phone. Select B for calculator");
    bob.grab(input.nextLine());
    System.out.println("Do you want to drop your phone or your pencil?");
    System.out.println("Select A for phone. Select B for pencil.");
    bob.drop(input.nextLine());
    System.out.println("Do you want to examine your test or another person's test?");
    System.out.println("Select A for your test. Select B for another person's test.");
    bob.examine(input.nextLine());
    System.out.println("Do you want to walk to a library or back home?");
    System.out.println("Select A for the library. Select B for home.");
    bob.walk(input.nextLine());
    System.out.println("Do you want to use your textbook or your video games?");
    System.out.println("Select A for textbook. Select B for video games");
    bob.use(input.nextLine());


    if (!bob.Brain_size.equals(0)) {
        bob.Good_Student_Score++;
    }
    if (bob.playedHooky == false) {
        bob.Good_Student_Score++;
    }
    if (bob.playedHooky == true) {
        bob.Bad_Student_Score++;
    }
    if (bob.Bad_Student_Score < bob.Good_Student_Score) {
        System.out.println("Congrats! You've passed high school.");
    }
    else {
        System.out.println("Sorry... you failed high school. Try again next year!");
    }

}

}