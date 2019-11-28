package com.ustglobal.collection.set;

import java.util.Comparator;

public class SortById implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		Integer i = c1.id;
		Integer j = c2.id;
		return i.compareTo(j);
	}

}
