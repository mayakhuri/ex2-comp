public class AST_DEC_FUNC extends AST_DEC {
    public AST_TYPE returnType;
    public String name;
    public AST_STMT body;
		

    public AST_DEC_FUNC(AST_TYPE returnType, String name, AST_STMT body) {
        this.returnType = returnType;
        this.name = name;
        this.body = body;
    }

    @Override
    public void printMe() {
        System.out.println("AST_DEC_FUNC Node: " + name);
        if (returnType != null) returnType.printMe();
        if (body != null) body.printMe();
    }
}