class Printer{
    void printData(string text){
        System.out.println("text =" +text);
    }
    void printData(int number){
        System.out.println("number =" +number);
    }
}    
    public class Main {
        public static void main(String[] args) {
             Printer printer = new Printer();

        printer.printData("Hello Printer");
        printer.printData(100);
        }
    }

