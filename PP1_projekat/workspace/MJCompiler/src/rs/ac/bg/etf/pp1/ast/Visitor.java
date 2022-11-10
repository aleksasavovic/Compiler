// generated with ast extension for cup
// version 0.8
// 18/0/2021 23:50:26


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Unmatched Unmatched);
    public void visit(OptAddTerm OptAddTerm);
    public void visit(AddExpr AddExpr);
    public void visit(ExprCommaList ExprCommaList);
    public void visit(Matched Matched);
    public void visit(CondTermOrList CondTermOrList);
    public void visit(OptMulFactor OptMulFactor);
    public void visit(OptMinus OptMinus);
    public void visit(FormParamDecl FormParamDecl);
    public void visit(StatementList StatementList);
    public void visit(ElseStm ElseStm);
    public void visit(Factor Factor);
    public void visit(DeclList DeclList);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(ClassMethodList ClassMethodList);
    public void visit(MulOp MulOp);
    public void visit(CaseList CaseList);
    public void visit(RelOp RelOp);
    public void visit(AssignOp AssignOp);
    public void visit(ActualParamList ActualParamList);
    public void visit(VarDeclBase VarDeclBase);
    public void visit(VarDeclList VarDeclList);
    public void visit(Expr Expr);
    public void visit(MethodTypeName MethodTypeName);
    public void visit(AddOp AddOp);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(CondFactAndList CondFactAndList);
    public void visit(ActualPars ActualPars);
    public void visit(FormParamList FormParamList);
    public void visit(Decl Decl);
    public void visit(ComplexDesignator ComplexDesignator);
    public void visit(ArrayBracket ArrayBracket);
    public void visit(OptActParsWithParens OptActParsWithParens);
    public void visit(Statement Statement);
    public void visit(ConstInitList ConstInitList);
    public void visit(VarDecl VarDecl);
    public void visit(ConstInit ConstInit);
    public void visit(ClassDecl ClassDecl);
    public void visit(CondFact CondFact);
    public void visit(OptActPars OptActPars);
    public void visit(ClassExtended ClassExtended);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(FormPars FormPars);
    public void visit(VarDeclBaseList VarDeclBaseList);
    public void visit(AssignOpDerived1 AssignOpDerived1);
    public void visit(LessEqualOp LessEqualOp);
    public void visit(LessOp LessOp);
    public void visit(MoreEqualOp MoreEqualOp);
    public void visit(MoreOp MoreOp);
    public void visit(NotEqualsOp NotEqualsOp);
    public void visit(EqualsOp EqualsOp);
    public void visit(MulOpMod MulOpMod);
    public void visit(MulOpDiv MulOpDiv);
    public void visit(MulOpMul MulOpMul);
    public void visit(AddOpMinus AddOpMinus);
    public void visit(AddOpPlus AddOpPlus);
    public void visit(DesignatorArray DesignatorArray);
    public void visit(BaseDesignator BaseDesignator);
    public void visit(ArrayAccessDesignator ArrayAccessDesignator);
    public void visit(ClassAccessDesignator ClassAccessDesignator);
    public void visit(ActualParam ActualParam);
    public void visit(ActualParams ActualParams);
    public void visit(NoActuals NoActuals);
    public void visit(Actuals Actuals);
    public void visit(NoOptActParrenWithParens NoOptActParrenWithParens);
    public void visit(SingleOptActParsWithParens SingleOptActParsWithParens);
    public void visit(BaseObjCreatingFactor BaseObjCreatingFactor);
    public void visit(ArgObjCreatingFactor ArgObjCreatingFactor);
    public void visit(BoolFactor BoolFactor);
    public void visit(ExprFactor ExprFactor);
    public void visit(CharFactor CharFactor);
    public void visit(NumFactor NumFactor);
    public void visit(VarFactor VarFactor);
    public void visit(TermBase TermBase);
    public void visit(TermMulOpFactor TermMulOpFactor);
    public void visit(NoOptMinusExpr NoOptMinusExpr);
    public void visit(OptMinusExpr OptMinusExpr);
    public void visit(NegativeAddExpression NegativeAddExpression);
    public void visit(AddExpression AddExpression);
    public void visit(Colon Colon);
    public void visit(ExprCondition ExprCondition);
    public void visit(ExprAdd ExprAdd);
    public void visit(CondFactRelOp CondFactRelOp);
    public void visit(CondFactBase CondFactBase);
    public void visit(NoCondFactAndList NoCondFactAndList);
    public void visit(ManyCondFactAndList ManyCondFactAndList);
    public void visit(CondTerm CondTerm);
    public void visit(NoCondTermOrList NoCondTermOrList);
    public void visit(ManyCondTermOrList ManyCondTermOrList);
    public void visit(Condition Condition);
    public void visit(NoOptActPars NoOptActPars);
    public void visit(SingleOptActPars SingleOptActPars);
    public void visit(NoExprCommaList NoExprCommaList);
    public void visit(ExpressionCommaList ExpressionCommaList);
    public void visit(ActPars ActPars);
    public void visit(DesignatorStatementFunctionCall DesignatorStatementFunctionCall);
    public void visit(DesignatorStatementDecrement DesignatorStatementDecrement);
    public void visit(DesignatorStatementIncrement DesignatorStatementIncrement);
    public void visit(DesignatorStatementEqualError DesignatorStatementEqualError);
    public void visit(DesignatorStatementEqual DesignatorStatementEqual);
    public void visit(NoElseStm NoElseStm);
    public void visit(OneElseStm OneElseStm);
    public void visit(NoCaseList NoCaseList);
    public void visit(ManyCaseList ManyCaseList);
    public void visit(Print Print);
    public void visit(Return Return);
    public void visit(SwitchStatement SwitchStatement);
    public void visit(DoWhileLoopStatement DoWhileLoopStatement);
    public void visit(IfElseStatement IfElseStatement);
    public void visit(BraceStatement BraceStatement);
    public void visit(TypeReturnStatement TypeReturnStatement);
    public void visit(VoidReturnStatement VoidReturnStatement);
    public void visit(ContinueStatement ContinueStatement);
    public void visit(BreakStatement BreakStatement);
    public void visit(PrintStatementTwoArguments PrintStatementTwoArguments);
    public void visit(PrintStatementOneArgument PrintStatementOneArgument);
    public void visit(ReadStatement ReadStatement);
    public void visit(DesignatorStatementt DesignatorStatementt);
    public void visit(NoStmt NoStmt);
    public void visit(Statements Statements);
    public void visit(Type Type);
    public void visit(FormParamDeclArray FormParamDeclArray);
    public void visit(FormParamDeclNotArray FormParamDeclNotArray);
    public void visit(SingleFormParamDecl SingleFormParamDecl);
    public void visit(FormParamDecls FormParamDecls);
    public void visit(NoFormParam NoFormParam);
    public void visit(FormParams FormParams);
    public void visit(MethodVoid MethodVoid);
    public void visit(MethodType MethodType);
    public void visit(MethodDecl MethodDecl);
    public void visit(NoMethodDeclListarations NoMethodDeclListarations);
    public void visit(MethodDeclListarations MethodDeclListarations);
    public void visit(NoVarDeclarations NoVarDeclarations);
    public void visit(VarDeclarations VarDeclarations);
    public void visit(NoClassMethods NoClassMethods);
    public void visit(ClassMethods ClassMethods);
    public void visit(ClassNotExtended ClassNotExtended);
    public void visit(ClassIsExtended ClassIsExtended);
    public void visit(ClassDeclDerived1 ClassDeclDerived1);
    public void visit(VarDeclBaseNotArray VarDeclBaseNotArray);
    public void visit(VarDeclBaseArray VarDeclBaseArray);
    public void visit(SingleVarDeclarationBase SingleVarDeclarationBase);
    public void visit(VarDeclarationsBaseError VarDeclarationsBaseError);
    public void visit(VarDeclarationsBase VarDeclarationsBase);
    public void visit(VarDeclError VarDeclError);
    public void visit(VarDeclNoError VarDeclNoError);
    public void visit(ConstBoolInit ConstBoolInit);
    public void visit(ConstCharInit ConstCharInit);
    public void visit(ConstNumInit ConstNumInit);
    public void visit(SingleConstInitiation SingleConstInitiation);
    public void visit(ConstInitiations ConstInitiations);
    public void visit(ConstDecl ConstDecl);
    public void visit(NoDeclList NoDeclList);
    public void visit(DecClassList DecClassList);
    public void visit(DecVarList DecVarList);
    public void visit(DecConstList DecConstList);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}