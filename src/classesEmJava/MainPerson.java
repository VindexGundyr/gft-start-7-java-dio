package classesEmJava;
// Trabalhar com objetos imutaveis - RECORD
public class MainPerson {
    public static void main(String[] args) {
        var person = new PersonRecord("João", 12);
        System.out.println(person.getInfo());
        System.out.println(person.name());
    }

}
