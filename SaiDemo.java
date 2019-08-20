interface Dog {
    public default void whatAmI() {
        System.out.println("I am a dog");
    }
}

interface Cat {
    public default void whatAmI() {
        System.out.println("I am a cat");
    }
}

interface Cheetah extends Cat {
    public default void whatAmI() {
        System.out.println("I am a cheetah");
    }
}

class Pet implements /*Dog,*/ Cheetah, Cat {

    // @Override
    // public void whatAmI() {
    //     //System.out.println("I am a pet");
    //     //Dog.super.whatAmI();
    //     //Cat.super.whatAmI();
    // }
}

public class SaiDemo {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.whatAmI();
    }
}