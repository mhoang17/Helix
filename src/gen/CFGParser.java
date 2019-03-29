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
		OP=1, ASSIGN=2, BEGIN=3, END=4, SEMI=5, COMMA=6, NOTE=7, ETYPE=8, CTYPE=9, 
		PTYPE=10, MEASURE=11, LPAREN=12, RPAREN=13, PLAY=14, SEND=15, REC=16, 
		NUM=17, ID=18, WS=19;
	public static final int
		RULE_program = 0, RULE_start = 1, RULE_dcls = 2, RULE_eDcl = 3, RULE_chordDcl = 4, 
		RULE_processDcl = 5, RULE_stmt = 6, RULE_playStruc = 7, RULE_chord = 8, 
		RULE_n = 9, RULE_e = 10, RULE_t = 11, RULE_c = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "start", "dcls", "eDcl", "chordDcl", "processDcl", "stmt", 
			"playStruc", "chord", "n", "e", "t", "c"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'{'", "'}'", "';'", "','", null, "'num'", "'chord'", 
			null, null, "'('", "')'", "'play'", "'send'", "'receive'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OP", "ASSIGN", "BEGIN", "END", "SEMI", "COMMA", "NOTE", "ETYPE", 
			"CTYPE", "PTYPE", "MEASURE", "LPAREN", "RPAREN", "PLAY", "SEND", "REC", 
			"NUM", "ID", "WS"
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
			setState(26);
			start();
			setState(27);
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
		public List<DclsContext> dcls() {
			return getRuleContexts(DclsContext.class);
		}
		public DclsContext dcls(int i) {
			return getRuleContext(DclsContext.class,i);
		}
		public List<ProcessDclContext> processDcl() {
			return getRuleContexts(ProcessDclContext.class);
		}
		public ProcessDclContext processDcl(int i) {
			return getRuleContext(ProcessDclContext.class,i);
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
					setState(29);
					dcls();
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
		public EDclContext eDcl() {
			return getRuleContext(EDclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CFGParser.SEMI, 0); }
		public ChordDclContext chordDcl() {
			return getRuleContext(ChordDclContext.class,0);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				eDcl();
				setState(37);
				match(SEMI);
				}
				break;
			case CTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				chordDcl();
				setState(40);
				match(SEMI);
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

	public static class EDclContext extends ParserRuleContext {
		public TerminalNode ETYPE() { return getToken(CFGParser.ETYPE, 0); }
		public TerminalNode ID() { return getToken(CFGParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CFGParser.ASSIGN, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public EDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterEDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitEDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitEDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EDclContext eDcl() throws RecognitionException {
		EDclContext _localctx = new EDclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ETYPE);
			setState(45);
			match(ID);
			setState(46);
			match(ASSIGN);
			setState(47);
			e();
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

	public static class ChordDclContext extends ParserRuleContext {
		public TerminalNode CTYPE() { return getToken(CFGParser.CTYPE, 0); }
		public TerminalNode ID() { return getToken(CFGParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(CFGParser.ASSIGN, 0); }
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public ChordDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chordDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterChordDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitChordDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitChordDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChordDclContext chordDcl() throws RecognitionException {
		ChordDclContext _localctx = new ChordDclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chordDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(CTYPE);
			setState(50);
			match(ID);
			setState(51);
			match(ASSIGN);
			setState(52);
			chord();
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
		enterRule(_localctx, 10, RULE_processDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PTYPE);
			setState(55);
			match(ID);
			setState(56);
			match(LPAREN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(57);
				match(ID);
				}
			}

			setState(60);
			match(RPAREN);
			setState(61);
			match(BEGIN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ETYPE) | (1L << CTYPE) | (1L << PLAY) | (1L << SEND) | (1L << REC))) != 0)) {
				{
				{
				setState(62);
				stmt();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public TerminalNode SEMI() { return getToken(CFGParser.SEMI, 0); }
		public TerminalNode MEASURE() { return getToken(CFGParser.MEASURE, 0); }
		public TerminalNode COMMA() { return getToken(CFGParser.COMMA, 0); }
		public TerminalNode SEND() { return getToken(CFGParser.SEND, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode REC() { return getToken(CFGParser.REC, 0); }
		public TContext t() {
			return getRuleContext(TContext.class,0);
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
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ETYPE:
			case CTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				dcls();
				}
				break;
			case PLAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(PLAY);
				setState(72);
				match(LPAREN);
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MEASURE) {
					{
					setState(73);
					match(MEASURE);
					setState(74);
					match(COMMA);
					}
				}

				setState(77);
				playStruc();
				setState(78);
				match(RPAREN);
				setState(79);
				match(SEMI);
				}
				break;
			case SEND:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(SEND);
				setState(82);
				match(LPAREN);
				setState(83);
				c();
				setState(84);
				match(COMMA);
				setState(85);
				e();
				setState(86);
				match(RPAREN);
				setState(87);
				match(SEMI);
				}
				break;
			case REC:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(REC);
				setState(90);
				match(LPAREN);
				setState(91);
				c();
				setState(92);
				match(COMMA);
				setState(93);
				t();
				setState(94);
				match(RPAREN);
				setState(95);
				match(SEMI);
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
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public List<NContext> n() {
			return getRuleContexts(NContext.class);
		}
		public NContext n(int i) {
			return getRuleContext(NContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFGParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFGParser.COMMA, i);
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
		enterRule(_localctx, 14, RULE_playStruc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case ID:
				{
				setState(99);
				chord();
				}
				break;
			case NOTE:
				{
				setState(100);
				n();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(103);
					match(COMMA);
					setState(104);
					chord();
					}
					break;
				case 2:
					{
					setState(105);
					match(COMMA);
					setState(106);
					n();
					}
					break;
				case 3:
					{
					setState(107);
					match(COMMA);
					}
					break;
				}
				}
				setState(112);
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
		enterRule(_localctx, 16, RULE_chord);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(LPAREN);
				setState(114);
				match(NOTE);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(115);
					match(COMMA);
					setState(116);
					match(NOTE);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				match(RPAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
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
		enterRule(_localctx, 18, RULE_n);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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

	public static class EContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode OP() { return getToken(CFGParser.OP, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFGListener ) ((CFGListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CFGVisitor ) return ((CFGVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_e);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				t();
				setState(129);
				match(OP);
				setState(130);
				e();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
		enterRule(_localctx, 22, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		enterRule(_localctx, 24, RULE_c);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7=\n\7\3\7\3\7\3\7\7\7B\n\7\f\7\16\7E\13"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3\t\5"+
		"\th\n\t\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\n\3\n\3\n\3\n\7"+
		"\nx\n\n\f\n\16\n{\13\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0088\n\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\3\3\2\23\24\2\u0090\2\34\3\2\2\2\4#\3\2\2\2\6,\3\2\2\2\b."+
		"\3\2\2\2\n\63\3\2\2\2\f8\3\2\2\2\16c\3\2\2\2\20g\3\2\2\2\22~\3\2\2\2\24"+
		"\u0080\3\2\2\2\26\u0087\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\35"+
		"\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37\"\5\6\4\2 \"\5\f\7\2!\37\3\2\2"+
		"\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\5"+
		"\b\5\2\'(\7\7\2\2(-\3\2\2\2)*\5\n\6\2*+\7\7\2\2+-\3\2\2\2,&\3\2\2\2,)"+
		"\3\2\2\2-\7\3\2\2\2./\7\n\2\2/\60\7\24\2\2\60\61\7\4\2\2\61\62\5\26\f"+
		"\2\62\t\3\2\2\2\63\64\7\13\2\2\64\65\7\24\2\2\65\66\7\4\2\2\66\67\5\22"+
		"\n\2\67\13\3\2\2\289\7\f\2\29:\7\24\2\2:<\7\16\2\2;=\7\24\2\2<;\3\2\2"+
		"\2<=\3\2\2\2=>\3\2\2\2>?\7\17\2\2?C\7\5\2\2@B\5\16\b\2A@\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\6\2\2G\r\3\2\2\2Hd\5"+
		"\6\4\2IJ\7\20\2\2JM\7\16\2\2KL\7\r\2\2LN\7\b\2\2MK\3\2\2\2MN\3\2\2\2N"+
		"O\3\2\2\2OP\5\20\t\2PQ\7\17\2\2QR\7\7\2\2Rd\3\2\2\2ST\7\21\2\2TU\7\16"+
		"\2\2UV\5\32\16\2VW\7\b\2\2WX\5\26\f\2XY\7\17\2\2YZ\7\7\2\2Zd\3\2\2\2["+
		"\\\7\22\2\2\\]\7\16\2\2]^\5\32\16\2^_\7\b\2\2_`\5\30\r\2`a\7\17\2\2ab"+
		"\7\7\2\2bd\3\2\2\2cH\3\2\2\2cI\3\2\2\2cS\3\2\2\2c[\3\2\2\2d\17\3\2\2\2"+
		"eh\5\22\n\2fh\5\24\13\2ge\3\2\2\2gf\3\2\2\2hp\3\2\2\2ij\7\b\2\2jo\5\22"+
		"\n\2kl\7\b\2\2lo\5\24\13\2mo\7\b\2\2ni\3\2\2\2nk\3\2\2\2nm\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\21\3\2\2\2rp\3\2\2\2st\7\16\2\2ty\7\t\2\2"+
		"uv\7\b\2\2vx\7\t\2\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2"+
		"{y\3\2\2\2|\177\7\17\2\2}\177\7\24\2\2~s\3\2\2\2~}\3\2\2\2\177\23\3\2"+
		"\2\2\u0080\u0081\7\t\2\2\u0081\25\3\2\2\2\u0082\u0083\5\30\r\2\u0083\u0084"+
		"\7\3\2\2\u0084\u0085\5\26\f\2\u0085\u0088\3\2\2\2\u0086\u0088\5\30\r\2"+
		"\u0087\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a"+
		"\t\2\2\2\u008a\31\3\2\2\2\u008b\u008c\7\24\2\2\u008c\33\3\2\2\2\17!#,"+
		"<CMcgnpy~\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}