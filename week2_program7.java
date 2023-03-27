// public class week2_program7 {
//     int speed;
    
//     // Constructor to initialize speed
//     public Bike(int speed) {
//         this.speed = speed;
//     }
    
//     // Call by value method to swap speed values
//     public static void swapValuesByValue(int speed1, int speed2) {
//         int temp = speed1;
//         speed1 = speed2;
//         speed2 = temp;
//     }
    
//     // Call by reference method to swap speed values
//     public static void swapValuesByReference(Bike bike1, Bike bike2) {
//         int temp = bike1.speed;
//         bike1.speed = bike2.speed;
//         bike2.speed = temp;
//     }
    
//     public static void main(String[] args) {
//         Bike bike1 = new Bike(50);
//         Bike bike2 = new Bike(80);
        
//         System.out.println("Before swapping:");
//         System.out.println("Bike 1 speed: " + bike1.speed);
//         System.out.println("Bike 2 speed: " + bike2.speed);
        
//         // Swap values using call by value
//         swapValuesByValue(bike1.speed, bike2.speed);
        
//         System.out.println("After swapping by value:");
//         System.out.println("Bike 1 speed: " + bike1.speed);
//         System.out.println("Bike 2 speed: " + bike2.speed);
        
//         // Swap values using call by reference
//         swapValuesByReference(bike1, bike2);
        
//         System.out.println("After swapping by reference:");
//         System.out.println("Bike 1 speed: " + bike1.speed);
//         System.out.println("Bike 2 speed: " + bike2.speed);
//     }
// }
