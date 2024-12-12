package AST;

public class AST_CFIELDS_LIST extends AST_Node
{

	public AST_CFIELD h;
	public AST_CFIELD_LIST t;

	/******************/
	/* CONSTRUCTOR(S) */
	/******************/
	public AST_CFIELDS_LIST(AST_CFIELD h,AST_CFIELD_LIST t)
	{

		this.h = h;
		this.t = t;
	}

	
}