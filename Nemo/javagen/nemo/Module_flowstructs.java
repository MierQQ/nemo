// HASH COLLISIONS: YES
// timestamp: 1.631529037E12

package nemo;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_flowstructs {
	final nemo runtime;
	Module_flowstructs(nemo runtime) {
		this.runtime = runtime;
	}
	Object f_extractStruct(Object[] aa, Object ae) {
		final Func2<Object,Object, Object> l1_$0 = new Func2<Object,Object,Object>() {
			final public Object invoke(final Object aacc, final Object ael) {
				if (runtime.h_Native.isSameStructType(aacc, ael)) {
					final Object l2_t = ((Object)runtime.m_dynamic.f_flow(ael));
					return l2_t;
				} else {
					return aacc;
				}
			}
		};
		return runtime.h_Native.fold(aa, ae, l1_$0);
	}
}
