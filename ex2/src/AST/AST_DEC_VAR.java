public class AST_DEC_VAR extends AST_DEC {
    public AST_TYPE type;
    public String name;
    public AST_EXP exp;

    public AST_DEC_VAR(AST_TYPE type, String name, AST_EXP exp) {
        this.type = type;
        this.name = name;
        this.exp = exp;
    }
    
    public AST_DEC_VAR(AST_TYPE type, String name, AST_EXP exp) {
        this.type = type;
        this.name = name;
        this.exp = exp;
    }

    @Override
    public void printMe() {
        System.out.println("AST_DEC_VAR Node: " + name);
        if (type != null) type.printMe();
        if (exp != null) exp.printMe();
    }
}