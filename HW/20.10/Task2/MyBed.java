class MyBed {
	public static void main(String[] args){
		Bed bed1 = new Bed ("econom", 55, 100, true);
		ModernBed bed2 = new ModernBed ("exclusive", 15,true, 15, true);
	
	System.out.println(bed1);
	System.out.println(bed2);
	System.out.println(bed1.equals(bed2));
	}
	
}