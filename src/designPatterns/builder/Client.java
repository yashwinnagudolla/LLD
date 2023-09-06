package designPatterns.builder;

public class Client{
    public static void main(String[] args) {
        //first call builder class it validates all set params
        //then the builder class calls the student constructor and it creates the obj
        Student s = Student.builder()
                .setId(1)
                .setName("Yashwin")
                .setGradYear(2021)
                .setYoe(1.5)
                .setPsp(90)
                .setBatchName("LLD March23")
                .build();
        System.out.println(s); //toString overridden method is used to print the obj
    }
}