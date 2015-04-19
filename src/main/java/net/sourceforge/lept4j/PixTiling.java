package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * -------------------------------------------------------------------------*<br>
 *                              Pix tiling                                 *<br>
 * -------------------------------------------------------------------------<br>
 * <i>native declaration : pix.h:168</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PixTiling extends Structure {
	/**
	 * input pix (a clone)<br>
	 * C type : Pix*
	 */
	public net.sourceforge.lept4j.Pix.ByReference pix;
	/**
	 * number of tiles horizontally<br>
	 * C type : l_int32
	 */
	public int nx;
	/**
	 * number of tiles vertically<br>
	 * C type : l_int32
	 */
	public int ny;
	/**
	 * tile width<br>
	 * C type : l_int32
	 */
	public int w;
	/**
	 * tile height<br>
	 * C type : l_int32
	 */
	public int h;
	/**
	 * overlap on left and right<br>
	 * C type : l_int32
	 */
	public int xoverlap;
	/**
	 * overlap on top and bottom<br>
	 * C type : l_int32
	 */
	public int yoverlap;
	/**
	 * strip for paint; default is TRUE<br>
	 * C type : l_int32
	 */
	public int strip;
	public PixTiling() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("pix", "nx", "ny", "w", "h", "xoverlap", "yoverlap", "strip");
	}
	/**
	 * @param pix input pix (a clone)<br>
	 * C type : Pix*<br>
	 * @param nx number of tiles horizontally<br>
	 * C type : l_int32<br>
	 * @param ny number of tiles vertically<br>
	 * C type : l_int32<br>
	 * @param w tile width<br>
	 * C type : l_int32<br>
	 * @param h tile height<br>
	 * C type : l_int32<br>
	 * @param xoverlap overlap on left and right<br>
	 * C type : l_int32<br>
	 * @param yoverlap overlap on top and bottom<br>
	 * C type : l_int32<br>
	 * @param strip strip for paint; default is TRUE<br>
	 * C type : l_int32
	 */
	public PixTiling(net.sourceforge.lept4j.Pix.ByReference pix, int nx, int ny, int w, int h, int xoverlap, int yoverlap, int strip) {
		super();
		this.pix = pix;
		this.nx = nx;
		this.ny = ny;
		this.w = w;
		this.h = h;
		this.xoverlap = xoverlap;
		this.yoverlap = yoverlap;
		this.strip = strip;
	}
	public PixTiling(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PixTiling implements Structure.ByReference {
		
	};
	public static class ByValue extends PixTiling implements Structure.ByValue {
		
	};
}
