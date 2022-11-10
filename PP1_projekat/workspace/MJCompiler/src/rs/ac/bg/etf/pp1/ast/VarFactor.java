// generated with ast extension for cup
// version 0.8
// 18/0/2021 23:50:26


package rs.ac.bg.etf.pp1.ast;

public class VarFactor extends Factor {

    private Designator Designator;
    private OptActParsWithParens OptActParsWithParens;

    public VarFactor (Designator Designator, OptActParsWithParens OptActParsWithParens) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.OptActParsWithParens=OptActParsWithParens;
        if(OptActParsWithParens!=null) OptActParsWithParens.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public OptActParsWithParens getOptActParsWithParens() {
        return OptActParsWithParens;
    }

    public void setOptActParsWithParens(OptActParsWithParens OptActParsWithParens) {
        this.OptActParsWithParens=OptActParsWithParens;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(OptActParsWithParens!=null) OptActParsWithParens.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(OptActParsWithParens!=null) OptActParsWithParens.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(OptActParsWithParens!=null) OptActParsWithParens.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarFactor(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptActParsWithParens!=null)
            buffer.append(OptActParsWithParens.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarFactor]");
        return buffer.toString();
    }
}
