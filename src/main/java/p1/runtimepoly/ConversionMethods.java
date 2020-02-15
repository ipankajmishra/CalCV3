package p1.runtimepoly;

import p1.exceptions.Invalid_Number_System;

public class ConversionMethods implements Methods{

	@Override
	public String decimalToBinary(String s) throws Invalid_Number_System {
		return Integer.toBinaryString(Integer.parseInt(s));
	}

	@Override
	public String decimalToOctal(String s) throws Invalid_Number_System {
		// TODO Auto-generated method stub
		return Integer.toOctalString(Integer.parseInt(s));
	}

	@Override
	public String decimalToHexaDecimal(String s) throws Invalid_Number_System {
		// TODO Auto-generated method stub
		return Integer.toHexString(Integer.parseInt(s));
	}

	@Override
	public String BinaryToDecimal(String s) throws Invalid_Number_System {
		// TODO Auto-generated method stub
		return ((Integer)(Integer.parseInt(s,2))).toString();
	}

	@Override
	public String OctalToDecimal(String s) throws Invalid_Number_System {
		// TODO Auto-generated method stub
		return ((Integer)(Integer.parseInt(s,8))).toString();
	}

	@Override
	public String HexadecimalTodecimal(String s) throws Invalid_Number_System {
		// TODO Auto-generated method stub
		return ((Integer)(Integer.parseInt(s,16))).toString();
	}
	
}
