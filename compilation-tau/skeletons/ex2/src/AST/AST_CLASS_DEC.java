package AST;

public class AST_CLASS_DEC extends AST_DEC {
    public String className;
    public String parentName;
    public AST_Node cFields;

    public AST_CLASS_DEC(String className, String parentName, AST_Node cFields) {
        this.className = className;
        this.parentName = parentName;
        this.cFields = cFields;
    }

    @Override
    public void printMe() {
        System.out.println("AST_CLASS_DEC Node: " + className);
        if (parentName != null) System.out.println("Extends: " + parentName);
        if (cFields != null) cFields.printMe();
    }
}