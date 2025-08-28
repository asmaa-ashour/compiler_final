// Generated from C:/Users/hp/Desktop/final/src/AngularaParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, SLASH=2, FROM=3, EXPORT=4, DEFAULT=5, CLASS=6, INTERFACE=7, 
		AT=8, NULL=9, EXTENDS=10, CONSTRUCTOR=11, IF=12, ELSE=13, LET=14, CONST=15, 
		NEW=16, THIS=17, COMPONENT=18, SELECTOR=19, STANDALONE=20, IMPORTS=21, 
		TEMPLATE=22, STYLE_URLS=23, STRING_TYPE=24, NUMBER_TYPE=25, BOOLEAN_TYPE=26, 
		VOID=27, AS=28, DOCTYPE=29, HTML=30, HEAD=31, BODY=32, META=33, TITLE=34, 
		BASE=35, LINK=36, ASSIGN=37, EQ=38, NE=39, EQ_STRICT=40, NE_STRICT=41, 
		PLUS=42, MINUS=43, MULTIPLY=44, DIVIDE=45, MODULO=46, LOGICAL_AND=47, 
		LOGICAL_OR=48, ARROW=49, SPREAD=50, EXCLAMATION=51, SEMI_Q=52, COMMA=53, 
		COLON=54, DOT=55, LBRACE=56, RBRACE=57, LPAREN=58, RPAREN=59, LBRACK=60, 
		RBRACK=61, BACKTICK=62, DOLLAR=63, LT=64, GT=65, QUESTION=66, IMPLEMENTS=67, 
		PRIVATE=68, PUBLIC=69, PROTECTED=70, PIPE=71, BOOLEAN_LITERAL=72, NUMBER=73, 
		TEMPLATE_STR=74, STRING=75, IDENTIFIER=76, WS=77, LINE_COMMENT=78, BLOCK_COMMENT=79;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_importClause = 3, 
		RULE_importItems = 4, RULE_componentDefinition = 5, RULE_componentMetadata = 6, 
		RULE_componentMetadataPropertyList = 7, RULE_componentMetadataProperty = 8, 
		RULE_classDeclaration = 9, RULE_decorator = 10, RULE_exportStatement = 11, 
		RULE_exportDefault = 12, RULE_classBody = 13, RULE_classElement = 14, 
		RULE_constructorDeclaration = 15, RULE_methodDeclaration = 16, RULE_paramList = 17, 
		RULE_param = 18, RULE_accessModifier = 19, RULE_fieldDeclaration = 20, 
		RULE_interfaceDeclaration = 21, RULE_interfaceBody = 22, RULE_interfaceProperty = 23, 
		RULE_typeAnnotation = 24, RULE_typeName = 25, RULE_typeArguments = 26, 
		RULE_typeAnnotationWithArray = 27, RULE_genericArguments = 28, RULE_genericTypeList = 29, 
		RULE_block = 30, RULE_statementInside = 31, RULE_variableDeclaration = 32, 
		RULE_destructuringAssignment = 33, RULE_destructuringList = 34, RULE_ifStatement = 35, 
		RULE_expressionStatement = 36, RULE_expression = 37, RULE_assignmentExpression = 38, 
		RULE_conditionalExpression = 39, RULE_logicalOrExpression = 40, RULE_logicalAndExpression = 41, 
		RULE_equalityExpression = 42, RULE_relationalExpression = 43, RULE_additiveExpression = 44, 
		RULE_multiplicativeExpression = 45, RULE_unaryExpression = 46, RULE_postfixExpression = 47, 
		RULE_primaryExpressionWithAssertion = 48, RULE_postfixAssertion = 49, 
		RULE_postfixOperator = 50, RULE_primaryExpression = 51, RULE_arrowFunction = 52, 
		RULE_arrowParameters = 53, RULE_parameterList = 54, RULE_parameter = 55, 
		RULE_arrowBody = 56, RULE_argumentList = 57, RULE_literal = 58, RULE_value = 59, 
		RULE_arrayLiteral = 60, RULE_objectLiteral = 61, RULE_objectProperty = 62, 
		RULE_htmlDocument = 63, RULE_htmlElement = 64, RULE_htmlTagName = 65, 
		RULE_htmlContent = 66, RULE_attribute = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatement", "importClause", "importItems", 
			"componentDefinition", "componentMetadata", "componentMetadataPropertyList", 
			"componentMetadataProperty", "classDeclaration", "decorator", "exportStatement", 
			"exportDefault", "classBody", "classElement", "constructorDeclaration", 
			"methodDeclaration", "paramList", "param", "accessModifier", "fieldDeclaration", 
			"interfaceDeclaration", "interfaceBody", "interfaceProperty", "typeAnnotation", 
			"typeName", "typeArguments", "typeAnnotationWithArray", "genericArguments", 
			"genericTypeList", "block", "statementInside", "variableDeclaration", 
			"destructuringAssignment", "destructuringList", "ifStatement", "expressionStatement", 
			"expression", "assignmentExpression", "conditionalExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"postfixExpression", "primaryExpressionWithAssertion", "postfixAssertion", 
			"postfixOperator", "primaryExpression", "arrowFunction", "arrowParameters", 
			"parameterList", "parameter", "arrowBody", "argumentList", "literal", 
			"value", "arrayLiteral", "objectLiteral", "objectProperty", "htmlDocument", 
			"htmlElement", "htmlTagName", "htmlContent", "attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", null, "'from'", "'export'", "'default'", "'class'", 
			"'interface'", "'@'", "'null'", "'extends'", "'constructor'", "'if'", 
			"'else'", "'let'", "'const'", "'new'", "'this'", "'@Component'", "'selector'", 
			"'standalone'", "'imports'", "'template'", "'styleUrls'", "'string'", 
			"'number'", "'boolean'", "'void'", "'as'", null, "'html'", "'head'", 
			"'body'", "'meta'", "'title'", "'base'", "'link'", "'='", "'=='", "'!='", 
			"'==='", "'!=='", "'+'", "'-'", "'*'", null, "'%'", "'&&'", "'||'", "'=>'", 
			"'...'", "'!'", "';'", "','", "':'", "'.'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'`'", "'$'", "'<'", "'>'", "'?'", "'implements'", "'private'", 
			"'public'", "'protected'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORT", "SLASH", "FROM", "EXPORT", "DEFAULT", "CLASS", "INTERFACE", 
			"AT", "NULL", "EXTENDS", "CONSTRUCTOR", "IF", "ELSE", "LET", "CONST", 
			"NEW", "THIS", "COMPONENT", "SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", 
			"STYLE_URLS", "STRING_TYPE", "NUMBER_TYPE", "BOOLEAN_TYPE", "VOID", "AS", 
			"DOCTYPE", "HTML", "HEAD", "BODY", "META", "TITLE", "BASE", "LINK", "ASSIGN", 
			"EQ", "NE", "EQ_STRICT", "NE_STRICT", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"MODULO", "LOGICAL_AND", "LOGICAL_OR", "ARROW", "SPREAD", "EXCLAMATION", 
			"SEMI_Q", "COMMA", "COLON", "DOT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "BACKTICK", "DOLLAR", "LT", "GT", "QUESTION", "IMPLEMENTS", 
			"PRIVATE", "PUBLIC", "PROTECTED", "PIPE", "BOOLEAN_LITERAL", "NUMBER", 
			"TEMPLATE_STR", "STRING", "IDENTIFIER", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AngularaParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				htmlDocument();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1515474605115429842L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 503L) != 0)) {
					{
					{
					setState(137);
					statement();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ComponentDefinitionContext componentDefinition() {
			return getRuleContext(ComponentDefinitionContext.class,0);
		}
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExportDefaultContext exportDefault() {
			return getRuleContext(ExportDefaultContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				componentDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				decorator();
				setState(149);
				exportStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				exportStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				exportDefault();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(154);
				variableDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(155);
				expressionStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(156);
				methodDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(157);
				ifStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularaParser.IMPORT, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularaParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularaParser.STRING, 0); }
		public TerminalNode SEMI_Q() { return getToken(AngularaParser.SEMI_Q, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IMPORT);
			setState(162);
			importClause();
			setState(163);
			match(FROM);
			setState(164);
			match(STRING);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_Q) {
				{
				setState(165);
				match(SEMI_Q);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportClauseContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularaParser.LBRACE, 0); }
		public ImportItemsContext importItems() {
			return getRuleContext(ImportItemsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularaParser.RBRACE, 0); }
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterImportClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitImportClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitImportClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importClause);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(IDENTIFIER);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(LBRACE);
				setState(170);
				importItems();
				setState(171);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public ImportItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterImportItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitImportItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitImportItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemsContext importItems() throws RecognitionException {
		ImportItemsContext _localctx = new ImportItemsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IDENTIFIER);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(COMMA);
					setState(177);
					match(IDENTIFIER);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(183);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularaParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ComponentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterComponentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitComponentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDefinitionContext componentDefinition() throws RecognitionException {
		ComponentDefinitionContext _localctx = new ComponentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(COMPONENT);
			setState(187);
			match(LPAREN);
			setState(188);
			componentMetadata();
			setState(189);
			match(RPAREN);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(190);
				classDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularaParser.RBRACE, 0); }
		public ComponentMetadataPropertyListContext componentMetadataPropertyList() {
			return getRuleContext(ComponentMetadataPropertyListContext.class,0);
		}
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterComponentMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitComponentMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitComponentMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentMetadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LBRACE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 144115188075855903L) != 0)) {
				{
				setState(194);
				componentMetadataPropertyList();
				}
			}

			setState(197);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataPropertyListContext extends ParserRuleContext {
		public List<ComponentMetadataPropertyContext> componentMetadataProperty() {
			return getRuleContexts(ComponentMetadataPropertyContext.class);
		}
		public ComponentMetadataPropertyContext componentMetadataProperty(int i) {
			return getRuleContext(ComponentMetadataPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public ComponentMetadataPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadataPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterComponentMetadataPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitComponentMetadataPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitComponentMetadataPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataPropertyListContext componentMetadataPropertyList() throws RecognitionException {
		ComponentMetadataPropertyListContext _localctx = new ComponentMetadataPropertyListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_componentMetadataPropertyList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			componentMetadataProperty();
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					match(COMMA);
					setState(201);
					componentMetadataProperty();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(207);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularaParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularaParser.STRING, 0); }
		public TerminalNode STANDALONE() { return getToken(AngularaParser.STANDALONE, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(AngularaParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode IMPORTS() { return getToken(AngularaParser.IMPORTS, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(AngularaParser.TEMPLATE, 0); }
		public TerminalNode TEMPLATE_STR() { return getToken(AngularaParser.TEMPLATE_STR, 0); }
		public TerminalNode STYLE_URLS() { return getToken(AngularaParser.STYLE_URLS, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public ComponentMetadataPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadataProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterComponentMetadataProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitComponentMetadataProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitComponentMetadataProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataPropertyContext componentMetadataProperty() throws RecognitionException {
		ComponentMetadataPropertyContext _localctx = new ComponentMetadataPropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentMetadataProperty);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(SELECTOR);
				setState(211);
				match(COLON);
				setState(212);
				match(STRING);
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(STANDALONE);
				setState(214);
				match(COLON);
				setState(215);
				match(BOOLEAN_LITERAL);
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(IMPORTS);
				setState(217);
				match(COLON);
				setState(218);
				value();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(TEMPLATE);
				setState(220);
				match(COLON);
				setState(221);
				match(TEMPLATE_STR);
				}
				break;
			case STYLE_URLS:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(STYLE_URLS);
				setState(223);
				match(COLON);
				setState(224);
				arrayLiteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(COLON);
				setState(227);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularaParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularaParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(AngularaParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularaParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularaParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularaParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(CLASS);
			setState(231);
			match(IDENTIFIER);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(232);
				match(EXTENDS);
				setState(233);
				match(IDENTIFIER);
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(236);
				match(IMPLEMENTS);
				setState(237);
				match(IDENTIFIER);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(238);
					match(COMMA);
					setState(239);
					match(IDENTIFIER);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(247);
			match(LBRACE);
			setState(248);
			classBody();
			setState(249);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularaParser.AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(AT);
			setState(252);
			match(IDENTIFIER);
			setState(253);
			match(LPAREN);
			setState(254);
			objectLiteral();
			setState(255);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularaParser.EXPORT, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(EXPORT);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(258);
				classDeclaration();
				}
				break;
			case LET:
			case CONST:
				{
				setState(259);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportDefaultContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularaParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(AngularaParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_Q() { return getToken(AngularaParser.SEMI_Q, 0); }
		public ExportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterExportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitExportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitExportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportDefaultContext exportDefault() throws RecognitionException {
		ExportDefaultContext _localctx = new ExportDefaultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exportDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(EXPORT);
			setState(263);
			match(DEFAULT);
			setState(264);
			expression();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_Q) {
				{
				setState(265);
				match(SEMI_Q);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassElementContext> classElement() {
			return getRuleContexts(ClassElementContext.class);
		}
		public ClassElementContext classElement(int i) {
			return getRuleContext(ClassElementContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRUCTOR || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 263L) != 0)) {
				{
				{
				setState(268);
				classElement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassElementContext extends ParserRuleContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterClassElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitClassElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitClassElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassElementContext classElement() throws RecognitionException {
		ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classElement);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				constructorDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				methodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				fieldDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularaParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(CONSTRUCTOR);
			setState(280);
			match(LPAREN);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 72292889526399L) != 0)) {
				{
				setState(281);
				paramList();
				}
			}

			setState(284);
			match(RPAREN);
			setState(285);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 7L) != 0)) {
				{
				setState(287);
				accessModifier();
				}
			}

			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(LPAREN);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 72292889526399L) != 0)) {
				{
				setState(292);
				paramList();
				}
			}

			setState(295);
			match(RPAREN);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(296);
				match(COLON);
				setState(297);
				typeAnnotation();
				}
			}

			setState(300);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			param();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(303);
				match(COMMA);
				setState(304);
				param();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode HTML() { return getToken(AngularaParser.HTML, 0); }
		public TerminalNode HEAD() { return getToken(AngularaParser.HEAD, 0); }
		public TerminalNode BODY() { return getToken(AngularaParser.BODY, 0); }
		public TerminalNode META() { return getToken(AngularaParser.META, 0); }
		public TerminalNode TITLE() { return getToken(AngularaParser.TITLE, 0); }
		public TerminalNode BASE() { return getToken(AngularaParser.BASE, 0); }
		public TerminalNode LINK() { return getToken(AngularaParser.LINK, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 7L) != 0)) {
				{
				setState(310);
				accessModifier();
				}
			}

			setState(313);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70368744177791L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(314);
			match(COLON);
			setState(315);
			typeAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(AngularaParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(AngularaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularaParser.PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_Q() { return getToken(AngularaParser.SEMI_Q, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 7L) != 0)) {
				{
				setState(319);
				accessModifier();
				}
			}

			setState(322);
			match(IDENTIFIER);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(323);
				match(COLON);
				setState(324);
				typeAnnotation();
				}
			}

			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(327);
				match(ASSIGN);
				setState(328);
				expression();
				}
			}

			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(331);
				match(SEMI_Q);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularaParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularaParser.LBRACE, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularaParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularaParser.EXPORT, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(334);
				match(EXPORT);
				}
			}

			setState(337);
			match(INTERFACE);
			setState(338);
			match(IDENTIFIER);
			setState(339);
			match(LBRACE);
			setState(340);
			interfaceBody();
			setState(341);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfacePropertyContext> interfaceProperty() {
			return getRuleContexts(InterfacePropertyContext.class);
		}
		public InterfacePropertyContext interfaceProperty(int i) {
			return getRuleContext(InterfacePropertyContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(343);
				interfaceProperty();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SEMI_Q() { return getToken(AngularaParser.SEMI_Q, 0); }
		public InterfacePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterInterfaceProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitInterfaceProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitInterfaceProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyContext interfaceProperty() throws RecognitionException {
		InterfacePropertyContext _localctx = new InterfacePropertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interfaceProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(IDENTIFIER);
			setState(350);
			match(COLON);
			setState(351);
			typeAnnotation();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_Q) {
				{
				setState(352);
				match(SEMI_Q);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(AngularaParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(AngularaParser.PIPE, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(AngularaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(AngularaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(AngularaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(AngularaParser.RBRACK, i);
		}
		public GenericArgumentsContext genericArguments() {
			return getRuleContext(GenericArgumentsContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeAnnotation);
		int _la;
		try {
			int _alt;
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				typeName();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PIPE) {
					{
					{
					setState(356);
					match(PIPE);
					setState(357);
					typeName();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(363);
						match(LBRACK);
						setState(364);
						match(RBRACK);
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				typeName();
				setState(371);
				genericArguments();
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(372);
						match(LBRACK);
						setState(373);
						match(RBRACK);
						}
						} 
					}
					setState(378);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public GenericArgumentsContext genericArguments() {
			return getRuleContext(GenericArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(AngularaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularaParser.RBRACK, 0); }
		public TerminalNode STRING_TYPE() { return getToken(AngularaParser.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(AngularaParser.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(AngularaParser.BOOLEAN_TYPE, 0); }
		public TerminalNode VOID() { return getToken(AngularaParser.VOID, 0); }
		public TerminalNode NULL() { return getToken(AngularaParser.NULL, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_typeName);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(IDENTIFIER);
				setState(383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(382);
					genericArguments();
					}
					break;
				}
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(385);
					match(LBRACK);
					setState(386);
					match(RBRACK);
					}
					break;
				}
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(STRING_TYPE);
				}
				break;
			case NUMBER_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(NUMBER_TYPE);
				}
				break;
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(BOOLEAN_TYPE);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(VOID);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeAnnotationWithArrayContext> typeAnnotationWithArray() {
			return getRuleContexts(TypeAnnotationWithArrayContext.class);
		}
		public TypeAnnotationWithArrayContext typeAnnotationWithArray(int i) {
			return getRuleContext(TypeAnnotationWithArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			typeAnnotationWithArray();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(397);
				match(COMMA);
				setState(398);
				typeAnnotationWithArray();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationWithArrayContext extends ParserRuleContext {
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(AngularaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularaParser.RBRACK, 0); }
		public TypeAnnotationWithArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotationWithArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterTypeAnnotationWithArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitTypeAnnotationWithArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitTypeAnnotationWithArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationWithArrayContext typeAnnotationWithArray() throws RecognitionException {
		TypeAnnotationWithArrayContext _localctx = new TypeAnnotationWithArrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeAnnotationWithArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			typeAnnotation();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(405);
				match(LBRACK);
				setState(406);
				match(RBRACK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularaParser.LT, 0); }
		public GenericTypeListContext genericTypeList() {
			return getRuleContext(GenericTypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(AngularaParser.GT, 0); }
		public GenericArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterGenericArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitGenericArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitGenericArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericArgumentsContext genericArguments() throws RecognitionException {
		GenericArgumentsContext _localctx = new GenericArgumentsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_genericArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(LT);
			setState(410);
			genericTypeList();
			setState(411);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeListContext extends ParserRuleContext {
		public List<TypeAnnotationWithArrayContext> typeAnnotationWithArray() {
			return getRuleContexts(TypeAnnotationWithArrayContext.class);
		}
		public TypeAnnotationWithArrayContext typeAnnotationWithArray(int i) {
			return getRuleContext(TypeAnnotationWithArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public GenericTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterGenericTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitGenericTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitGenericTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeListContext genericTypeList() throws RecognitionException {
		GenericTypeListContext _localctx = new GenericTypeListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_genericTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			typeAnnotationWithArray();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(414);
				match(COMMA);
				setState(415);
				typeAnnotationWithArray();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularaParser.RBRACE, 0); }
		public List<StatementInsideContext> statementInside() {
			return getRuleContexts(StatementInsideContext.class);
		}
		public StatementInsideContext statementInside(int i) {
			return getRuleContext(StatementInsideContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(LBRACE);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1519978204742537730L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 503L) != 0)) {
				{
				{
				setState(422);
				statementInside();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementInsideContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public TerminalNode SEMI_Q() { return getToken(AngularaParser.SEMI_Q, 0); }
		public StatementInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterStatementInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitStatementInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitStatementInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementInsideContext statementInside() throws RecognitionException {
		StatementInsideContext _localctx = new StatementInsideContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_statementInside);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				fieldDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				match(SEMI_Q);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(AngularaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(AngularaParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularaParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode HTML() { return getToken(AngularaParser.HTML, 0); }
		public TerminalNode HEAD() { return getToken(AngularaParser.HEAD, 0); }
		public TerminalNode BODY() { return getToken(AngularaParser.BODY, 0); }
		public TerminalNode META() { return getToken(AngularaParser.META, 0); }
		public TerminalNode TITLE() { return getToken(AngularaParser.TITLE, 0); }
		public TerminalNode BASE() { return getToken(AngularaParser.BASE, 0); }
		public TerminalNode LINK() { return getToken(AngularaParser.LINK, 0); }
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SEMI_Q() { return getToken(AngularaParser.SEMI_Q, 0); }
		public DestructuringAssignmentContext destructuringAssignment() {
			return getRuleContext(DestructuringAssignmentContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclaration);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(438);
				_la = _input.LA(1);
				if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70368744177791L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(439);
					match(COLON);
					setState(440);
					typeAnnotation();
					}
				}

				setState(443);
				match(ASSIGN);
				setState(444);
				expression();
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(445);
					match(SEMI_Q);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				_la = _input.LA(1);
				if ( !(_la==LET || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(449);
				destructuringAssignment();
				setState(450);
				match(ASSIGN);
				setState(451);
				expression();
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(452);
					match(SEMI_Q);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructuringAssignmentContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularaParser.LBRACE, 0); }
		public DestructuringListContext destructuringList() {
			return getRuleContext(DestructuringListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularaParser.RBRACE, 0); }
		public DestructuringAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuringAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterDestructuringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitDestructuringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitDestructuringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructuringAssignmentContext destructuringAssignment() throws RecognitionException {
		DestructuringAssignmentContext _localctx = new DestructuringAssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_destructuringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(LBRACE);
			setState(458);
			destructuringList();
			setState(459);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestructuringListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public DestructuringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructuringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterDestructuringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitDestructuringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitDestructuringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructuringListContext destructuringList() throws RecognitionException {
		DestructuringListContext _localctx = new DestructuringListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_destructuringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(IDENTIFIER);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(462);
				match(COMMA);
				setState(463);
				match(IDENTIFIER);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularaParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(IF);
			setState(470);
			match(LPAREN);
			setState(471);
			expression();
			setState(472);
			match(RPAREN);
			setState(473);
			block();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(474);
				match(ELSE);
				setState(475);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI_Q() { return getToken(AngularaParser.SEMI_Q, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			expression();
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(479);
				match(SEMI_Q);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularaParser.ASSIGN, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			conditionalExpression();
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(485);
				match(ASSIGN);
				setState(486);
				assignmentExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(AngularaParser.QUESTION, 0); }
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			logicalOrExpression();
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(490);
				match(QUESTION);
				setState(491);
				assignmentExpression();
				setState(492);
				match(COLON);
				setState(493);
				assignmentExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_OR() { return getTokens(AngularaParser.LOGICAL_OR); }
		public TerminalNode LOGICAL_OR(int i) {
			return getToken(AngularaParser.LOGICAL_OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			logicalAndExpression();
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					match(LOGICAL_OR);
					setState(499);
					logicalAndExpression();
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> LOGICAL_AND() { return getTokens(AngularaParser.LOGICAL_AND); }
		public TerminalNode LOGICAL_AND(int i) {
			return getToken(AngularaParser.LOGICAL_AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			equalityExpression();
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(506);
					match(LOGICAL_AND);
					setState(507);
					equalityExpression();
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(AngularaParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(AngularaParser.EQ, i);
		}
		public List<TerminalNode> NE() { return getTokens(AngularaParser.NE); }
		public TerminalNode NE(int i) {
			return getToken(AngularaParser.NE, i);
		}
		public List<TerminalNode> EQ_STRICT() { return getTokens(AngularaParser.EQ_STRICT); }
		public TerminalNode EQ_STRICT(int i) {
			return getToken(AngularaParser.EQ_STRICT, i);
		}
		public List<TerminalNode> NE_STRICT() { return getTokens(AngularaParser.NE_STRICT); }
		public TerminalNode NE_STRICT(int i) {
			return getToken(AngularaParser.NE_STRICT, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			relationalExpression();
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(515);
					relationalExpression();
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_relationalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			additiveExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(AngularaParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(AngularaParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngularaParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngularaParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			multiplicativeExpression();
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(525);
					multiplicativeExpression();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(AngularaParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(AngularaParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(AngularaParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(AngularaParser.DIVIDE, i);
		}
		public List<TerminalNode> MODULO() { return getTokens(AngularaParser.MODULO); }
		public TerminalNode MODULO(int i) {
			return getToken(AngularaParser.MODULO, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			unaryExpression();
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(532);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(533);
					unaryExpression();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(AngularaParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(AngularaParser.MINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(AngularaParser.EXCLAMATION, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unaryExpression);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case NULL:
			case NEW:
			case THIS:
			case HTML:
			case HEAD:
			case BODY:
			case META:
			case TITLE:
			case BASE:
			case LINK:
			case LBRACE:
			case LPAREN:
			case LBRACK:
			case BOOLEAN_LITERAL:
			case NUMBER:
			case TEMPLATE_STR:
			case STRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				postfixExpression();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				match(PLUS);
				setState(541);
				unaryExpression();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				match(MINUS);
				setState(543);
				unaryExpression();
				}
				break;
			case EXCLAMATION:
				enterOuterAlt(_localctx, 4);
				{
				setState(544);
				match(EXCLAMATION);
				setState(545);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionWithAssertionContext primaryExpressionWithAssertion() {
			return getRuleContext(PrimaryExpressionWithAssertionContext.class,0);
		}
		public List<PostfixOperatorContext> postfixOperator() {
			return getRuleContexts(PostfixOperatorContext.class);
		}
		public PostfixOperatorContext postfixOperator(int i) {
			return getRuleContext(PostfixOperatorContext.class,i);
		}
		public TerminalNode AS() { return getToken(AngularaParser.AS, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			primaryExpressionWithAssertion();
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					postfixOperator();
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(555);
				match(AS);
				setState(556);
				typeName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionWithAssertionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixAssertionContext postfixAssertion() {
			return getRuleContext(PostfixAssertionContext.class,0);
		}
		public PrimaryExpressionWithAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpressionWithAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterPrimaryExpressionWithAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitPrimaryExpressionWithAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitPrimaryExpressionWithAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionWithAssertionContext primaryExpressionWithAssertion() throws RecognitionException {
		PrimaryExpressionWithAssertionContext _localctx = new PrimaryExpressionWithAssertionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primaryExpressionWithAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			primaryExpression();
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(560);
				postfixAssertion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixAssertionContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(AngularaParser.EXCLAMATION, 0); }
		public PostfixAssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixAssertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterPostfixAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitPostfixAssertion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitPostfixAssertion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixAssertionContext postfixAssertion() throws RecognitionException {
		PostfixAssertionContext _localctx = new PostfixAssertionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_postfixAssertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixOperatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AngularaParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(AngularaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AngularaParser.RBRACK, 0); }
		public PostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterPostfixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitPostfixOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitPostfixOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixOperatorContext postfixOperator() throws RecognitionException {
		PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_postfixOperator);
		int _la;
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(DOT);
				setState(566);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(LPAREN);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1515474605115113986L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 31L) != 0)) {
					{
					setState(568);
					argumentList();
					}
				}

				setState(571);
				match(RPAREN);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(572);
				match(LBRACK);
				setState(573);
				expression();
				setState(574);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngularaParser.THIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode HTML() { return getToken(AngularaParser.HTML, 0); }
		public TerminalNode HEAD() { return getToken(AngularaParser.HEAD, 0); }
		public TerminalNode BODY() { return getToken(AngularaParser.BODY, 0); }
		public TerminalNode META() { return getToken(AngularaParser.META, 0); }
		public TerminalNode TITLE() { return getToken(AngularaParser.TITLE, 0); }
		public TerminalNode BASE() { return getToken(AngularaParser.BASE, 0); }
		public TerminalNode LINK() { return getToken(AngularaParser.LINK, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AngularaParser.NEW, 0); }
		public GenericArgumentsContext genericArguments() {
			return getRuleContext(GenericArgumentsContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode TEMPLATE_STR() { return getToken(AngularaParser.TEMPLATE_STR, 0); }
		public TerminalNode IMPORT() { return getToken(AngularaParser.IMPORT, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularaParser.DOT, i);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primaryExpression);
		int _la;
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(THIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(HTML);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(581);
				match(HEAD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(582);
				match(BODY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(583);
				match(META);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(584);
				match(TITLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(585);
				match(BASE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(586);
				match(LINK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(587);
				literal();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(588);
				arrayLiteral();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(589);
				objectLiteral();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(590);
				match(LPAREN);
				setState(591);
				expression();
				setState(592);
				match(RPAREN);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(594);
				arrowFunction();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(595);
				match(NEW);
				setState(596);
				match(IDENTIFIER);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(597);
					genericArguments();
					}
				}

				setState(600);
				match(LPAREN);
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1515474605115113986L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 31L) != 0)) {
					{
					setState(601);
					argumentList();
					}
				}

				setState(604);
				match(RPAREN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(605);
				match(TEMPLATE_STR);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(606);
				match(IMPORT);
				setState(607);
				match(DOT);
				setState(608);
				match(META);
				setState(609);
				match(DOT);
				setState(610);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public ArrowParametersContext arrowParameters() {
			return getRuleContext(ArrowParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(AngularaParser.ARROW, 0); }
		public ArrowBodyContext arrowBody() {
			return getRuleContext(ArrowBodyContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			arrowParameters();
			setState(614);
			match(ARROW);
			setState(615);
			arrowBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowParametersContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularaParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ArrowParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterArrowParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitArrowParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitArrowParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowParametersContext arrowParameters() throws RecognitionException {
		ArrowParametersContext _localctx = new ArrowParametersContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arrowParameters);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				match(LPAREN);
				setState(619);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				match(LPAREN);
				setState(621);
				parameterList();
				setState(622);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			parameter();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(627);
				match(COMMA);
				setState(628);
				parameter();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(IDENTIFIER);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(635);
				match(COLON);
				setState(636);
				typeAnnotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArrowBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterArrowBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitArrowBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitArrowBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowBodyContext arrowBody() throws RecognitionException {
		ArrowBodyContext _localctx = new ArrowBodyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arrowBody);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			assignmentExpression();
			setState(648);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(644);
					match(COMMA);
					setState(645);
					assignmentExpression();
					}
					} 
				}
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(651);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularaParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AngularaParser.NUMBER, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(AngularaParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(AngularaParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_la = _input.LA(1);
			if ( !(_la==NULL || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 11L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode TEMPLATE_STR() { return getToken(AngularaParser.TEMPLATE_STR, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_value);
		try {
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				arrayLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(TEMPLATE_STR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularaParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SPREAD() { return getTokens(AngularaParser.SPREAD); }
		public TerminalNode SPREAD(int i) {
			return getToken(AngularaParser.SPREAD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(LBRACK);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1516600505021956610L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 31L) != 0)) {
				{
				setState(679);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IMPORT:
				case NULL:
				case NEW:
				case THIS:
				case HTML:
				case HEAD:
				case BODY:
				case META:
				case TITLE:
				case BASE:
				case LINK:
				case PLUS:
				case MINUS:
				case EXCLAMATION:
				case LBRACE:
				case LPAREN:
				case LBRACK:
				case BOOLEAN_LITERAL:
				case NUMBER:
				case TEMPLATE_STR:
				case STRING:
				case IDENTIFIER:
					{
					setState(662);
					expression();
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(663);
						match(COMMA);
						setState(664);
						expression();
						}
						}
						setState(669);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case SPREAD:
					{
					setState(670);
					match(SPREAD);
					setState(671);
					expression();
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(672);
						match(COMMA);
						setState(673);
						expression();
						}
						}
						setState(678);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularaParser.RBRACE, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularaParser.COMMA, i);
		}
		public List<TerminalNode> SEMI_Q() { return getTokens(AngularaParser.SEMI_Q); }
		public TerminalNode SEMI_Q(int i) {
			return getToken(AngularaParser.SEMI_Q, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LBRACE);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPREAD || _la==IDENTIFIER) {
				{
				{
				setState(687);
				objectProperty();
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(688);
					_la = _input.LA(1);
					if ( !(_la==SEMI_Q || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(696);
				match(COMMA);
				}
			}

			setState(699);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SPREAD() { return getToken(AngularaParser.SPREAD, 0); }
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_objectProperty);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(IDENTIFIER);
				setState(702);
				match(COLON);
				setState(703);
				expression();
				}
				break;
			case SPREAD:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(SPREAD);
				setState(705);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(AngularaParser.DOCTYPE, 0); }
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOCTYPE) {
				{
				setState(708);
				match(DOCTYPE);
				}
			}

			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LT) {
				{
				{
				setState(711);
				htmlElement();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(AngularaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(AngularaParser.LT, i);
		}
		public List<HtmlTagNameContext> htmlTagName() {
			return getRuleContexts(HtmlTagNameContext.class);
		}
		public HtmlTagNameContext htmlTagName(int i) {
			return getRuleContext(HtmlTagNameContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(AngularaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(AngularaParser.GT, i);
		}
		public TerminalNode SLASH() { return getToken(AngularaParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				match(LT);
				setState(718);
				htmlTagName();
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(719);
					attribute();
					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(725);
				match(GT);
				setState(729);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(726);
						htmlContent();
						}
						} 
					}
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(732);
				match(LT);
				setState(733);
				match(SLASH);
				setState(734);
				htmlTagName();
				setState(735);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				match(LT);
				setState(738);
				htmlTagName();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(739);
					attribute();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(745);
				match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				match(LT);
				setState(748);
				htmlTagName();
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(749);
					attribute();
					}
					}
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(755);
				match(SLASH);
				setState(756);
				match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNameContext extends ParserRuleContext {
		public TerminalNode META() { return getToken(AngularaParser.META, 0); }
		public TerminalNode HTML() { return getToken(AngularaParser.HTML, 0); }
		public TerminalNode HEAD() { return getToken(AngularaParser.HEAD, 0); }
		public TerminalNode BODY() { return getToken(AngularaParser.BODY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public TerminalNode TITLE() { return getToken(AngularaParser.TITLE, 0); }
		public TerminalNode BASE() { return getToken(AngularaParser.BASE, 0); }
		public TerminalNode LINK() { return getToken(AngularaParser.LINK, 0); }
		public HtmlTagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterHtmlTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitHtmlTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitHtmlTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameContext htmlTagName() throws RecognitionException {
		HtmlTagNameContext _localctx = new HtmlTagNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlTagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 70368744177791L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AngularaParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularaParser.IDENTIFIER, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlContent);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				htmlElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(765);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularaParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(AngularaParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(AngularaParser.NUMBER, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(AngularaParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(AngularaParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularaParserListener ) ((AngularaParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularaParserVisitor ) return ((AngularaParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attribute);
		int _la;
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(IDENTIFIER);
				setState(770);
				match(ASSIGN);
				setState(771);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 27L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001O\u0307\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u008b\b\u0000\n\u0000\f\u0000\u008e\t\u0000\u0001\u0000\u0003\u0000\u0091"+
		"\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00a0\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a7\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ae\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b3\b\u0004\n\u0004\f\u0004"+
		"\u00b6\t\u0004\u0001\u0004\u0003\u0004\u00b9\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c0\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00c4\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00cb\b\u0007\n\u0007\f\u0007"+
		"\u00ce\t\u0007\u0001\u0007\u0003\u0007\u00d1\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e5\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00eb\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00f1\b\t\n\t\f\t\u00f4\t\t\u0003\t\u00f6\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0105\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u010b\b\f\u0001\r\u0005\r\u010e\b\r\n\r\f\r"+
		"\u0111\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0116\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u011b\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u0121\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0126\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u012b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0132\b\u0011\n\u0011\f\u0011\u0135"+
		"\t\u0011\u0001\u0012\u0003\u0012\u0138\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014"+
		"\u0141\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0146\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u014a\b\u0014\u0001\u0014\u0003"+
		"\u0014\u014d\b\u0014\u0001\u0015\u0003\u0015\u0150\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0005\u0016\u0159\b\u0016\n\u0016\f\u0016\u015c\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0162\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0167\b\u0018\n\u0018\f\u0018\u016a\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u016e\b\u0018\n\u0018\f\u0018\u0171"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0177"+
		"\b\u0018\n\u0018\f\u0018\u017a\t\u0018\u0003\u0018\u017c\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0180\b\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0184\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u018b\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0190\b\u001a\n\u001a\f\u001a\u0193\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0198\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01a1\b\u001d"+
		"\n\u001d\f\u001d\u01a4\t\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u01a8"+
		"\b\u001e\n\u001e\f\u001e\u01ab\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01b4\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u01ba\b \u0001 \u0001 \u0001 \u0003"+
		" \u01bf\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01c6\b \u0003 \u01c8"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0005\"\u01d1"+
		"\b\"\n\"\f\"\u01d4\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01dd\b#\u0001$\u0001$\u0003$\u01e1\b$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0003&\u01e8\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u01f0\b\'\u0001(\u0001(\u0001(\u0005(\u01f5\b(\n(\f(\u01f8"+
		"\t(\u0001)\u0001)\u0001)\u0005)\u01fd\b)\n)\f)\u0200\t)\u0001*\u0001*"+
		"\u0001*\u0005*\u0205\b*\n*\f*\u0208\t*\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0005,\u020f\b,\n,\f,\u0212\t,\u0001-\u0001-\u0001-\u0005-\u0217\b-"+
		"\n-\f-\u021a\t-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u0223\b.\u0001/\u0001/\u0005/\u0227\b/\n/\f/\u022a\t/\u0001/\u0001/"+
		"\u0003/\u022e\b/\u00010\u00010\u00030\u0232\b0\u00011\u00011\u00012\u0001"+
		"2\u00012\u00012\u00032\u023a\b2\u00012\u00012\u00012\u00012\u00012\u0003"+
		"2\u0241\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00033\u0257\b3\u00013\u00013\u00033\u025b\b3\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0264\b3\u00014\u00014\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0271\b5\u0001"+
		"6\u00016\u00016\u00056\u0276\b6\n6\f6\u0279\t6\u00017\u00017\u00017\u0003"+
		"7\u027e\b7\u00018\u00018\u00038\u0282\b8\u00019\u00019\u00019\u00059\u0287"+
		"\b9\n9\f9\u028a\t9\u00019\u00039\u028d\b9\u0001:\u0001:\u0001;\u0001;"+
		"\u0001;\u0003;\u0294\b;\u0001<\u0001<\u0001<\u0001<\u0005<\u029a\b<\n"+
		"<\f<\u029d\t<\u0001<\u0001<\u0001<\u0001<\u0005<\u02a3\b<\n<\f<\u02a6"+
		"\t<\u0005<\u02a8\b<\n<\f<\u02ab\t<\u0001<\u0001<\u0001=\u0001=\u0001="+
		"\u0003=\u02b2\b=\u0005=\u02b4\b=\n=\f=\u02b7\t=\u0001=\u0003=\u02ba\b"+
		"=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u02c3\b>\u0001"+
		"?\u0003?\u02c6\b?\u0001?\u0005?\u02c9\b?\n?\f?\u02cc\t?\u0001@\u0001@"+
		"\u0001@\u0005@\u02d1\b@\n@\f@\u02d4\t@\u0001@\u0001@\u0005@\u02d8\b@\n"+
		"@\f@\u02db\t@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@"+
		"\u0005@\u02e5\b@\n@\f@\u02e8\t@\u0001@\u0001@\u0001@\u0001@\u0001@\u0005"+
		"@\u02ef\b@\n@\f@\u02f2\t@\u0001@\u0001@\u0001@\u0003@\u02f7\b@\u0001A"+
		"\u0001A\u0001B\u0001B\u0001B\u0001B\u0003B\u02ff\bB\u0001C\u0001C\u0001"+
		"C\u0001C\u0003C\u0305\bC\u0001C\u0000\u0000D\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0000"+
		"\t\u0002\u0000\u001e$LL\u0001\u0000DF\u0001\u0000\u000e\u000f\u0001\u0000"+
		"&)\u0001\u0000*+\u0001\u0000,.\u0003\u0000\t\tHIKK\u0001\u000045\u0002"+
		"\u0000HIKL\u0349\u0000\u0090\u0001\u0000\u0000\u0000\u0002\u009f\u0001"+
		"\u0000\u0000\u0000\u0004\u00a1\u0001\u0000\u0000\u0000\u0006\u00ad\u0001"+
		"\u0000\u0000\u0000\b\u00af\u0001\u0000\u0000\u0000\n\u00ba\u0001\u0000"+
		"\u0000\u0000\f\u00c1\u0001\u0000\u0000\u0000\u000e\u00c7\u0001\u0000\u0000"+
		"\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012\u00e6\u0001\u0000\u0000"+
		"\u0000\u0014\u00fb\u0001\u0000\u0000\u0000\u0016\u0101\u0001\u0000\u0000"+
		"\u0000\u0018\u0106\u0001\u0000\u0000\u0000\u001a\u010f\u0001\u0000\u0000"+
		"\u0000\u001c\u0115\u0001\u0000\u0000\u0000\u001e\u0117\u0001\u0000\u0000"+
		"\u0000 \u0120\u0001\u0000\u0000\u0000\"\u012e\u0001\u0000\u0000\u0000"+
		"$\u0137\u0001\u0000\u0000\u0000&\u013d\u0001\u0000\u0000\u0000(\u0140"+
		"\u0001\u0000\u0000\u0000*\u014f\u0001\u0000\u0000\u0000,\u015a\u0001\u0000"+
		"\u0000\u0000.\u015d\u0001\u0000\u0000\u00000\u017b\u0001\u0000\u0000\u0000"+
		"2\u018a\u0001\u0000\u0000\u00004\u018c\u0001\u0000\u0000\u00006\u0194"+
		"\u0001\u0000\u0000\u00008\u0199\u0001\u0000\u0000\u0000:\u019d\u0001\u0000"+
		"\u0000\u0000<\u01a5\u0001\u0000\u0000\u0000>\u01b3\u0001\u0000\u0000\u0000"+
		"@\u01c7\u0001\u0000\u0000\u0000B\u01c9\u0001\u0000\u0000\u0000D\u01cd"+
		"\u0001\u0000\u0000\u0000F\u01d5\u0001\u0000\u0000\u0000H\u01de\u0001\u0000"+
		"\u0000\u0000J\u01e2\u0001\u0000\u0000\u0000L\u01e4\u0001\u0000\u0000\u0000"+
		"N\u01e9\u0001\u0000\u0000\u0000P\u01f1\u0001\u0000\u0000\u0000R\u01f9"+
		"\u0001\u0000\u0000\u0000T\u0201\u0001\u0000\u0000\u0000V\u0209\u0001\u0000"+
		"\u0000\u0000X\u020b\u0001\u0000\u0000\u0000Z\u0213\u0001\u0000\u0000\u0000"+
		"\\\u0222\u0001\u0000\u0000\u0000^\u0224\u0001\u0000\u0000\u0000`\u022f"+
		"\u0001\u0000\u0000\u0000b\u0233\u0001\u0000\u0000\u0000d\u0240\u0001\u0000"+
		"\u0000\u0000f\u0263\u0001\u0000\u0000\u0000h\u0265\u0001\u0000\u0000\u0000"+
		"j\u0270\u0001\u0000\u0000\u0000l\u0272\u0001\u0000\u0000\u0000n\u027a"+
		"\u0001\u0000\u0000\u0000p\u0281\u0001\u0000\u0000\u0000r\u0283\u0001\u0000"+
		"\u0000\u0000t\u028e\u0001\u0000\u0000\u0000v\u0293\u0001\u0000\u0000\u0000"+
		"x\u0295\u0001\u0000\u0000\u0000z\u02ae\u0001\u0000\u0000\u0000|\u02c2"+
		"\u0001\u0000\u0000\u0000~\u02c5\u0001\u0000\u0000\u0000\u0080\u02f6\u0001"+
		"\u0000\u0000\u0000\u0082\u02f8\u0001\u0000\u0000\u0000\u0084\u02fe\u0001"+
		"\u0000\u0000\u0000\u0086\u0304\u0001\u0000\u0000\u0000\u0088\u0091\u0003"+
		"~?\u0000\u0089\u008b\u0003\u0002\u0001\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u0000\u0000"+
		"\u0001\u0090\u0088\u0001\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000"+
		"\u0000\u0091\u0001\u0001\u0000\u0000\u0000\u0092\u00a0\u0003\u0004\u0002"+
		"\u0000\u0093\u00a0\u0003\n\u0005\u0000\u0094\u0095\u0003\u0014\n\u0000"+
		"\u0095\u0096\u0003\u0016\u000b\u0000\u0096\u00a0\u0001\u0000\u0000\u0000"+
		"\u0097\u00a0\u0003\u0016\u000b\u0000\u0098\u00a0\u0003\u0018\f\u0000\u0099"+
		"\u00a0\u0003\u0012\t\u0000\u009a\u00a0\u0003@ \u0000\u009b\u00a0\u0003"+
		"H$\u0000\u009c\u00a0\u0003 \u0010\u0000\u009d\u00a0\u0003F#\u0000\u009e"+
		"\u00a0\u0003*\u0015\u0000\u009f\u0092\u0001\u0000\u0000\u0000\u009f\u0093"+
		"\u0001\u0000\u0000\u0000\u009f\u0094\u0001\u0000\u0000\u0000\u009f\u0097"+
		"\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f\u0099"+
		"\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009b"+
		"\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u0003"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a3"+
		"\u0003\u0006\u0003\u0000\u00a3\u00a4\u0005\u0003\u0000\u0000\u00a4\u00a6"+
		"\u0005K\u0000\u0000\u00a5\u00a7\u00054\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u0005\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ae\u0005L\u0000\u0000\u00a9\u00aa\u00058\u0000\u0000"+
		"\u00aa\u00ab\u0003\b\u0004\u0000\u00ab\u00ac\u00059\u0000\u0000\u00ac"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000\u0000\u0000\u00ad"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ae\u0007\u0001\u0000\u0000\u0000\u00af"+
		"\u00b4\u0005L\u0000\u0000\u00b0\u00b1\u00055\u0000\u0000\u00b1\u00b3\u0005"+
		"L\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u00055\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\t\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0012\u0000\u0000\u00bb\u00bc\u0005:\u0000\u0000\u00bc"+
		"\u00bd\u0003\f\u0006\u0000\u00bd\u00bf\u0005;\u0000\u0000\u00be\u00c0"+
		"\u0003\u0012\t\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u000b\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005"+
		"8\u0000\u0000\u00c2\u00c4\u0003\u000e\u0007\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u00059\u0000\u0000\u00c6\r\u0001\u0000\u0000"+
		"\u0000\u00c7\u00cc\u0003\u0010\b\u0000\u00c8\u00c9\u00055\u0000\u0000"+
		"\u00c9\u00cb\u0003\u0010\b\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d1\u00055\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u000f"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0013\u0000\u0000\u00d3\u00d4"+
		"\u00056\u0000\u0000\u00d4\u00e5\u0005K\u0000\u0000\u00d5\u00d6\u0005\u0014"+
		"\u0000\u0000\u00d6\u00d7\u00056\u0000\u0000\u00d7\u00e5\u0005H\u0000\u0000"+
		"\u00d8\u00d9\u0005\u0015\u0000\u0000\u00d9\u00da\u00056\u0000\u0000\u00da"+
		"\u00e5\u0003v;\u0000\u00db\u00dc\u0005\u0016\u0000\u0000\u00dc\u00dd\u0005"+
		"6\u0000\u0000\u00dd\u00e5\u0005J\u0000\u0000\u00de\u00df\u0005\u0017\u0000"+
		"\u0000\u00df\u00e0\u00056\u0000\u0000\u00e0\u00e5\u0003x<\u0000\u00e1"+
		"\u00e2\u0005L\u0000\u0000\u00e2\u00e3\u00056\u0000\u0000\u00e3\u00e5\u0003"+
		"v;\u0000\u00e4\u00d2\u0001\u0000\u0000\u0000\u00e4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00e4\u00d8\u0001\u0000\u0000\u0000\u00e4\u00db\u0001\u0000\u0000"+
		"\u0000\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e5\u0011\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0006\u0000"+
		"\u0000\u00e7\u00ea\u0005L\u0000\u0000\u00e8\u00e9\u0005\n\u0000\u0000"+
		"\u00e9\u00eb\u0005L\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f5\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005C\u0000\u0000\u00ed\u00f2\u0005L\u0000\u0000\u00ee\u00ef\u0005"+
		"5\u0000\u0000\u00ef\u00f1\u0005L\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u00058\u0000\u0000\u00f8\u00f9\u0003\u001a\r\u0000"+
		"\u00f9\u00fa\u00059\u0000\u0000\u00fa\u0013\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\b\u0000\u0000\u00fc\u00fd\u0005L\u0000\u0000\u00fd\u00fe"+
		"\u0005:\u0000\u0000\u00fe\u00ff\u0003z=\u0000\u00ff\u0100\u0005;\u0000"+
		"\u0000\u0100\u0015\u0001\u0000\u0000\u0000\u0101\u0104\u0005\u0004\u0000"+
		"\u0000\u0102\u0105\u0003\u0012\t\u0000\u0103\u0105\u0003@ \u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0017\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0004\u0000\u0000\u0107"+
		"\u0108\u0005\u0005\u0000\u0000\u0108\u010a\u0003J%\u0000\u0109\u010b\u0005"+
		"4\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u0019\u0001\u0000\u0000\u0000\u010c\u010e\u0003\u001c"+
		"\u000e\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u001b\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000"+
		"\u0000\u0000\u0112\u0116\u0003\u001e\u000f\u0000\u0113\u0116\u0003 \u0010"+
		"\u0000\u0114\u0116\u0003(\u0014\u0000\u0115\u0112\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0116\u001d\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u000b\u0000\u0000"+
		"\u0118\u011a\u0005:\u0000\u0000\u0119\u011b\u0003\"\u0011\u0000\u011a"+
		"\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005;\u0000\u0000\u011d\u011e"+
		"\u0003<\u001e\u0000\u011e\u001f\u0001\u0000\u0000\u0000\u011f\u0121\u0003"+
		"&\u0013\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0005L\u0000"+
		"\u0000\u0123\u0125\u0005:\u0000\u0000\u0124\u0126\u0003\"\u0011\u0000"+
		"\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u012a\u0005;\u0000\u0000\u0128"+
		"\u0129\u00056\u0000\u0000\u0129\u012b\u00030\u0018\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0003<\u001e\u0000\u012d!\u0001\u0000\u0000"+
		"\u0000\u012e\u0133\u0003$\u0012\u0000\u012f\u0130\u00055\u0000\u0000\u0130"+
		"\u0132\u0003$\u0012\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0135"+
		"\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0001\u0000\u0000\u0000\u0134#\u0001\u0000\u0000\u0000\u0135\u0133\u0001"+
		"\u0000\u0000\u0000\u0136\u0138\u0003&\u0013\u0000\u0137\u0136\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0007\u0000\u0000\u0000\u013a\u013b\u00056\u0000"+
		"\u0000\u013b\u013c\u00030\u0018\u0000\u013c%\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0007\u0001\u0000\u0000\u013e\'\u0001\u0000\u0000\u0000\u013f\u0141"+
		"\u0003&\u0013\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0145\u0005"+
		"L\u0000\u0000\u0143\u0144\u00056\u0000\u0000\u0144\u0146\u00030\u0018"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0148\u0005%\u0000\u0000"+
		"\u0148\u014a\u0003J%\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u014d"+
		"\u00054\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d)\u0001\u0000\u0000\u0000\u014e\u0150\u0005\u0004"+
		"\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u0007"+
		"\u0000\u0000\u0152\u0153\u0005L\u0000\u0000\u0153\u0154\u00058\u0000\u0000"+
		"\u0154\u0155\u0003,\u0016\u0000\u0155\u0156\u00059\u0000\u0000\u0156+"+
		"\u0001\u0000\u0000\u0000\u0157\u0159\u0003.\u0017\u0000\u0158\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b-\u0001\u0000"+
		"\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005L\u0000"+
		"\u0000\u015e\u015f\u00056\u0000\u0000\u015f\u0161\u00030\u0018\u0000\u0160"+
		"\u0162\u00054\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162/\u0001\u0000\u0000\u0000\u0163\u0168\u0003"+
		"2\u0019\u0000\u0164\u0165\u0005G\u0000\u0000\u0165\u0167\u00032\u0019"+
		"\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000"+
		"\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000"+
		"\u0000\u0169\u016f\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0005<\u0000\u0000\u016c\u016e\u0005=\u0000\u0000\u016d"+
		"\u016b\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f"+
		"\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170"+
		"\u017c\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u00032\u0019\u0000\u0173\u0178\u00038\u001c\u0000\u0174\u0175\u0005"+
		"<\u0000\u0000\u0175\u0177\u0005=\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u0163\u0001\u0000\u0000"+
		"\u0000\u017b\u0172\u0001\u0000\u0000\u0000\u017c1\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0005L\u0000\u0000\u017e\u0180\u00038\u001c\u0000\u017f\u017e"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0183"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0005<\u0000\u0000\u0182\u0184\u0005"+
		"=\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u018b\u0001\u0000\u0000\u0000\u0185\u018b\u0005\u0018"+
		"\u0000\u0000\u0186\u018b\u0005\u0019\u0000\u0000\u0187\u018b\u0005\u001a"+
		"\u0000\u0000\u0188\u018b\u0005\u001b\u0000\u0000\u0189\u018b\u0005\t\u0000"+
		"\u0000\u018a\u017d\u0001\u0000\u0000\u0000\u018a\u0185\u0001\u0000\u0000"+
		"\u0000\u018a\u0186\u0001\u0000\u0000\u0000\u018a\u0187\u0001\u0000\u0000"+
		"\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018b3\u0001\u0000\u0000\u0000\u018c\u0191\u00036\u001b\u0000\u018d"+
		"\u018e\u00055\u0000\u0000\u018e\u0190\u00036\u001b\u0000\u018f\u018d\u0001"+
		"\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u01925\u0001\u0000"+
		"\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197\u00030\u0018"+
		"\u0000\u0195\u0196\u0005<\u0000\u0000\u0196\u0198\u0005=\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198"+
		"7\u0001\u0000\u0000\u0000\u0199\u019a\u0005@\u0000\u0000\u019a\u019b\u0003"+
		":\u001d\u0000\u019b\u019c\u0005A\u0000\u0000\u019c9\u0001\u0000\u0000"+
		"\u0000\u019d\u01a2\u00036\u001b\u0000\u019e\u019f\u00055\u0000\u0000\u019f"+
		"\u01a1\u00036\u001b\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3;\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a9\u00058\u0000\u0000\u01a6\u01a8\u0003>\u001f"+
		"\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u00059\u0000\u0000\u01ad=\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b4\u0003@ \u0000\u01af\u01b4\u0003F#\u0000\u01b0\u01b4\u0003H$\u0000"+
		"\u01b1\u01b4\u0003(\u0014\u0000\u01b2\u01b4\u00054\u0000\u0000\u01b3\u01ae"+
		"\u0001\u0000\u0000\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b4?\u0001\u0000\u0000\u0000\u01b5\u01b6\u0007"+
		"\u0002\u0000\u0000\u01b6\u01b9\u0007\u0000\u0000\u0000\u01b7\u01b8\u0005"+
		"6\u0000\u0000\u01b8\u01ba\u00030\u0018\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0005%\u0000\u0000\u01bc\u01be\u0003J%\u0000\u01bd"+
		"\u01bf\u00054\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c8\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0007\u0002\u0000\u0000\u01c1\u01c2\u0003B!\u0000\u01c2\u01c3\u0005%"+
		"\u0000\u0000\u01c3\u01c5\u0003J%\u0000\u01c4\u01c6\u00054\u0000\u0000"+
		"\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c0\u0001\u0000\u0000\u0000\u01c8A\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u00058\u0000\u0000\u01ca\u01cb\u0003D\"\u0000\u01cb\u01cc\u0005"+
		"9\u0000\u0000\u01ccC\u0001\u0000\u0000\u0000\u01cd\u01d2\u0005L\u0000"+
		"\u0000\u01ce\u01cf\u00055\u0000\u0000\u01cf\u01d1\u0005L\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"E\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0005\f\u0000\u0000\u01d6\u01d7\u0005:\u0000\u0000\u01d7\u01d8\u0003"+
		"J%\u0000\u01d8\u01d9\u0005;\u0000\u0000\u01d9\u01dc\u0003<\u001e\u0000"+
		"\u01da\u01db\u0005\r\u0000\u0000\u01db\u01dd\u0003<\u001e\u0000\u01dc"+
		"\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd"+
		"G\u0001\u0000\u0000\u0000\u01de\u01e0\u0003J%\u0000\u01df\u01e1\u0005"+
		"4\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1I\u0001\u0000\u0000\u0000\u01e2\u01e3\u0003L&\u0000"+
		"\u01e3K\u0001\u0000\u0000\u0000\u01e4\u01e7\u0003N\'\u0000\u01e5\u01e6"+
		"\u0005%\u0000\u0000\u01e6\u01e8\u0003L&\u0000\u01e7\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8M\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ef\u0003P(\u0000\u01ea\u01eb\u0005B\u0000\u0000\u01eb"+
		"\u01ec\u0003L&\u0000\u01ec\u01ed\u00056\u0000\u0000\u01ed\u01ee\u0003"+
		"L&\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0O\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f6\u0003R)\u0000\u01f2\u01f3\u00050\u0000\u0000\u01f3\u01f5"+
		"\u0003R)\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7Q\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fe\u0003T*\u0000\u01fa\u01fb\u0005/\u0000\u0000\u01fb"+
		"\u01fd\u0003T*\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd\u0200\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001"+
		"\u0000\u0000\u0000\u01ffS\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0201\u0206\u0003V+\u0000\u0202\u0203\u0007\u0003\u0000\u0000"+
		"\u0203\u0205\u0003V+\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0208"+
		"\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207U\u0001\u0000\u0000\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0003X,\u0000\u020aW\u0001\u0000\u0000"+
		"\u0000\u020b\u0210\u0003Z-\u0000\u020c\u020d\u0007\u0004\u0000\u0000\u020d"+
		"\u020f\u0003Z-\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0212\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211Y\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0213\u0218\u0003\\.\u0000\u0214\u0215\u0007\u0005\u0000"+
		"\u0000\u0215\u0217\u0003\\.\u0000\u0216\u0214\u0001\u0000\u0000\u0000"+
		"\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0001\u0000\u0000\u0000\u0219[\u0001\u0000\u0000\u0000\u021a"+
		"\u0218\u0001\u0000\u0000\u0000\u021b\u0223\u0003^/\u0000\u021c\u021d\u0005"+
		"*\u0000\u0000\u021d\u0223\u0003\\.\u0000\u021e\u021f\u0005+\u0000\u0000"+
		"\u021f\u0223\u0003\\.\u0000\u0220\u0221\u00053\u0000\u0000\u0221\u0223"+
		"\u0003\\.\u0000\u0222\u021b\u0001\u0000\u0000\u0000\u0222\u021c\u0001"+
		"\u0000\u0000\u0000\u0222\u021e\u0001\u0000\u0000\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0223]\u0001\u0000\u0000\u0000\u0224\u0228\u0003`0"+
		"\u0000\u0225\u0227\u0003d2\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0001\u0000\u0000\u0000\u0229\u022d\u0001\u0000\u0000\u0000\u022a"+
		"\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u001c\u0000\u0000\u022c"+
		"\u022e\u00032\u0019\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0001\u0000\u0000\u0000\u022e_\u0001\u0000\u0000\u0000\u022f\u0231\u0003"+
		"f3\u0000\u0230\u0232\u0003b1\u0000\u0231\u0230\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232a\u0001\u0000\u0000\u0000\u0233"+
		"\u0234\u00053\u0000\u0000\u0234c\u0001\u0000\u0000\u0000\u0235\u0236\u0005"+
		"7\u0000\u0000\u0236\u0241\u0005L\u0000\u0000\u0237\u0239\u0005:\u0000"+
		"\u0000\u0238\u023a\u0003r9\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b"+
		"\u0241\u0005;\u0000\u0000\u023c\u023d\u0005<\u0000\u0000\u023d\u023e\u0003"+
		"J%\u0000\u023e\u023f\u0005=\u0000\u0000\u023f\u0241\u0001\u0000\u0000"+
		"\u0000\u0240\u0235\u0001\u0000\u0000\u0000\u0240\u0237\u0001\u0000\u0000"+
		"\u0000\u0240\u023c\u0001\u0000\u0000\u0000\u0241e\u0001\u0000\u0000\u0000"+
		"\u0242\u0264\u0005\u0011\u0000\u0000\u0243\u0264\u0005L\u0000\u0000\u0244"+
		"\u0264\u0005\u001e\u0000\u0000\u0245\u0264\u0005\u001f\u0000\u0000\u0246"+
		"\u0264\u0005 \u0000\u0000\u0247\u0264\u0005!\u0000\u0000\u0248\u0264\u0005"+
		"\"\u0000\u0000\u0249\u0264\u0005#\u0000\u0000\u024a\u0264\u0005$\u0000"+
		"\u0000\u024b\u0264\u0003t:\u0000\u024c\u0264\u0003x<\u0000\u024d\u0264"+
		"\u0003z=\u0000\u024e\u024f\u0005:\u0000\u0000\u024f\u0250\u0003J%\u0000"+
		"\u0250\u0251\u0005;\u0000\u0000\u0251\u0264\u0001\u0000\u0000\u0000\u0252"+
		"\u0264\u0003h4\u0000\u0253\u0254\u0005\u0010\u0000\u0000\u0254\u0256\u0005"+
		"L\u0000\u0000\u0255\u0257\u00038\u001c\u0000\u0256\u0255\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000"+
		"\u0000\u0258\u025a\u0005:\u0000\u0000\u0259\u025b\u0003r9\u0000\u025a"+
		"\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025c\u0264\u0005;\u0000\u0000\u025d\u0264"+
		"\u0005J\u0000\u0000\u025e\u025f\u0005\u0001\u0000\u0000\u025f\u0260\u0005"+
		"7\u0000\u0000\u0260\u0261\u0005!\u0000\u0000\u0261\u0262\u00057\u0000"+
		"\u0000\u0262\u0264\u0005L\u0000\u0000\u0263\u0242\u0001\u0000\u0000\u0000"+
		"\u0263\u0243\u0001\u0000\u0000\u0000\u0263\u0244\u0001\u0000\u0000\u0000"+
		"\u0263\u0245\u0001\u0000\u0000\u0000\u0263\u0246\u0001\u0000\u0000\u0000"+
		"\u0263\u0247\u0001\u0000\u0000\u0000\u0263\u0248\u0001\u0000\u0000\u0000"+
		"\u0263\u0249\u0001\u0000\u0000\u0000\u0263\u024a\u0001\u0000\u0000\u0000"+
		"\u0263\u024b\u0001\u0000\u0000\u0000\u0263\u024c\u0001\u0000\u0000\u0000"+
		"\u0263\u024d\u0001\u0000\u0000\u0000\u0263\u024e\u0001\u0000\u0000\u0000"+
		"\u0263\u0252\u0001\u0000\u0000\u0000\u0263\u0253\u0001\u0000\u0000\u0000"+
		"\u0263\u025d\u0001\u0000\u0000\u0000\u0263\u025e\u0001\u0000\u0000\u0000"+
		"\u0264g\u0001\u0000\u0000\u0000\u0265\u0266\u0003j5\u0000\u0266\u0267"+
		"\u00051\u0000\u0000\u0267\u0268\u0003p8\u0000\u0268i\u0001\u0000\u0000"+
		"\u0000\u0269\u0271\u0005L\u0000\u0000\u026a\u026b\u0005:\u0000\u0000\u026b"+
		"\u0271\u0005;\u0000\u0000\u026c\u026d\u0005:\u0000\u0000\u026d\u026e\u0003"+
		"l6\u0000\u026e\u026f\u0005;\u0000\u0000\u026f\u0271\u0001\u0000\u0000"+
		"\u0000\u0270\u0269\u0001\u0000\u0000\u0000\u0270\u026a\u0001\u0000\u0000"+
		"\u0000\u0270\u026c\u0001\u0000\u0000\u0000\u0271k\u0001\u0000\u0000\u0000"+
		"\u0272\u0277\u0003n7\u0000\u0273\u0274\u00055\u0000\u0000\u0274\u0276"+
		"\u0003n7\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276\u0279\u0001\u0000"+
		"\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001\u0000"+
		"\u0000\u0000\u0278m\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000"+
		"\u0000\u027a\u027d\u0005L\u0000\u0000\u027b\u027c\u00056\u0000\u0000\u027c"+
		"\u027e\u00030\u0018\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0001\u0000\u0000\u0000\u027eo\u0001\u0000\u0000\u0000\u027f\u0282\u0003"+
		"J%\u0000\u0280\u0282\u0003<\u001e\u0000\u0281\u027f\u0001\u0000\u0000"+
		"\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0282q\u0001\u0000\u0000\u0000"+
		"\u0283\u0288\u0003L&\u0000\u0284\u0285\u00055\u0000\u0000\u0285\u0287"+
		"\u0003L&\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000"+
		"\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000"+
		"\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028b\u028d\u00055\u0000\u0000\u028c\u028b\u0001\u0000\u0000"+
		"\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028ds\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0007\u0006\u0000\u0000\u028fu\u0001\u0000\u0000\u0000\u0290"+
		"\u0294\u0003J%\u0000\u0291\u0294\u0003x<\u0000\u0292\u0294\u0005J\u0000"+
		"\u0000\u0293\u0290\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000"+
		"\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294w\u0001\u0000\u0000\u0000"+
		"\u0295\u02a9\u0005<\u0000\u0000\u0296\u029b\u0003J%\u0000\u0297\u0298"+
		"\u00055\u0000\u0000\u0298\u029a\u0003J%\u0000\u0299\u0297\u0001\u0000"+
		"\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u02a8\u0001\u0000"+
		"\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u029f\u00052\u0000"+
		"\u0000\u029f\u02a4\u0003J%\u0000\u02a0\u02a1\u00055\u0000\u0000\u02a1"+
		"\u02a3\u0003J%\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a7\u0296\u0001\u0000\u0000\u0000\u02a7\u029e\u0001"+
		"\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005"+
		"=\u0000\u0000\u02ady\u0001\u0000\u0000\u0000\u02ae\u02b5\u00058\u0000"+
		"\u0000\u02af\u02b1\u0003|>\u0000\u02b0\u02b2\u0007\u0007\u0000\u0000\u02b1"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b3\u02af\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b7\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b8\u02ba\u00055\u0000\u0000\u02b9\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bb\u02bc\u00059\u0000\u0000\u02bc{\u0001\u0000"+
		"\u0000\u0000\u02bd\u02be\u0005L\u0000\u0000\u02be\u02bf\u00056\u0000\u0000"+
		"\u02bf\u02c3\u0003J%\u0000\u02c0\u02c1\u00052\u0000\u0000\u02c1\u02c3"+
		"\u0003J%\u0000\u02c2\u02bd\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c3}\u0001\u0000\u0000\u0000\u02c4\u02c6\u0005\u001d\u0000"+
		"\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c6\u02ca\u0001\u0000\u0000\u0000\u02c7\u02c9\u0003\u0080@\u0000"+
		"\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000"+
		"\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cb\u007f\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cd\u02ce\u0005@\u0000\u0000\u02ce\u02d2\u0003\u0082A\u0000\u02cf\u02d1"+
		"\u0003\u0086C\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d9\u0005A\u0000\u0000\u02d6\u02d8\u0003\u0084"+
		"B\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000"+
		"\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000"+
		"\u0000\u02da\u02dc\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0005@\u0000\u0000\u02dd\u02de\u0005\u0002\u0000\u0000"+
		"\u02de\u02df\u0003\u0082A\u0000\u02df\u02e0\u0005A\u0000\u0000\u02e0\u02f7"+
		"\u0001\u0000\u0000\u0000\u02e1\u02e2\u0005@\u0000\u0000\u02e2\u02e6\u0003"+
		"\u0082A\u0000\u02e3\u02e5\u0003\u0086C\u0000\u02e4\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e9\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005A\u0000\u0000"+
		"\u02ea\u02f7\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005@\u0000\u0000\u02ec"+
		"\u02f0\u0003\u0082A\u0000\u02ed\u02ef\u0003\u0086C\u0000\u02ee\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005"+
		"\u0002\u0000\u0000\u02f4\u02f5\u0005A\u0000\u0000\u02f5\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f6\u02cd\u0001\u0000\u0000\u0000\u02f6\u02e1\u0001\u0000"+
		"\u0000\u0000\u02f6\u02eb\u0001\u0000\u0000\u0000\u02f7\u0081\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f9\u0007\u0000\u0000\u0000\u02f9\u0083\u0001\u0000"+
		"\u0000\u0000\u02fa\u02ff\u0003\u0080@\u0000\u02fb\u02ff\u0003J%\u0000"+
		"\u02fc\u02ff\u0005K\u0000\u0000\u02fd\u02ff\u0005L\u0000\u0000\u02fe\u02fa"+
		"\u0001\u0000\u0000\u0000\u02fe\u02fb\u0001\u0000\u0000\u0000\u02fe\u02fc"+
		"\u0001\u0000\u0000\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02ff\u0085"+
		"\u0001\u0000\u0000\u0000\u0300\u0305\u0005L\u0000\u0000\u0301\u0302\u0005"+
		"L\u0000\u0000\u0302\u0303\u0005%\u0000\u0000\u0303\u0305\u0007\b\u0000"+
		"\u0000\u0304\u0300\u0001\u0000\u0000\u0000\u0304\u0301\u0001\u0000\u0000"+
		"\u0000\u0305\u0087\u0001\u0000\u0000\u0000[\u008c\u0090\u009f\u00a6\u00ad"+
		"\u00b4\u00b8\u00bf\u00c3\u00cc\u00d0\u00e4\u00ea\u00f2\u00f5\u0104\u010a"+
		"\u010f\u0115\u011a\u0120\u0125\u012a\u0133\u0137\u0140\u0145\u0149\u014c"+
		"\u014f\u015a\u0161\u0168\u016f\u0178\u017b\u017f\u0183\u018a\u0191\u0197"+
		"\u01a2\u01a9\u01b3\u01b9\u01be\u01c5\u01c7\u01d2\u01dc\u01e0\u01e7\u01ef"+
		"\u01f6\u01fe\u0206\u0210\u0218\u0222\u0228\u022d\u0231\u0239\u0240\u0256"+
		"\u025a\u0263\u0270\u0277\u027d\u0281\u0288\u028c\u0293\u029b\u02a4\u02a7"+
		"\u02a9\u02b1\u02b5\u02b9\u02c2\u02c5\u02ca\u02d2\u02d9\u02e6\u02f0\u02f6"+
		"\u02fe\u0304";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}