import java.math.BigInteger;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;


public class Big_Integer_Counter{
	public long start_time;
	public long last_update_shown_time;
	public BigInteger counter;
	public BigInteger max;
	public long milliseconds_since_last_update(){
		long output;
		long now = System.currentTimeMillis();
		output = now - last_update_shown_time;
		last_update_shown_time = now;
		return output;
	}
	public String update_to_show(){
		String output = "";
		long since_last_update = milliseconds_since_last_update();
		if(TimeUnit.MILLISECONDS.toSeconds(since_last_update) != 0){
			output += String.format("%nNow at %.3f%%, or %s out of %s, it took %s seconds since last report", get_percent_done(), NumberFormat.getNumberInstance(Locale.US).format(get_counter()), NumberFormat.getNumberInstance(Locale.US).format(get_max()), String.valueOf(TimeUnit.MILLISECONDS.toSeconds(since_last_update)));
		}else{
			output += String.format("%nNow at %.3f%%, or %s out of %s, it took %s seconds since last report", get_percent_done(), NumberFormat.getNumberInstance(Locale.US).format(get_counter()), NumberFormat.getNumberInstance(Locale.US).format(get_max()), String.valueOf(TimeUnit.MILLISECONDS.toSeconds(since_last_update)));
		}
		return output;
	}
	public boolean show_update(){
		BigInteger mod = counter.mod(max.divide(new BigInteger("100")));
		if((last_update_shown_time - System.currentTimeMillis()) > 10000){
			return  true;
		}
		if(counter.equals(new BigInteger("0"))){
			return false;
		}
		if(mod.equals(new BigInteger("0"))){
			return true;
		}else{
			return false;
		}
	}
	public BigInteger get_update_increment(){
		return counter.mod(max.divide(new BigInteger("1000")));	
	}
	public double get_percent_done(){
		return (counter.doubleValue() / max.doubleValue()) * 100;
	}
	public BigInteger get_counter(){
		return counter;
	}	
	public void iterate(){
		counter = counter.add(new BigInteger("1"));
	}
	public BigInteger get_max(){
		return max;
	}
	public Big_Integer_Counter(BigInteger input_max){
		counter = new BigInteger("0");
		max = input_max;
		start_time = System.currentTimeMillis();
		last_update_shown_time = System.currentTimeMillis();
	}
}