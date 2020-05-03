package cst8284.wordsort;
/*
 * ZHANG Yajun
 * 040958689
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class SortListAlphabetically implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Collections.sort(WordSorter.getListOfStrings());
		WordSorter.reloadJTextArea();
	}

}
