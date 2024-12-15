package AST;
public class AST_COMMA_ID extends AST_NODE{
  public AST_COMMA_ID cid;
  public AST_TYPE type;
  public String ID;

  public AST_COMMA_ID(AST_COMMA_ID cid, AST_TYPE type, String ID){
    this.cid = cid;
    this.type = type;
    this.ID = ID;
  }

}