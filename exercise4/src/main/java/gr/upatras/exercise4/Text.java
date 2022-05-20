package gr.upatras.exercise4;

public class Text {
	private int id;
	private String titlos;
	private String keimeno;
	
	public String getKeimeno(){
		return keimeno;
	}
	
	public void setKeimeno(String keimeno) {
		this.keimeno=keimeno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Text(int id,String titlos,String keimeno){
		super();
		this.id = id;
		this.keimeno = keimeno;
	}
	
}
