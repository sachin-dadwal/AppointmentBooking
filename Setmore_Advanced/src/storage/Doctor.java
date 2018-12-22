package storage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Doctor {

	static HashMap<Integer, LocalTime> map = new HashMap<>();
	static HashMap<Integer, LocalTime> map1 = new HashMap<>();

	public static LocalTime printTimeSlots(LocalTime startTime, LocalTime endTime, int slotSizeInMinutes) {
		Scanner sc = new Scanner(System.in);
		LocalTime l = null;
		
		if (map.size() == 0) {
			int n = 1;
			for (LocalTime time = startTime, nextTime; time.isBefore(endTime); time = nextTime) {
				nextTime = time.plusMinutes(slotSizeInMinutes);
				// System.out.println(nextTime);
				if (nextTime.isAfter(endTime))
					break; // time slot crosses end time
				// System.out.println(time + "-" + nextTime);
				map.put(n, time);
				n++;
			}
			System.out.print(map);
			System.out.println();

			System.out.println("\n Please select the available slots :");
			int m = sc.nextInt();
			if (m <= map.size()) {

				l = map.get(m);
				System.out.println(l);
				map.remove(m);
				int recordsToPrint = map.size();

				FileWriter fstream;
				BufferedWriter out;

				// create your filewriter and bufferedreader
				try {
					fstream = new FileWriter("Slots.txt");

					out = new BufferedWriter(fstream);

					// initialize the record count
					int count = 0;

					// create your iterator for your map
					Iterator<Entry<Integer, LocalTime>> it = map.entrySet().iterator();

					// then use the iterator to loop through the map, stopping when we reach the
					// last record in the map or when we have printed enough records
					out.write("Available slots:");
					out.write("\n\r");
					while (it.hasNext() && count < recordsToPrint) {

						// the key/value pair is stored here in pairs
						Entry<Integer, LocalTime> pairs = it.next();
						// System.out.println("Value is :" + pairs.getValue());

						// since you only want the value, we only care about pairs.getValue(), which is
						// written to out
						
						out.write("\n"+pairs.getKey()+" = " + pairs.getValue() + "\n\r");

						// increment the record count once we have printed to the file
						count++;
					}
					// lastly, close the file and end
					out.close();
					// System.out.println(map);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Enter the correct choice");
				}
			}

		} else {
			System.out.print(map);
			System.out.println();
			System.out.println("\n Please select the available slots :");
			// System.out.println(map);
			// System.out.println(map.values());
			int m = sc.nextInt();
			// System.out.println(m);
			// System.out.println(map.get(m));

			l = map.get(m);

			map.remove(m);
		}

		//System.out.println(map);
		return l;
	}

	public static LocalTime printTimeSlots1(LocalTime startTime, LocalTime endTime, int slotSizeInMinutes) {
		Scanner sc = new Scanner(System.in);
		LocalTime l = null;
		;
		if (map1.size() == 0) {
			int n = 1;
			for (LocalTime time = startTime, nextTime; time.isBefore(endTime); time = nextTime) {
				nextTime = time.plusMinutes(slotSizeInMinutes);
				// System.out.println(nextTime);
				if (nextTime.isAfter(endTime))
					break; // time slot crosses end time
				// System.out.println(time + "-" + nextTime);
				map1.put(n, time);
				n++;
			}
			System.out.print(map1);
			System.out.println();

			System.out.println("\n Please select the available slots :");
			int m = sc.nextInt();
			if (m <= map1.size()) {

				l = map1.get(m);
				System.out.println(l);
				map1.remove(m);
				int recordsToPrint = map1.size();

				FileWriter fstream;
				BufferedWriter out;

				// create your filewriter and bufferedreader
				try {
					fstream = new FileWriter("Slots1.txt");

					out = new BufferedWriter(fstream);

					// initialize the record count
					int count = 0;

					// create your iterator for your map
					Iterator<Entry<Integer, LocalTime>> it = map1.entrySet().iterator();

					// then use the iterator to loop through the map, stopping when we reach the
					// last record in the map or when we have printed enough records
					out.write("Available slots:");
					out.write("\n\r");
					while (it.hasNext() && count < recordsToPrint) {

						// the key/value pair is stored here in pairs
						Entry<Integer, LocalTime> pairs = it.next();
						// System.out.println("Value is :" + pairs.getValue());

						// since you only want the value, we only care about pairs.getValue(), which is
						// written to out
						
						out.write("\n"+pairs.getKey()+" = " + pairs.getValue() + "\n\r");

						// increment the record count once we have printed to the file
						count++;
					}
					// lastly, close the file and end
					out.close();
					// System.out.println(map);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.out.println("Enter the correct choice");
				}
			}

		} else {
			System.out.print(map1);
			System.out.println();
			System.out.println("\n Please select the available slots :");
			// System.out.println(map);
			// System.out.println(map.values());
			int m = sc.nextInt();
			// System.out.println(m);
			// System.out.println(map.get(m));

			l = map1.get(m);

			map1.remove(m);
		}

		//System.out.println(map1);
		return l;
	}

	public static void main(String[] args) {

		System.out.println(printTimeSlots(LocalTime.parse("07:00"), LocalTime.parse("14:00"), 15));
		// printTimeSlots(LocalTime.parse("14:00"), LocalTime.parse("21:00"), 15);
	}
}
