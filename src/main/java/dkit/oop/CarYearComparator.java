// Comparator - compares int-type field "year"		Nov 2021
//
// This class defines a Comparator  - that is a class that implements the
// Comparator interface.  Every class that implements the Comparator interface
// must implement the compare() method.
//
// In this case we want to compare Car objects based on their "year".
// So, in the compare() method, we compare the year fields of the
// two Car objects.
//
// To sort a list of Car objects, we can use Collections.sort() and
// we pass in an instance of the CarYearComparator() to specify
// the order of sorting (i.e. by year)
// The sort() method will call the compareTo() method each time it
// wants to compare two cars.  The two cars being compared are
// passed into the compareTo() method.

package dkit.oop;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car>
{
	public int compare(Car car1, Car car2) {

		if (car1.getYear() < car2.getYear()) {
			return -1;	// a negative value
		} else if (car1.getYear() == car2.getYear()) {
			return 0;
		} else {
			return 1;
		}

//		As an alternative to the above, we could subtract one from
//		the other and return the difference.
//		return (car1.getYear() - car2.getYear());

	}
}


