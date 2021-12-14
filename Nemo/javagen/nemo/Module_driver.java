// HASH COLLISIONS: YES
// timestamp: 1.631529037E12

package nemo;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_driver {
	final nemo runtime;
	Module_driver(nemo runtime) {
		this.runtime = runtime;
	}
	Object[] f_compilePegGrammar(String agr) {
		return ((Object[])f_compilePegGrammar2(agr).f_first);
	}
	Struct_Pair f_compilePegGrammar2(String agr) {
		final Object l0_r = runtime.m_parsic.f_parsic(runtime.m_lingocode.g_pegOps4Lingo, agr, runtime.m_pegaction.g_defaultPegActions);
		final Struct_Grammar l1_g = ((Struct_Grammar)l0_r);
		final Struct_Grammar l2_renamed = runtime.m_optimize_grammar.f_optimizeGrammar(runtime.m_rename_bindings.f_renameBindings(runtime.m_peg.f_inlineProductions(runtime.m_peg.f_processNestedSequences(l1_g))));
		final Struct_Pair l3_code = runtime.m_grammar2code.f_grammar2code(l2_renamed);
		return l3_code;
	}
}
