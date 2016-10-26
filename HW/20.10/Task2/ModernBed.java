class ModernBed extends Bed {
	private int wooden;
	private boolean box;
	
	ModernBed (String modelName,int hardness, boolean frame, int wooden, boolean box){
		super (modelName, iron, hardness, frame);
		this.wooden=wooden;
		this.box=box;	
	}
	
	public boolean equals(ModernBed modernBed) { 
	    
		if (( this.modelName == modernBed.modelName ) && ( this.wooden == modernBed.wooden )) {
            return true;
	 	}
        else {
			return false;
		}	
	
	}
	
	public String toString() {
        return "This is modern bed " + modelName+ ". ";
	}
	
}