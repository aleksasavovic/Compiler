package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CodeGenerator extends VisitorAdaptor {
	
	private int mainPc;
	
	public int getMainPc() {
		return mainPc;
	}
	
	@Override
	public void visit(MethodVoid methodTypeName) {
		methodTypeName.obj.setAdr(Code.pc);
		if ("main".equalsIgnoreCase(methodTypeName.getName())) {
			mainPc = Code.pc;
		}
		
		// Generate the entry.
		Code.put(Code.enter);
		Code.put(0);
		Code.put(methodTypeName.obj.getLocalSymbols().size());
	}
	
	@Override
	public void visit(MethodType methodTypeName) {
		methodTypeName.obj.setAdr(Code.pc);
		
		// Generate the entry.
		Code.put(Code.enter);
		Code.put(0);
		Code.put(methodTypeName.obj.getLocalSymbols().size());
	}
	
	@Override
	public void visit(MethodDecl MethodDecl) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	@Override
	public void visit(TypeReturnStatement ReturnExpr) {
		
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	@Override
	public void visit(VoidReturnStatement ReturnNoExpr) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	@Override
	public void visit(NumFactor numFactor) {
		Code.loadConst(numFactor.getN1());
	}
	@Override
	public void visit(CharFactor charFactor) {
		Code.loadConst(charFactor.getC1());
	}
	@Override
	public void visit(BoolFactor boolFactor) {
		Code.loadConst(boolFactor.getB1()? 1 : 0);
	}
	
	@Override
	public void visit(VarFactor varFactor) {
		if (varFactor.getOptActParsWithParens() instanceof NoOptActParrenWithParens)
			Code.load(varFactor.getDesignator().obj);
	}
	@Override
	public void visit(ArgObjCreatingFactor argObjCreatingFactor) {
		Code.put(Code.newarray);
		if (argObjCreatingFactor.getType().struct == Tab.charType) 
			Code.put(0);
		else Code.put(1);
	}
	
	@Override
	public void visit(AddExpression addExpr) {
		if(addExpr.getAddOp() instanceof AddOpPlus)
			Code.put(Code.add);
		else Code.put(Code.sub);
	}
	
	@Override
	public void visit(TermMulOpFactor termMulOpFactor) {
		if(termMulOpFactor.getMulOp() instanceof MulOpMul)
			Code.put(Code.mul);
		else if (termMulOpFactor.getMulOp() instanceof MulOpDiv)
			Code.put(Code.div);
		else Code.put(Code.rem);
	}
	
	@Override
	public void visit(NegativeAddExpression negativeAddExpression) {
		if(negativeAddExpression.getOptMinus() instanceof OptMinusExpr)
			Code.put(Code.neg);
	}
	
	@Override
	public void visit(DesignatorStatementEqual assignment) {
		Code.store(assignment.getDesignator().obj);
	}
	
	public void visit(DesignatorStatementIncrement increment) {
		Obj obj = increment.getDesignator().obj;
		if (obj.getKind()==Obj.Elem)
			Code.put(Code.dup2);
		Code.load(obj);
		Code.loadConst(1);
		Code.put(Code.add);
		Code.store(obj);
	}
	public void visit(DesignatorStatementDecrement decrement) {
		Obj obj = decrement.getDesignator().obj;
		if (obj.getKind()==Obj.Elem)
			Code.put(Code.dup2);
		Code.load(obj);
		Code.loadConst(-1);
		Code.put(Code.add);
		Code.store(obj);
	}
	
	@Override
	public void visit(PrintStatementOneArgument printStmt) {
		Code.loadConst(1);
		if (printStmt.getExpr().struct == Tab.charType)
			Code.put(Code.bprint);
		else
			Code.put(Code.print);
	}
	@Override
	public void visit(PrintStatementTwoArguments printStmt) {
		Code.loadConst(printStmt.getValue());
		if (printStmt.getExpr().struct == Tab.charType)
			Code.put(Code.bprint);
		else
			Code.put(Code.print);
	}
	@Override
	public void visit(ReadStatement readStmt) {
		
		if (readStmt.getDesignator().obj.getType() == Tab.charType)
			Code.put(Code.bread);
		else
			Code.put(Code.read);
		Code.store(readStmt.getDesignator().obj);
	}
	@Override
	public void visit(DesignatorArray designatorArray) {
		Code.load(designatorArray.getDesignator().obj);
	
	}
	@Override
	public void visit(CondFactRelOp condFactRelOp) {
		int op;
		if(condFactRelOp.getRelOp() instanceof EqualsOp)
			op = Code.eq;
		else if(condFactRelOp.getRelOp() instanceof NotEqualsOp)
			op = Code.ne;
		else if(condFactRelOp.getRelOp() instanceof MoreEqualOp)
			op = Code.ge;
		else if(condFactRelOp.getRelOp() instanceof MoreOp)
			op = Code.gt;
		else if(condFactRelOp.getRelOp() instanceof LessEqualOp)
			op = Code.le;
		else 
			op = Code.lt;
		Code.putFalseJump(op, 0);
		int adr = Code.pc-2;
		condFactRelOp.struct= new Struct(adr);
	}
	@Override
	public void visit(CondFactBase condFactBase) {
		Code.loadConst(1);
		Code.putFalseJump(Code.eq, 0);
		int adr = Code.pc-2;
		condFactBase.struct= new Struct(adr);
	}
	
	@Override
	public void visit(Colon colon) {
		Code.putJump(0);
		int adr = Code.pc-2;
		colon.struct= new Struct(adr);
		
		ExprCondition ec = (ExprCondition)colon.getParent();
		Code.fixup(ec.getCondFact().struct.getKind());
	}
	
	@Override
	public void visit(ExprCondition exprCondition) {
		Code.fixup(exprCondition.getColon().struct.getKind());
	}
	
}
