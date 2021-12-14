// HASH COLLISIONS: YES
// timestamp: 1.631535573684E12

package Parser;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class Parser extends FlowRuntime {

	// Modules: (30)
	Module_dynamic m_dynamic;
	Module_maybe m_maybe;
	Module_url m_url;
	Module_list m_list;
	Module_array m_array;
	Module_flowstructs m_flowstructs;
	Module_securitymode m_securitymode;
	Module_runtime m_runtime;
	Module_tree m_tree;
	Module_string m_string;
	Module_linecolumn m_linecolumn;
	Module_math m_math;
	Module_deserialize_string m_deserialize_string;
	Module_bits m_bits;
	Module_stringmath m_stringmath;
	Module_inttree m_inttree;
	Module_json m_json;
	Module_peg m_peg;
	Module_url_parameter m_url_parameter;
	Module_devmode m_devmode;
	Module_pegaction m_pegaction;
	Module_optimize_grammar m_optimize_grammar;
	Module_pegcode_lib m_pegcode_lib;
	Module_rename_bindings m_rename_bindings;
	Module_pegcode m_pegcode;
	Module_grammar2code m_grammar2code;
	Module_lingocode m_lingocode;
	Module_parsic m_parsic;
	Module_driver m_driver;
	Module_parser m_parser;
	final private void init_modules() {
		m_dynamic = new Module_dynamic(this);
		m_maybe = new Module_maybe(this);
		m_url = new Module_url(this);
		m_list = new Module_list(this);
		m_array = new Module_array(this);
		m_flowstructs = new Module_flowstructs(this);
		m_securitymode = new Module_securitymode(this);
		m_runtime = new Module_runtime(this);
		m_tree = new Module_tree(this);
		m_string = new Module_string(this);
		m_linecolumn = new Module_linecolumn(this);
		m_math = new Module_math(this);
		m_deserialize_string = new Module_deserialize_string(this);
		m_bits = new Module_bits(this);
		m_stringmath = new Module_stringmath(this);
		m_inttree = new Module_inttree(this);
		m_json = new Module_json(this);
		m_peg = new Module_peg(this);
		m_url_parameter = new Module_url_parameter(this);
		m_devmode = new Module_devmode(this);
		m_pegaction = new Module_pegaction(this);
		m_optimize_grammar = new Module_optimize_grammar(this);
		m_pegcode_lib = new Module_pegcode_lib(this);
		m_rename_bindings = new Module_rename_bindings(this);
		m_pegcode = new Module_pegcode(this);
		m_grammar2code = new Module_grammar2code(this);
		m_lingocode = new Module_lingocode(this);
		m_parsic = new Module_parsic(this);
		m_driver = new Module_driver(this);
		m_parser = new Module_parser(this);
	}

	// Wrappers: 5
	Func1<String,Struct> gfw_action2string;
	Func1<Struct_Production,Struct_Production> gfw_optimizeProduction;
	Func1<String,Object> gfw_toString;
	Func1<Struct_Production,Struct_Production> gfw_renameBindingsInProduction;
	Func1<Struct_Seq,Struct_Seq> gfw_renameBindingsInChoice;
	final private void init_wrappers() {
		gfw_action2string = new Func1<String,Struct>() {
			final public String invoke(Struct a0) {
				return m_peg.f_action2string(a0);
			}
		};
		gfw_optimizeProduction = new Func1<Struct_Production,Struct_Production>() {
			final public Struct_Production invoke(Struct_Production a0) {
				return m_optimize_grammar.f_optimizeProduction(a0);
			}
		};
		gfw_toString = new Func1<String,Object>() {
			final public String invoke(Object a0) {
				return m_dynamic.f_toString(a0);
			}
		};
		gfw_renameBindingsInProduction = new Func1<Struct_Production,Struct_Production>() {
			final public Struct_Production invoke(Struct_Production a0) {
				return m_rename_bindings.f_renameBindingsInProduction(a0);
			}
		};
		gfw_renameBindingsInChoice = new Func1<Struct_Seq,Struct_Seq>() {
			final public Struct_Seq invoke(Struct_Seq a0) {
				return m_rename_bindings.f_renameBindingsInChoice(a0);
			}
		};
	}

	// Native Wrappers (20)
	Func2<Object,Struct, Object> n_headList;
	Func1<Struct,Struct> n_tailList;
	Func3<Integer,Object[], Object, Integer> n_elemIndex;
	Func2<Boolean,Object[], Func1<Boolean,Object>> n_exists;
	Func2<Struct,Object[], Func1<Boolean,Object>> n_find;
	Func2<Object,Object, Object> n_max;
	Func2<Struct,Struct, Object> n_lookupTree;
	Func3<Struct,Struct, Object, Object> n_setTree;
	Func1<String,String> n_cloneString;
	Func1<String,Double> n_d2s;
	Func2<String,String, Integer> n_getCharAt;
	Func1<String,Integer> n_i2s;
	Func3<Boolean,String, Integer, String> n_strContainsAt;
	Func4<Integer,String, String, Integer, Integer> n_strRangeIndexOf;
	Func3<String,String, String, String> n_strReplace;
	Func1<Integer,Double> n_trunc;
	Func1<Double,Integer> n_i2d;
	Func2<Integer,Integer, Integer> n_bitShl;
	Func2<Integer,Integer, Integer> n_bitUshr;
	Func1<Struct,String> n_parseJson;
	final private void init_native_wrappers() {
		n_headList = new Func2<Object,Struct, Object>() {
			final public Object invoke(Struct a0, Object a1) {
				return m_list.nf_headList(a0, a1);
			}
		};
		n_tailList = new Func1<Struct,Struct>() {
			final public Struct invoke(Struct a0) {
				return m_list.nf_tailList(a0);
			}
		};
		n_elemIndex = new Func3<Integer,Object[], Object, Integer>() {
			final public Integer invoke(Object[] a0, Object a1, Integer a2) {
				return m_array.nf_elemIndex(a0, a1, a2);
			}
		};
		n_exists = new Func2<Boolean,Object[], Func1<Boolean,Object>>() {
			final public Boolean invoke(Object[] a0, Func1<Boolean,Object> a1) {
				return m_array.nf_exists(a0, a1);
			}
		};
		n_find = new Func2<Struct,Object[], Func1<Boolean,Object>>() {
			final public Struct invoke(Object[] a0, Func1<Boolean,Object> a1) {
				return m_array.nf_find(a0, a1);
			}
		};
		n_max = new Func2<Object,Object, Object>() {
			final public Object invoke(Object a0, Object a1) {
				return m_runtime.nf_max(a0, a1);
			}
		};
		n_lookupTree = new Func2<Struct,Struct, Object>() {
			final public Struct invoke(Struct a0, Object a1) {
				return m_tree.nf_lookupTree(a0, a1);
			}
		};
		n_setTree = new Func3<Struct,Struct, Object, Object>() {
			final public Struct invoke(Struct a0, Object a1, Object a2) {
				return m_tree.nf_setTree(a0, a1, a2);
			}
		};
		n_cloneString = new Func1<String,String>() {
			final public String invoke(String a0) {
				return m_string.nf_cloneString(a0);
			}
		};
		n_d2s = new Func1<String,Double>() {
			final public String invoke(Double a0) {
				return m_string.nf_d2s(a0);
			}
		};
		n_getCharAt = new Func2<String,String, Integer>() {
			final public String invoke(String a0, Integer a1) {
				return m_string.nf_getCharAt(a0, a1);
			}
		};
		n_i2s = new Func1<String,Integer>() {
			final public String invoke(Integer a0) {
				return m_string.nf_i2s(a0);
			}
		};
		n_strContainsAt = new Func3<Boolean,String, Integer, String>() {
			final public Boolean invoke(String a0, Integer a1, String a2) {
				return m_string.nf_strContainsAt(a0, a1, a2);
			}
		};
		n_strRangeIndexOf = new Func4<Integer,String, String, Integer, Integer>() {
			final public Integer invoke(String a0, String a1, Integer a2, Integer a3) {
				return m_string.nf_strRangeIndexOf(a0, a1, a2, a3);
			}
		};
		n_strReplace = new Func3<String,String, String, String>() {
			final public String invoke(String a0, String a1, String a2) {
				return m_string.nf_strReplace(a0, a1, a2);
			}
		};
		n_trunc = new Func1<Integer,Double>() {
			final public Integer invoke(Double a0) {
				return m_string.nf_trunc(a0);
			}
		};
		n_i2d = new Func1<Double,Integer>() {
			final public Double invoke(Integer a0) {
				return m_math.nf_i2d(a0);
			}
		};
		n_bitShl = new Func2<Integer,Integer, Integer>() {
			final public Integer invoke(Integer a0, Integer a1) {
				return m_bits.nf_bitShl(a0, a1);
			}
		};
		n_bitUshr = new Func2<Integer,Integer, Integer>() {
			final public Integer invoke(Integer a0, Integer a1) {
				return m_bits.nf_bitUshr(a0, a1);
			}
		};
		n_parseJson = new Func1<Struct,String>() {
			final public Struct invoke(String a0) {
				return m_json.nf_parseJson(a0);
			}
		};
	}

	// Init function: 1
	Native h_Native;

	// Init hosts: 1
	final private void init_hosts() {
		h_Native = super.getNativeHost(Native.class);
	}

	// Init code: 34
	final private void init_code_0() {
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("headList", Struct.class, Object.class);
			n_headList = new Func2<Object,Struct, Object>() {
				final public Object invoke(Struct a0, Object a1) {
					try { return (Object)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("tailList", Struct.class);
			n_tailList = new Func1<Struct,Struct>() {
				final public Struct invoke(Struct a0) {
					try { return (Struct)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("elemIndex", Object[].class, Object.class, Integer.class);
			n_elemIndex = new Func3<Integer,Object[], Object, Integer>() {
				final public Integer invoke(Object[] a0, Object a1, Integer a2) {
					try { return (Integer)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("exists", Object[].class, Func1.class);
			n_exists = new Func2<Boolean,Object[], Func1<Boolean,Object>>() {
				final public Boolean invoke(Object[] a0, Func1<Boolean,Object> a1) {
					try { return (Boolean)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("find", Object[].class, Func1.class);
			n_find = new Func2<Struct,Object[], Func1<Boolean,Object>>() {
				final public Struct invoke(Object[] a0, Func1<Boolean,Object> a1) {
					try { return (Struct)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("fast_max", Object.class, Object.class);
			n_max = new Func2<Object,Object, Object>() {
				final public Object invoke(Object a0, Object a1) {
					try { return (Object)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("fast_lookupTree", Struct.class, Object.class);
			n_lookupTree = new Func2<Struct,Struct, Object>() {
				final public Struct invoke(Struct a0, Object a1) {
					try { return (Struct)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("fast_setTree", Struct.class, Object.class, Object.class);
			n_setTree = new Func3<Struct,Struct, Object, Object>() {
				final public Struct invoke(Struct a0, Object a1, Object a2) {
					try { return (Struct)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("cloneString", String.class);
			n_cloneString = new Func1<String,String>() {
				final public String invoke(String a0) {
					try { return (String)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("d2s", Double.class);
			n_d2s = new Func1<String,Double>() {
				final public String invoke(Double a0) {
					try { return (String)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("getCharAt", String.class, Integer.class);
			n_getCharAt = new Func2<String,String, Integer>() {
				final public String invoke(String a0, Integer a1) {
					try { return (String)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("i2s", Integer.class);
			n_i2s = new Func1<String,Integer>() {
				final public String invoke(Integer a0) {
					try { return (String)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("strContainsAt", String.class, Integer.class, String.class);
			n_strContainsAt = new Func3<Boolean,String, Integer, String>() {
				final public Boolean invoke(String a0, Integer a1, String a2) {
					try { return (Boolean)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("strRangeIndexOf", String.class, String.class, Integer.class, Integer.class);
			n_strRangeIndexOf = new Func4<Integer,String, String, Integer, Integer>() {
				final public Integer invoke(String a0, String a1, Integer a2, Integer a3) {
					try { return (Integer)method.invoke(h_Native, a0, a1, a2, a3); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("strReplace", String.class, String.class, String.class);
			n_strReplace = new Func3<String,String, String, String>() {
				final public String invoke(String a0, String a1, String a2) {
					try { return (String)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("trunc", Double.class);
			n_trunc = new Func1<Integer,Double>() {
				final public Integer invoke(Double a0) {
					try { return (Integer)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("i2d", Integer.class);
			n_i2d = new Func1<Double,Integer>() {
				final public Double invoke(Integer a0) {
					try { return (Double)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("bitShl", Integer.class, Integer.class);
			n_bitShl = new Func2<Integer,Integer, Integer>() {
				final public Integer invoke(Integer a0, Integer a1) {
					try { return (Integer)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("bitUshr", Integer.class, Integer.class);
			n_bitUshr = new Func2<Integer,Integer, Integer>() {
				final public Integer invoke(Integer a0, Integer a1) {
					try { return (Integer)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("parseJson", String.class);
			n_parseJson = new Func1<Struct,String>() {
				final public Struct invoke(String a0) {
					try { return (Struct)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		m_url.init_redirectAdditionalFn();
		m_securitymode.init_loggingEnabled();
		m_securitymode.init_securityModes();
		m_runtime.init_localStorageEnabled();
		m_bits.init_pots2();
		m_peg.init_lastParsing();
		m_peg.init_parseCacheHits();
		m_peg.init_parseCacheMisses();
		m_url_parameter.init_allUrlParameters();
		m_devmode.init_devModeCheckFn();
		m_pegaction.init_defaultPegActions();
		m_pegcode_lib.init_peg_fail_cache_item();
	}
	final private void init_code_1() {
		m_pegcode.init_profilePcs();
		m_lingocode.init_pegOps4Lingo();
	}
	final private void init_code() {
		init_code_0();
		init_code_1();
	}
	public Parser(String[] args) {
		super(Structs.structList(), args);
	}
	final private void init() {
		init_modules();
		init_wrappers();
		init_native_wrappers();
		init_hosts();
		init_code();
	}
	protected void main() {
		init();
		m_parser.f_main();
	}
	public static void main(String[] args) {
		Parser runner = new Parser(args);
		runner.start(null);
	}
}
