package Homework5;

public class WorkerClass {
    public static void main(String[] args) {
        Employee employee1= new Employee("Petrov Petr Petrovich", "director", "petrov38@gmail.com", "+79139588578", 150000L, 54);

        employee1.printData();

        System.out.println("_______________");

        Employee[] persArray = new Employee[5];
        persArray[0]= new Employee("Galkin Ivan Ivanovich", "expert", "galkin55@gmail.com", "+79139999999", 45500L, 30);
        persArray[1]= new Employee("Ivanova Irina Borisovna", "team leader", "ivanova22@gmail.com", "+79134545454", 67400L, 40);
        persArray[2]= new Employee("Petrov Denis Egorovich", "administrator", "petrov46@mail.ru", "+79138989898", 42100L, 46);
        persArray[3]= new Employee("Matveev Egor Stepanovich", "expert", "matveev51@gmail.com", "+79136666666", 45500L, 51);
        persArray[4]= new Employee("Medvedeva Regina Petrovovna", "specialist", "medvedeva29@mail.ru", "+79137777777", 35000L, 29);


            for (int i=0; i< persArray.length;i++){
                if (persArray[i].getAge() >40) {
                    persArray[i].printData();
                    System.out.println("\t");}
            }

    }
}
