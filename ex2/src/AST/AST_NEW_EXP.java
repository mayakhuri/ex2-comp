package AST;

public class AST_NEW_EXP extends AST_Node {
    public AST_TYPE type;  // The type being instantiated
    public AST_EXP size;   // The size of the array (if applicable)

    // Constructor for non-array instantiation (no size specified)
    public AST_NEW_EXP(AST_TYPE type, AST_EXP size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public void PrintMe() {
        System.out.print("AST NODE NEW EXPRESSION\n");
        if (type != null) {
            System.out.print("Type: ");
            type.PrintMe();
        }
        if (size != null) {
            System.out.print("Size: ");
            size.PrintMe();
        }
    }
}
