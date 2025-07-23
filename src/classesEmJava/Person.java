package classesEmJava;

import java.time.OffsetDateTime;

public class Person {

   private final String name; // Molde de estrutura para objetos, proteja o acesso das propiedades
    // final vira uma constante, um valor que não muda.
    private int age;
    private int lastYearAgeInc = OffsetDateTime.now().getYear();

//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
    public Person(String name){
        this.name = name;
        this.age = 1;
    }

   public String getName(){
       return this.name;
   }
//    public void setAge(int age){
//        this.age = age;
//    }
    public int getAge(){
        return this.age;
    }
    public void incAge(){
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
