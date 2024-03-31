module lept4j {
    requires com.sun.jna;
    requires java.logging;
    requires org.apache.commons.io;
    requires java.desktop;
    exports net.sourceforge.lept4j;
    exports net.sourceforge.lept4j.util;
    exports com.ochafik.lang.jnaerator.runtime to com.sun.jna;
}