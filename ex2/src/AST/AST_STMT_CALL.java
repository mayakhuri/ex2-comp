package AST;

public class AST_EXP_CALL extends AST_EXP
{
	public AST_VAR var = null;
    public AST_CXP CXP = null;
    public String ID = null;
    public AST_EXP exp = null;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/


					| ID:id LPAREN exp:e RPAREN SEMICOLON					{: RESULT = new AST_STMT_CALL(id,e);:}


                    
	public AST_EXP_CALL(String ID,AST_EXP e,AST_CXP c)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
		this.exp = e;
        this.CXP=  c;
        this.ID = ID;
	}
    public AST_EXP_CALL(AST_VAR var,String ID)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
		this.var = var;
        this.ID = ID;

	}
    public AST_EXP_CALL(AST_VAR var,String ID,AST_EXP e)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
		System.out.print("====================== exp -> var\n");
		this.var = var;
        this.exp = e;
        this.ID = ID;
	}
    public AST_EXP_CALL(AST_VAR var,String ID,AST_EXP e,AST_CXP c)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
		System.out.print("====================== exp -> var\n");
		this.var = var;
        this.exp = e;
        this.ID = ID;
        this.CXP=  c;

	}
    public AST_EXP_CALL(String ID)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
        this.ID = ID;
	}
    public AST_EXP_CALL(String ID,AST_EXP e)
	{
		SerialNumber = AST_Node_Serial_Number.getFresh();
		this.exp = e;
        this.ID = ID;
	}

	
	/************************not changed yet***********************/
	/* The default message for an exp var AST node */
	/***********************************************/
	public void PrintMe()
	{
		/************************************/
		/* AST NODE TYPE = EXP VAR AST NODE */
		/************************************/
		System.out.print("AST NODE FCALL VAR\n");

		/*****************************/
		/* RECURSIVELY PRINT var ... */
		/*****************************/
		if (var != null) var.PrintMe();
		
		/*********************************/
		/* Print to AST GRAPHIZ DOT file */
		/*********************************/
		AST_GRAPHVIZ.getInstance().logNode(
			SerialNumber,
			"EXP\nVAR");

		/****************************************/
		/* PRINT Edges to AST GRAPHVIZ DOT file */
		/****************************************/
		AST_GRAPHVIZ.getInstance().logEdge(SerialNumber,var.SerialNumber);
			
	}
}
