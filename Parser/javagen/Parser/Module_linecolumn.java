// HASH COLLISIONS: YES
// timestamp: 1.631529037E12

package Parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_linecolumn {
	final Parser runtime;
	Module_linecolumn(Parser runtime) {
		this.runtime = runtime;
	}
	int f_doFindLine(Struct_LineResolver aresolver, int alow, int ahigh, int aindex) {
	 TAIL_CALL: for(;;) {
		if (((alow>ahigh)||((ahigh-alow)==1))) {
			return alow;
		} else {
			final int l0_mid = ((ahigh+alow)/2);
			final int l1_p = ((int)(aresolver.f_linestarts[l0_mid]));
			if ((l1_p<=aindex)) {
				{
					final int l2___tmp = l0_mid;
					alow = l2___tmp;
					continue TAIL_CALL;
				}
			} else {
				{
					final int l3___tmp = l0_mid;
					ahigh = l3___tmp;
					continue TAIL_CALL;
				}
			}
		}
	 }
	}
	Struct f_doFindlinestarts(String ainput, int ai, Struct aacc) {
		final Object[] l0_a = runtime.h_Native.s2a(ainput);
		final Func3<Struct,Integer, Struct, Integer> l2_$1 = new Func3<Struct,Integer,Struct,Integer>() {
			final public Struct invoke(final Integer aix, final Struct aacc1, final Integer ae) {
				if ((((int)ae)==10)) {
					return (new Struct_Cons((((int)aix)+1), aacc1));
				} else {
					return aacc1;
				}
			}
		};
		return ((Struct)runtime.h_Native.foldi(l0_a, aacc, ((Func3<Object,Integer, Object, Object>)(Func3)l2_$1)));
	}
	int f_findColumnNumber(String aline, int acol, int ai, int aindex, int atab_size) {
	 TAIL_CALL: for(;;) {
		if ((ai>aindex)) {
			return acol;
		} else {
			{
				final int l0___tmp = ((runtime.h_Native.getCharCodeAt(aline, ai)==9)?(((acol+atab_size)/atab_size)*atab_size):(acol+1));
				final int l1___tmp = (ai+1);
				acol = l0___tmp;
				ai = l1___tmp;
				continue TAIL_CALL;
			}
		}
	 }
	}
	Struct_LineColumn f_findLine(Struct_LineResolver aresolver, int aindex) {
		return f_findLine1(aresolver, aindex, 4);
	}
	Struct_LineColumn f_findLine1(Struct_LineResolver aresolver, int aindex, int atab_size) {
		final int l0_n = runtime.h_Native.length(aresolver.f_linestarts);
		int l1_lineno;
		if ((l0_n==1)) {
			l1_lineno=0;
		} else {
			l1_lineno=f_doFindLine(aresolver, 0, (l0_n-1), aindex);
		}
		final int l2_startLineIndex = ((int)(aresolver.f_linestarts[l1_lineno]));
		int l3_endLineIndex;
		if ((l1_lineno==(l0_n-1))) {
			l3_endLineIndex=runtime.h_Native.strlen(aresolver.f_input);
		} else {
			l3_endLineIndex=(((int)(aresolver.f_linestarts[(l1_lineno+1)]))-1);
		}
		final String l4_line = runtime.h_Native.substring(aresolver.f_input, l2_startLineIndex, (l3_endLineIndex-l2_startLineIndex));
		int l5_col;
		if ((l4_line).equals("")) {
			l5_col=0;
		} else {
			l5_col=f_findColumnNumber(l4_line, 0, 0, (aindex-l2_startLineIndex), atab_size);
		}
		return (new Struct_LineColumn(l4_line, (l1_lineno+1), l5_col, (aindex-l2_startLineIndex), aresolver));
	}
	Object[] f_findLineStartIndexes(String ai) {
		return runtime.h_Native.list2array(f_doFindlinestarts(ai, 0, (new Struct_Cons(0, runtime.m_list.f_makeList()))));
	}
	Struct_LineResolver f_makeLineResolver(String ainput) {
		return (new Struct_LineResolver(ainput, f_findLineStartIndexes(ainput)));
	}
}
