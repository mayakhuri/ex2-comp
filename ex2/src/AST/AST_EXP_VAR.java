package AST;

public class AST_EXP_VAR extends AST_EXP {
    public String name;        // For simple variables (e.g., `x`)
    public AST_EXP_VAR base;   // For field access (e.g., `a.b`) or array indexing
    public AST_EXP index;      // For array access (e.g., `a[3]`)

    // Constructor for a simple variable (e.g., `x`)
    public AST_EXP_VAR(String name) {
        this.name = name;
        this.base = null;
        this.index = null;
    }

    // Constructor for field access (e.g., `a.b`)
    public AST_EXP_VAR(AST_EXP_VAR base, String name) {
        this.base = base;
        this.name = name;
        this.index = null;
    }

    // Constructor for array access (e.g., `a[3]`)
    public AST_EXP_VAR(AST_EXP_VAR base, AST_EXP index) {
        this.base = base;
        this.index = index;
        this.name = null;
    }

    @Override
    public void PrintMe() {
        System.out.print("AST NODE VARIABLE\n");
        if (name != null) System.out.print("Name: " + name + "\n");
        if (base != null) {
            System.out.print("Base: ");
            base.PrintMe();
        }
        if (index != null) {
            System.out.print("Index: ");
            index.PrintMe();
        }
    }
}
