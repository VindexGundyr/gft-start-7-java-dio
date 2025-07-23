package classesEmJava;
// Trabalhar com objetos imutaveis - RECORD
public record PersonRecord(String name, int age) {
    public PersonRecord(final String name){
        this(name, 1);
    }
    public String getInfo() {
        return "Name: " + name + " age: " + age;
    }
}
