public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 2015, "Россия", "желтый", 1.7);
        lada.outputMessage();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
        audi.outputMessage();
        Car bmv = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
        bmv.outputMessage();
        Car kia = new Car("Kia", "Sportage 4 поколение", 2018, "Южная Корея", "красный", 2.4);
        kia.outputMessage();
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        hyundai.outputMessage();
    }
}