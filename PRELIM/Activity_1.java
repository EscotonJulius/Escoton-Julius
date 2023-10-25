import java.util.Scanner;

class Activity_1 {
    public static void main(String args[]) {
        System.out.println("========== Activity One: What does the animal say? ===========");
        Selection choose = new Selection();
        choose.choices();
    }
}

class Lion {
    public void SoundofTheAnimals() {
        System.out.println("Roar!! Roar!! Roar!!! ");
    }
}

class Cow extends Lion {
    
    public void SoundofTheAnimals() {
        System.out.println("Moo!! Moo!! Moo!! ");
    }
}

class Duck extends Lion {
    
    public void SoundofTheAnimals() {
        System.out.println("Quack!! Quack!! Quack!");
    }
}

class Pig extends Lion {
   
    public void SoundofTheAnimals() {
        System.out.println("oink! oink! oink!");
    }
}

class Select {
    private Scanner scan = new Scanner(System.in);

    public void choices() {
        int number;
        System.out.println("Select an animal: ");
        System.out.println("1. Lion");
        System.out.println("2. Cow");
        System.out.println("3. Duck");
        System.out.println("4. Pig|");
        System.out.println(" Enter a number: ");
        number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Animal: Lion");
                Lion lion = new Lion();
                lion.SoundofTheAnimals();
                break;
            case 2:
                System.out.println("Animal: Cow");
                Cow cow = new Cow();
                cow.SoundofTheAnimals();
                break;
            case 3:
                System.out.println("Animal: Duck");
                Duck duck = new Duck();
                duck.SoundofTheAnimals();
                break;
            case 4:
                System.out.println("Animal: Pig");
                Pig pig = new Pig();
                pig.SoundofTheAnimals();
                break;
            default:
                System.out.println("Out of the choices");
        }
    }
}
