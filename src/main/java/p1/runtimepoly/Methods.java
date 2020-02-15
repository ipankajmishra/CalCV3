package p1.runtimepoly;

import p1.exceptions.Invalid_Number_System;

public interface Methods {
	public abstract String decimalToBinary(String s) throws Invalid_Number_System;
	public abstract String decimalToOctal(String s) throws Invalid_Number_System;
	public abstract String decimalToHexaDecimal(String s) throws Invalid_Number_System;
	public abstract String BinaryToDecimal(String s) throws Invalid_Number_System;
	public abstract String OctalToDecimal(String s) throws Invalid_Number_System;
	public abstract String HexadecimalTodecimal(String s) throws Invalid_Number_System;
	
	
	
}
