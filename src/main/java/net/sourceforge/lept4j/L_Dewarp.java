package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : dewarp.h:52</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Dewarp extends Structure {
	/**
	 * ptr to parent (not owned)<br>
	 * C type : L_Dewarpa*
	 */
	public net.sourceforge.lept4j.L_Dewarpa.ByReference dewa;
	/**
	 * source pix, 1 bpp<br>
	 * C type : Pix*
	 */
	public net.sourceforge.lept4j.Pix.ByReference pixs;
	/**
	 * sampled vert disparity array<br>
	 * C type : FPix*
	 */
	public net.sourceforge.lept4j.FPix.ByReference sampvdispar;
	/**
	 * sampled horiz disparity array<br>
	 * C type : FPix*
	 */
	public net.sourceforge.lept4j.FPix.ByReference samphdispar;
	/**
	 * full vert disparity array<br>
	 * C type : FPix*
	 */
	public net.sourceforge.lept4j.FPix.ByReference fullvdispar;
	/**
	 * full horiz disparity array<br>
	 * C type : FPix*
	 */
	public net.sourceforge.lept4j.FPix.ByReference fullhdispar;
	/**
	 * sorted y val of midpoint each line<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference namidys;
	/**
	 * sorted curvature of each line<br>
	 * C type : Numa*
	 */
	public net.sourceforge.lept4j.Numa.ByReference nacurves;
	/**
	 * width of source image<br>
	 * C type : l_int32
	 */
	public int w;
	/**
	 * height of source image<br>
	 * C type : l_int32
	 */
	public int h;
	/**
	 * page number; important for reuse<br>
	 * C type : l_int32
	 */
	public int pageno;
	/**
	 * sampling factor of disparity arrays<br>
	 * C type : l_int32
	 */
	public int sampling;
	/**
	 * reduction factor of pixs: 1 or 2<br>
	 * C type : l_int32
	 */
	public int redfactor;
	/**
	 * min number of long lines required<br>
	 * C type : l_int32
	 */
	public int minlines;
	/**
	 * number of long lines found<br>
	 * C type : l_int32
	 */
	public int nlines;
	/**
	 * min line curvature in micro-units<br>
	 * C type : l_int32
	 */
	public int mincurv;
	/**
	 * max line curvature in micro-units<br>
	 * C type : l_int32
	 */
	public int maxcurv;
	/**
	 * left edge slope in milli-units<br>
	 * C type : l_int32
	 */
	public int leftslope;
	/**
	 * right edge slope in milli-units<br>
	 * C type : l_int32
	 */
	public int rightslope;
	/**
	 * left edge curvature in micro-units<br>
	 * C type : l_int32
	 */
	public int leftcurv;
	/**
	 * right edge curvature in micro-units<br>
	 * C type : l_int32
	 */
	public int rightcurv;
	/**
	 * number of sampling pts in x-dir<br>
	 * C type : l_int32
	 */
	public int nx;
	/**
	 * number of sampling pts in y-dir<br>
	 * C type : l_int32
	 */
	public int ny;
	/**
	 * 0 if normal; 1 if has a refpage<br>
	 * C type : l_int32
	 */
	public int hasref;
	/**
	 * page with disparity model to use<br>
	 * C type : l_int32
	 */
	public int refpage;
	/**
	 * sets to 1 if vert disparity builds<br>
	 * C type : l_int32
	 */
	public int vsuccess;
	/**
	 * sets to 1 if horiz disparity builds<br>
	 * C type : l_int32
	 */
	public int hsuccess;
	/**
	 * sets to 1 if valid vert disparity<br>
	 * C type : l_int32
	 */
	public int vvalid;
	/**
	 * sets to 1 if valid horiz disparity<br>
	 * C type : l_int32
	 */
	public int hvalid;
	/**
	 * sets to 1 if debug output requested<br>
	 * C type : l_int32
	 */
	public int debug;
	public L_Dewarp() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("dewa", "pixs", "sampvdispar", "samphdispar", "fullvdispar", "fullhdispar", "namidys", "nacurves", "w", "h", "pageno", "sampling", "redfactor", "minlines", "nlines", "mincurv", "maxcurv", "leftslope", "rightslope", "leftcurv", "rightcurv", "nx", "ny", "hasref", "refpage", "vsuccess", "hsuccess", "vvalid", "hvalid", "debug");
	}
	public L_Dewarp(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends L_Dewarp implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Dewarp implements Structure.ByValue {
		
	};
}
