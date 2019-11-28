package com.ustglobal.objectclass;

public class USBPort {
	
	public static void connect(Object obj) { 
		if(obj instanceof PenDrive) {
			PenDrive p = (PenDrive) obj;
			p.read();
			p.write();
			System.out.println("Pen drive connected");
		}else if(obj instanceof Mouse) {
			Mouse m = (Mouse) obj;
			m.click();
			m.scroll();
			System.out.println("Mouse connected");
		}
	}
}
