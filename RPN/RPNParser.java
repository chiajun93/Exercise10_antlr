// Generated from RPN.g4 by ANTLR 4.5

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RPNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT=13, AND=14, OR=15, NOT=16, TRUE=17, FALSE=18, 
		WS=19;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_eval = 2;
	public static final String[] ruleNames = {
		"start", "expr", "eval"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", null, "'&&'", "'||'", "'!'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT", "AND", "OR", "NOT", "TRUE", "FALSE", "WS"
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
	public String getGrammarFileName() { return "RPN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  int val = 0;
	  int a = 0;
	  int b = 0;
	  boolean left, right = false;
	  boolean result = false;
	  Stack<Integer> intStack = new Stack<Integer>();
	  Stack<Boolean> boolStack = new Stack<Boolean>();

	public RPNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RPNListener ) ((RPNListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RPNListener ) ((RPNListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				expr();
				setState(7);
				match(T__0);

				// 	                System.out.println("Bool Stack: " + boolStack);
				// 	                System.out.println("Int Stack: " + intStack);
				 	                if(!intStack.isEmpty())
				 	                    {System.out.println("Result: " + intStack.pop());}
				 	                if(!boolStack.isEmpty())
				 	                    {System.out.println("Result: " + boolStack.pop());}
				 	                val=0;
				 	                result = false;
				 	              
				}
				}
				setState(12); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE))) != 0) );
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
		public Token INT;
		public List<TerminalNode> INT() { return getTokens(RPNParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(RPNParser.INT, i);
		}
		public List<EvalContext> eval() {
			return getRuleContexts(EvalContext.class);
		}
		public EvalContext eval(int i) {
			return getRuleContext(EvalContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TRUE() { return getTokens(RPNParser.TRUE); }
		public TerminalNode TRUE(int i) {
			return getToken(RPNParser.TRUE, i);
		}
		public List<TerminalNode> FALSE() { return getTokens(RPNParser.FALSE); }
		public TerminalNode FALSE(int i) {
			return getToken(RPNParser.FALSE, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RPNListener ) ((RPNListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RPNListener ) ((RPNListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(63);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((ExprContext)_localctx).INT = match(INT);

				//          System.out.println("Int: " + (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0));
				            intStack.push((((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0));
				            
				setState(16);
				((ExprContext)_localctx).INT = match(INT);

				                   intStack.push((((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0));
				                   
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(18);
					eval();
					}
					}
					setState(21); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << AND) | (1L << OR) | (1L << NOT))) != 0) );
				setState(26);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(23);
						expr();
						}
						} 
					}
					setState(28);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					match(TRUE);

					//              System.out.println("Logical Operator: true");
					              boolStack.push(true);
					              
					}
					}
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TRUE );
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					eval();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << AND) | (1L << OR) | (1L << NOT))) != 0) );
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(40);
						expr();
						}
						} 
					}
					setState(45);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					match(FALSE);

					//               System.out.println("Logical Operator: false");
					               boolStack.push(true);
					               
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FALSE );
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					eval();
					}
					}
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << AND) | (1L << OR) | (1L << NOT))) != 0) );
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(57);
						expr();
						}
						} 
					}
					setState(62);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
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

	public static class EvalContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(RPNParser.AND, 0); }
		public TerminalNode OR() { return getToken(RPNParser.OR, 0); }
		public TerminalNode NOT() { return getToken(RPNParser.NOT, 0); }
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RPNListener ) ((RPNListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RPNListener ) ((RPNListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eval);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__1);

				            a = intStack.pop();
				            b = intStack.pop();
				            val = a + b;
				            intStack.push(val);
				         
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__2);

				            a = intStack.pop();
				            b = intStack.pop();
				            val = a - b;
				            intStack.push(val);
				          
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__3);

				           a = intStack.pop();
				           b = intStack.pop();
				           val = a * b;
				           intStack.push(val);
				           
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(T__4);

				           a = intStack.pop();
				           b = intStack.pop();
				           val = a / b;
				           intStack.push(val);
				        
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(T__5);

				            a = intStack.pop();
				            b = intStack.pop();
				            val = a % b;
				            intStack.push(val);
				           
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(T__6);

				            b = intStack.pop();
				            a = intStack.pop();
				            result = a < b;
				            boolStack.push(result);
				            
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(T__7);

				             b = intStack.pop();
				             a = intStack.pop();
				             result = a <= b;
				             boolStack.push(result);
				            
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(T__8);

				            b = intStack.pop();
				            a = intStack.pop();
				            result = a > b;
				            boolStack.push(result);
				            
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				match(T__9);

				             b = intStack.pop();
				             a = intStack.pop();
				             result = a >= b;
				             boolStack.push(result);
				             
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 10);
				{
				setState(83);
				match(T__10);

				            b = intStack.pop();
				            a = intStack.pop();
				            result = a == b;
				            boolStack.push(result);
				            
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
				match(T__11);

				            b = intStack.pop();
				            a = intStack.pop();
				            result = a != b;
				            boolStack.push(result);
				            
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 12);
				{
				setState(87);
				match(AND);

				             left = boolStack.pop();
				             right = boolStack.pop();
				             result = left && right;
				             boolStack.push(result);
				             
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 13);
				{
				setState(89);
				match(OR);

				            left = boolStack.pop();
				            right = boolStack.pop();
				            result = left || right;
				            boolStack.push(result);
				            
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 14);
				{
				setState(91);
				match(NOT);

				            result = !boolStack.pop();
				            boolStack.push(result);
				            
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\6\2\r\n\2\r\2\16\2\16\3\3\3\3\3\3\3\3\3\3\6"+
		"\3\26\n\3\r\3\16\3\27\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\6\3\"\n"+
		"\3\r\3\16\3#\3\3\6\3\'\n\3\r\3\16\3(\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3"+
		"\3\6\3\63\n\3\r\3\16\3\64\3\3\6\38\n\3\r\3\16\39\3\3\7\3=\n\3\f\3\16\3"+
		"@\13\3\5\3B\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3"+
		"\4\2\2\5\2\4\6\2\2v\2\f\3\2\2\2\4A\3\2\2\2\6_\3\2\2\2\b\t\5\4\3\2\t\n"+
		"\7\3\2\2\n\13\b\2\1\2\13\r\3\2\2\2\f\b\3\2\2\2\r\16\3\2\2\2\16\f\3\2\2"+
		"\2\16\17\3\2\2\2\17\3\3\2\2\2\20\21\7\17\2\2\21\22\b\3\1\2\22\23\7\17"+
		"\2\2\23\25\b\3\1\2\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2"+
		"\2\2\27\30\3\2\2\2\30\34\3\2\2\2\31\33\5\4\3\2\32\31\3\2\2\2\33\36\3\2"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35B\3\2\2\2\36\34\3\2\2\2\37 \7\23\2"+
		"\2 \"\b\3\1\2!\37\3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%\'"+
		"\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)-\3\2\2\2*,\5\4\3\2"+
		"+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.B\3\2\2\2/-\3\2\2\2\60\61\7\24"+
		"\2\2\61\63\b\3\1\2\62\60\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\67\3\2\2\2\668\5\6\4\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:>\3\2\2\2;=\5\4\3\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3"+
		"\2\2\2@>\3\2\2\2A\20\3\2\2\2A!\3\2\2\2A\62\3\2\2\2B\5\3\2\2\2CD\7\4\2"+
		"\2D`\b\4\1\2EF\7\5\2\2F`\b\4\1\2GH\7\6\2\2H`\b\4\1\2IJ\7\7\2\2J`\b\4\1"+
		"\2KL\7\b\2\2L`\b\4\1\2MN\7\t\2\2N`\b\4\1\2OP\7\n\2\2P`\b\4\1\2QR\7\13"+
		"\2\2R`\b\4\1\2ST\7\f\2\2T`\b\4\1\2UV\7\r\2\2V`\b\4\1\2WX\7\16\2\2X`\b"+
		"\4\1\2YZ\7\20\2\2Z`\b\4\1\2[\\\7\21\2\2\\`\b\4\1\2]^\7\22\2\2^`\b\4\1"+
		"\2_C\3\2\2\2_E\3\2\2\2_G\3\2\2\2_I\3\2\2\2_K\3\2\2\2_M\3\2\2\2_O\3\2\2"+
		"\2_Q\3\2\2\2_S\3\2\2\2_U\3\2\2\2_W\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_]\3\2\2"+
		"\2`\7\3\2\2\2\r\16\27\34#(-\649>A_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}