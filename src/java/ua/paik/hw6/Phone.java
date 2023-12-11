package ua.paik.hw6;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }

    public Phone() {
        this.number = "Undefined";
        this.model = "Undefined";
        this.weight = 0.0;
    }

    public String getNumber() {
        return number;
    }


    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("099-456-978", "iPhone", 150.5);
        Phone phone2 = new Phone("654-146-321", "Samsung");
        Phone phone3 = new Phone();

        phone3.number = "358-091-375";
        phone3.model = "Nokia";
        phone3.weight = 120.0;


        System.out.println("Phone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.model);
        System.out.println("Weight: " + phone1.weight + " grams");

        System.out.println("\nPhone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.model);
        System.out.println("Weight: " + phone2.weight + " grams");

        System.out.println("\nPhone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.model);
        System.out.println("Weight: " + phone3.weight + " grams");

        phone1.receiveCall("Jane");
        phone2.receiveCall("Anny");
        phone3.receiveCall("John");
    }
}

