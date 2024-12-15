public class AST_DEC_FUNC extends AST_DEC {
    public AST_TYPE t1;
    public AST_TYPE t2;
    public String name1;
    public String name2;
    public AST_COMMA_ID cid;
    public AST_M_STMT s;

		

    public AST_DEC_FUNC(String name1, String name2, AST_TYPE t1, AST_TYPE t2, AST_COMMA_ID cid, AST_M_STMT s) {
        this.name1 = name1;
        this.name2 = name2;
        this.t1 = t1;
        this.t2 = t2;
        this.cid = cid;
        this.s = s;
   
    }

    @Override
    public void printMe() {
        System.out.println("AST_DEC_FUNC Node: " + name);
        if (returnType != null) returnType.printMe();
        if (body != null) body.printMe();
    }
}