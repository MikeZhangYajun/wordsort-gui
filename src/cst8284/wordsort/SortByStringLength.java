package cst8284.wordsort;

/*
 * ZHANG Yajun
 * 040958689
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class SortByStringLength implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Collections.sort(WordSorter.getListOfStrings(), (o1, o2) -> Integer.compare(o1.length(), o2.length()));
		WordSorter.reloadJTextArea();
	}

}
