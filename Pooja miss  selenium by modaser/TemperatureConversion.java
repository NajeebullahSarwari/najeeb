package Temp;
public class TemperatureConversion {
	double c,f;
	double getC()
	{
		return (c);
	}
	double getF()
	{
		return (f);
	}
	void setC(double celsius)
	{
	c=celsius;	
	}
	void setF(double Far)
	{
		f=Far;
	}
	double ToC()
	{
	return ((f-32)/1.8)	;
	}
	double ToF()
	{
		return((c*9/5+32));
	}
}
