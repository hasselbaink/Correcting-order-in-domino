import java.util.Scanner;
import java.util.Formatter;
public class Main {
    public static void main(String[] args) {
	Scanner scn = null;
	Formatter frm = null;
	byte[] dom = new byte[4];
	try {
	    scn = new Scanner("domino.in");
	    for (byte i = 0; i < dom.length; i++) dom[i] = scn.nextByte();
	} catch (Exception ex) { System.exit(0); } finally { scn.close(); }
	String result = dom[1]==dom[2]?dom[0]+" "+dom[1]+" "+dom[2]+" "+dom[3]
		:dom[1]==dom[3]?dom[0]+" "+dom[1]+" "+dom[3]+" "+dom[2]
		:dom[0]==dom[2]?dom[1]+" "+dom[0]+" "+dom[2]+" "+dom[3]
		:dom[0]==dom[3]?dom[1]+" "+dom[0]+" "+dom[3]+" "+dom[2]
		:"-1";
	try {
	    frm = new Formatter("domino.out");
	    frm.flush();
	    frm.format(result);
	} catch (Exception ex) { System.exit(0); } finally { frm.close(); }
	while(true){}
    }
}