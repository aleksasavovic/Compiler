// generated with ast extension for cup
// version 0.8
// 18/0/2021 23:50:26


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclDerived1 extends ClassDecl {

    private String name;
    private ClassExtended ClassExtended;
    private VarDeclList VarDeclList;
    private ClassMethodList ClassMethodList;

    public ClassDeclDerived1 (String name, ClassExtended ClassExtended, VarDeclList VarDeclList, ClassMethodList ClassMethodList) {
        this.name=name;
        this.ClassExtended=ClassExtended;
        if(ClassExtended!=null) ClassExtended.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.ClassMethodList=ClassMethodList;
        if(ClassMethodList!=null) ClassMethodList.setParent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public ClassExtended getClassExtended() {
        return ClassExtended;
    }

    public void setClassExtended(ClassExtended ClassExtended) {
        this.ClassExtended=ClassExtended;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public ClassMethodList getClassMethodList() {
        return ClassMethodList;
    }

    public void setClassMethodList(ClassMethodList ClassMethodList) {
        this.ClassMethodList=ClassMethodList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassExtended!=null) ClassExtended.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(ClassMethodList!=null) ClassMethodList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassExtended!=null) ClassExtended.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(ClassMethodList!=null) ClassMethodList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassExtended!=null) ClassExtended.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(ClassMethodList!=null) ClassMethodList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclDerived1(\n");

        buffer.append(" "+tab+name);
        buffer.append("\n");

        if(ClassExtended!=null)
            buffer.append(ClassExtended.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ClassMethodList!=null)
            buffer.append(ClassMethodList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclDerived1]");
        return buffer.toString();
    }
}
