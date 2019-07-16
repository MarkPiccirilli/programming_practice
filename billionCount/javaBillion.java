

public class javaBillion {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Argument not included");
			System.exit(1);
		}
		
		long j = Long.parseLong(args[0]);
		
		final long start = System.nanoTime();
		for(long i = 0; i < 1000000000; i++) {
			j++;
			if(j % 2000000 == 0) {
				System.out.println(j);
			}
		}
		final long end = System.nanoTime();

		long time = (end - start) / 1000000;

		System.out.println("Time to count to 1 billion: " + time);	
	}
}
