// Generated from /Users/Maria/Documents/GitHub/Helix/CFG.g4 by ANTLR 4.7.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CFGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, ASSIGN=2, BEGIN=3, END=4, SEMI=5, NUM=6, ID=7, WS=8;
	public static final int
		RULE_start = 0, RULE_aStmt = 1, RULE_stmt = 2, RULE_t = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "aStmt", "stmt", "t"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'='", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "ASSIGN", "BEGIN", "END", "SEMI", "NUM", "ID", "WS"
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
	public String getGrammarFileName() { return "CFG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CFGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public AStmtContext aStmt() {
			return getRuleContext(AStmtContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFGParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			aStmt();
			setState(9);
			match(EOF);
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

	public static class AStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CFGParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CFGParser.ASSIGN, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterAStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitAStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitAStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AStmtContext aStmt() throws RecognitionException {
		AStmtContext _localctx = new AStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_aStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(ID);
			setState(12);
			match(ASSIGN);
			setState(13);
			stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CFGParser.PLUS, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				t();
				setState(16);
				match(PLUS);
				setState(17);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				t();
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(CFGParser.NUM, 0); }
		public TerminalNode ID() { return getToken(CFGParser.ID, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==ID) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\33\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\27\n\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\3\2\b\t\2\27\2\n\3\2\2\2\4\r\3"+
		"\2\2\2\6\26\3\2\2\2\b\30\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f\3\3\2\2\2"+
		"\r\16\7\t\2\2\16\17\7\4\2\2\17\20\5\6\4\2\20\5\3\2\2\2\21\22\5\b\5\2\22"+
		"\23\7\3\2\2\23\24\5\6\4\2\24\27\3\2\2\2\25\27\5\b\5\2\26\21\3\2\2\2\26"+
		"\25\3\2\2\2\27\7\3\2\2\2\30\31\t\2\2\2\31\t\3\2\2\2\3\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}