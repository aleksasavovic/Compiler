// generated with ast extension for cup
// version 0.8
// 18/0/2021 23:50:26


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarationsBaseError extends VarDeclBaseList {

    private VarDeclBase VarDeclBase;

    public VarDeclarationsBaseError (VarDeclBase VarDeclBase) {
        this.VarDeclBase=VarDeclBase;
        if(VarDeclBase!=null) VarDeclBase.setParent(this);
    }

    public VarDeclBase getVarDeclBase() {
        return VarDeclBase;
    }

    public void setVarDeclBase(VarDeclBase VarDeclBase) {
        this.VarDeclBase=VarDeclBase;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclBase!=null) VarDeclBase.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclBase!=null) VarDeclBase.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclBase!=null) VarDeclBase.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarationsBaseError(\n");

        if(VarDeclBase!=null)
            buffer.append(VarDeclBase.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarationsBaseError]");
        return buffer.toString();
    }
}
