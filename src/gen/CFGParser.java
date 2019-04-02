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
		OP=1, ASSIGN=2, BEGIN=3, END=4, SEMI=5, COMMA=6, ETYPE=7, CTYPE=8, PTYPE=9, 
		MEASURE=10, LPAREN=11, RPAREN=12, PLAY=13, SEND=14, REC=15, NUM=16, INT=17, 
		ID=18, NOTE=19, WS=20;
	public static final int
		RULE_program = 0, RULE_start = 1, RULE_dcls = 2, RULE_processDcl = 3, 
		RULE_stmt = 4, RULE_playStruc = 5, RULE_chord = 6, RULE_n = 7, RULE_aExp = 8, 
		RULE_t = 9, RULE_x = 10, RULE_c = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "start", "dcls", "processDcl", "stmt", "playStruc", "chord", 
			"n", "aExp", "t", "x", "c"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'{'", "'}'", "';'", "','", "'num'", "'chord'", null, 
			null, "'('", "')'", "'play'", "'send'", "'receive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "ASSIGN", "BEGIN", "END", "SEMI", "COMMA", "ETYPE", "CTYPE", 
			"PTYPE", "MEASURE", "LPAREN", "RPAREN", "PLAY", "SEND", "REC", "NUM", 
			"INT", "ID", "NOTE", "WS"
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

	public static class ProgramContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFGParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			start();
			setState(25);
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

	public static class StartContext extends ParserRuleContext {
		public List<ProcessDclContext> processDcl() {
			return getRuleContexts(ProcessDclContext.class);
		}
		public ProcessDclContext processDcl(int i) {
			return getRuleContext(ProcessDclContext.class,i);
		}
		public List<DclsContext> dcls() {
			return getRuleContexts(DclsContext.class);
		}
		public DclsContext dcls(int i) {
			return getRuleContext(DclsContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CFGParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CFGParser.SEMI, i);
		}
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
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ETYPE) | (1L << CTYPE) | (1L << PTYPE))) != 0)) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ETYPE:
				case CTYPE:
					{
					{
					setState(27);
					dcls();
					setState(28);
					match(SEMI);
					}
					}
					break;
				case PTYPE:
					{
					setState(30);
					processDcl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
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

	public static class DclsContext extends ParserRuleContext {
		public TerminalNode ETYPE() { return getToken(CFGParser.ETYPE, 0); }
		public TerminalNode ID() { return getToken(CFGParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CFGParser.ASSIGN, 0); }
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public TerminalNode CTYPE() { return getToken(CFGParser.CTYPE, 0); }
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public DclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterDcls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitDcls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitDcls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclsContext dcls() throws RecognitionException {
		DclsContext _localctx = new DclsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dcls);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ETYPE);
				setState(37);
				match(ID);
				setState(38);
				match(ASSIGN);
				setState(39);
				aExp();
				}
				break;
			case CTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(CTYPE);
				setState(41);
				match(ID);
				setState(42);
				match(ASSIGN);
				setState(43);
				chord();
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

	public static class ProcessDclContext extends ParserRuleContext {
		public TerminalNode PTYPE() { return getToken(CFGParser.PTYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(CFGParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CFGParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(CFGParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CFGParser.RPAREN, 0); }
		public TerminalNode BEGIN() { return getToken(CFGParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CFGParser.END, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CFGParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CFGParser.SEMI, i);
		}
		public ProcessDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterProcessDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitProcessDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitProcessDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessDclContext processDcl() throws RecognitionException {
		ProcessDclContext _localctx = new ProcessDclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_processDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(PTYPE);
			setState(47);
			match(ID);
			setState(48);
			match(LPAREN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(49);
				match(ID);
				}
			}

			setState(52);
			match(RPAREN);
			setState(53);
			match(BEGIN);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ETYPE) | (1L << CTYPE) | (1L << PLAY) | (1L << SEND) | (1L << REC))) != 0)) {
				{
				{
				setState(54);
				stmt();
				setState(55);
				match(SEMI);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(END);
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
		public DclsContext dcls() {
			return getRuleContext(DclsContext.class,0);
		}
		public TerminalNode PLAY() { return getToken(CFGParser.PLAY, 0); }
		public TerminalNode LPAREN() { return getToken(CFGParser.LPAREN, 0); }
		public PlayStrucContext playStruc() {
			return getRuleContext(PlayStrucContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CFGParser.RPAREN, 0); }
		public TerminalNode MEASURE() { return getToken(CFGParser.MEASURE, 0); }
		public TerminalNode COMMA() { return getToken(CFGParser.COMMA, 0); }
		public TerminalNode SEND() { return getToken(CFGParser.SEND, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public TerminalNode REC() { return getToken(CFGParser.REC, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
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
		enterRule(_localctx, 8, RULE_stmt);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ETYPE:
			case CTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				dcls();
				}
				break;
			case PLAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(PLAY);
				setState(66);
				match(LPAREN);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MEASURE) {
					{
					setState(67);
					match(MEASURE);
					setState(68);
					match(COMMA);
					}
				}

				setState(71);
				playStruc();
				setState(72);
				match(RPAREN);
				}
				break;
			case SEND:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(SEND);
				setState(75);
				match(LPAREN);
				setState(76);
				c();
				setState(77);
				match(COMMA);
				setState(78);
				aExp();
				setState(79);
				match(RPAREN);
				}
				break;
			case REC:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(REC);
				setState(82);
				match(LPAREN);
				setState(83);
				c();
				setState(84);
				match(COMMA);
				setState(85);
				x();
				setState(86);
				match(RPAREN);
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

	public static class PlayStrucContext extends ParserRuleContext {
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFGParser.COMMA, i);
		}
		public List<PlayStrucContext> playStruc() {
			return getRuleContexts(PlayStrucContext.class);
		}
		public PlayStrucContext playStruc(int i) {
			return getRuleContext(PlayStrucContext.class,i);
		}
		public PlayStrucContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playStruc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterPlayStruc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitPlayStruc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitPlayStruc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayStrucContext playStruc() throws RecognitionException {
		PlayStrucContext _localctx = new PlayStrucContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_playStruc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case ID:
				{
				setState(90);
				chord();
				}
				break;
			case NOTE:
				{
				setState(91);
				n();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(COMMA);
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << ID) | (1L << NOTE))) != 0)) {
						{
						setState(95);
						playStruc();
						}
					}

					}
					} 
				}
				setState(102);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ChordContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CFGParser.LPAREN, 0); }
		public List<TerminalNode> NOTE() { return getTokens(CFGParser.NOTE); }
		public TerminalNode NOTE(int i) {
			return getToken(CFGParser.NOTE, i);
		}
		public TerminalNode RPAREN() { return getToken(CFGParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CFGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFGParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(CFGParser.ID, 0); }
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitChord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitChord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chord);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(LPAREN);
				setState(104);
				match(NOTE);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(105);
					match(COMMA);
					setState(106);
					match(NOTE);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(ID);
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

	public static class NContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(CFGParser.NOTE, 0); }
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NOTE);
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

	public static class AExpContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode OP() { return getToken(CFGParser.OP, 0); }
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public AExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterAExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitAExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitAExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AExpContext aExp() throws RecognitionException {
		AExpContext _localctx = new AExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aExp);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				t();
				setState(119);
				match(OP);
				setState(120);
				aExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
		enterRule(_localctx, 18, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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

	public static class XContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_x);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				chord();
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

	public static class CContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CFGParser.ID, 0); }
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\5\5\65"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\5\7_\n\7\3\7\3\7\5\7c\n\7\7\7e\n\7\f\7"+
		"\16\7h\13\7\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b\5\bu\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\f\3\f\5\f\u0084\n\f\3"+
		"\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\22\22\24\24\2"+
		"\u008b\2\32\3\2\2\2\4#\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\nZ\3\2\2\2\f^\3"+
		"\2\2\2\16t\3\2\2\2\20v\3\2\2\2\22}\3\2\2\2\24\177\3\2\2\2\26\u0083\3\2"+
		"\2\2\30\u0085\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\5"+
		"\6\4\2\36\37\7\7\2\2\37\"\3\2\2\2 \"\5\b\5\2!\35\3\2\2\2! \3\2\2\2\"%"+
		"\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\7\t\2\2\'(\7\24\2"+
		"\2()\7\4\2\2)/\5\22\n\2*+\7\n\2\2+,\7\24\2\2,-\7\4\2\2-/\5\16\b\2.&\3"+
		"\2\2\2.*\3\2\2\2/\7\3\2\2\2\60\61\7\13\2\2\61\62\7\24\2\2\62\64\7\r\2"+
		"\2\63\65\7\24\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\16"+
		"\2\2\67=\7\5\2\289\5\n\6\29:\7\7\2\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\6\2\2A\t\3\2\2\2B[\5\6\4\2CD"+
		"\7\17\2\2DG\7\r\2\2EF\7\f\2\2FH\7\b\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2"+
		"IJ\5\f\7\2JK\7\16\2\2K[\3\2\2\2LM\7\20\2\2MN\7\r\2\2NO\5\30\r\2OP\7\b"+
		"\2\2PQ\5\22\n\2QR\7\16\2\2R[\3\2\2\2ST\7\21\2\2TU\7\r\2\2UV\5\30\r\2V"+
		"W\7\b\2\2WX\5\26\f\2XY\7\16\2\2Y[\3\2\2\2ZB\3\2\2\2ZC\3\2\2\2ZL\3\2\2"+
		"\2ZS\3\2\2\2[\13\3\2\2\2\\_\5\16\b\2]_\5\20\t\2^\\\3\2\2\2^]\3\2\2\2_"+
		"f\3\2\2\2`b\7\b\2\2ac\5\f\7\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2d`\3\2\2\2"+
		"eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hf\3\2\2\2ij\7\r\2\2jo\7\25\2"+
		"\2kl\7\b\2\2ln\7\25\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2"+
		"\2\2qo\3\2\2\2ru\7\16\2\2su\7\24\2\2ti\3\2\2\2ts\3\2\2\2u\17\3\2\2\2v"+
		"w\7\25\2\2w\21\3\2\2\2xy\5\24\13\2yz\7\3\2\2z{\5\22\n\2{~\3\2\2\2|~\5"+
		"\24\13\2}x\3\2\2\2}|\3\2\2\2~\23\3\2\2\2\177\u0080\t\2\2\2\u0080\25\3"+
		"\2\2\2\u0081\u0084\5\24\13\2\u0082\u0084\5\16\b\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\27\3\2\2\2\u0085\u0086\7\24\2\2\u0086\31\3"+
		"\2\2\2\20!#.\64=GZ^bfot}\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}