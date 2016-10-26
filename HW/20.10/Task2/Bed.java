class Bed{
	public String modelName;
	private int iron;
	public int hardness;
	public boolean frame;
	
	
	
	String getModelName() {
        return modelName;
    }
	
	public int getIron (){
		return iron;
	}
	
	public int getHardness (){
		return hardness;
	}
	
	
	
	String frame(){
		if (this.frame) {
			return getModelName() + " bed" ;
		}else{
			return getModelName() + " not bed" ;
		}
	}
	
	Bed (String modelName, int iron, int hardness,boolean frame){
		this.modelName=modelName;
		this.iron=iron;
		this.hardness=hardness;
		this.frame=frame;
	}
	
	public boolean equals(Bed bed) { 
	    
		if (( this.modelName == bed.modelName ) && ( this.iron == bed.iron )) {
            return true;
	 	}
        else {
			return false;
		}	
	
	}	
	
	public String toString() {
        return "This is bed " + modelName+ ". ";
	}
}	
	

