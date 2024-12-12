public class AST_EXP_EXP extends AST_EXP {
    private exp e;  // Can be any subclass of exp
    private var v;
    private String id;
    print cxp c;

    public AST_EXP_EXP(exp e) {
        this.e = e;  // Store the expression
    }
    public AST_EXP_EXP(var v,String id,exp e,cxp c) {
        this.e = e;  // Store the expression
        this.v = v;
        this.exp = c;
        this.id = id;
    }

    // Additional methods to interact with the expression
}
