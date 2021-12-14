// HASH COLLISIONS: YES
// timestamp: 1.631529037E12

package Parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_parsic {
	final Parser runtime;
	Module_parsic(Parser runtime) {
		this.runtime = runtime;
	}
	Object f_parsic(Object[] aop, String atext, Struct_SemanticActions aactions) {
		final Struct_ParseResult l0_result = runtime.m_pegcode.f_runPeg(atext, aop, runtime.m_tree.f_makeTree(), aactions);
		if ((l0_result.f_pos<0)) {
			runtime.m_runtime.f_println((("SYNTAX ERROR <0: \""+runtime.m_string.f_strLeft(atext, 130))+"...\""));
		} else {
			if ((l0_result.f_pos<runtime.h_Native.strlen(atext))) {
				runtime.m_runtime.f_println((("SYNTAX ERROR AT : \""+runtime.h_Native.substring(atext, l0_result.f_pos, 130))+"...\""));
			} else {
			}
		}
		return runtime.m_dynamic.f_flow(runtime.m_maybe.f_either(l0_result.f_result, runtime.m_dynamic.f_flow("PARSING FAILED")));
	}
	Struct_Triple f_parsic3(Object[] aop, String acode, Struct_SemanticActions aactions, Object adef) {
		final Struct_ParseResult l0_result = runtime.m_pegcode.f_runPeg(acode, aop, runtime.m_tree.f_makeTree(), aactions);
		final Struct l1_typed = ((Struct)l0_result.f_result);
		String l2_error;
		if ((l0_result.f_pos<0)) {
			l2_error="SYNTAX ERROR";
		} else {
			if (((l0_result.f_pos<runtime.h_Native.strlen(acode))||runtime.m_maybe.f_isNone(l1_typed))) {
				final Struct_LineResolver l3_resolver = runtime.m_linecolumn.f_makeLineResolver(acode);
				final Struct_LineColumn l4_line = runtime.m_linecolumn.f_findLine(l3_resolver, l0_result.f_pos);
				l2_error=((((((runtime.n_i2s.invoke(((Integer)l4_line.f_lineno))+":")+runtime.n_i2s.invoke(((Integer)l4_line.f_column)))+": SYNTAX ERROR\n")+runtime.m_string.f_strLeft(l4_line.f_line, 80))+"\n")+((l4_line.f_lineIndex<80)?(runtime.m_string.f_strLeft("                                                                                ", l4_line.f_lineIndex)+"^"):""));
			} else {
				l2_error="";
			}
		}
		return (new Struct_Triple(runtime.m_maybe.f_either(l1_typed, adef), l0_result.f_pos, l2_error));
	}
}
