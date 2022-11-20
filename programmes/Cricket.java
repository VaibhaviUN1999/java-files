class Cricket{
    public static void main(String args[]){
	//external way of using array//
	int rohitHigestScore =264;
	int sachinHigestScore=200;
	int mandanaHigestScore=135;
	int ackerrHigestScore=232;
	int bjClarkHigestScore=229;
	
	int higestScores[]={rohitHigestScore,sachinHigestScore,mandanaHigestScore,ackerrHigestScore,bjClarkHigestScore};
	
	int ref4 = higestScores[4];
	int ref0 = higestScores[0];
	int ref2= higestScores[2];
	System.out.println("element at index 4" + ref4);
	System.out.println("element at index 0" + ref0);
	System.out.println("element at index 2" + ref2);
	System.out.println("the higest scores is"+higestScores.length);
	
	for(int index=0;index<higestScores.length;index++){
		
		int ref=higestScores[index];
		System.out.println("elements of index are" + index + ref);
	}
	
	}

}