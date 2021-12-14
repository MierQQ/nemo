// HASH COLLISIONS: YES
// timestamp: 1.635759496E12

package nemo;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_nemo {
	final nemo runtime;
	Module_nemo(nemo runtime) {
		this.runtime = runtime;
	}
	Struct f_Parse(String as) {
		final String l0_gram = "program = ws \"{\" ws desc* \"}\" ws body ws;\r\ndesc = \"var \" ws variable ws \":\" ws type ws \";\" ws;\r\nvariable = char*;\r\ntype = array | int | bool;\r\narray = \"[\" ws type ws \"]\";\r\nint = \"int\";\r\nbool = \"bool\";\r\n\r\nexp = integer | variable | sub | sum | prod | div | less | equal | get | set;\r\nsub = \"(\"exp\"-\"exp\")\";\r\nsum = \"(\"exp\"+\"exp\")\";\r\nprod = \"(\"exp\"*\"exp\")\";\r\ndiv = \"(\"exp\"/\"exp\")\";\r\nless = \"(\"exp\"<\"exp\")\";\r\nequal = \"(\"exp\"==\"exp\")\";\r\nget = \"get(\"exp\",\"exp\")\";\r\nset = \"set(\"exp\",\"exp\",\"exp\")\";\r\n\r\nbody = test | assigment | detExec | ndetExec | ndetIt | print;\r\nassigment = variable\"=\"exp;\r\ntest = exp \"?\";\r\ndbody = body\";\";\r\ndetExec = \"{\" body+ \"}\";\r\nnbody = body\"^\";\r\nndetExec = \"{\" nbody+ \"}\";\r\nndetIt = body \"*\";\r\nprint = \"print(\" exp \")\";\r\n\r\n\r\ninteger = digit+;\r\ndigit = '0' - '9';\r\nchar = 'a' - 'z' | 'A' - 'Z';\r\n\r\nws = s*;\r\ns = \" \";";
		final Object[] l1_parser = runtime.m_driver.f_compilePegGrammar(l0_gram);
		final Struct_Triple l2_result = runtime.m_parsic.f_parsic3(l1_parser, as, runtime.m_pegaction.g_defaultPegActions, 0);
		runtime.m_runtime.f_println(l2_result);
		if ((((String)l2_result.f_third)).equals("")) {
			return (new Struct_Some(l2_result.f_first));
		} else {
			return ((Struct)SingletonStructs.str_None);
		}
	}
	Object f_main() {
		final Struct l0_a = f_Parse("{var a : int;} (10-10)? ");
		Struct l1__tmp = l0_a;
		switch (l1__tmp.getTypeId()) {
		case 97/*Some*/: {
			final Struct_Some l2__tmp = (Struct_Some)l1__tmp;
			final Object l3_tree = l2__tmp.f_value;
			final int l4_tree = ((int)l2__tmp.f_value);
			return runtime.m_runtime.f_println(l4_tree);
		}
		case 36/*None*/: {
			return runtime.m_runtime.f_println("Something gone wrong\n");
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
		}
	}
}
