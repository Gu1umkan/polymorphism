
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Eagle(), new Turtle(), new Eagle(), new Shark(), new Shark(), new Turtle()};
        int sharkCounter = 0;
        int turtleCounter = 0;
        for (Animal animal : animals) {
            System.out.println("+++++++++++++++++++++++++++++++++");
            Class<?> type = animal.getClass();
            System.out.println("Type is " + type);
            animal.eat();
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.attack();
                sharkCounter++;
            } else if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.swim();
                turtleCounter++;
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }
        }
        Shark[] sharks = new Shark[sharkCounter];
        Turtle[] turtles = new Turtle[turtleCounter];
        Eagle[] eagles = new Eagle[animals.length - sharkCounter - turtleCounter];
        int i = 0, k = 0, j = 0;
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                sharks[i++] = shark;
            } else if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtles[k++] = turtle;
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagles[j++] = eagle;
            }
        }
    }
}