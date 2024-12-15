package AST;

public class AST_PROG extends AST_Node {
    public AST_DEC dec;
    public AST_PROG next;

    public AST_PROG(AST_DEC dec, AST_PROG next) {

        this.dec = dec;
        this.next = next;
    }

    @Override
    public void printMe() {
        System.out.println("AST_PROG Node");
        if (dec != null) dec.printMe();
        if (next != null) next.printMe();
    }
}