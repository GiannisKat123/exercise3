package gr.upatras.exercise4;

import java.util.List;

public interface ITextService{

	List<Text> findAll();
	/**
	* @param id
	* @return a {@link Text}
	*/
	Text addText(Text t); 
	/**
	* @param t
	* @return the edited {@link Text}
	*/
}