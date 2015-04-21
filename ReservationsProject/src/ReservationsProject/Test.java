public class Test{

	public static void main(String[] args){
		String time = "05:06";
		System.out.println(time);
        int hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
        int min = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length()));
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + min);
    }
}