package Day9;

public class MSExcel implements MSOffice {

	@Override
	public void start() {
		System.out.println("Start method of MS Excel");
		
	}

	@Override
	public void save() {
		System.out.println("Save method of MS Excel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("SaveAs method of MS Excel");
		
	}
	
	public void open()
	{
		System.out.println("Open method of MS Excel");
	}

}
