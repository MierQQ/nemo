// HASH COLLISIONS: YES
// timestamp: 1.631535144E12

package Parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_parser {
	final Parser runtime;
	Module_parser(Parser runtime) {
		this.runtime = runtime;
	}
	Object f_main() {
		return runtime.m_runtime.f_println(f_parse("(1+(2*3))"));
	}
	Struct f_parse(String as) {
		final String l0_gram = "exp = sum|prod|int;\r\nsum = \"(\" exp:l \"+\" exp:r \")\" {ArSum(:l, :r)};\r\nprod = \"(\" exp:l \"+\" exp:r \")\" {ArProd(:l, :r)};\r\nint = digit+ $i {ArInt(s2i($i))};\r\ndigit = '0' - '9';\r\n";
		final Object[] l1_parser = runtime.m_driver.f_compilePegGrammar(l0_gram);
		final Struct_Triple l2_result = runtime.m_parsic.f_parsic3(l1_parser, as, runtime.m_pegaction.g_defaultPegActions, (new Struct_ArInt(0)));
		runtime.m_runtime.f_println(l2_result);
		if ((((String)l2_result.f_third)).equals("")) {
			return (new Struct_Some(l2_result.f_first));
		} else {
			return ((Struct)SingletonStructs.str_None);
		}
	}
}
