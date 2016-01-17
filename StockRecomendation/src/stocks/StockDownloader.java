package stocks;
import java.util.*;
import java.net.*;
public class StockDownloader {

	public static final int date = 0;
	public static final int open = 1;
	public static final int high = 2;
	public static final int low = 3;
	public static final int close =4;
	public static final int voume = 5;
	public static final int adjClose = 6;

	private ArrayList<GregorianCalendar> dates;
	private ArrayList<Double> opens;
	private ArrayList<Double> highs;
	private ArrayList<Double> lows;
	private ArrayList<Double> closes;
	private ArrayList<Integer> volumes;
	private ArrayList<Double> adjcloses;
	 public StockDownloader()
	 {
	 }
	
	public StockDownloader(String symbol,GregorianCalendar start,GregorianCalendar end)
	{
	dates = new  ArrayList<GregorianCalendar>();
	opens = new ArrayList<Double>();
	highs = new ArrayList<Double>();
	lows =new ArrayList<Double>();
	closes = new ArrayList<Double>();
	volumes = new ArrayList<Integer>();
	adjcloses = new ArrayList<Double>();
	String url = "http://real-chart.finance.yahoo.com/table.csv?s="+symbol+
			"&a="+start.get(Calendar.MONTH)+
			"&b="+start.get(Calendar.DAY_OF_MONTH)+
			"&c="+start.get(Calendar.YEAR)+
			"&d="+end.get(Calendar.MONTH)+
			"&e="+end.get(Calendar.DAY_OF_MONTH)+
			"&f="+end.get(Calendar.YEAR)+"&g=w&ignore=.csv";
	try{
		URL yahooAPI = new URL(url);
		URLConnection conn = yahooAPI.openConnection();
		Scanner input = new Scanner(conn.getInputStream());
		if(input.hasNext())
			input.nextLine();
		
		while(input.hasNextLine())
		{		
		String line = input.nextLine();
		System.out.println(line);
		}
		
		
		
	}
	catch(Exception e)
	{
		System.err.print(e);
	}
	}

	
	
	}

	
	

