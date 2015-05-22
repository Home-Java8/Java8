package com.patterns2.abstractfactory;

public class TestClient {
	public void run(String countryId){
		UIAbstractFactory uiFactory = null;
		if(countryId.equals("JP"))
			uiFactory = new JapaneseUIFactory();
		if(countryId.equals("US"))
			uiFactory = new USUIFactory();
		
		if(uiFactory != null){
			Help help = uiFactory.getHelp();
			log("help created for: " + help.getHelpCountry());
			
			Images images = uiFactory.getImages();
			log("UI images created for: " + images.getImagesCountry());
			
			Locale locale = uiFactory.getLocale();
			log("UI locale created for: " + locale.getLocaleCountry());
		}else{
			log("Wrong country id");
		}
	}
	
	private void log(String msg){
		System.out.println(msg);
	}
}
