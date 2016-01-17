package stocks;
import java.util.*;
public class Data_yahoo {

public static void main (String[] args)
{
	GregorianCalendar start = new GregorianCalendar(1962,2,14);
	GregorianCalendar end = new GregorianCalendar(2016,1,14);

	StockDownloader data = new StockDownloader("MSFT",start,end);
}
}
