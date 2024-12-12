package AST;

public class AST_CXP extends AST_Node
{
	/****************/
	/* DATA MEMBERS */
	/****************/
	public AST_EXP head;
	public AST_CXP tail;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_M_STMT(AST_EXP head,AST_CXP tail)
	{
		/******************************/
		/* SET A UNIQUE SERIAL NUMBER */
		/******************************/
		SerialNumber = AST_Node_Serial_Number.getFresh();

		/*******************************/
		this.head = head;
		this.tail = tail;
	}

	/******************************************************/
	/* The printing message for a statement list AST node */
	/******************************************************/
	
}
