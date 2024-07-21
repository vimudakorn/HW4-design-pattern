// 6510405792 Vimudakorn Kittechapanich
public class GumballMachine {
    State noQuarterState;
    State hasQuarterState;
    State gumballSoldState;
    State outOfGumballsState;
    State winnerState;

    State state = outOfGumballsState;
    int countGumballs = 0;

    public GumballMachine(int countGumballs) {
        this.countGumballs = countGumballs;
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        gumballSoldState = new GumballSoldState(this);
        outOfGumballsState = new OutOfGumballsState(this);
        winnerState = new WinnerState(this);
        if (countGumballs > 0) {
            state = noQuarterState;
        }
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (countGumballs != 0) {
            countGumballs = countGumballs - 1;
        }
    }

    public void printDetail() {
        System.out.println("\nMighty Gumball Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + countGumballs + " gumballs");
        if (countGumballs > 0) {
            System.out.println("Machine is waiting for quarter\n");
        }
        else {
            System.out.println("Machine is sold out\n");
        }
    }
    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getGumballSoldState() {
        return gumballSoldState;
    }

    public State getOutOfGumballsState() {
        return outOfGumballsState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCountGumballs() {
        return countGumballs;
    }
}