package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : ccbord.h:18</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CCBord extends Structure {
	/**
	 * component bitmap (min size)<br>
	 * C type : Pix*
	 */
	public net.sourceforge.lept4j.Pix.ByReference pix;
	/**
	 * regions of each closed curve<br>
	 * C type : Boxa*
	 */
	public net.sourceforge.lept4j.Boxa.ByReference boxa;
	/**
	 * initial border pixel locations<br>
	 * C type : Pta*
	 */
	public net.sourceforge.lept4j.Pta.ByReference start;
	/**
	 * number of handles; start at 1<br>
	 * C type : l_int32
	 */
	public int refcount;
	/**
	 * ptaa of chain pixels (local)<br>
	 * C type : Ptaa*
	 */
	public net.sourceforge.lept4j.Ptaa.ByReference local;
	/**
	 * ptaa of chain pixels (global)<br>
	 * C type : Ptaa*
	 */
	public net.sourceforge.lept4j.Ptaa.ByReference global;
	/**
	 * numaa of chain code (step dir)<br>
	 * C type : Numaa*
	 */
	public net.sourceforge.lept4j.Numaa.ByReference step;
	/**
	 * pta of single chain (local)<br>
	 * C type : Pta*
	 */
	public net.sourceforge.lept4j.Pta.ByReference splocal;
	/**
	 * pta of single chain (global)<br>
	 * C type : Pta*
	 */
	public net.sourceforge.lept4j.Pta.ByReference spglobal;
	public CCBord() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pix", "boxa", "start", "refcount", "local", "global", "step", "splocal", "spglobal");
	}
	/**
	 * @param pix component bitmap (min size)<br>
	 * C type : Pix*<br>
	 * @param boxa regions of each closed curve<br>
	 * C type : Boxa*<br>
	 * @param start initial border pixel locations<br>
	 * C type : Pta*<br>
	 * @param refcount number of handles; start at 1<br>
	 * C type : l_int32<br>
	 * @param local ptaa of chain pixels (local)<br>
	 * C type : Ptaa*<br>
	 * @param global ptaa of chain pixels (global)<br>
	 * C type : Ptaa*<br>
	 * @param step numaa of chain code (step dir)<br>
	 * C type : Numaa*<br>
	 * @param splocal pta of single chain (local)<br>
	 * C type : Pta*<br>
	 * @param spglobal pta of single chain (global)<br>
	 * C type : Pta*
	 */
	public CCBord(net.sourceforge.lept4j.Pix.ByReference pix, net.sourceforge.lept4j.Boxa.ByReference boxa, net.sourceforge.lept4j.Pta.ByReference start, int refcount, net.sourceforge.lept4j.Ptaa.ByReference local, net.sourceforge.lept4j.Ptaa.ByReference global, net.sourceforge.lept4j.Numaa.ByReference step, net.sourceforge.lept4j.Pta.ByReference splocal, net.sourceforge.lept4j.Pta.ByReference spglobal) {
		super();
		this.pix = pix;
		this.boxa = boxa;
		this.start = start;
		this.refcount = refcount;
		this.local = local;
		this.global = global;
		this.step = step;
		this.splocal = splocal;
		this.spglobal = spglobal;
	}
	public CCBord(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CCBord implements Structure.ByReference {
		
	};
	public static class ByValue extends CCBord implements Structure.ByValue {
		
	};
}
