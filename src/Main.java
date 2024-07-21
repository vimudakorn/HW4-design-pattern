// 6510405792 Vimudakorn Kittechapanich
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.printDetail();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();

    }
}