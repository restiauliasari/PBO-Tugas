/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestiAuliaSari24102022;

/**
 *
 * @author acer
 */
public class Hewancontroller {
	private Hewan model; 
	private HewanView view; 
	public Hewancontroller(Hewan model, HewanView view){ 
	
            this.model = model; 
		this.view = view; 
	} 
	public void setHewanJenis(String jenis){ 
		model.setJenis(jenis); 
	} 
	public String getHewanJenis(){ 
		return model.getJenis(); 
	} 
	public void setHewanName(String name){ 
		model.setName(name); 
	} 
	public String getHewanName(){ 
		return model.getName(); 
	} 
	public void updateView(){ 
		view.printHewanDetails(model.getJenis(), model.getName()); 
	} 

}
   
