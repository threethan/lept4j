package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * -------------------------------------------------------------------------*<br>
 *                              Array of Pta                               *<br>
 * -------------------------------------------------------------------------<br>
 * <i>native declaration : pix.h:140</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class Ptaa extends Structure {
	/**
	 * number of pta in ptr array<br>
	 * C type : l_int32
	 */
	public int n;
	/**
	 * number of pta ptrs allocated<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * pta ptr array<br>
	 * C type : Pta**
	 */
	public net.sourceforge.lept4j.Pta.ByReference[] pta;
	public Ptaa() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("n", "nalloc", "pta");
	}
	/**
	 * @param n number of pta in ptr array<br>
	 * C type : l_int32<br>
	 * @param nalloc number of pta ptrs allocated<br>
	 * C type : l_int32<br>
	 * @param pta pta ptr array<br>
	 * C type : Pta**
	 */
	public Ptaa(int n, int nalloc, net.sourceforge.lept4j.Pta.ByReference pta[]) {
		super();
		this.n = n;
		this.nalloc = nalloc;
		if ((pta.length != this.pta.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.pta = pta;
	}
	public Ptaa(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends Ptaa implements Structure.ByReference {
		
	};
	public static class ByValue extends Ptaa implements Structure.ByValue {
		
	};
}
