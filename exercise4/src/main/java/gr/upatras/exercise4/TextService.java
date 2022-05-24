package gr.upatras.exercise4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TextService implements ITextService{
	List<Text> keimenaki = new ArrayList<Text>();
	int ix=1;
	
	public List<Text> findAll(){
		return keimenaki;
	}

	public Text addText(Text t) {
		ix = ix + 1;
		t.setId(ix);
		keimenaki.add(t);
		return t;
	}

//	public Text findById(int id) {
//		for (Text t:keimenaki) {
//			if (t.getId() == id) {
//				return t;
//			}
//		}
//		return null;
//	}
//	
//	public Void deleteText(int id) {
//		for(Text t:keimenaki) {
//			if(t.getId()==id) {
//				keimenaki.remove(t);
//				break;
//			}
//		}
//		return null;
//	}
}