public class AST_TYPE extends AST_Node {
    public String type;

    public AST_TYPE(String type) {
        this.type = type;
    }

    @Override
    public void printMe() {
        System.out.println("AST_TYPE Node: " + type);
    }
}