// HASH COLLISIONS: YES
// timestamp: 1.631529037E12

package nemo;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_stringmath {
	final nemo runtime;
	Module_stringmath(nemo runtime) {
		this.runtime = runtime;
	}
	String f_d2st(double ad, int afractlen) {
		return f_decimals(ad, afractlen, false);
	}
	String f_decimals(double ad, int anumOfDigits, boolean awithTrailingZeroes) {
		String l0_sign_;
		if ((ad<0.0)) {
			l0_sign_="-";
		} else {
			l0_sign_="";
		}
		final double l1_ad = runtime.m_math.f_abs(ad);
		final int l2_num = ((int)runtime.m_runtime.f_min(9, anumOfDigits));
		final Reference<Double> l3_intPart = ((Reference<Double>)(new Reference(((l2_num<=0)?runtime.m_math.f_dround(l1_ad):runtime.m_math.f_dfloor(l1_ad)))));
		final double l4_k = ((double)runtime.n_i2d.invoke(((Integer)runtime.m_math.f_pow(10, l2_num))));
		String l5_second;
		if ((l2_num<=0)) {
			l5_second="";
		} else {
			final double l8_$7 = (l1_ad-((double)l3_intPart.value));
			final boolean l10_withTrailingZeroes = awithTrailingZeroes;
			final Func1<String,Double> l9_$6 = new Func1<String,Double>() {
				final public String invoke(final Double av) {
					final String l12_$11 = runtime.n_i2s.invoke(((Integer)runtime.m_math.f_round((((double)av)*l4_k))));
					final Func1<String,String> l13_$10 = new Func1<String,String>() {
						final public String invoke(final String as) {
							String l17_$15;
							if ((runtime.h_Native.strlen(as)>l2_num)) {
								l3_intPart.value = ((Double)(((double)l3_intPart.value)+1.0));
								l17_$15=runtime.m_string.f_ltrim2(as, "1");
							} else {
								l17_$15=as;
							}
							final Func1<String,String> l18_$16 = new Func1<String,String>() {
								final public String invoke(final String ass) {
									final String l21_$20 = runtime.m_string.f_lpad(ass, "0", l2_num);
									final Func1<String,String> l22_$19 = new Func1<String,String>() {
										final public String invoke(final String asss) {
											if (!l10_withTrailingZeroes) {
												return runtime.m_string.f_rtrim2(asss, "0");
											} else {
												return asss;
											}
										}
									};
									return l22_$19.invoke(l21_$20);
								}
							};
							return l18_$16.invoke(l17_$15);
						}
					};
					return l13_$10.invoke(l12_$11);
				}
			};
			l5_second=l9_$6.invoke(((Double)l8_$7));
		}
		final String l11_first = ((((((double)l3_intPart.value)==0.0)&&(l5_second).equals(""))?"":l0_sign_)+runtime.n_d2s.invoke(l3_intPart.value));
		if ((!(l5_second).equals(""))) {
			return ((l11_first+".")+l5_second);
		} else {
			return l11_first;
		}
	}
}
