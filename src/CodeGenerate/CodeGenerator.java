//package CodeGenerate;
//import AST.Classes.Program;
//
//package CodeGen;
//
//import AST.Classes.*;
//
//public class CodeGenerator {
//    private StringBuilder output = new StringBuilder();
//    private int indentLevel = 0;
//
//    // إضافة نص مع الإندنتيشن
//    private void append(String str) {
//        output.append("  ".repeat(indentLevel)).append(str).append("\n");
//    }
//
//    // زيادة مستوى الإندنتيشن
//    private void indent() {
//        indentLevel++;
//    }
//
//    // تقليل مستوى الإندنتيشن
//    private void dedent() {
//        indentLevel--;
//    }
//
//    // بدء عملية التوليد
//    public String generate(Program program) {
//        visitProgram(program);
//        return output.toString();
//    }
//
//    // زيارة عقدة البرنامج
//    private void visitProgram(Program program) {
//        if (program.getHtmlDocument() != null) {
//            visitHtmlDocument(program.getHtmlDocument());
//        }
//        if (program.getStatement() != null) {
//            for (Statement statement : program.getStatement()) {
//                visitStatement(statement);
//            }
//        }
//    }
//
//    // زيارة عبارة
//    private void visitStatement(Statement statement) {
//        if (statement.getImportStatement() != null) {
//            visitImportStatement(statement.getImportStatement());
//        } else if (statement.getComponentDefinition() != null) {
//            visitComponentDefinition(statement.getComponentDefinition());
//        } else if (statement.getClassDeclaration() != null) {
//            visitClassDeclaration(statement.getClassDeclaration());
//        } else if (statement.getExportStatement() != null) {
//            visitExportStatement(statement.getExportStatement());
//        } else if (statement.getExportDefault() != null) {
//            visitExportDefault(statement.getExportDefault());
//        } else if (statement.getVariableDeclaration() != null) {
//            visitVariableDeclaration(statement.getVariableDeclaration());
//        } else if (statement.getIfStatement() != null) {
//            visitIfStatement(statement.getIfStatement());
//        } else if (statement.getExpressionStatement() != null) {
//            visitExpressionStatement(statement.getExpressionStatement());
//        } else if (statement.getMethodDeclaration() != null) {
//            visitMethodDeclaration(statement.getMethodDeclaration());
//        } else if (statement.getInterfaceDeclaration() != null) {
//            visitInterfaceDeclaration(statement.getInterfaceDeclaration());
//        }
//    }
//
//    // زيارة عبارة الاستيراد
//    private void visitImportStatement(ImportStatement importStatement) {
//        String clause = visitImportClause(importStatement.getImportClause());
//        append(String.format("import %s from %s%s",
//                clause, importStatement.getSTRING(), importStatement.getSEMI_Q() != null ? ";" : ""));
//    }
//
//    private String visitImportClause(ImportClause importClause) {
//        if (importClause.getIDENTIFIER() != null) {
//            return importClause.getIDENTIFIER();
//        } else if (importClause.getImportItems() != null) {
//            ImportItems items = importClause.getImportItems();
//            return String.format("{ %s }",
//                    String.join(", ", items.getIDENTIFIER()));
//        }
//        return "";
//    }
//
//    // زيارة تعريف المكون
//    private void visitComponentDefinition(ComponentDefinition componentDefinition) {
//        append(String.format("@%s%s", componentDefinition.getCOMPONENT(),
//                visitComponentMetadata(componentDefinition.getComponentMetadata())));
//        if (componentDefinition.getClassDeclaration() != null) {
//            visitClassDeclaration(componentDefinition.getClassDeclaration());
//        }
//    }
//
//    private String visitComponentMetadata(ComponentMetadata metadata) {
//        StringBuilder result = new StringBuilder();
//        result.append("{\n");
//        indent();
//        if (metadata.getComponentMetadataPropertyList() != null) {
//            ComponentMetadataPropertyList propList = metadata.getComponentMetadataPropertyList();
//            for (ComponentMetadataProperty prop : propList.getComponentMetadataProperty()) {
//                visitComponentMetadataProperty(prop);
//            }
//        }
//        dedent();
//        append("}");
//        return result.toString();
//    }
//
//    private void visitComponentMetadataProperty(ComponentMetadataProperty prop) {
//        if (prop.getSELECTOR() != null) {
//            append(String.format("selector: %s,", prop.getSTRING()));
//        } else if (prop.getSTANDALONE() != null) {
//            append(String.format("standalone: %s,", prop.getBOOLEAN_LITERAL()));
//        } else if (prop.getIMPORTS() != null) {
//            append(String.format("imports: %s,", visitValue(prop.getValue())));
//        } else if (prop.getTEMPLATE() != null) {
//            append(String.format("template: %s,", prop.getTEMPLATE_STR()));
//        } else if (prop.getSTYLE_URLS() != null) {
//            append(String.format("styleUrls: %s,", visitArrayLiteral(prop.getArrayLiteral())));
//        } else if (prop.getIDENTIFIER() != null) {
//            append(String.format("%s: %s,", prop.getIDENTIFIER(), visitValue(prop.getValue())));
//        }
//    }
//
//    // زيارة تعريف الكلاس
//    private void visitClassDeclaration(ClassDeclaration classDeclaration) {
//        StringBuilder classDef = new StringBuilder();
//        classDef.append(String.format("class %s", classDeclaration.getIDENTIFIER().get(0)));
//        if (classDeclaration.getEXTENDS() != null) {
//            classDef.append(String.format(" extends %s", classDeclaration.getIDENTIFIER().get(1)));
//        }
//        if (classDeclaration.getIMPLEMENTS() != null) {
//            classDef.append(String.format(" implements %s",
//                    String.join(", ", classDeclaration.getIDENTIFIER().subList(2, classDeclaration.getIDENTIFIER().size()))));
//        }
//        append(classDef.toString() + " {");
//        indent();
//        if (classDeclaration.getClassBody() != null) {
//            for (ClassElement element : classDeclaration.getClassBody().getClassElement()) {
//                visitClassElement(element);
//            }
//        }
//        dedent();
//        append("}");
//    }
//
//    private void visitClassElement(ClassElement element) {
//        if (element.getConstructorDeclaration() != null) {
//            visitConstructorDeclaration(element.getConstructorDeclaration());
//        } else if (element.getMethodDeclaration() != null) {
//            visitMethodDeclaration(element.getMethodDeclaration());
//        } else if (element.getFieldDeclaration() != null) {
//            visitFieldDeclaration(element.getFieldDeclaration());
//        }
//    }
//
//    // زيارة تعريف المنشئ
//    private void visitConstructorDeclaration(ConstructorDeclaration constructor) {
//        StringBuilder params = new StringBuilder();
//        if (constructor.getParamList() != null) {
//            params.append(visitParamList(constructor.getParamList()));
//        }
//        append(String.format("constructor(%s) {", params));
//        indent();
//        if (constructor.getBlock() != null) {
//            visitBlock(constructor.getBlock());
//        }
//        dedent();
//        append("}");
//    }
//
//    // زيارة إعلان المتغير
//    private void visitVariableDeclaration(VariableDeclaration varDecl) {
//        StringBuilder decl = new StringBuilder();
//        decl.append(varDecl.getLET() != null ? "let " : "const ");
//        if (varDecl.getIDENTIFIER() != null) {
//            decl.append(varDecl.getIDENTIFIER());
//        } else if (varDecl.getDestructuringAssignment() != null) {
//            decl.append(visitDestructuringAssignment(varDecl.getDestructuringAssignment()));
//        }
//        if (varDecl.getTypeAnnotation() != null) {
//            decl.append(": ").append(visitTypeAnnotation(varDecl.getTypeAnnotation()));
//        }
//        decl.append(" = ").append(visitExpression(varDecl.getExpression()));
//        append(decl.toString() + (varDecl.getSEMI_Q() != null ? ";" : ""));
//    }
//
//    // زيارة مستند HTML
//    private void visitHtmlDocument(HtmlDocument htmlDocument) {
//        if (htmlDocument.getDOCTYPE() != null) {
//            append("<!DOCTYPE html>");
//        }
//        for (HtmlElement element : htmlDocument.getHtmlElement()) {
//            visitHtmlElement(element);
//        }
//    }
//
//    private void visitHtmlElement(HtmlElement element) {
//        StringBuilder tag = new StringBuilder("<");
//        // نأخذ اسم الوسم الأول لفتح الوسم
//        tag.append(visitHtmlTagName(element.getHtmlTagName().get(0)));
//        for (Attribute attr : element.getAttribute()) {
//            tag.append(" ").append(visitAttribute(attr));
//        }
//        if (element.getSLASH() != null) {
//            // وسم ذاتي الإغلاق (مثل <br />)
//            tag.append(" />");
//            append(tag.toString());
//        } else {
//            tag.append(">");
//            append(tag.toString());
//            indent();
//            // معالجة الوسوم الداخلية (htmlTagName) إذا وجدت
//            if (element.getHtmlTagName().size() > 1) {
//                for (int i = 1; i < element.getHtmlTagName().size() - 1; i++) {
//                    // توليد الوسوم الداخلية كعناصر نصية
//                    append(visitHtmlTagName(element.getHtmlTagName().get(i)));
//                }
//            }
//            dedent();
//            // إغلاق الوسم باستخدام آخر وسم في القائمة
//            append(String.format("</%s>", visitHtmlTagName(element.getHtmlTagName().get(element.getHtmlTagName().size() - 1))));
//        }
//    }
//
//    private String visitHtmlTagName(HtmlTagName tagName) {
//        if (tagName.getIDENTIFIER() != null) return tagName.getIDENTIFIER();
//        if (tagName.getHTML() != null) return tagName.getHTML();
//        if (tagName.getHEAD() != null) return tagName.getHEAD();
//        if (tagName.getBODY() != null) return tagName.getBODY();
//        if (tagName.getMETA() != null) return tagName.getMETA();
//        if (tagName.getTITLE() != null) return tagName.getTITLE();
//        if (tagName.getBASE() != null) return tagName.getBASE();
//        if (tagName.getLINK() != null) return tagName.getLINK();
//        return "";
//    }
//
//    private String visitAttribute(Attribute attr) {
//        StringBuilder result = new StringBuilder(attr.getIDENTIFIER());
//        if (attr.getASSIGN() != null) {
//            result.append("=").append(attr.getSTRING() != null ? attr.getSTRING() :
//                    attr.getNUMBER() != null ? attr.getNUMBER() :
//                            attr.getBOOLEAN_LITERAL() != null ? attr.getBOOLEAN_LITERAL() :
//                                    attr.getIDENTIFIER());
//        }
//        return result.toString();
//    }
//
//    private void visitHtmlContent(HtmlContent content) {
//        if (content.getHtmlElement() != null) {
//            visitHtmlElement(content.getHtmlElement());
//        } else if (content.getExpression() != null) {
//            append(visitExpression(content.getExpression()));
//        } else if (content.getSTRING() != null) {
//            append(content.getSTRING());
//        } else if (content.getIDENTIFIER() != null) {
//            append(content.getIDENTIFIER());
//        }
//    }
//
//    private String visitArrayLiteral(ArrayLiteral arrayLiteral) {
//        StringBuilder result = new StringBuilder("[");
//        for (int i = 0; i < arrayLiteral.getExpression().size(); i++) {
//            result.append(visitExpression(arrayLiteral.getExpression().get(i)));
//            if (i < arrayLiteral.getCOMMA().size()) {
//                result.append(", ");
//            }
//        }
//        result.append("]");
//        return result.toString();
//    }
//
//    private String visitValue(Value value) {
//        if (value.getExpression() != null) {
//            return visitExpression(value.getExpression());
//        } else if (value.getArrayLiteral() != null) {
//            return visitArrayLiteral(value.getArrayLiteral());
//        } else if (value.getTEMPLATE_STR() != null) {
//            return value.getTEMPLATE_STR();
//        }
//        return "";
//    }
//
//    private String visitExpression(Expression expr) {
//        if (expr.getAssignmentExpression() != null) {
//            return visitAssignmentExpression(expr.getAssignmentExpression());
//        }
//        return "";
//    }
//
//    private String visitAssignmentExpression(AssignmentExpression assignExpr) {
//        StringBuilder result = new StringBuilder(visitConditionalExpression(assignExpr.getConditionalExpression()));
//        if (assignExpr.getASSIGN() != null && assignExpr.getAssignmentExpression() != null) {
//            result.append(" = ").append(visitAssignmentExpression(assignExpr.getAssignmentExpression()));
//        }
//        return result.toString();
//    }
//
//    private String visitConditionalExpression(ConditionalExpression condExpr) {
//        StringBuilder result = new StringBuilder(visitLogicalOrExpression(condExpr.getLogicalOrExpression()));
//        if (condExpr.getQUESTION() != null) {
//            result.append(" ? ").append(visitAssignmentExpression(condExpr.getAssignmentExpression()))
//                    .append(" : ").append(visitAssignmentExpression(condExpr.getAssignmentExpression2()));
//        }
//        return result.toString();
//    }
//
//    private String visitLogicalOrExpression(LogicalOrExpression logicalOr) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < logicalOr.getLogicalAndExpression().size(); i++) {
//            result.append(visitLogicalAndExpression(logicalOr.getLogicalAndExpression().get(i)));
//            if (i < logicalOr.getLOGICAL_OR().size()) {
//                result.append(" || ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitLogicalAndExpression(LogicalAndExpression logicalAnd) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < logicalAnd.getEqualityExpression().size(); i++) {
//            result.append(visitEqualityExpression(logicalAnd.getEqualityExpression().get(i)));
//            if (i < logicalAnd.getLOGICAL_AND().size()) {
//                result.append(" && ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitEqualityExpression(EqualityExpression eqExpr) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < eqExpr.getRelationalExpression().size(); i++) {
//            result.append(visitRelationalExpression(eqExpr.getRelationalExpression().get(i)));
//            if (i < eqExpr.getEQ().size()) {
//                result.append(" == ");
//            } else if (i < eqExpr.getNE().size()) {
//                result.append(" != ");
//            } else if (i < eqExpr.getEQ_STRICT().size()) {
//                result.append(" === ");
//            } else if (i < eqExpr.getNE_STRICT().size()) {
//                result.append(" !== ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitRelationalExpression(RelationalExpression relExpr) {
//        return visitAdditiveExpression(relExpr.getAdditiveExpression());
//    }
//
//    private String visitAdditiveExpression(AdditiveExpression addExpr) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < addExpr.getMultiplicativeExpression().size(); i++) {
//            result.append(visitMultiplicativeExpression(addExpr.getMultiplicativeExpression().get(i)));
//            if (i < addExpr.getPLUS().size()) {
//                result.append(" + ");
//            } else if (i < addExpr.getMINUS().size()) {
//                result.append(" - ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitMultiplicativeExpression(MultiplicativeExpression mulExpr) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < mulExpr.getUnaryExpression().size(); i++) {
//            result.append(visitUnaryExpression(mulExpr.getUnaryExpression().get(i)));
//            if (i < mulExpr.getMULTIPLY().size()) {
//                result.append(" * ");
//            } else if (i < mulExpr.getDIVIDE().size()) {
//                result.append(" / ");
//            } else if (i < mulExpr.getMODULO().size()) {
//                result.append(" % ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitUnaryExpression(UnaryExpression unaryExpr) {
//        if (unaryExpr.getPostfixExpression() != null) {
//            return visitPostfixExpression(unaryExpr.getPostfixExpression());
//        } else if (unaryExpr.getUnaryExpression() != null) {
//            String op = unaryExpr.getPLUS() != null ? "+" :
//                    unaryExpr.getMINUS() != null ? "-" :
//                            unaryExpr.getEXCLAMATION() != null ? "!" : "";
//            return op + visitUnaryExpression(unaryExpr.getUnaryExpression());
//        }
//        return "";
//    }
//
//    private String visitPostfixExpression(PostfixExpression postfixExpr) {
//        StringBuilder result = new StringBuilder(visitPrimaryExpressionWithAssertion(postfixExpr.getPrimaryExpressionWithAssertion()));
//        for (PostfixOperator op : postfixExpr.getPostfixOperator()) {
//            result.append(visitPostfixOperator(op));
//        }
//        if (postfixExpr.getAS() != null && postfixExpr.getTypeName() != null) {
//            result.append(" as ").append(visitTypeName(postfixExpr.getTypeName()));
//        }
//        return result.toString();
//    }
//
//    private String visitPrimaryExpressionWithAssertion(PrimaryExpressionWithAssertion primary) {
//        StringBuilder result = new StringBuilder(visitPrimaryExpression(primary.getPrimaryExpression()));
//        if (primary.getPostfixAssertion() != null) {
//            result.append(visitPostfixAssertion(primary.getPostfixAssertion()));
//        }
//        return result.toString();
//    }
//
//    private String visitPostfixAssertion(PostfixAssertion assertion) {
//        return assertion.getEXCLAMATION();
//    }
//
//    private String visitPostfixOperator(PostfixOperator op) {
//        if (op.getDOT() != null) {
//            return "." + op.getIDENTIFIER();
//        } else if (op.getLPAREN() != null) {
//            String args = op.getArgumentList() != null ? visitArgumentList(op.getArgumentList()) : "";
//            return String.format("(%s)", args);
//        } else if (op.getLBRACK() != null) {
//            return String.format("[%s]", visitExpression(op.getExpression()));
//        }
//        return "";
//    }
//
//    private String visitPrimaryExpression(PrimaryExpression primary) {
//        if (primary.getTHIS() != null) return primary.getTHIS();
//        if (primary.getIDENTIFIER() != null) return primary.getIDENTIFIER();
//        if (primary.getHTML() != null) return primary.getHTML();
//        if (primary.getHEAD() != null) return primary.getHEAD();
//        if (primary.getBODY() != null) return primary.getBODY();
//        if (primary.getMETA() != null) return primary.getMETA();
//        if (primary.getTITLE() != null) return primary.getTITLE();
//        if (primary.getBASE() != null) return primary.getBASE();
//        if (primary.getLINK() != null) return primary.getLINK();
//        if (primary.getLiteral() != null) return visitLiteral(primary.getLiteral());
//        if (primary.getArrayLiteral() != null) return visitArrayLiteral(primary.getArrayLiteral());
//        if (primary.getObjectLiteral() != null) return visitObjectLiteral(primary.getObjectLiteral());
//        if (primary.getExpression() != null) return "(" + visitExpression(primary.getExpression()) + ")";
//        if (primary.getArrowFunction() != null) return visitArrowFunction(primary.getArrowFunction());
//        if (primary.getNEW() != null) {
//            String generics = primary.getGenericArguments() != null ? visitGenericArguments(primary.getGenericArguments()) : "";
//            String args = primary.getArgumentList() != null ? visitArgumentList(primary.getArgumentList()) : "";
//            return String.format("new %s%s(%s)", primary.getIDENTIFIER(), generics, args);
//        }
//        if (primary.getTEMPLATE_STR() != null) return primary.getTEMPLATE_STR();
//        if (primary.getIMPORT() != null) return String.format("import.meta.%s", primary.getIDENTIFIER());
//        return "";
//    }
//
//    private String visitLiteral(Literal literal) {
//        if (literal.getSTRING() != null) return literal.getSTRING();
//        if (literal.getNUMBER() != null) return literal.getNUMBER();
//        if (literal.getBOOLEAN_LITERAL() != null) return literal.getBOOLEAN_LITERAL();
//        if (literal.getNULL() != null) return literal.getNULL();
//        return "";
//    }
//
//    private String visitObjectLiteral(ObjectLiteral objLiteral) {
//        StringBuilder result = new StringBuilder("{");
//        for (int i = 0; i < objLiteral.getObjectProperty().size(); i++) {
//            result.append(visitObjectProperty(objLiteral.getObjectProperty().get(i)));
//            if (i < objLiteral.getCOMMA().size()) {
//                result.append(", ");
//            }
//        }
//        result.append("}");
//        return result.toString();
//    }
//
//    private String visitObjectProperty(ObjectProperty prop) {
//        if (prop.getSPREAD() != null) {
//            return "..." + visitExpression(prop.getExpression());
//        }
//        return String.format("%s: %s", prop.getIDENTIFIER(), visitExpression(prop.getExpression()));
//    }
//
//    private String visitArrowFunction(ArrowFunction arrowFunc) {
//        String params = visitArrowParameters(arrowFunc.getArrowParameters());
//        String body = visitArrowBody(arrowFunc.getArrowBody());
//        return String.format("%s => %s", params, body);
//    }
//
//    private String visitArrowParameters(ArrowParameters params) {
//        if (params.getIDENTIFIER() != null) return params.getIDENTIFIER();
//        if (params.getLPAREN() != null && params.getRPAREN() != null) {
//            if (params.getParameterList() != null) {
//                return "(" + visitParameterList(params.getParameterList()) + ")";
//            }
//            return "()";
//        }
//        return "";
//    }
//
//    private String visitParameterList(ParameterList paramList) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < paramList.getParameter().size(); i++) {
//            result.append(visitParameter(paramList.getParameter().get(i)));
//            if (i < paramList.getCOMMA().size()) {
//                result.append(", ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitParameter(Parameter param) {
//        String type = param.getTypeAnnotation() != null ? ": " + visitTypeAnnotation(param.getTypeAnnotation()) : "";
//        return param.getIDENTIFIER() + type;
//    }
//
//    private String visitArrowBody(ArrowBody body) {
//        if (body.getExpression() != null) {
//            return visitExpression(body.getExpression());
//        } else if (body.getBlock() != null) {
//            return visitBlock(body.getBlock());
//        }
//        return "";
//    }
//
//    private String visitBlock(Block block) {
//        StringBuilder result = new StringBuilder("{");
//        indent();
//        for (StatementInside stmt : block.getStatementInside()) {
//            visitStatementInside(stmt);
//        }
//        dedent();
//        result.append("\n").append("  ".repeat(indentLevel)).append("}");
//        return result.toString();
//    }
//
//    private void visitStatementInside(StatementInside stmt) {
//        if (stmt.getVariableDeclaration() != null) {
//            visitVariableDeclaration(stmt.getVariableDeclaration());
//        } else if (stmt.getIfStatement() != null) {
//            visitIfStatement(stmt.getIfStatement());
//        } else if (stmt.getExpressionStatement() != null) {
//            visitExpressionStatement(stmt.getExpressionStatement());
//        } else if (stmt.getFieldDeclaration() != null) {
//            visitFieldDeclaration(stmt.getFieldDeclaration());
//        } else if (stmt.getSEMI_Q() != null) {
//            append(";");
//        }
//    }
//
//    private void visitIfStatement(IfStatement ifStmt) {
//        append(String.format("if (%s) {", visitExpression(ifStmt.getExpression())));
//        indent();
//        visitBlock(ifStmt.getBlock(1));
//        dedent();
//        if (ifStmt.getELSE() != null && ifStmt.getBlock(1) != null) {
//            append("} else {");
//            indent();
//            visitBlock(ifStmt.getBlock(1));
//            dedent();
//        }
//        append("}");
//    }
//
//    private void visitExpressionStatement(ExpressionStatement exprStmt) {
//        append(visitExpression(exprStmt.getExpression()) + (exprStmt.getSEMI_Q() != null ? ";" : ""));
//    }
//
//    private String visitTypeAnnotation(TypeAnnotation typeAnnot) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < typeAnnot.getTypeName().size(); i++) {
//            result.append(visitTypeName(typeAnnot.getTypeName().get(i)));
//            if (i < typeAnnot.getPIPE().size()) {
//                result.append(" | ");
//            }
//        }
//        if (typeAnnot.getGenericArguments() != null) {
//            result.append(visitGenericArguments(typeAnnot.getGenericArguments()));
//        }
//        for (String bracket : typeAnnot.getLBRACK()) {
//            result.append("[]");
//        }
//        return result.toString();
//    }
//
//    private String visitTypeName(TypeName typeName) {
//        if (typeName.getIDENTIFIER() != null) {
//            String generics = typeName.getGenericArguments() != null ? visitGenericArguments(typeName.getGenericArguments()) : "";
//            String array = typeName.getLBRACK() != null ? "[]" : "";
//            return typeName.getIDENTIFIER() + generics + array;
//        }
//        if (typeName.getSTRING_TYPE() != null) return typeName.getSTRING_TYPE();
//        if (typeName.getNUMBER_TYPE() != null) return typeName.getNUMBER_TYPE();
//        if (typeName.getBOOLEAN_TYPE() != null) return typeName.getBOOLEAN_TYPE();
//        if (typeName.getVOID() != null) return typeName.getVOID();
//        if (typeName.getNULL() != null) return typeName.getNULL();
//        return "";
//    }
//
//    private String visitGenericArguments(GenericArguments genArgs) {
//        return "<" + visitGenericTypeList(genArgs.getGenericTypeList()) + ">";
//    }
//
//    private String visitGenericTypeList(GenericTypeList genTypeList) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < genTypeList.getTypeAnnotationWithArray().size(); i++) {
//            result.append(visitTypeAnnotationWithArray(genTypeList.getTypeAnnotationWithArray().get(i)));
//            if (i < genTypeList.getCOMMA().size()) {
//                result.append(", ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitTypeAnnotationWithArray(TypeAnnotationWithArray typeAnnotArray) {
//        String result = visitTypeAnnotation(typeAnnotArray.getTypeAnnotation());
//        if (typeAnnotArray.getLBRACK() != null) {
//            result += "[]";
//        }
//        return result;
//    }
//
//    private void visitMethodDeclaration(MethodDeclaration method) {
//        String access = method.getAccessModifier() != null ? visitAccessModifier(method.getAccessModifier()) + " " : "";
//        String params = method.getParamList() != null ? visitParamList(method.getParamList()) : "";
//        String type = method.getTypeAnnotation() != null ? ": " + visitTypeAnnotation(method.getTypeAnnotation()) : "";
//        append(String.format("%s%s(%s)%s {", access, method.getIDENTIFIER(), params, type));
//        indent();
//        if (method.getBlock() != null) {
//            visitBlock(method.getBlock());
//        }
//        dedent();
//        append("}");
//    }
//
//    private String visitAccessModifier(AccessModifier access) {
//        if (access.getPRIVATE() != null) return access.getPRIVATE();
//        if (access.getPUBLIC() != null) return access.getPUBLIC();
//        if (access.getPROTECTED() != null) return access.getPROTECTED();
//        return "";
//    }
//
//    private String visitParamList(ParamList paramList) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < paramList.getParam().size(); i++) {
//            result.append(visitParam(paramList.getParam().get(i)));
//            if (i < paramList.getCOMMA().size()) {
//                result.append(", ");
//            }
//        }
//        return result.toString();
//    }
//
//    private String visitParam(Param param) {
//        String access = param.getAccessModifier() != null ? visitAccessModifier(param.getAccessModifier()) + " " : "";
//        String name = param.getIDENTIFIER() != null ? param.getIDENTIFIER() :
//                param.getHTML() != null ? param.getHTML() :
//                        param.getHEAD() != null ? param.getHEAD() :
//                                param.getBODY() != null ? param.getBODY() :
//                                        param.getMETA() != null ? param.getMETA() :
//                                                param.getTITLE() != null ? param.getTITLE() :
//                                                        param.getBASE() != null ? param.getBASE() :
//                                                                param.getLINK() != null ? param.getLINK() : "";
//        String type = param.getTypeAnnotation() != null ? ": " + visitTypeAnnotation(param.getTypeAnnotation()) : "";
//        return access + name + type;
//    }
//
//    private void visitFieldDeclaration(FieldDeclaration field) {
//        String access = field.getAccessModifier() != null ? visitAccessModifier(field.getAccessModifier()) + " " : "";
//        String type = field.getTypeAnnotation() != null ? ": " + visitTypeAnnotation(field.getTypeAnnotation()) : "";
//        String value = field.getExpression() != null ? " = " + visitExpression(field.getExpression()) : "";
//        append(String.format("%s%s%s%s%s", access, field.getIDENTIFIER(), type, value,
//                field.getSEMI_Q() != null ? ";" : ""));
//    }
//
//    private void visitInterfaceDeclaration(InterfaceDeclaration intf) {
//        String exportStr = intf.getEXPORT() != null ? "export " : "";
//        append(String.format("%sinterface %s {", exportStr, intf.getIDENTIFIER()));
//        indent();
//        if (intf.getInterfaceBody() != null) {
//            for (InterfaceProperty prop : intf.getInterfaceBody().getInterfaceProperty()) {
//                visitInterfaceProperty(prop);
//            }
//        }
//        dedent();
//        append("}");
//    }
//
//    private void visitInterfaceProperty(InterfaceProperty prop) {
//        append(String.format("%s: %s%s", prop.getIDENTIFIER(), visitTypeAnnotation(prop.getTypeAnnotation()),
//                prop.getSEMI_Q() != null ? ";" : ""));
//    }
//
//    private String visitDestructuringAssignment(DestructuringAssignment destruct) {
//        StringBuilder result = new StringBuilder("{");
//        DestructuringList list = destruct.getDestructuringList();
//        for (int i = 0; i < list.getIDENTIFIER().size(); i++) {
//            result.append(list.getIDENTIFIER().get(i));
//            if (i < list.getCOMMA().size()) {
//                result.append(", ");
//            }
//        }
//        result.append("}");
//        return result.toString();
//    }
//
//    private void visitExportStatement(ExportStatement exportStmt) {
//        append("export ");
//        if (exportStmt.getClassDeclaration() != null) {
//            visitClassDeclaration(exportStmt.getClassDeclaration());
//        } else if (exportStmt.getVariableDeclaration() != null) {
//            visitVariableDeclaration(exportStmt.getVariableDeclaration());
//        }
//    }
//
//    private void visitExportDefault(ExportDefault exportDef) {
//        append(String.format("export default %s%s", visitExpression(exportDef.getExpression()),
//                exportDef.getSEMI_Q() != null ? ";" : ""));
//    }
//}