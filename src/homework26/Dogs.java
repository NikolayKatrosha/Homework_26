package homework26;

import static homework26.Dog.counter;

public class Dogs {

    public static void main(String[] args) {
Dog dog1 = new Dog("Mikki",7,30, "Irish terrier");
Dog dog2 = new Dog("Cooper",5,32,"terrier");
        System.out.println(counter);
        System.out.println(dog1.CompareAge(dog2));
        System.out.println(dog1.CompareWeight(dog2));
    }
}
