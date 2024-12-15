package AST;

public class AST_ARRAY_TYPEDEF extends AST_DEC {
    public String name;
    public AST_TYPE type;

    public AST_ARRAY_TYPEDEF(String name, AST_TYPE type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void printMe() {
        System.out.println("AST_ARRAY_TYPEDEF Node: " + name);
        if (type != null) type.printMe();
    }
}
