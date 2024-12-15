package AST;

public class AST_CFIELD extends AST_Node {
    public AST_DEC field;

    // Constructor accepting a varDec
    public AST_CFIELD(AST_DEC_VAR varDec) {
        this.field = varDec;
    }

    // Constructor accepting a funcDec
    public AST_CFIELD(AST_DEC_FUNC funcDec) {
        this.field = funcDec;
    }
}
