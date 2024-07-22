// 6510405792 Vimudakorn Kittechapanich
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
//        gumballMachine.printDetail();
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.printDetail();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.printDetail();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.printDetail();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.printDetail();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        gumballMachine.printDetail();
//
        gumballMachine.printDetail();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        gumballMachine.printDetail();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.printDetail();
    }

}