public class methodTypes {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Вова";
        person1.age = 45;

        Person person2 = new Person();
        person2.name = "Дима";
        person2.age = 26;

        int year1 = person1.calculateYearsoRetirement();
        int year2 = person2.calculateYearsoRetirement();
        System.out.println("1 человеку осталось до пенсии:"+year1);
        System.out.println("2 человеку осталось до пенсии:"+year2);
    }
}
class Person{
    String name;
    int age;
   int calculateYearsoRetirement(){
       int years = 65-age;
       return years;
   }


}
