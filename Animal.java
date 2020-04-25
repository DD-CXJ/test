package 容器;

import java.util.ArrayList;

public class Animal {


    public static void main(String[] args) {
        ArrayList<Animal> an = new ArrayList<Animal>();//泛型
        an.add(new Dog());
        an.add(new Cat());
        System.out.println(an);
        System.out.println(an.size());
        System.out.println(an.get(1));

    }
}
