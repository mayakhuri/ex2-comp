   
import java.io.*;
import java.io.PrintWriter;
import java_cup.runtime.Symbol;
import AST.*;

public class Main
{
	static public void main(String argv[])
	{
		Lexer l;
		Parser p;
		Symbol s;
		AST_STMT_LIST AST;
		FileReader file_reader;
		PrintWriter file_writer;
		String inputFilename = argv[0];
		String outputFilename = argv[1];
		
		try
		{
			/********************************/
			/* [1] Initialize a file reader */
			/********************************/
			file_reader = new FileReader(inputFilename);

			/********************************/
			/* [2] Initialize a file writer */
			/********************************/
			file_writer = new PrintWriter(outputFilename);
			
			/******************************/
			/* [3] Initialize a new lexer */
			/******************************/
			l = new Lexer(file_reader);
			
			/*******************************/
			/* [4] Initialize a new parser */
			/*******************************/
			p = new Parser(l);

			/***********************************/
			/* [5] 3 ... 2 ... 1 ... Parse !!! */
			/***********************************/
			AST = (AST_STMT_LIST) p.parse().value;
			
			/*************************/
			/* [6] Print the AST ... */
			/*************************/
			AST.PrintMe();
			
			/*************************/
			/* [7] Close output file */
			/*************************/
			file_writer.close();
			
			/*************************************/
			/* [8] Finalize AST GRAPHIZ DOT file */
			/*************************************/
			AST_GRAPHVIZ.getInstance().finalizeFile();
    	}
			     
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}








package AST;



// AST_TYPE: Type declaration




// AST_STMT: Base class for statements
public abstract class AST_STMT extends AST_Node {}

// AST_STMT_ASSIGN: Assignment statement
public class AST_STMT_ASSIGN extends AST_STMT {
    public AST_EXP var;
    public AST_EXP exp;

    public AST_STMT_ASSIGN(AST_EXP var, AST_EXP exp) {
        this.var = var;
        this.exp = exp;
    }

    @Override
    public void printMe() {
        System.out.println("AST_STMT_ASSIGN Node");
        if (var != null) var.printMe();
        if (exp != null) exp.printMe();
    }
}

// AST_ARRAY_TYPEDEF: Array typedef declaration
public class AST_ARRAY_TYPEDEF extends AST_DEC {
    public String name;
    public AST_TYPE type;

    public AST_ARRAY_TYPEDEF(String name, AST_TYPE type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void printMe() {
        System.out.println("AST_ARRAY_TYPEDEF Node: " + name);
        if (type != null) type.printMe();
    }
}


