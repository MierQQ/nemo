// HASH COLLISIONS: YES
// timestamp: 1.631529037E12

package Parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_url_parameter {
	final Parser runtime;
	Module_url_parameter(Parser runtime) {
		this.runtime = runtime;
	}
	public Struct g_allUrlParameters;
	public void init_allUrlParameters() {
		g_allUrlParameters=f_getAllUrlParameters();
	}
	Struct f_getAllUrlParameters() {
		final Struct l0_debugStorage = runtime.n_parseJson.invoke(runtime.m_runtime.f_getKeyValue("local-url-parameters", "{}"));
		final Object[] l4_$2 = (new Object[] { "dev", "devtrace", "new", "allow_share_progress" });
		final Struct l5_$3 = runtime.m_tree.f_makeTree();
		final Func2<Struct,Struct, String> l6_$1 = new Func2<Struct,Struct,String>() {
			final public Struct invoke(final Struct aacc, final String akey) {
				final String l7_value = runtime.m_json.f_getJsonStringField(l0_debugStorage, akey, "");
				if ((l7_value).equals("")) {
					return aacc;
				} else {
					return ((Func3<Struct,Struct, String, String>)(Func3)runtime.n_setTree).invoke(aacc, akey, l7_value);
				}
			}
		};
		final Struct l7_localTree = ((Struct)runtime.h_Native.fold(l4_$2, l5_$3, ((Func2<Object,Object, Object>)(Func2)l6_$1)));
		final Object[] l10_$9 = runtime.h_Native.getAllUrlParameters();
		final Func2<Struct,Struct, Object[]> l11_$8 = new Func2<Struct,Struct,Object[]>() {
			final public Struct invoke(final Struct aacc, final Object[] apar) {
				return ((Func3<Struct,Struct, String, String>)(Func3)runtime.n_setTree).invoke(aacc, ((String)(apar[0])), ((String)(apar[1])));
			}
		};
		return ((Struct)runtime.h_Native.fold(l10_$9, l7_localTree, ((Func2<Object,Object, Object>)(Func2)l11_$8)));
	}
	boolean f_isParameterFalse(String aparam) {
		return (((aparam).equals("false")||(aparam).equals("0"))||(aparam).equals("FALSE"));
	}
	boolean f_isUrlParameterTrue(String aname) {
		final Struct l3_$2 = ((Func2<Struct,Struct, String>)(Func2)runtime.n_lookupTree).invoke(g_allUrlParameters, aname);
		final Func1<Boolean,String> l4_$0 = new Func1<Boolean,String>() {
			final public Boolean invoke(final String aparam) {
				return ((Boolean)!f_isParameterFalse(aparam));
			}
		};
		final Func0<Boolean> l5_$1 = new Func0<Boolean>() {
			final public Boolean invoke() {
				return ((Boolean)false);
			}
		};
		return ((boolean)runtime.m_maybe.f_eitherFn(l3_$2, ((Func1<Object,Object>)(Func1)l4_$0), ((Func0<Object>)(Func0)l5_$1)));
	}
}
