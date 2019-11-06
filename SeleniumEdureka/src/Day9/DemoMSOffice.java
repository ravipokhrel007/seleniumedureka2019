package Day9;

public class DemoMSOffice {

	public static void main(String[] args) {
		MSExcel msExcel = new MSExcel();
		msExcel.start();
		msExcel.save();
		msExcel.saveAs();
		msExcel.open();
		
		MSWord msWord = new MSWord();
		msWord.start();
		msWord.save();
		msWord.saveAs();

		MSOffice msOffice = new MSExcel();
		msOffice.save();
		msOffice.saveAs();
		msOffice.start();
		//MSOffice will not have open method from MSEXCEl since it will only methods from interface and not from Excel and Word only and Open is not Overridden method.
		
		
	}

}
