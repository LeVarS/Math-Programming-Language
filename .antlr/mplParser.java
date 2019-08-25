// Generated from c:\Users\ellerbee_james1\Documents\GitHub\Math-Programming-Language\mpl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SET=18, LET=19, VAR=20, EQU_SIGN=21, STRING=22, INT=23, OPERATOR=24, TERM=25;
	public static final int
		RULE_source = 0, RULE_statement = 1, RULE_expr = 2, RULE_operation = 3, 
		RULE_equ = 4;
	public static final String[] ruleNames = {
		"source", "statement", "expr", "operation", "equ"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'display'", "','", "'exist'", "'='", "'solve for'", "'given'", 
		"'when'", "'('", "')'", "'**'", "'*'", "'/'", "'%'", "'+'", "'-'", "'''"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "SET", "LET", "VAR", "EQU_SIGN", "STRING", 
		"INT", "OPERATOR", "TERM"
	};
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
	public String getGrammarFileName() { return "mpl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				statement();
				setState(11);
				match(T__0);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << SET) | (1L << LET))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LET() { return getToken(mplParser.LET, 0); }
		public List<TerminalNode> VAR() { return getTokens(mplParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(mplParser.VAR, i);
		}
		public TerminalNode SET() { return getToken(mplParser.SET, 0); }
		public List<EquContext> equ() {
			return getRuleContexts(EquContext.class);
		}
		public EquContext equ(int i) {
			return getRuleContext(EquContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(T__1);
				setState(18);
				expr();
				setState(19);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(LET);
				setState(22);
				match(VAR);
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(23);
					match(T__2);
					setState(24);
					match(VAR);
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(30);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(LET);
				setState(32);
				match(VAR);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(33);
					match(T__2);
					setState(34);
					match(VAR);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(40);
				match(T__4);
				setState(41);
				expr();
				setState(42);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(SET);
				setState(45);
				match(VAR);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(46);
					match(T__2);
					setState(47);
					match(VAR);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(53);
				match(T__4);
				setState(54);
				expr();
				setState(55);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(T__5);
				setState(58);
				match(VAR);
				setState(59);
				match(T__2);
				setState(60);
				match(T__6);
				setState(61);
				equ();
				setState(62);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(T__5);
				setState(65);
				match(VAR);
				setState(66);
				match(T__2);
				setState(67);
				match(T__6);
				setState(68);
				equ();
				setState(69);
				match(T__2);
				setState(70);
				match(T__7);
				setState(71);
				equ();
				setState(72);
				match(T__0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(mplParser.STRING, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(STRING);
				}
				break;
			case T__8:
			case TERM:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				operation(0);
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

	public static class OperationContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode TERM() { return getToken(mplParser.TERM, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(81);
				match(T__8);
				setState(82);
				operation(0);
				setState(83);
				match(T__9);
				}
				break;
			case 2:
				{
				{
				setState(85);
				match(TERM);
				setState(86);
				match(T__10);
				setState(87);
				operation(0);
				}
				}
				break;
			case 3:
				{
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(88);
					match(TERM);
					setState(89);
					match(T__11);
					setState(90);
					operation(0);
					}
					break;
				case 2:
					{
					setState(91);
					match(TERM);
					setState(92);
					match(T__12);
					setState(93);
					operation(0);
					}
					break;
				case 3:
					{
					setState(94);
					match(TERM);
					setState(95);
					match(T__13);
					setState(96);
					operation(0);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(99);
					match(TERM);
					setState(100);
					match(T__14);
					setState(101);
					operation(0);
					}
					break;
				case 2:
					{
					setState(102);
					match(TERM);
					setState(103);
					match(T__15);
					setState(104);
					operation(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operation);
					setState(109);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(110);
					match(T__8);
					setState(111);
					operation(0);
					setState(112);
					match(T__9);
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EquContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> EQU_SIGN() { return getTokens(mplParser.EQU_SIGN); }
		public TerminalNode EQU_SIGN(int i) {
			return getToken(mplParser.EQU_SIGN, i);
		}
		public TerminalNode VAR() { return getToken(mplParser.VAR, 0); }
		public EquContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ; }
	}

	public final EquContext equ() throws RecognitionException {
		EquContext _localctx = new EquContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equ);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__16);
				setState(120);
				expr();
				setState(121);
				match(EQU_SIGN);
				setState(122);
				expr();
				setState(123);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__16);
				setState(126);
				expr();
				setState(127);
				match(EQU_SIGN);
				setState(128);
				match(VAR);
				setState(129);
				match(EQU_SIGN);
				setState(130);
				expr();
				setState(131);
				match(T__16);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\6\2\20\n\2\r\2\16\2\21\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\5\4Q\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5d\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\5\5n\n\5\3\5\3\5\3\5\3\5\3\5\7\5u\n"+
		"\5\f\5\16\5x\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0088\n\6\3\6\2\3\b\7\2\4\6\b\n\2\2\2\u0096\2\17\3\2\2\2\4L\3"+
		"\2\2\2\6P\3\2\2\2\bm\3\2\2\2\n\u0087\3\2\2\2\f\r\5\4\3\2\r\16\7\3\2\2"+
		"\16\20\3\2\2\2\17\f\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2"+
		"\22\3\3\2\2\2\23\24\7\4\2\2\24\25\5\6\4\2\25\26\7\3\2\2\26M\3\2\2\2\27"+
		"\30\7\25\2\2\30\35\7\26\2\2\31\32\7\5\2\2\32\34\7\26\2\2\33\31\3\2\2\2"+
		"\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 "+
		"M\7\6\2\2!\"\7\25\2\2\"\'\7\26\2\2#$\7\5\2\2$&\7\26\2\2%#\3\2\2\2&)\3"+
		"\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\7\2\2+,\5\6\4\2"+
		",-\7\3\2\2-M\3\2\2\2./\7\24\2\2/\64\7\26\2\2\60\61\7\5\2\2\61\63\7\26"+
		"\2\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2"+
		"\2\2\66\64\3\2\2\2\678\7\7\2\289\5\6\4\29:\7\3\2\2:M\3\2\2\2;<\7\b\2\2"+
		"<=\7\26\2\2=>\7\5\2\2>?\7\t\2\2?@\5\n\6\2@A\7\3\2\2AM\3\2\2\2BC\7\b\2"+
		"\2CD\7\26\2\2DE\7\5\2\2EF\7\t\2\2FG\5\n\6\2GH\7\5\2\2HI\7\n\2\2IJ\5\n"+
		"\6\2JK\7\3\2\2KM\3\2\2\2L\23\3\2\2\2L\27\3\2\2\2L!\3\2\2\2L.\3\2\2\2L"+
		";\3\2\2\2LB\3\2\2\2M\5\3\2\2\2NQ\7\30\2\2OQ\5\b\5\2PN\3\2\2\2PO\3\2\2"+
		"\2Q\7\3\2\2\2RS\b\5\1\2ST\7\13\2\2TU\5\b\5\2UV\7\f\2\2Vn\3\2\2\2WX\7\33"+
		"\2\2XY\7\r\2\2Yn\5\b\5\2Z[\7\33\2\2[\\\7\16\2\2\\d\5\b\5\2]^\7\33\2\2"+
		"^_\7\17\2\2_d\5\b\5\2`a\7\33\2\2ab\7\20\2\2bd\5\b\5\2cZ\3\2\2\2c]\3\2"+
		"\2\2c`\3\2\2\2dn\3\2\2\2ef\7\33\2\2fg\7\21\2\2gl\5\b\5\2hi\7\33\2\2ij"+
		"\7\22\2\2jl\5\b\5\2ke\3\2\2\2kh\3\2\2\2ln\3\2\2\2mR\3\2\2\2mW\3\2\2\2"+
		"mc\3\2\2\2mk\3\2\2\2nv\3\2\2\2op\f\6\2\2pq\7\13\2\2qr\5\b\5\2rs\7\f\2"+
		"\2su\3\2\2\2to\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\t\3\2\2\2xv\3\2"+
		"\2\2yz\7\23\2\2z{\5\6\4\2{|\7\27\2\2|}\5\6\4\2}~\7\23\2\2~\u0088\3\2\2"+
		"\2\177\u0080\7\23\2\2\u0080\u0081\5\6\4\2\u0081\u0082\7\27\2\2\u0082\u0083"+
		"\7\26\2\2\u0083\u0084\7\27\2\2\u0084\u0085\5\6\4\2\u0085\u0086\7\23\2"+
		"\2\u0086\u0088\3\2\2\2\u0087y\3\2\2\2\u0087\177\3\2\2\2\u0088\13\3\2\2"+
		"\2\r\21\35\'\64LPckmv\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}